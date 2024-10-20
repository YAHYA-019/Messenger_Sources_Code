package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: MB2.class */
public class MB2 extends DefaultHandler implements MG4 {
    public long A00;
    public KgH A01;
    public String A02;
    public final String A03;
    public final XmlPullParserFactory A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public static final Pattern A0C = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern A08 = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A09 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final Pattern A0A = Pattern.compile("^https?:\\/\\/[^\\/]+(\\/.+)$");
    public static final int[] A0B = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public MB2() {
        this(null, 0, false, false, false, false, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v7 ??, still in use, count: 2, list:
          (r309v7 ??) from 0x0067: PHI (r309v6 ??) = (r309v5 ??), (r309v7 ??) binds: [B:15:0x0054, B:20:0x0064] A[DONT_GENERATE, DONT_INLINE]
          (r309v7 ?? I:X.KgH) from 0x0064: SPUT (r309v7 ?? I:X.KgH) A[Catch: all -> 0x006d] X.KgH.A01 X.KgH
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
    public MB2(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v7 ??, still in use, count: 2, list:
          (r309v7 ??) from 0x0067: PHI (r309v6 ??) = (r309v5 ??), (r309v7 ??) binds: [B:15:0x0054, B:20:0x0064] A[DONT_GENERATE, DONT_INLINE]
          (r309v7 ?? I:X.KgH) from 0x0064: SPUT (r309v7 ?? I:X.KgH) A[Catch: all -> 0x006d] X.KgH.A01 X.KgH
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
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

    public static float A00(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = A0C.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                f = parseInt;
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    f /= Integer.parseInt(r0);
                }
            }
        }
        return f;
    }

    public static int A01(String str) {
        Object obj;
        if (str == null) {
            return 0;
        }
        int i = 2;
        switch (str.hashCode()) {
            case -2060497896:
                obj = "subtitle";
                break;
            case -1724546052:
                return str.equals("description") ? 512 : 0;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                }
                return 0;
            case -1574842690:
                obj = "forced_subtitle";
                break;
            case -1408024454:
                if (!str.equals("alternate")) {
                    return 0;
                }
                return i;
            case -1396432756:
                obj = "forced-subtitle";
                break;
            case 99825:
                return str.equals("dub") ? 16 : 0;
            case 3343801:
                return str.equals("main") ? 1 : 0;
            case 3530173:
                return str.equals("sign") ? 256 : 0;
            case 552573414:
                return str.equals("caption") ? 64 : 0;
            case 899152809:
                return str.equals("commentary") ? 8 : 0;
            case 1629013393:
                return str.equals("emergency") ? 32 : 0;
            case 1855372047:
                return str.equals(4YT.A00(1510)) ? 4 : 0;
            default:
                return 0;
        }
        if (!str.equals(obj)) {
            return 0;
        }
        i = 128;
        return i;
    }

    public static int A02(String str, XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x021f, code lost:
    
        if (r306 != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(org.xmlpull.v1.XmlPullParser r301) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB2.A03(org.xmlpull.v1.XmlPullParser):int");
    }

    public static int A04(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        int i = -1;
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                i = 1;
            } else {
                if ("video".equals(attributeValue)) {
                    return 2;
                }
                if ("text".equals(attributeValue)) {
                    return 3;
                }
                if ("image".equals(attributeValue)) {
                    return 4;
                }
            }
        }
        return i;
    }

    public static long A05(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            Matcher matcher = Util.A06.matcher(attributeValue);
            if (!matcher.matches()) {
                return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
            }
            boolean A1V = JQx.A1V(matcher.group(1));
            String group = matcher.group(3);
            double d = 0.0d;
            double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
            String group2 = matcher.group(5);
            double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
            String group3 = matcher.group(7);
            double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
            String group4 = matcher.group(10);
            double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
            String group5 = matcher.group(12);
            double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
            String group6 = matcher.group(14);
            if (group6 != null) {
                d = Double.parseDouble(group6);
            }
            j = (long) ((parseDouble5 + d) * 1000.0d);
            if (A1V) {
                j = -j;
            }
        }
        return j;
    }

    public static long A06(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        return j;
    }

    public static long A07(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue != null) {
            if (!"INF".equals(attributeValue)) {
                return Float.parseFloat(attributeValue) * 1000000.0f;
            }
            j = Long.MAX_VALUE;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair A08(org.xmlpull.v1.XmlPullParser r301) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB2.A08(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static Krd A09(String str, XmlPullParser xmlPullParser) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        String str3 = attributeValue != null ? attributeValue : "";
        String str4 = null;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 != null) {
            str4 = attributeValue2;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!KwT.A00(str, xmlPullParser));
        return new Krd(str3, str4, str2);
    }

    private KuW A0A(String str, String str2, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new KuW(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new KuW(attributeValue, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r325v6, types: [X.KSm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.K1I A0B(X.K1I r302, org.xmlpull.v1.XmlPullParser r303, long r304, long r306, long r308, long r310) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB2.A0B(X.K1I, org.xmlpull.v1.XmlPullParser, long, long, long, long):X.K1I");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x018d, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ec, code lost:
    
        if (r301.A05 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027e, code lost:
    
        if (r0 != (-1)) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r343v5, types: [X.KSm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.K1J A0C(X.K1J r302, java.util.List r303, org.xmlpull.v1.XmlPullParser r304, long r305, long r307, long r309, long r311, boolean r313) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB2.A0C(X.K1J, java.util.List, org.xmlpull.v1.XmlPullParser, long, long, long, long, boolean):X.K1J");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.KSm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.KSm A0D(X.KkS r302, org.xmlpull.v1.XmlPullParser r303) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB2.A0D(X.KkS, org.xmlpull.v1.XmlPullParser):X.KSm");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0188. Please report as an issue. */
    public static Kq7 A0E(Kq7 kq7, String str, XmlPullParser xmlPullParser) {
        String str2;
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return kq7;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = attributeValue.length();
            if (i2 >= length) {
                return new Kq7(iArr, strArr, strArr2, i3);
            }
            int indexOf = attributeValue.indexOf("$", i2);
            if (indexOf == -1) {
                strArr[i3] = 0Pz.A0W(strArr[i3], attributeValue.substring(i2));
                i2 = length;
            } else if (indexOf != i2) {
                strArr[i3] = 0Pz.A0W(strArr[i3], attributeValue.substring(i2, indexOf));
                i2 = indexOf;
            } else if (attributeValue.startsWith("$$", i2)) {
                strArr[i3] = 0Pz.A0W(strArr[i3], "$");
                i2 += 2;
            } else {
                int i4 = i2 + 1;
                int indexOf2 = attributeValue.indexOf("$", i4);
                String substring = attributeValue.substring(i4, indexOf2);
                if (!substring.equals("RepresentationID")) {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = 0Pz.A0W(str2, "d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (!substring.equals("Number")) {
                                break;
                            } else {
                                iArr[i3] = 2;
                                strArr2[i3] = str2;
                                break;
                            }
                        case 2606829:
                            if (!substring.equals("Time")) {
                                break;
                            } else {
                                i = 4;
                                iArr[i3] = i;
                                strArr2[i3] = str2;
                                break;
                            }
                        case 38199441:
                            if (!substring.equals("Bandwidth")) {
                                break;
                            } else {
                                i = 3;
                                iArr[i3] = i;
                                strArr2[i3] = str2;
                                break;
                            }
                    }
                } else {
                    iArr[i3] = 1;
                }
                i3++;
                strArr[i3] = "";
                i2 = indexOf2 + 1;
            }
        }
        throw 0Pz.A05("Invalid template: ", attributeValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v155, types: [java.lang.Number] */
    private String A0F(StringBuilder sb, List list) {
        String str = "";
        sb.append(0Pz.A0j("VideoId: ", this.A03, "\n"));
        sb.append("++++++++++++++++++++++++++++++++++++++++\n");
        sb.append("Is MCM: ");
        sb.append(A0L(list));
        sb.append("\n");
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Iterator it2 = ((KqM) it.next()).A03.iterator();
            int i = 0;
            while (it2.hasNext()) {
                L0w A0e = JQx.A0e(it2);
                if (A0e != null && A0e.A01 == 2) {
                    JQy.A1S("Adaptation set ", "\n", sb, i);
                    i++;
                    int i2 = 0;
                    for (6Cu r0 : A0e.A07) {
                        sb.append("  [");
                        sb.append(i2);
                        sb.append("]");
                        6Yl r02 = r0.A03;
                        String str2 = r02.A0W;
                        sb.append(str2);
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb.append(r02.A0L);
                        sb.append("x");
                        sb.append(r02.A0A);
                        sb.append(",aoai: ");
                        6Zt r03 = r02.A0N;
                        sb.append(r03.A09);
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb.append(r03.A07);
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb.append(r02.A05);
                        sb.append("bps\n");
                        i2++;
                        Integer num = new Integer(0);
                        if (A0u.containsKey(str2)) {
                            num = (Number) A0u.get(str2);
                            if (num == null) {
                                num = new Integer(0);
                            }
                        }
                        AnonymousClass001.A1A(str2, A0u, num.intValue() + 1);
                    }
                }
            }
        }
        sb.append("----------------------------------------\n");
        if (!A0u.isEmpty()) {
            Iterator A0x = AnonymousClass001.A0x(A0u);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                str = 0Pz.A0W(0Pz.A0W(str, String.format(Locale.US, "%d%s", A0z.getValue(), A0z.getKey())), "+");
            }
            int length = str.length();
            if (length > 1) {
                str = str.substring(0, length - 1);
            }
        }
        return str;
    }

    public static ArrayList A0G(List list, XmlPullParser xmlPullParser, boolean z) {
        int i;
        ArrayList A0s;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = (-1) << (-1);
            if (z) {
                i = 1;
            }
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                A0I(xmlPullParser);
            }
        } while (!KwT.A00("BaseURL", xmlPullParser));
        if (str == null || L6E.A02(str)[0] == -1) {
            A0s = AnonymousClass001.A0s();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Krl krl = (Krl) list.get(i2);
                String A00 = L6E.A00(krl.A03, str);
                String str2 = attributeValue3;
                if (attributeValue3 == null) {
                    str2 = A00;
                }
                if (z) {
                    i = krl.A00;
                    parseInt = krl.A01;
                    str2 = krl.A02;
                }
                A0s.add(new Krl(A00, str2, i, parseInt));
            }
        } else {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            A0s = 1JW.A03(new Krl[]{new Krl(str, attributeValue3, i, parseInt)});
        }
        return A0s;
    }

    public static void A0H(6Zr r301, KmH kmH, String str, Collection collection) {
        String str2;
        ArrayList arrayList = kmH.A05;
        arrayList.addAll(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i);
            UUID uuid = 6Za.A00;
            if (!uuid.equals(schemeData.A03) || (str2 = schemeData.A01) == null) {
                i++;
            } else {
                arrayList.remove(i);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i2);
                    if (6Za.A01.equals(schemeData2.A03) && schemeData2.A01 == null) {
                        arrayList.set(i2, new DrmInitData.SchemeData(str2, schemeData2.A02, uuid, schemeData2.A04));
                    }
                }
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                r301.A00(new DrmInitData(str, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false));
                return;
            }
            DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) arrayList.get(size);
            if (schemeData3.A04 == null) {
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList.size()) {
                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) arrayList.get(i3);
                        if (schemeData4.A04 != null && schemeData3.A04 == null && schemeData4.A00(schemeData3.A03)) {
                            arrayList.remove(size);
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
    }

    public static void A0I(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (true) {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                i++;
            } else if (xmlPullParser.getEventType() == 3) {
                i--;
            } else {
                continue;
            }
            if (i == 0) {
                return;
            }
        }
    }

    public static boolean A0J(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KqM kqM = (KqM) it.next();
            if (kqM != null) {
                Iterator it2 = kqM.A03.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    L0w A0e = JQx.A0e(it2);
                    if (A0e != null && A0e.A01 == i) {
                        i2++;
                        if (i2 > 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean A0K(String str, XmlPullParser xmlPullParser) {
        boolean z = false;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            z = attributeValue.equals("true");
        }
        return z;
    }

    public static boolean A0L(List list) {
        String str;
        if (A0J(2, list)) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KqM kqM = (KqM) it.next();
            if (kqM != null) {
                Iterator it2 = kqM.A03.iterator();
                while (it2.hasNext()) {
                    L0w A0e = JQx.A0e(it2);
                    if (A0e != null && A0e.A01 == 2) {
                        String str2 = "";
                        for (6Cu r0 : A0e.A07) {
                            if (r0 != null && (str = r0.A03.A0W) != null && !TextUtils.isEmpty(str)) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = str;
                                } else if (!str2.equals(str)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v295 ??, still in use, count: 5, list:
          (r307v295 ??) from 0x3207: PHI (r307v355 ??) = (r307v295 ??), (r307v295 ??), (r307v295 ??), (r307v362 ??) binds: [B:688:0x31c9, B:691:0x31d5, B:706:0x31ff, B:23:0x3204] A[DONT_GENERATE, DONT_INLINE]
          (r307v295 ??) from 0x3207: PHI (r307v355 ??) = (r307v295 ??), (r307v295 ??), (r307v295 ??), (r307v362 ??) binds: [B:688:0x31c9, B:691:0x31d5, B:706:0x31ff, B:23:0x3204] A[DONT_GENERATE, DONT_INLINE]
          (r307v295 ??) from 0x3207: PHI (r307v355 ??) = (r307v295 ??), (r307v295 ??), (r307v295 ??), (r307v362 ??) binds: [B:688:0x31c9, B:691:0x31d5, B:706:0x31ff, B:23:0x3204] A[DONT_GENERATE, DONT_INLINE]
          (r307v295 ?? I:X.6W0) from 0x31c4: IPUT (r0v2205 ?? I:java.lang.String), (r307v295 ?? I:X.6W0) A[Catch: XmlPullParserException -> 0x32c9] X.6W0.A02 java.lang.String
          (r307v295 ?? I:java.lang.Object) from 0x31f8: INVOKE (r0v2233 ?? I:android.util.LruCache), (r0v2177 ?? I:java.lang.Object), (r307v295 ?? I:java.lang.Object) VIRTUAL call: android.util.LruCache.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x3298, MD:(K, V):V (c)]
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
    @Override // X.MG4
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public X.C6W0 CWe(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v295 ??, still in use, count: 5, list:
          (r307v295 ??) from 0x3207: PHI (r307v355 ??) = (r307v295 ??), (r307v295 ??), (r307v295 ??), (r307v362 ??) binds: [B:688:0x31c9, B:691:0x31d5, B:706:0x31ff, B:23:0x3204] A[DONT_GENERATE, DONT_INLINE]
          (r307v295 ??) from 0x3207: PHI (r307v355 ??) = (r307v295 ??), (r307v295 ??), (r307v295 ??), (r307v362 ??) binds: [B:688:0x31c9, B:691:0x31d5, B:706:0x31ff, B:23:0x3204] A[DONT_GENERATE, DONT_INLINE]
          (r307v295 ??) from 0x3207: PHI (r307v355 ??) = (r307v295 ??), (r307v295 ??), (r307v295 ??), (r307v362 ??) binds: [B:688:0x31c9, B:691:0x31d5, B:706:0x31ff, B:23:0x3204] A[DONT_GENERATE, DONT_INLINE]
          (r307v295 ?? I:X.6W0) from 0x31c4: IPUT (r0v2205 ?? I:java.lang.String), (r307v295 ?? I:X.6W0) A[Catch: XmlPullParserException -> 0x32c9] X.6W0.A02 java.lang.String
          (r307v295 ?? I:java.lang.Object) from 0x31f8: INVOKE (r0v2233 ?? I:android.util.LruCache), (r0v2177 ?? I:java.lang.Object), (r307v295 ?? I:java.lang.Object) VIRTUAL call: android.util.LruCache.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x3298, MD:(K, V):V (c)]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
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

    public K1M A0N(K1M k1m, XmlPullParser xmlPullParser) {
        long j;
        long A06 = A06("timescale", xmlPullParser, k1m != null ? k1m.A01 : 1L);
        long j2 = 0;
        long A062 = A06("presentationTimeOffset", xmlPullParser, k1m != null ? k1m.A00 : 0L);
        if (k1m != null) {
            j = k1m.A01;
            j2 = k1m.A00;
        } else {
            j = 0;
        }
        KuW kuW = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - j) + 1;
        }
        if (k1m != null) {
            kuW = k1m.A02;
        }
        do {
            xmlPullParser.next();
            if (KwT.A01("Initialization", xmlPullParser)) {
                kuW = A0A("sourceURL", "range", xmlPullParser);
            } else {
                A0I(xmlPullParser);
            }
        } while (!KwT.A00("SegmentBase", xmlPullParser));
        return new K1M(kuW, A06, A062, j, j2);
    }
}
