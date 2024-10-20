package X;

/* renamed from: X.6a7, reason: invalid class name */
/* loaded from: 6a7.class */
public final class C6a7 implements 6Zf {
    public boolean A00;
    public final 6Zf A01;
    public final /* synthetic */ C6a6 A02;

    public C6a7(C6a6 c6a6, 6Zf r303) {
        this.A02 = c6a6;
        this.A01 = r303;
    }

    public long BGg(int i) {
        return this.A01.BGg(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r301.A01.BVE() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVE() {
        /*
            r301 = this;
            r0 = r301
            X.6a6 r0 = r0.A02
            r302 = r0
            r0 = r302
            long r0 = r0.A01
            r303 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L2f
            r0 = r301
            X.6Zf r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.BVE()
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L32
        L2f:
            r0 = 0
            r308 = r0
        L32:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6a7.BVE():boolean");
    }

    public void Bdk() {
        this.A01.Bdk();
    }

    public int Caz(6WB r302, 6WD r303, int i) {
        C6a6 c6a6 = this.A02;
        boolean z = false;
        if (c6a6.A01 != -9223372036854775807L) {
            z = true;
        }
        if (z) {
            return -3;
        }
        if (this.A00) {
            ((6WE) r303).A00 = 4;
            return -4;
        }
        int Caz = this.A01.Caz(r302, r303, i);
        if (Caz != -5) {
            long j = c6a6.A00;
            if (j == Long.MIN_VALUE || (Caz != -4 ? !(Caz == -3 && c6a6.AaF() == Long.MIN_VALUE && !r303.A04) : r303.A01 < j)) {
                return Caz;
            }
            r303.A00();
            ((6WE) r303).A00 = 4;
            this.A00 = true;
            return -4;
        }
        6Yl r0 = r302.A00;
        r0.getClass();
        int i2 = r0.A08;
        if (i2 != 0 || r0.A09 != 0) {
            int i3 = 0;
            if (c6a6.A02 != 0) {
                i2 = 0;
            }
            if (c6a6.A00 == Long.MIN_VALUE) {
                i3 = r0.A09;
            }
            6Zr r02 = new 6Zr(r0);
            r02.A06 = i2;
            r02.A07 = i3;
            r302.A00 = new 6Yl(r02);
        }
        return -5;
    }

    public int D0l(long j) {
        if (this.A02.A01 != -9223372036854775807L) {
            return -3;
        }
        return this.A01.D0l(j);
    }
}
