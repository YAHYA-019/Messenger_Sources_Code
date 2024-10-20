package X;

/* renamed from: X.3TJ, reason: invalid class name */
/* loaded from: 3TJ.class */
public final class C3TJ {
    public C00o A00;
    public 1CP A01;
    public final 1CL A02;
    public final 1CP A03;
    public final 1CP A04;
    public final 1CZ A05;

    /* JADX WARN: Multi-variable type inference failed */
    public C3TJ(1CL r302, 1CP r303, 1CP r304, 1CP r305) {
        this.A02 = r302;
        this.A03 = r303;
        this.A04 = r304;
        this.A00 = r302.getOrCreateOverridesTable();
        1Cd A00 = AbstractC09394pz.A00(r304);
        this.A05 = A00 != null ? A00.A07 : new Object();
        this.A01 = r305;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0 >= 16384) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair A00(X.3oR r301) {
        /*
            r0 = r301
            int r0 = r0.A04
            r302 = r0
            r0 = -1
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1a
            r0 = 16384(0x4000, float:2.2959E-41)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r302
            r1 = r304
            if (r0 < r1) goto L1c
        L1a:
            r0 = 1
            r303 = r0
        L1c:
            r0 = r301
            java.lang.String r0 = r0.A00
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r301
            java.lang.String r0 = r0.A01
            r307 = r0
        L2c:
            android.util.Pair r0 = new android.util.Pair
            r305 = r0
            r0 = r305
            r1 = r306
            r2 = r307
            r0.<init>(r1, r2)
            r0 = r305
            return r0
        L3d:
            r0 = r302
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r307 = r0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TJ.A00(X.3oR):android.util.Pair");
    }

    public static 1CP A01(C3TJ c3tj, long j) {
        int i = (int) ((j >>> 54) & 63);
        return i != 1 ? (i == 2 || i != 4) ? c3tj.A03 : c3tj.A01 : c3tj.A04;
    }

    public double A02(long j) {
        1CP A01 = A01(this, j);
        if (A01 == null) {
            return this.A05.AiB(j);
        }
        1GD A0J = 1BK.A0J();
        A0J.A04 = true;
        1GD A012 = 1GD.A01(A0J);
        A012.A02 = true;
        return A01.AiH(A012, j);
    }

    public double A03(long j) {
        C00o c00o = this.A00;
        if (c00o == null || !c00o.hasDoubleOverrideForParam(j)) {
            return A02(j);
        }
        double AiB = this.A05.AiB(j);
        C00o c00o2 = this.A00;
        if (c00o2 != null) {
            AiB = c00o2.doubleOverrideForParam(j, AiB);
        }
        return AiB;
    }

    public long A04(long j) {
        1CP A01 = A01(this, j);
        if (A01 == null) {
            return this.A05.Av2(j);
        }
        1GD A0J = 1BK.A0J();
        A0J.A04 = true;
        1GD A012 = 1GD.A01(A0J);
        A012.A02 = true;
        return A01.Av9(A012, j);
    }

    public long A05(long j) {
        C00o c00o = this.A00;
        if (c00o == null || !c00o.hasIntOverrideForParam(j)) {
            return A04(j);
        }
        long Av2 = this.A05.Av2(j);
        C00o c00o2 = this.A00;
        if (c00o2 != null) {
            Av2 = c00o2.intOverrideForParam(j, Av2);
        }
        return Av2;
    }

    public String A06(long j) {
        1CP A01 = A01(this, j);
        if (A01 == null) {
            return this.A05.BD3(j);
        }
        1GD A0J = 1BK.A0J();
        A0J.A04 = true;
        1GD A012 = 1GD.A01(A0J);
        A012.A02 = true;
        return A01.BDB(A012, j);
    }

    public String A07(long j) {
        C00o c00o = this.A00;
        if (c00o == null || !c00o.hasStringOverrideForParam(j)) {
            return A06(j);
        }
        String BD3 = this.A05.BD3(j);
        C00o c00o2 = this.A00;
        if (c00o2 != null) {
            BD3 = c00o2.stringOverrideForParam(j, BD3);
        }
        return BD3;
    }

    public boolean A08(long j) {
        1CP A01 = A01(this, j);
        if (A01 == null) {
            return this.A05.AZi(j);
        }
        1GD A0J = 1BK.A0J();
        A0J.A04 = true;
        1GD A012 = 1GD.A01(A0J);
        A012.A02 = true;
        return A01.AZr(A012, j);
    }

    public boolean A09(long j) {
        C00o c00o = this.A00;
        if (c00o == null || !c00o.hasBoolOverrideForParam(j)) {
            return A08(j);
        }
        boolean AZi = this.A05.AZi(j);
        C00o c00o2 = this.A00;
        if (c00o2 != null) {
            AZi = c00o2.boolOverrideForParam(j, AZi);
        }
        return AZi;
    }
}
