package X;

/* loaded from: L6r.class */
public abstract class L6r {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static LEQ A00(int i) {
        int i2 = 1;
        do {
            LEQ leq = LEQ.A04[i2 - 1];
            int i3 = leq.A00;
            KiH kiH = leq.A03[1];
            int i4 = kiH.A00;
            int i5 = 0;
            for (KiG kiG : kiH.A01) {
                i5 += kiG.A00;
            }
            if (i3 - (i4 * i5) >= (i + 7) / 8) {
                return leq;
            }
            i2++;
            if (i2 > 40) {
                throw new Exception("Data too big");
            }
        } while (i2 > 0);
        throw JQx.A0n();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1457  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0669 A[LOOP:3: B:88:0x0662->B:90:0x0669, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.KqN A01(java.lang.Integer r301, java.lang.String r302, java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 5243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L6r.A01(java.lang.Integer, java.lang.String, java.util.Map):X.KqN");
    }
}
