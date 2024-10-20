package X;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.6ay, reason: invalid class name */
/* loaded from: 6ay.class */
public final class C6ay {
    public static final Pattern A00 = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap A01 = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x06f6, code lost:
    
        if (r0.A03 != 6) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x088f, code lost:
    
        if (r302.equals("L30") == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x03b0, code lost:
    
        if (r305 != null) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02de, code lost:
    
        if (r302.equals("04") == false) goto L56;
     */
    /* JADX WARN: Failed to calculate best type for var: r308v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r308v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r318v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r318v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x03c8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x007e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x071e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x01eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 308, insn: 0x0e16: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r308 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:483:0x0e15 */
    /* JADX WARN: Not initialized variable reg: 318, insn: 0x0e42: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r318 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:484:0x0e41 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair A00(X.6Yl r301) {
        /*
            Method dump skipped, instructions count: 4144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ay.A00(X.6Yl):android.util.Pair");
    }

    public static C6b1 A01(String str) {
        List A04 = A04(str, false, false);
        if (A04.isEmpty()) {
            return null;
        }
        return (C6b1) A04.get(0);
    }

    public static String A02(6Yl r301) {
        Pair A002;
        String str = r301.A0W;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(str) || (A002 = A00(r301)) == null) {
            return null;
        }
        int A03 = AnonymousClass001.A03(A002.first);
        if (A03 == 16 || A03 == 256) {
            return "video/hevc";
        }
        if (A03 == 512) {
            return "video/avc";
        }
        return null;
    }

    public static ArrayList A03(final 6Yl r301, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new AHU(new AZ1() { // from class: X.Laq
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
            
                if (r0.equals(X.C6ay.A02(r0)) != false) goto L6;
             */
            @Override // X.AZ1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final int B95(java.lang.Object r302) {
                /*
                    r301 = this;
                    r0 = r301
                    X.6Yl r0 = r302
                    r303 = r0
                    r0 = r302
                    X.6b1 r0 = (X.C6b1) r0
                    r302 = r0
                    r0 = r302
                    java.lang.String r0 = r0.A02
                    r304 = r0
                    r0 = r303
                    java.lang.String r0 = r0.A0W
                    r305 = r0
                    r0 = r304
                    r1 = r305
                    boolean r0 = r0.equals(r1)
                    r306 = r0
                    r0 = r306
                    if (r0 != 0) goto L3b
                    r0 = r303
                    java.lang.String r0 = X.C6ay.A02(r0)
                    r305 = r0
                    r0 = r304
                    r1 = r305
                    boolean r0 = r0.equals(r1)
                    r307 = r0
                    r0 = 0
                    r306 = r0
                    r0 = 0
                    r305 = r0
                    r0 = r307
                    if (r0 == 0) goto L3e
                L3b:
                    r0 = 1
                    r306 = r0
                L3e:
                    r0 = 0
                    r307 = r0
                    r0 = 0
                    r304 = r0
                    r0 = r306
                    if (r0 == 0) goto L58
                    r0 = r303
                    r1 = r302
                    r2 = 0
                    boolean r0 = X.C6b1.A03(r0, r1, r2)
                    r306 = r0
                    r0 = r306
                    if (r0 == 0) goto L58
                    r0 = 1
                    r307 = r0
                L58:
                    r0 = r307
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.Laq.B95(java.lang.Object):int");
            }
        }, 12));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r303 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        if (A07(r0) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List A04(java.lang.String r301, boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ay.A04(java.lang.String, boolean, boolean):java.util.List");
    }

    public static void A05(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isVendor();
    }

    public static void A06(String str) {
        String str2;
        try {
            A04(str, false, false);
        } catch (C7ho e) {
            e = e;
            str2 = "Codec warming failed";
            5My.A05("MediaCodecUtil", str2, e);
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str2 = "Codec warming failed with UnsatisfiedLinkError";
            5My.A05("MediaCodecUtil", str2, e);
        }
    }

    public static boolean A07(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A08(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A09(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean A0A(MediaCodecInfo mediaCodecInfo, String str) {
        boolean z;
        if (Util.A00 < 29) {
            if (!"audio".equals(C6ac.A04(str))) {
                String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
                z = false;
                if (!lowerCase.startsWith("arc.")) {
                    if (!lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("omx.ffmpeg.") && ((!lowerCase.startsWith("omx.sec.") || !lowerCase.contains(".sw.")) && !lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.") && (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")))) {
                        return false;
                    }
                }
            }
            return true;
        }
        z = A09(mediaCodecInfo);
        return z;
    }
}
