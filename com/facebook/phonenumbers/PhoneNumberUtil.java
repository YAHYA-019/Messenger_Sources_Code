package com.facebook.phonenumbers;

import X.0Pz;
import X.0Q8;
import X.1BK;
import X.4YV;
import X.AnonymousClass001;
import X.DKe;
import android.content.Context;
import android.util.Log;
import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtilData;
import com.facebook.phonenumbers.Phonenumber$PhoneNumber;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: PhoneNumberUtil.class */
public class PhoneNumberUtil {
    public static Pattern LAZY_CAPTURING_DIGIT_PATTERN;
    public static Pattern LAZY_EXTN_PATTERN;
    public static Pattern LAZY_FG_PATTERN;
    public static Pattern LAZY_FIRST_GROUP_ONLY_PREFIX_PATTERN;
    public static Pattern LAZY_FIRST_GROUP_PATTERN;
    public static Pattern LAZY_NON_DIGITS_PATTERN;
    public static Pattern LAZY_NP_PATTERN;
    public static Pattern LAZY_PLUS_CHARS_PATTERN;
    public static Pattern LAZY_SECOND_NUMBER_START_PATTERN;
    public static Pattern LAZY_UNIQUE_INTERNATIONAL_PREFIX_PATTERN;
    public static Pattern LAZY_UNWANTED_END_CHAR_PATTERN;
    public static Pattern LAZY_VALID_ALPHA_PHONE_PATTERN;
    public static Pattern LAZY_VALID_PHONE_NUMBER_PATTERN;
    public static Pattern LAZY_VALID_START_CHAR_PATTERN;
    public static PhoneNumberUtil instance;
    public final PhoneNumberUtilData data;
    public final Context mContext;
    public final MetadataLoader metadataLoader;
    public static final MetadataLoader DEFAULT_METADATA_LOADER = new MetadataLoader() { // from class: com.facebook.phonenumbers.PhoneNumberUtil.1
        @Override // com.facebook.phonenumbers.MetadataLoader
        public InputStream loadMetadata(String str) {
            throw 0Q8.createAndThrow();
        }
    };
    public static final Logger logger = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final SimpleCharMap ASCII_DIGIT_MAPPINGS = new DKe(0);
    public static final SimpleCharMap ALPHA_MAPPINGS = new DKe(1);
    public static final SimpleCharMap ALPHA_PHONE_MAPPINGS = new DKe(2);
    public static final SimpleCharMap DIALLABLE_CHAR_MAPPINGS = new DKe(3);
    public static final SimpleCharMap ALL_PLUS_NUMBER_GROUPING_SYMBOLS = new DKe(4);
    public final Map regionToMetadataMap = Collections.synchronizedMap(new HashMap());
    public final Map countryCodeToNonGeographicalMetadataMap = Collections.synchronizedMap(new HashMap());
    public final RegexCache regexCache = new RegexCache(100);
    public final String currentFilePrefix = "PhoneNumberMetadataProto";

    /* loaded from: PhoneNumberUtil$Leniency.class */
    public enum Leniency {
        POSSIBLE { // from class: com.facebook.phonenumbers.PhoneNumberUtil.Leniency.1
            @Override // com.facebook.phonenumbers.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
                return phoneNumberUtil.isPossibleNumber(phonenumber$PhoneNumber);
            }
        },
        VALID { // from class: com.facebook.phonenumbers.PhoneNumberUtil.Leniency.2
            @Override // com.facebook.phonenumbers.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
                boolean z;
                if (phoneNumberUtil.isValidNumberForRegion(phonenumber$PhoneNumber, phoneNumberUtil.getRegionCodeForNumber(phonenumber$PhoneNumber))) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        z = true;
                        if (i2 < str.length() - 1) {
                            char charAt = str.charAt(i2);
                            if (charAt == 'x' || charAt == 'X') {
                                int i3 = i2 + 1;
                                char charAt2 = str.charAt(i3);
                                if (charAt2 == 'x' || charAt2 == 'X') {
                                    if (phoneNumberUtil.isNumberMatch(phonenumber$PhoneNumber, str.substring(i3)) != MatchType.NSN_MATCH) {
                                        break;
                                    }
                                    i2 = i3;
                                } else if (!PhoneNumberUtil.normalizeDigitsOnly(str.substring(i2)).equals(phonenumber$PhoneNumber.extension_)) {
                                    break;
                                }
                            }
                            i = i2 + 1;
                        } else if (phonenumber$PhoneNumber.countryCodeSource_ == Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
                            Phonemetadata$PhoneMetadata metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.data.getRegionCodeForCountryCallingCode(phonenumber$PhoneNumber.countryCode_));
                            if (metadataForRegion != null) {
                                Phonemetadata$NumberFormat chooseFormattingPatternForNumber = phoneNumberUtil.chooseFormattingPatternForNumber(metadataForRegion.numberFormat_, phoneNumberUtil.getNationalSignificantNumber(phonenumber$PhoneNumber));
                                if (chooseFormattingPatternForNumber != null) {
                                    String str2 = chooseFormattingPatternForNumber.nationalPrefixFormattingRule_;
                                    if (str2.length() > 0 && !chooseFormattingPatternForNumber.nationalPrefixOptionalWhenFormatting_ && !PhoneNumberUtil.formattingRuleHasFirstGroupOnly(str2)) {
                                        return phoneNumberUtil.maybeStripNationalPrefixAndCarrierCode(AnonymousClass001.A0o(PhoneNumberUtil.normalizeDigitsOnly(phonenumber$PhoneNumber.rawInput_)), metadataForRegion, null);
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
                return z;
            }
        };

        public abstract boolean verify(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str, PhoneNumberUtil phoneNumberUtil);
    }

    /* loaded from: PhoneNumberUtil$MatchType.class */
    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    /* loaded from: PhoneNumberUtil$PhoneNumberFormat.class */
    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    /* loaded from: PhoneNumberUtil$PhoneNumberType.class */
    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* loaded from: PhoneNumberUtil$SimpleCharMap.class */
    public interface SimpleCharMap {
        char get(char c, char c2);
    }

    /* loaded from: PhoneNumberUtil$ValidationResult.class */
    public enum ValidationResult {
        IS_POSSIBLE,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        TOO_LONG
    }

    public PhoneNumberUtil(String str, MetadataLoader metadataLoader, PhoneNumberUtilData phoneNumberUtilData, Context context) {
        this.mContext = context;
        this.metadataLoader = metadataLoader;
        this.data = phoneNumberUtilData;
    }

    private String formatNsnUsingPattern(String str, Phonemetadata$NumberFormat phonemetadata$NumberFormat, PhoneNumberFormat phoneNumberFormat, String str2) {
        String str3 = phonemetadata$NumberFormat.format_;
        Matcher matcher = this.regexCache.getPatternForRegex(phonemetadata$NumberFormat.pattern_).matcher(str);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.NATIONAL;
        String str4 = phonemetadata$NumberFormat.nationalPrefixFormattingRule_;
        if (phoneNumberFormat != phoneNumberFormat2 || str4 == null || str4.length() <= 0) {
            return matcher.replaceAll(str3);
        }
        Pattern pattern = LAZY_FIRST_GROUP_PATTERN;
        Pattern A12 = 4YV.A12(pattern, "getFirstGroupPattern()", "(\\$\\d)", pattern);
        LAZY_FIRST_GROUP_PATTERN = A12;
        return matcher.replaceAll(A12.matcher(str3).replaceFirst(str4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r0.matcher(r301).matches() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean formattingRuleHasFirstGroupOnly(java.lang.String r301) {
        /*
            r0 = r301
            int r0 = r0.length()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L34
            java.util.regex.Pattern r0 = com.facebook.phonenumbers.PhoneNumberUtil.LAZY_FIRST_GROUP_ONLY_PREFIX_PATTERN
            r303 = r0
            java.lang.String r0 = "getFirstGroupOnlyPrefixPattern()"
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.String r2 = "\\(?\\$1\\)?"
            r3 = r303
            java.util.regex.Pattern r0 = X.4YV.A12(r0, r1, r2, r3)
            r305 = r0
            r0 = r305
            com.facebook.phonenumbers.PhoneNumberUtil.LAZY_FIRST_GROUP_ONLY_PREFIX_PATTERN = r0
            r0 = r305
            r1 = r301
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L36
        L34:
            r0 = 1
            r302 = r0
        L36:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.formattingRuleHasFirstGroupOnly(java.lang.String):boolean");
    }

    private int getCountryCodeForValidRegion(String str) {
        int countryCallingCodeForRegionCode = this.data.getCountryCallingCodeForRegionCode(str, -1);
        if (countryCallingCodeForRegionCode != -1) {
            return countryCallingCodeForRegionCode;
        }
        Phonemetadata$PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion == null) {
            throw 0Pz.A05("Invalid region code: ", str);
        }
        PhoneNumberUtilData phoneNumberUtilData = this.data;
        int i = metadataForRegion.countryCode_;
        if (str == null || str.length() == 0 || i < 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        if (phoneNumberUtilData.getCountryCallingCodeForRegionCode(str, -1) == -1) {
            synchronized (phoneNumberUtilData) {
                Map map = phoneNumberUtilData.mRegionCodeToCountryCallingCodeMapAddendum;
                if (map == null) {
                    map = AnonymousClass001.A0u();
                    phoneNumberUtilData.mRegionCodeToCountryCallingCodeMapAddendum = map;
                }
                if (!map.containsKey(str)) {
                    phoneNumberUtilData.mRegionCodeToCountryCallingCodeMapAddendum.put(str, Integer.valueOf(i));
                }
            }
        }
        return metadataForRegion.countryCode_;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x0046: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000a, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:com.facebook.phonenumbers.PhoneNumberUtil) from 0x003b: SPUT (r303v2 ?? I:com.facebook.phonenumbers.PhoneNumberUtil) A[Catch: all -> 0x0041] com.facebook.phonenumbers.PhoneNumberUtil.instance com.facebook.phonenumbers.PhoneNumberUtil
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static com.facebook.phonenumbers.PhoneNumberUtil getInstance(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x0046: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000a, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:com.facebook.phonenumbers.PhoneNumberUtil) from 0x003b: SPUT (r303v2 ?? I:com.facebook.phonenumbers.PhoneNumberUtil) A[Catch: all -> 0x0041] com.facebook.phonenumbers.PhoneNumberUtil.instance com.facebook.phonenumbers.PhoneNumberUtil
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    private Phonemetadata$PhoneMetadata getMetadataForRegionOrCallingCode(int i, String str) {
        return "001".equals(str) ? getMetadataForNonGeographicalRegion(i) : getMetadataForRegion(str);
    }

    private PhoneNumberType getNumberTypeHelper(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.generalDesc_)) {
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.premiumRate_)) {
                return PhoneNumberType.PREMIUM_RATE;
            }
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.tollFree_)) {
                return PhoneNumberType.TOLL_FREE;
            }
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.sharedCost_)) {
                return PhoneNumberType.SHARED_COST;
            }
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.voip_)) {
                return PhoneNumberType.VOIP;
            }
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.personalNumber_)) {
                return PhoneNumberType.PERSONAL_NUMBER;
            }
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.pager_)) {
                return PhoneNumberType.PAGER;
            }
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.uan_)) {
                return PhoneNumberType.UAN;
            }
            if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.voicemail_)) {
                return PhoneNumberType.VOICEMAIL;
            }
            boolean isNumberMatchingDesc = isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.fixedLine_);
            boolean z = phonemetadata$PhoneMetadata.sameMobileAndFixedLinePattern_;
            if (isNumberMatchingDesc) {
                return (z || isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.mobile_)) ? PhoneNumberType.FIXED_LINE_OR_MOBILE : PhoneNumberType.FIXED_LINE;
            }
            if (!z && isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.mobile_)) {
                return PhoneNumberType.MOBILE;
            }
        }
        return PhoneNumberType.UNKNOWN;
    }

    public static Pattern getPlusCharsPattern() {
        Pattern pattern = LAZY_PLUS_CHARS_PATTERN;
        if (pattern == null) {
            Log.d("com.facebook.phonenumbers.PhoneNumberUtil", "getPlusCharsPattern()");
            pattern = Pattern.compile("[+＋]+", 0);
        }
        LAZY_PLUS_CHARS_PATTERN = pattern;
        return pattern;
    }

    public static final Pattern getUnwantedEndCharPattern() {
        Pattern pattern = LAZY_UNWANTED_END_CHAR_PATTERN;
        if (pattern == null) {
            Log.d("com.facebook.phonenumbers.PhoneNumberUtil", "getUnwantedEndCharPattern()");
            pattern = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$", 0);
        }
        LAZY_UNWANTED_END_CHAR_PATTERN = pattern;
        return pattern;
    }

    public static boolean isViablePhoneNumber(String str) {
        if (str.length() < 2) {
            return false;
        }
        Pattern pattern = LAZY_VALID_PHONE_NUMBER_PATTERN;
        if (pattern == null) {
            Log.d("com.facebook.phonenumbers.PhoneNumberUtil", "getValidPhoneNumberPattern()");
            pattern = Pattern.compile("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\\p{Nd}]*(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?", 66);
        }
        LAZY_VALID_PHONE_NUMBER_PATTERN = pattern;
        return pattern.matcher(str).matches();
    }

    private void maybeAppendFormattedExtension(Phonenumber$PhoneNumber phonenumber$PhoneNumber, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        if (phonenumber$PhoneNumber.hasExtension) {
            String str = phonenumber$PhoneNumber.extension_;
            if (str.length() > 0) {
                sb.append(phonemetadata$PhoneMetadata.hasPreferredExtnPrefix ? phonemetadata$PhoneMetadata.preferredExtnPrefix_ : " ext. ");
                sb.append(str);
            }
        }
    }

    public static void normalize(StringBuilder sb) {
        String obj = sb.toString();
        Pattern pattern = LAZY_VALID_ALPHA_PHONE_PATTERN;
        if (pattern == null) {
            Log.d("com.facebook.phonenumbers.PhoneNumberUtil", "getValidAlphaPhonePattern()");
            pattern = Pattern.compile("(?:.*?[A-Za-z]){3}.*", 0);
        }
        LAZY_VALID_ALPHA_PHONE_PATTERN = pattern;
        sb.replace(0, sb.length(), pattern.matcher(obj).matches() ? normalizeHelper(obj, ALPHA_PHONE_MAPPINGS, true) : normalizeDigitsOnly(obj));
    }

    public static String normalizeDigitsOnly(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return sb.toString();
            }
            int digit = Character.digit(charArray[i2], 10);
            if (digit != -1) {
                sb.append(digit);
            }
            i = i2 + 1;
        }
    }

    public static String normalizeHelper(String str, SimpleCharMap simpleCharMap, boolean z) {
        int length = str.length();
        StringBuilder A0l = AnonymousClass001.A0l(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0l.toString();
            }
            char c = simpleCharMap.get(Character.toUpperCase(str.charAt(i2)), (char) 55296);
            if (c != 55296) {
                A0l.append(c);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:23|(2:25|(2:33|34))|36|(1:38)|39|(1:41)|42|(15:46|(2:47|(2:49|(2:52|53)(1:51))(1:122))|54|(1:56)|57|58|59|60|61|62|(4:64|(1:66)(2:104|(1:106))|67|(4:69|(2:71|(3:73|(1:75)|76))|77|(2:79|(4:81|(4:85|(2:86|(1:1)(1:90))|92|(1:94))|96|97)(2:98|99))(2:100|101))(2:102|103))|107|(1:109)|67|(0)(0))(0)|123|54|(0)|57|58|59|60|61|62|(0)|107|(0)|67|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x039a, code lost:
    
        r317 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x039c, code lost:
    
        r0 = getPlusCharsPattern().matcher(r0.toString());
        r0 = r317.errorType;
        r0 = com.facebook.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03c1, code lost:
    
        if (r0 != r0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03d0, code lost:
    
        r311 = maybeExtractCountryCode(r0.substring(r0.end()), r320, r321, r304, r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03f3, code lost:
    
        if (r311 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0407, code lost:
    
        throw new com.facebook.phonenumbers.NumberParseException(r0, "Could not interpret numbers after plus-sign.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05d4, code lost:
    
        throw new com.facebook.phonenumbers.NumberParseException(r317.errorType, r317.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0444  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void parseHelper(java.lang.String r302, java.lang.String r303, boolean r304, boolean r305, com.facebook.phonenumbers.Phonenumber$PhoneNumber r306) {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.parseHelper(java.lang.String, java.lang.String, boolean, boolean, com.facebook.phonenumbers.Phonenumber$PhoneNumber):void");
    }

    private void prefixNumberWithCountryCallingCode(int i, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        int ordinal = phoneNumberFormat.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            } else {
                sb.insert(0, " ");
            }
        }
        sb.insert(0, i);
        sb.insert(0, '+');
    }

    private ValidationResult testNumberLengthAgainstPattern(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.matches() ? ValidationResult.IS_POSSIBLE : matcher.lookingAt() ? ValidationResult.TOO_LONG : ValidationResult.TOO_SHORT;
    }

    public Phonemetadata$NumberFormat chooseFormattingPatternForNumber(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            int size = phonemetadata$NumberFormat.leadingDigitsPattern_.size();
            if (size != 0) {
                if (!this.regexCache.getPatternForRegex((String) phonemetadata$NumberFormat.leadingDigitsPattern_.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.regexCache.getPatternForRegex(phonemetadata$NumberFormat.pattern_).matcher(str).matches()) {
                return phonemetadata$NumberFormat;
            }
        }
        return null;
    }

    public int extractCountryCode(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() == 0 || sb.charAt(0) == '0') {
            return 0;
        }
        int length = sb.length();
        int i = 1;
        while (i <= length) {
            int parseInt = Integer.parseInt(sb.substring(0, i));
            if (Arrays.binarySearch(PhoneNumberUtilData.CountryCallingCodeToRegionCodeTable.COUNTRY_CALLING_CODE_KEY_COLUMN, (short) parseInt) >= 0) {
                sb2.append(sb.substring(i));
                return parseInt;
            }
            i++;
            if (i > 3) {
                return 0;
            }
        }
        return 0;
    }

    public String format(Phonenumber$PhoneNumber phonenumber$PhoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phonenumber$PhoneNumber.nationalNumber_ == 0 && phonenumber$PhoneNumber.hasRawInput) {
            String str = phonenumber$PhoneNumber.rawInput_;
            if (str.length() > 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i = phonenumber$PhoneNumber.countryCode_;
        String nationalSignificantNumber = getNationalSignificantNumber(phonenumber$PhoneNumber);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.E164;
        if (phoneNumberFormat == phoneNumberFormat2) {
            sb.append(nationalSignificantNumber);
            prefixNumberWithCountryCallingCode(i, phoneNumberFormat2, sb);
        } else if (Arrays.binarySearch(PhoneNumberUtilData.CountryCallingCodeToRegionCodeTable.COUNTRY_CALLING_CODE_KEY_COLUMN, (short) i) >= 0) {
            Phonemetadata$PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(i, this.data.getRegionCodeForCountryCallingCode(i));
            Phonemetadata$NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber((metadataForRegionOrCallingCode.intlNumberFormat_.size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) ? metadataForRegionOrCallingCode.numberFormat_ : metadataForRegionOrCallingCode.intlNumberFormat_, nationalSignificantNumber);
            if (chooseFormattingPatternForNumber != null) {
                nationalSignificantNumber = formatNsnUsingPattern(nationalSignificantNumber, chooseFormattingPatternForNumber, phoneNumberFormat, null);
            }
            sb.append(nationalSignificantNumber);
            maybeAppendFormattedExtension(phonenumber$PhoneNumber, metadataForRegionOrCallingCode, phoneNumberFormat, sb);
            prefixNumberWithCountryCallingCode(i, phoneNumberFormat, sb);
        } else {
            sb.append(nationalSignificantNumber);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r307 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String formatInOriginalFormat(com.facebook.phonenumbers.Phonenumber$PhoneNumber r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.formatInOriginalFormat(com.facebook.phonenumbers.Phonenumber$PhoneNumber, java.lang.String):java.lang.String");
    }

    public int getCountryCodeForRegion(String str) {
        if (this.data.isValidRegionCode(str)) {
            return getCountryCodeForValidRegion(str);
        }
        Logger logger2 = logger;
        Level level = Level.WARNING;
        if (str == null) {
            str = "null";
        }
        logger2.log(level, 0Pz.A0j("Invalid or missing region code (", str, ") provided."));
        return 0;
    }

    public int getLengthOfGeographicalAreaCode(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber2;
        Phonemetadata$PhoneMetadata metadataForRegion = getMetadataForRegion(getRegionCodeForNumber(phonenumber$PhoneNumber));
        if (metadataForRegion == null) {
            return 0;
        }
        if (!metadataForRegion.hasNationalPrefix && !phonenumber$PhoneNumber.italianLeadingZero_) {
            return 0;
        }
        Phonemetadata$PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(phonenumber$PhoneNumber.countryCode_, getRegionCodeForNumber(phonenumber$PhoneNumber));
        PhoneNumberType numberTypeHelper = metadataForRegionOrCallingCode == null ? PhoneNumberType.UNKNOWN : getNumberTypeHelper(getNationalSignificantNumber(phonenumber$PhoneNumber), metadataForRegionOrCallingCode);
        if (numberTypeHelper != PhoneNumberType.FIXED_LINE && numberTypeHelper != PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            return 0;
        }
        if (phonenumber$PhoneNumber.hasExtension) {
            phonenumber$PhoneNumber2 = new Phonenumber$PhoneNumber();
            phonenumber$PhoneNumber2.mergeFrom(phonenumber$PhoneNumber);
            phonenumber$PhoneNumber2.hasExtension = false;
            phonenumber$PhoneNumber2.extension_ = "";
        } else {
            phonenumber$PhoneNumber2 = phonenumber$PhoneNumber;
        }
        String format = format(phonenumber$PhoneNumber2, PhoneNumberFormat.INTERNATIONAL);
        Pattern pattern = LAZY_NON_DIGITS_PATTERN;
        Pattern A12 = 4YV.A12(pattern, "getNonDigitsPattern()", "(\\D+)", pattern);
        LAZY_NON_DIGITS_PATTERN = A12;
        String[] split = A12.split(format);
        if (split.length <= 3) {
            return 0;
        }
        Phonemetadata$PhoneMetadata metadataForRegionOrCallingCode2 = getMetadataForRegionOrCallingCode(phonenumber$PhoneNumber.countryCode_, getRegionCodeForNumber(phonenumber$PhoneNumber));
        if ((metadataForRegionOrCallingCode2 == null ? PhoneNumberType.UNKNOWN : getNumberTypeHelper(getNationalSignificantNumber(phonenumber$PhoneNumber), metadataForRegionOrCallingCode2)) == PhoneNumberType.MOBILE) {
            int i = phonenumber$PhoneNumber.countryCode_;
            if (!(i != 52 ? i != 54 ? "" : "9" : ConstantsKt.CAMERA_ID_BACK).equals("")) {
                return split[2].length() + split[3].length();
            }
        }
        return split[2].length();
    }

    public Phonemetadata$PhoneMetadata getMetadataForNonGeographicalRegion(int i) {
        synchronized (this.countryCodeToNonGeographicalMetadataMap) {
            if (Arrays.binarySearch(PhoneNumberUtilData.CountryCallingCodeToRegionCodeTable.COUNTRY_CALLING_CODE_KEY_COLUMN, (short) i) < 0) {
                return null;
            }
            Map map = this.countryCodeToNonGeographicalMetadataMap;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                loadMetadataFromFile(this.currentFilePrefix, "001", i, this.metadataLoader);
            }
            return (Phonemetadata$PhoneMetadata) this.countryCodeToNonGeographicalMetadataMap.get(valueOf);
        }
    }

    public Phonemetadata$PhoneMetadata getMetadataForRegion(String str) {
        if (!this.data.isValidRegionCode(str)) {
            return null;
        }
        synchronized (this.regionToMetadataMap) {
            if (!this.regionToMetadataMap.containsKey(str)) {
                loadMetadataFromFile(this.currentFilePrefix, str, 0, this.metadataLoader);
            }
        }
        return (Phonemetadata$PhoneMetadata) this.regionToMetadataMap.get(str);
    }

    public String getNationalSignificantNumber(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.italianLeadingZero_) {
            char[] cArr = new char[phonenumber$PhoneNumber.numberOfLeadingZeros_];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phonenumber$PhoneNumber.nationalNumber_);
        return sb.toString();
    }

    public String getRegionCodeForNumber(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int i = phonenumber$PhoneNumber.countryCode_;
        List regionCodesForCountryCallingCode = this.data.getRegionCodesForCountryCallingCode(i);
        if (regionCodesForCountryCallingCode == null) {
            logger.log(Level.WARNING, 0Pz.A0E(i, "Missing/invalid country_code (", ") for number ", getNationalSignificantNumber(phonenumber$PhoneNumber)));
            return null;
        }
        if (regionCodesForCountryCallingCode.size() == 1) {
            return (String) 1BK.A0r(regionCodesForCountryCallingCode);
        }
        String nationalSignificantNumber = getNationalSignificantNumber(phonenumber$PhoneNumber);
        Iterator it = regionCodesForCountryCallingCode.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Phonemetadata$PhoneMetadata metadataForRegion = getMetadataForRegion(A0i);
            if (metadataForRegion.hasLeadingDigits) {
                if (this.regexCache.getPatternForRegex(metadataForRegion.leadingDigits_).matcher(nationalSignificantNumber).lookingAt()) {
                    return A0i;
                }
            } else if (getNumberTypeHelper(nationalSignificantNumber, metadataForRegion) != PhoneNumberType.UNKNOWN) {
                return A0i;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0142, code lost:
    
        if (r0 == r0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch(com.facebook.phonenumbers.Phonenumber$PhoneNumber r302, com.facebook.phonenumbers.Phonenumber$PhoneNumber r303) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.isNumberMatch(com.facebook.phonenumbers.Phonenumber$PhoneNumber, com.facebook.phonenumbers.Phonenumber$PhoneNumber):com.facebook.phonenumbers.PhoneNumberUtil$MatchType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.phonenumbers.PhoneNumberUtil] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.facebook.phonenumbers.PhoneNumberUtil$MatchType] */
    public MatchType isNumberMatch(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str) {
        NumberParseException numberParseException = this;
        try {
            numberParseException = isNumberMatch(phonenumber$PhoneNumber, numberParseException.parse(str, "ZZ"));
            return numberParseException;
        } catch (NumberParseException unused) {
            if (numberParseException.errorType == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                String regionCodeForCountryCallingCode = this.data.getRegionCodeForCountryCallingCode(phonenumber$PhoneNumber.countryCode_);
                try {
                    if (regionCodeForCountryCallingCode.equals("ZZ")) {
                        Phonenumber$PhoneNumber phonenumber$PhoneNumber2 = new Phonenumber$PhoneNumber();
                        parseHelper(str, null, false, false, phonenumber$PhoneNumber2);
                        return isNumberMatch(phonenumber$PhoneNumber, phonenumber$PhoneNumber2);
                    }
                    MatchType isNumberMatch = isNumberMatch(phonenumber$PhoneNumber, parse(str, regionCodeForCountryCallingCode));
                    if (isNumberMatch == MatchType.EXACT_MATCH) {
                        isNumberMatch = MatchType.NSN_MATCH;
                    }
                    return isNumberMatch;
                } catch (NumberParseException unused2) {
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (r0.matches() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isNumberMatchingDesc(java.lang.String r302, com.facebook.phonenumbers.Phonemetadata$PhoneNumberDesc r303) {
        /*
            r301 = this;
            r0 = r301
            com.facebook.phonenumbers.RegexCache r0 = r0.regexCache
            r304 = r0
            r0 = r303
            java.lang.String r0 = r0.nationalNumberPattern_
            r305 = r0
            r0 = r304
            r1 = r305
            java.util.regex.Pattern r0 = r0.getPatternForRegex(r1)
            r1 = r302
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r306 = r0
            r0 = r301
            com.facebook.phonenumbers.RegexCache r0 = r0.regexCache
            r304 = r0
            r0 = r303
            java.lang.String r0 = r0.possibleNumberPattern_
            r305 = r0
            r0 = r304
            r1 = r305
            java.util.regex.Pattern r0 = r0.getPatternForRegex(r1)
            r1 = r302
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r305 = r0
            r0 = r305
            boolean r0 = r0.matches()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L49
            r0 = r306
            boolean r0 = r0.matches()
            r308 = r0
            r0 = 1
            r307 = r0
            r0 = r308
            if (r0 != 0) goto L4f
        L49:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L4f:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.isNumberMatchingDesc(java.lang.String, com.facebook.phonenumbers.Phonemetadata$PhoneNumberDesc):boolean");
    }

    public boolean isPossibleNumber(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        ValidationResult validationResult;
        String nationalSignificantNumber = getNationalSignificantNumber(phonenumber$PhoneNumber);
        int i = phonenumber$PhoneNumber.countryCode_;
        if (Arrays.binarySearch(PhoneNumberUtilData.CountryCallingCodeToRegionCodeTable.COUNTRY_CALLING_CODE_KEY_COLUMN, (short) i) >= 0) {
            validationResult = testNumberLengthAgainstPattern(this.regexCache.getPatternForRegex(getMetadataForRegionOrCallingCode(i, this.data.getRegionCodeForCountryCallingCode(i)).generalDesc_.possibleNumberPattern_), nationalSignificantNumber);
        } else {
            validationResult = ValidationResult.INVALID_COUNTRY_CODE;
        }
        boolean z = false;
        if (validationResult == ValidationResult.IS_POSSIBLE) {
            z = true;
        }
        return z;
    }

    public boolean isValidNumberForRegion(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str) {
        int i = phonenumber$PhoneNumber.countryCode_;
        Phonemetadata$PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(i, str);
        if (metadataForRegionOrCallingCode != null) {
            return ("001".equals(str) || i == getCountryCodeForValidRegion(str)) && getNumberTypeHelper(getNationalSignificantNumber(phonenumber$PhoneNumber), metadataForRegionOrCallingCode) != PhoneNumberType.UNKNOWN;
        }
        return false;
    }

    public void loadMetadataFromFile(String str, String str2, int i, MetadataLoader metadataLoader) {
        ArrayList arrayList;
        boolean equals = "001".equals(str2);
        String A0v = 0Pz.A0v("libphone_data/", str, "_", equals ? String.valueOf(i) : str2);
        InputStream loadMetadata = metadataLoader.loadMetadata(A0v);
        if (loadMetadata == null) {
            logger.log(Level.SEVERE, 0Pz.A0W("missing metadata: ", A0v));
            throw 1BK.A0i("missing metadata: ", A0v);
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(loadMetadata);
            try {
                try {
                    arrayList = new ArrayList();
                    try {
                        int readInt = objectInputStream.readInt();
                        for (int i2 = 0; i2 < readInt; i2++) {
                            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
                            phonemetadata$PhoneMetadata.readExternal(objectInputStream);
                            arrayList.add(phonemetadata$PhoneMetadata);
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e) {
                            logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e);
                        }
                    } catch (IOException e2) {
                        Logger logger2 = logger;
                        Level level = Level.WARNING;
                        logger2.log(level, "error reading input (ignored)", (Throwable) e2);
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            logger2.log(level, "error closing input stream (ignored)", (Throwable) e3);
                        }
                    }
                } catch (Throwable unused) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e4) {
                        logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e4);
                    }
                }
            } catch (Throwable unused2) {
            }
            if (arrayList.isEmpty()) {
                logger.log(Level.SEVERE, 0Pz.A0W("empty metadata: ", A0v));
                throw 1BK.A0i("empty metadata: ", A0v);
            }
            if (arrayList.size() > 1) {
                logger.log(Level.WARNING, 0Pz.A0W("invalid metadata (too many entries): ", A0v));
            }
            Object obj = arrayList.get(0);
            if (equals) {
                this.countryCodeToNonGeographicalMetadataMap.put(Integer.valueOf(i), obj);
            } else {
                this.regionToMetadataMap.put(str2, obj);
            }
        } catch (IOException e5) {
            logger.log(Level.SEVERE, 0Pz.A0W("cannot load/parse metadata: ", A0v), (Throwable) e5);
            throw 1BK.A0s(0Pz.A0W("cannot load/parse metadata: ", A0v), e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int maybeExtractCountryCode(java.lang.String r302, com.facebook.phonenumbers.Phonemetadata$PhoneMetadata r303, java.lang.StringBuilder r304, boolean r305, com.facebook.phonenumbers.Phonenumber$PhoneNumber r306) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.maybeExtractCountryCode(java.lang.String, com.facebook.phonenumbers.Phonemetadata$PhoneMetadata, java.lang.StringBuilder, boolean, com.facebook.phonenumbers.Phonenumber$PhoneNumber):int");
    }

    public boolean maybeStripNationalPrefixAndCarrierCode(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String str = phonemetadata$PhoneMetadata.nationalPrefixForParsing_;
        if (length == 0 || str.length() == 0) {
            return false;
        }
        Matcher matcher = this.regexCache.getPatternForRegex(str).matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        Pattern patternForRegex = this.regexCache.getPatternForRegex(phonemetadata$PhoneMetadata.generalDesc_.nationalNumberPattern_);
        boolean matches = patternForRegex.matcher(sb).matches();
        int groupCount = matcher.groupCount();
        String str2 = phonemetadata$PhoneMetadata.nationalPrefixTransformRule_;
        if (str2 == null || str2.length() == 0 || matcher.group(groupCount) == null) {
            if (matches && !patternForRegex.matcher(sb.substring(matcher.end())).matches()) {
                return false;
            }
            if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                sb2.append(matcher.group(1));
            }
            sb.delete(0, matcher.end());
            return true;
        }
        StringBuilder sb3 = new StringBuilder(sb);
        sb3.replace(0, length, matcher.replaceFirst(str2));
        if (matches && !patternForRegex.matcher(sb3.toString()).matches()) {
            return false;
        }
        if (sb2 != null && groupCount > 1) {
            sb2.append(matcher.group(1));
        }
        sb.replace(0, sb.length(), sb3.toString());
        return true;
    }

    public Phonenumber$PhoneNumber parse(String str, String str2) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        parseHelper(str, str2, false, true, phonenumber$PhoneNumber);
        return phonenumber$PhoneNumber;
    }

    public Phonenumber$PhoneNumber parseAndKeepRawInput(String str, String str2) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        parseHelper(str, str2, true, true, phonenumber$PhoneNumber);
        return phonenumber$PhoneNumber;
    }
}
