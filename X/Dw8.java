package X;

/* loaded from: Dw8.class */
public final class Dw8 extends 1LH {
    public final int A00;
    public final long A01;
    public final long A02;
    public final 2lO A03;
    public final ELv A04;
    public final C97i A05;
    public final CharSequence A06;
    public final Integer A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Dw8(X.2lO r302, X.ELv r303, X.C97i r304, java.lang.CharSequence r305, java.lang.Integer r306, int r307, int r308) {
        /*
            r301 = this;
            r0 = r308
            r309 = r0
            r0 = r302
            r310 = r0
            r0 = r303
            r311 = r0
            r0 = r307
            r312 = r0
            r0 = r308
            r1 = 8
            r0 = r0 & r1
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L1d
            r0 = 0
            r312 = r0
        L1d:
            r0 = r308
            r1 = 16
            r0 = r0 & r1
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L2e
            X.ELv r0 = X.ELv.A07
            r311 = r0
        L2e:
            r0 = r308
            r1 = 32
            r0 = r0 & r1
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L7a
            long r0 = X.7zQ.A0A()
            r314 = r0
        L3f:
            r0 = r308
            r1 = 64
            r0 = r0 & r1
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L74
            long r0 = X.7zQ.A0A()
            r316 = r0
        L50:
            r0 = r309
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L60
            r0 = 0
            r310 = r0
        L60:
            r0 = r301
            r1 = r310
            r2 = r311
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r312
            r7 = r314
            r8 = r316
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L74:
            r0 = 0
            r316 = r0
            goto L50
        L7a:
            r0 = 0
            r314 = r0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dw8.<init>(X.2lO, X.ELv, X.97i, java.lang.CharSequence, java.lang.Integer, int, int):void");
    }

    public Dw8(2lO r302, ELv eLv, C97i c97i, CharSequence charSequence, Integer num, int i, long j, long j2) {
        1BL.A1H(charSequence, num, c97i);
        11T.A0F(eLv, 5);
        this.A06 = charSequence;
        this.A07 = num;
        this.A05 = c97i;
        this.A00 = i;
        this.A04 = eLv;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        CharSequence charSequence = this.A06;
        Fy7 fy7 = new Fy7(this.A05, this.A07);
        int i = this.A00;
        return new Dvk(this.A03, this.A04, EL4.A03, fy7, new EJ0(this.A02, this.A01), charSequence, i);
    }
}
