package com.facebook.phonenumbers;

import X.0Pz;
import X.1BK;
import X.AnonymousClass001;
import X.DKD;
import com.facebook.acra.constants.ActionId;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: AsYouTypeFormatter.class */
public class AsYouTypeFormatter {
    public static final Pattern CHARACTER_CLASS_PATTERN;
    public static final Pattern DIGIT_PATTERN;
    public static final Pattern ELIGIBLE_FORMAT_PATTERN;
    public static final Phonemetadata$PhoneMetadata EMPTY_METADATA;
    public static final Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN;
    public static final Pattern STANDALONE_DIGIT_PATTERN;
    public Phonemetadata$PhoneMetadata currentMetadata;
    public String defaultCountry;
    public Phonemetadata$PhoneMetadata defaultMetadata;
    public final PhoneNumberUtil phoneUtil;
    public String currentOutput = "";
    public StringBuilder formattingTemplate = AnonymousClass001.A0k();
    public String currentFormattingPattern = "";
    public StringBuilder accruedInput = AnonymousClass001.A0k();
    public StringBuilder accruedInputWithoutFormatting = AnonymousClass001.A0k();
    public boolean ableToFormat = true;
    public boolean inputHasFormatting = false;
    public boolean isCompleteNumber = false;
    public boolean isExpectingCountryCallingCode = false;
    public int lastMatchPosition = 0;
    public int originalPosition = 0;
    public int positionToRemember = 0;
    public StringBuilder prefixBeforeNationalNumber = AnonymousClass001.A0k();
    public boolean shouldAddSpaceAfterNationalPrefix = false;
    public String extractedNationalPrefix = "";
    public StringBuilder nationalNumber = AnonymousClass001.A0k();
    public List possibleFormats = AnonymousClass001.A0s();
    public RegexCache regexCache = new RegexCache(64);

    static {
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
        phonemetadata$PhoneMetadata.hasInternationalPrefix = true;
        phonemetadata$PhoneMetadata.internationalPrefix_ = "NA";
        EMPTY_METADATA = phonemetadata$PhoneMetadata;
        CHARACTER_CLASS_PATTERN = Pattern.compile("\\[([^\\[\\]])*\\]");
        STANDALONE_DIGIT_PATTERN = Pattern.compile("\\d(?=[^,}][^,}])");
        ELIGIBLE_FORMAT_PATTERN = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)+");
        NATIONAL_PREFIX_SEPARATORS_PATTERN = Pattern.compile("[- ]");
        DIGIT_PATTERN = Pattern.compile("\u2008");
    }

    public AsYouTypeFormatter(String str, PhoneNumberUtil phoneNumberUtil) {
        this.phoneUtil = phoneNumberUtil;
        this.defaultCountry = str;
        Phonemetadata$PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        this.currentMetadata = metadataForRegion;
        this.defaultMetadata = metadataForRegion;
    }

    private String appendNationalNumber(String str) {
        StringBuilder A0k;
        StringBuilder sb = this.prefixBeforeNationalNumber;
        int length = sb.length();
        if (!this.shouldAddSpaceAfterNationalPrefix || length <= 0 || sb.charAt(length - 1) == ' ') {
            A0k = AnonymousClass001.A0k();
            A0k.append((Object) this.prefixBeforeNationalNumber);
        } else {
            A0k = AnonymousClass001.A0k();
            A0k.append(new String(this.prefixBeforeNationalNumber));
            A0k.append(' ');
        }
        return AnonymousClass001.A0d(str, A0k);
    }

    private String attemptToChooseFormattingPattern() {
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata;
        List<Phonemetadata$NumberFormat> list;
        StringBuilder sb = this.nationalNumber;
        int length = sb.length();
        String obj = sb.toString();
        if (length < 3) {
            return appendNationalNumber(obj);
        }
        if (!this.isCompleteNumber || this.currentMetadata.intlNumberFormat_.size() <= 0) {
            phonemetadata$PhoneMetadata = this.currentMetadata;
            list = phonemetadata$PhoneMetadata.numberFormat_;
        } else {
            phonemetadata$PhoneMetadata = this.currentMetadata;
            list = phonemetadata$PhoneMetadata.intlNumberFormat_;
        }
        boolean z = phonemetadata$PhoneMetadata.hasNationalPrefix;
        for (Phonemetadata$NumberFormat phonemetadata$NumberFormat : list) {
            if (!z || this.isCompleteNumber || phonemetadata$NumberFormat.nationalPrefixOptionalWhenFormatting_ || PhoneNumberUtil.formattingRuleHasFirstGroupOnly(phonemetadata$NumberFormat.nationalPrefixFormattingRule_)) {
                if (DKD.A1X(phonemetadata$NumberFormat.format_, ELIGIBLE_FORMAT_PATTERN)) {
                    this.possibleFormats.add(phonemetadata$NumberFormat);
                }
            }
        }
        narrowDownPossibleFormats(obj);
        String attemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
        if (attemptToFormatAccruedDigits.length() <= 0) {
            if (!maybeCreateNewTemplate()) {
                return this.accruedInput.toString();
            }
            attemptToFormatAccruedDigits = inputAccruedNationalNumber();
        }
        return attemptToFormatAccruedDigits;
    }

    private boolean attemptToExtractCountryCallingCode() {
        StringBuilder A0k;
        int extractCountryCode;
        Phonemetadata$PhoneMetadata metadataForRegion;
        StringBuilder sb = this.nationalNumber;
        if (sb.length() == 0 || (extractCountryCode = this.phoneUtil.extractCountryCode(sb, (A0k = AnonymousClass001.A0k()))) == 0) {
            return false;
        }
        this.nationalNumber.setLength(0);
        this.nationalNumber.append((CharSequence) A0k);
        String regionCodeForCountryCallingCode = this.phoneUtil.data.getRegionCodeForCountryCallingCode(extractCountryCode);
        if (!"001".equals(regionCodeForCountryCallingCode)) {
            if (!regionCodeForCountryCallingCode.equals(this.defaultCountry)) {
                metadataForRegion = getMetadataForRegion(regionCodeForCountryCallingCode);
            }
            String num = Integer.toString(extractCountryCode);
            StringBuilder sb2 = this.prefixBeforeNationalNumber;
            sb2.append(num);
            sb2.append(' ');
            this.extractedNationalPrefix = "";
            return true;
        }
        metadataForRegion = this.phoneUtil.getMetadataForNonGeographicalRegion(extractCountryCode);
        this.currentMetadata = metadataForRegion;
        String num2 = Integer.toString(extractCountryCode);
        StringBuilder sb22 = this.prefixBeforeNationalNumber;
        sb22.append(num2);
        sb22.append(' ');
        this.extractedNationalPrefix = "";
        return true;
    }

    private boolean attemptToExtractIdd() {
        Matcher matcher = this.regexCache.getPatternForRegex(0Pz.A0W("\\+|", this.currentMetadata.internationalPrefix_)).matcher(this.accruedInputWithoutFormatting);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.isCompleteNumber = true;
        int end = matcher.end();
        this.nationalNumber.setLength(0);
        this.nationalNumber.append(this.accruedInputWithoutFormatting.substring(end));
        this.prefixBeforeNationalNumber.setLength(0);
        this.prefixBeforeNationalNumber.append(this.accruedInputWithoutFormatting.substring(0, end));
        if (this.accruedInputWithoutFormatting.charAt(0) != '+') {
            this.prefixBeforeNationalNumber.append(' ');
        }
        return true;
    }

    private Phonemetadata$PhoneMetadata getMetadataForRegion(String str) {
        Phonemetadata$PhoneMetadata metadataForRegion = this.phoneUtil.getMetadataForRegion(this.phoneUtil.data.getRegionCodeForCountryCallingCode(this.phoneUtil.getCountryCodeForRegion(str)));
        if (metadataForRegion == null) {
            metadataForRegion = EMPTY_METADATA;
        }
        return metadataForRegion;
    }

    private String inputAccruedNationalNumber() {
        StringBuilder sb;
        String inputDigitHelper;
        int length = this.nationalNumber.length();
        if (length > 0) {
            int i = 0;
            do {
                inputDigitHelper = inputDigitHelper(this.nationalNumber.charAt(i));
                i++;
            } while (i < length);
            if (this.ableToFormat) {
                return appendNationalNumber(inputDigitHelper);
            }
            sb = this.accruedInput;
        } else {
            sb = this.prefixBeforeNationalNumber;
        }
        return sb.toString();
    }

    private String inputDigitHelper(char c) {
        Matcher matcher = DIGIT_PATTERN.matcher(this.formattingTemplate);
        if (!matcher.find(this.lastMatchPosition)) {
            if (this.possibleFormats.size() == 1) {
                this.ableToFormat = false;
            }
            this.currentFormattingPattern = "";
            return this.accruedInput.toString();
        }
        String replaceFirst = matcher.replaceFirst(Character.toString(c));
        this.formattingTemplate.replace(0, replaceFirst.length(), replaceFirst);
        int start = matcher.start();
        this.lastMatchPosition = start;
        return this.formattingTemplate.substring(0, start + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (attemptToExtractCountryCallingCode() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (X.DKD.A1X(java.lang.Character.toString(r302), com.facebook.phonenumbers.PhoneNumberUtil.getPlusCharsPattern()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String inputDigitWithOptionToRememberPosition(char r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.AsYouTypeFormatter.inputDigitWithOptionToRememberPosition(char, boolean):java.lang.String");
    }

    private boolean maybeCreateNewTemplate() {
        Iterator it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            String str = phonemetadata$NumberFormat.pattern_;
            if (this.currentFormattingPattern.equals(str)) {
                return false;
            }
            if (str.indexOf(ActionId.VIEW_DID_LOAD_BEGIN) == -1) {
                String replaceAll = STANDALONE_DIGIT_PATTERN.matcher(CHARACTER_CLASS_PATTERN.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                this.formattingTemplate.setLength(0);
                String str2 = phonemetadata$NumberFormat.format_;
                Matcher matcher = this.regexCache.getPatternForRegex(replaceAll).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                String replaceAll2 = group.length() < this.nationalNumber.length() ? "" : group.replaceAll(replaceAll, str2).replaceAll("9", "\u2008");
                if (replaceAll2.length() > 0) {
                    this.formattingTemplate.append(replaceAll2);
                    this.currentFormattingPattern = str;
                    this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(phonemetadata$NumberFormat.nationalPrefixFormattingRule_).find();
                    this.lastMatchPosition = 0;
                    return true;
                }
            }
            it.remove();
        }
        this.ableToFormat = false;
        return false;
    }

    private void narrowDownPossibleFormats(String str) {
        int length = str.length() - 3;
        Iterator it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            if (phonemetadata$NumberFormat.leadingDigitsPattern_.size() != 0) {
                if (!this.regexCache.getPatternForRegex(1BK.A14(phonemetadata$NumberFormat.leadingDigitsPattern_, Math.min(length, AnonymousClass001.A04(phonemetadata$NumberFormat.leadingDigitsPattern_)))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private String removeNationalPrefixFromNationalNumber() {
        boolean z = false;
        if (this.currentMetadata.countryCode_ == 1 && this.nationalNumber.charAt(0) == '1' && this.nationalNumber.charAt(1) != '0' && this.nationalNumber.charAt(1) != '1') {
            z = true;
        }
        int i = 1;
        if (z) {
            StringBuilder sb = this.prefixBeforeNationalNumber;
            sb.append('1');
            sb.append(' ');
            this.isCompleteNumber = true;
        } else {
            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = this.currentMetadata;
            if (phonemetadata$PhoneMetadata.hasNationalPrefixForParsing) {
                Matcher matcher = this.regexCache.getPatternForRegex(phonemetadata$PhoneMetadata.nationalPrefixForParsing_).matcher(this.nationalNumber);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.isCompleteNumber = true;
                    i = matcher.end();
                    this.prefixBeforeNationalNumber.append(this.nationalNumber.substring(0, i));
                }
            }
            i = 0;
        }
        String substring = this.nationalNumber.substring(0, i);
        this.nationalNumber.delete(0, i);
        return substring;
    }

    public String attemptToFormatAccruedDigits() {
        for (Phonemetadata$NumberFormat phonemetadata$NumberFormat : this.possibleFormats) {
            Matcher matcher = this.regexCache.getPatternForRegex(phonemetadata$NumberFormat.pattern_).matcher(this.nationalNumber);
            if (matcher.matches()) {
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(phonemetadata$NumberFormat.nationalPrefixFormattingRule_).find();
                return appendNationalNumber(matcher.replaceAll(phonemetadata$NumberFormat.format_));
            }
        }
        return "";
    }

    public void clear() {
        this.currentOutput = "";
        this.accruedInput.setLength(0);
        this.accruedInputWithoutFormatting.setLength(0);
        this.formattingTemplate.setLength(0);
        this.lastMatchPosition = 0;
        this.currentFormattingPattern = "";
        this.prefixBeforeNationalNumber.setLength(0);
        this.extractedNationalPrefix = "";
        this.nationalNumber.setLength(0);
        this.ableToFormat = true;
        this.inputHasFormatting = false;
        this.positionToRemember = 0;
        this.originalPosition = 0;
        this.isCompleteNumber = false;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.shouldAddSpaceAfterNationalPrefix = false;
        if (this.currentMetadata.equals(this.defaultMetadata)) {
            return;
        }
        this.currentMetadata = getMetadataForRegion(this.defaultCountry);
    }

    public String inputDigit(char c) {
        String inputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c, false);
        this.currentOutput = inputDigitWithOptionToRememberPosition;
        return inputDigitWithOptionToRememberPosition;
    }

    public String inputDigitAndRememberPosition(char c) {
        String inputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c, true);
        this.currentOutput = inputDigitWithOptionToRememberPosition;
        return inputDigitWithOptionToRememberPosition;
    }
}
