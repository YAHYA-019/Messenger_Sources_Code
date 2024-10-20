package X;

/* loaded from: Kuj.class */
public class Kuj {
    public final LtK A00 = LtK.A02(new C2919Jd7[16]);

    public void A00() {
        if (!(this instanceof C2919Jd7)) {
            LtK ltK = this.A00;
            int i = ltK.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = ltK.A02;
                do {
                    ((Kuj) objArr[i2]).A00();
                    i2++;
                } while (i2 < i);
                return;
            }
            return;
        }
        C2919Jd7 c2919Jd7 = (C2919Jd7) this;
        LtK ltK2 = ((Kuj) c2919Jd7).A00;
        int i3 = ltK2.A00;
        if (i3 > 0) {
            Object[] objArr2 = ltK2.A02;
            int i4 = 0;
            do {
                ((Kuj) objArr2[i4]).A00();
                i4++;
            } while (i4 < i3);
        }
        LPR lpr = c2919Jd7.A06;
        LtK ltK3 = null;
        while (lpr != null) {
            if (lpr instanceof MNZ) {
                ((MNZ) lpr).Bmx();
            } else if ((lpr.A01 & 16) != 0 && (lpr instanceof AbstractC2887Jc8)) {
                int i5 = 0;
                for (LPR lpr2 = ((AbstractC2887Jc8) lpr).A00; lpr2 != null; lpr2 = lpr2.A02) {
                    if ((lpr2.A01 & 16) != 0) {
                        i5++;
                        if (i5 == 1) {
                            lpr = lpr2;
                        } else {
                            ltK3 = JR0.A0Z(ltK3);
                            lpr = JQx.A0Z(ltK3, lpr);
                            ltK3.A0C(lpr2);
                        }
                    }
                }
                if (i5 == 1) {
                }
            }
            lpr = LDX.A00(ltK3);
        }
    }

    public final void A01() {
        int i = 0;
        while (true) {
            LtK ltK = this.A00;
            if (i >= ltK.A00) {
                return;
            }
            C2919Jd7 c2919Jd7 = (C2919Jd7) ltK.A02[i];
            if (c2919Jd7.A06.A08) {
                i++;
                c2919Jd7.A01();
            } else {
                c2919Jd7.A00();
                ltK.A05(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r309 >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.JaY r302, long r303) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuj.A02(X.JaY, long):void");
    }

    public void A03(Kp6 kp6) {
        LtK ltK = this.A00;
        int i = ltK.A00;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C2919Jd7) ltK.A02[i]).A07.A00 == 0) {
                ltK.A05(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(X.C00p r302, X.Kp6 r303, X.MKq r304, boolean r305) {
        /*
            r301 = this;
            r0 = r301
            X.LtK r0 = r0.A00
            r306 = r0
            r0 = r306
            int r0 = r0.A00
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r307
            if (r0 <= 0) goto L56
            r0 = r306
            java.lang.Object[] r0 = r0.A02
            r309 = r0
            r0 = 0
            r310 = r0
        L1f:
            r0 = r309
            r1 = r310
            r0 = r0[r1]
            X.Kuj r0 = (X.Kuj) r0
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            boolean r0 = r0.A04(r1, r2, r3, r4)
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L46
            r0 = r308
            r311 = r0
            r0 = 0
            r308 = r0
            r0 = r311
            if (r0 == 0) goto L49
        L46:
            r0 = 1
            r308 = r0
        L49:
            r0 = r310
            r1 = 1
            int r0 = r0 + r1
            r310 = r0
            r0 = r310
            r1 = r307
            if (r0 < r1) goto L1f
        L56:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuj.A04(X.00p, X.Kp6, X.MKq, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cd, code lost:
    
        if (r311 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x025a, code lost:
    
        if (r311 == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02b2, code lost:
    
        if (r0 != false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05(X.C00p r302, X.Kp6 r303, X.MKq r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuj.A05(X.00p, X.Kp6, X.MKq, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x015c, code lost:
    
        if (r318 == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a6, code lost:
    
        if (r0 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06(X.Kp6 r302) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuj.A06(X.Kp6):boolean");
    }
}
