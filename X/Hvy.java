package X;

import android.media.MediaFormat;
import java.io.IOException;

/* loaded from: Hvy.class */
public abstract class Hvy {
    /* JADX WARN: Type inference failed for: r0v24, types: [X.Ije, X.JGz, java.lang.Object] */
    public static JGz A00(HAy hAy, JKb jKb, String str) {
        if (hAy != HAy.A01) {
            if (hAy == HAy.A03) {
                return Ijf.A00(jKb, str);
            }
            return null;
        }
        JN4 AIh = jKb.AIh();
        try {
            try {
                AIh.Cnx(str);
                HfI A00 = I9s.A00(AIh);
                if (A00 != null) {
                    MediaFormat mediaFormat = A00.A01;
                    ?? obj = new Object();
                    if (mediaFormat.containsKey("channel-count")) {
                        obj.A00 = mediaFormat.getInteger("channel-count");
                        if (mediaFormat.containsKey("sample-rate")) {
                            obj.A01 = mediaFormat.getInteger("sample-rate");
                            if (mediaFormat.containsKey("mime")) {
                                String string = mediaFormat.getString("mime");
                                if (string != null) {
                                    obj.A02 = string;
                                    return obj;
                                }
                            }
                        }
                    }
                }
                AIh.release();
                return null;
            } catch (H3n | IOException unused) {
                AIh.release();
                return null;
            }
        } finally {
            AIh.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fd, code lost:
    
        if (r0.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0200, code lost:
    
        r0 = X.GOp.A1D(((X.Huc) r0.next()).A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0221, code lost:
    
        if (r0.hasNext() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0230, code lost:
    
        r0 = ((X.HuY) r0.next()).A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0239, code lost:
    
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023c, code lost:
    
        r0 = r0.getCanonicalPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0245, code lost:
    
        if (r314 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0259, code lost:
    
        r0 = A00(r302, r304, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0262, code lost:
    
        if (r328 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0272, code lost:
    
        if (r328.BSC(r0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0275, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x024a, code lost:
    
        r328 = A00(r302, r304, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0251, code lost:
    
        r314 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0279, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r305 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r302 != X.HAy.A01) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r0 = r303.A08(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        r0 = X.1BK.A17(r0.values());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        java.util.Collections.sort(r0, new X.J4h(12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        r320 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
    
        if (r0.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r0 = (X.Huc) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0115, code lost:
    
        if (r320 != r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        if (r320 < r0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0156, code lost:
    
        r0 = r0 + X.IEs.A01(r301, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012b, code lost:
    
        if (r0.A00 > 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0131, code lost:
    
        r0 = X.IEs.A01(r301, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0160, code lost:
    
        r0 = r303.A08(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0169, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016c, code lost:
    
        r0 = r303.A08(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0175, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0178, code lost:
    
        r0 = X.GOo.A13(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018a, code lost:
    
        if (r0.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
    
        r0 = X.GOp.A1D(((X.Huc) r0.next()).A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ae, code lost:
    
        if (r0.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (((X.HuY) r0.next()).A03.A03(java.util.concurrent.TimeUnit.MICROSECONDS) <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01df, code lost:
    
        r328 = null;
        r0 = X.GOo.A13(r0);
        r314 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.JO9 r301, X.HAy r302, X.I9d r303, X.JKb r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hvy.A01(X.JO9, X.HAy, X.I9d, X.JKb, boolean):boolean");
    }
}
