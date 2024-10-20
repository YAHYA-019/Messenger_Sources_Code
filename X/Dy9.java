package X;

import android.content.Context;

/* loaded from: Dy9.class */
public final class Dy9 extends C1rj {
    public int A00;
    public GIj A01;
    public String A02;

    public Dy9() {
        super("BigFlare");
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        EgI egI = (EgI) 1Bi.A03(99997);
        DNB dnb = new DNB(context);
        dnb.A02 = egI;
        return dnb;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (X.11T.A0O(r310, r306) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0r(X.1LI r302, X.1LI r303, X.2Yv r304, X.2Yv r305) {
        /*
            r301 = this;
            r0 = r302
            X.Dy9 r0 = (X.Dy9) r0
            r302 = r0
            r0 = r303
            X.Dy9 r0 = (X.Dy9) r0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 != 0) goto L74
            r0 = 0
            r307 = r0
        L14:
            r0 = r303
            if (r0 != 0) goto L6b
            r0 = 0
            r308 = r0
        L1b:
            r0 = r302
            if (r0 != 0) goto L5b
            r0 = 0
            r309 = r0
            r0 = 0
            r310 = r0
        L25:
            r0 = r303
            if (r0 == 0) goto L36
            r0 = r303
            int r0 = r0.A00
            r311 = r0
            r0 = r311
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r306 = r0
        L36:
            r0 = r307
            r1 = r308
            boolean r0 = X.11T.A0O(r0, r1)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L55
            r0 = r310
            r1 = r306
            boolean r0 = X.11T.A0O(r0, r1)
            r309 = r0
            r0 = 0
            r311 = r0
            r0 = r309
            if (r0 != 0) goto L58
        L55:
            r0 = 1
            r311 = r0
        L58:
            r0 = r311
            return r0
        L5b:
            r0 = r302
            int r0 = r0.A00
            r311 = r0
            r0 = r311
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r310 = r0
            goto L25
        L6b:
            r0 = r303
            java.lang.String r0 = r0.A02
            r308 = r0
            goto L1b
        L74:
            r0 = r302
            java.lang.String r0 = r0.A02
            r307 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dy9.A0r(X.1LI, X.1LI, X.2Yv, X.2Yv):boolean");
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        5Gk r0;
        DNB dnb = (DNB) obj;
        String str = this.A02;
        GIj gIj = this.A01;
        int i = this.A00;
        1BL.A1H(dnb, str, gIj);
        if (!11T.A0O(dnb.A04, str)) {
            dnb.A04 = str;
            dnb.A06 = false;
            5Gk r02 = dnb.A01;
            if (r02 != null && (r02 instanceof 5Gk) && (r0 = r02) != null) {
                r0.stop();
            }
        }
        dnb.A0B.removeMessages(1);
        if (dnb.A00 != i) {
            dnb.A00 = i;
            if (dnb.A01 != null) {
                dnb.A05 = true;
                dnb.invalidateSelf();
            }
        }
        gIj.AC4(dnb, str);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DNB dnb = (DNB) obj;
        String str = this.A02;
        GIj gIj = this.A01;
        1BL.A1H(dnb, str, gIj);
        gIj.D5X(dnb, str);
        dnb.A0B.sendEmptyMessage(1);
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Dy9 dy9 = (Dy9) r302;
            if (this.A00 != dy9.A00) {
                return false;
            }
            GIj gIj = this.A01;
            GIj gIj2 = dy9.A01;
            if (gIj != null) {
                if (!gIj.equals(gIj2)) {
                    return false;
                }
            } else if (gIj2 != null) {
                return false;
            }
            String str = this.A02;
            String str2 = dy9.A02;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }
}
