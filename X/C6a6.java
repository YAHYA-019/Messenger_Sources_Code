package X;

/* renamed from: X.6a6, reason: invalid class name */
/* loaded from: 6a6.class */
public final class C6a6 implements 6Zm, 6YW {
    public long A00;
    public long A01;
    public long A02;
    public KLo A03;
    public 6YW A04;
    public C6a7[] A05 = new C6a7[0];
    public final 6Zm A06;

    public C6a6(6Zm r302, long j, long j2) {
        this.A06 = r302;
        this.A01 = j;
        this.A02 = j;
        this.A00 = j2;
    }

    public void AEE(long j) {
        this.A06.AEE(j);
    }

    public boolean AHs(long j, long j2) {
        return this.A06.AHs(j, j2);
    }

    public /* synthetic */ boolean AHt(KjS kjS) {
        return this.A06.AHs(kjS.A01, kjS.A00);
    }

    public void ANV(long j, boolean z) {
        this.A06.ANV(j, z);
    }

    public long AW2(6Vl r302, long j) {
        6Vl r305 = r302;
        long j2 = this.A02;
        if (j != j2) {
            long j3 = r302.A01;
            long max = Math.max(0L, Math.min(j3, j - j2));
            long j4 = r302.A00;
            long j5 = this.A00;
            long max2 = Math.max(0L, Math.min(j4, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j));
            if (max != j3 || max2 != j4) {
                r305 = new 6Vl(max, max2);
            }
            j2 = this.A06.AW2(r305, j);
        }
        return j2;
    }

    public long AaC(long j) {
        return this.A06.AaC(j);
    }

    public long AaF() {
        long AaF = this.A06.AaF();
        if (AaF != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || AaF < j) {
                return AaF;
            }
        }
        return Long.MIN_VALUE;
    }

    public long AzC() {
        long AzC = this.A06.AzC();
        if (AzC != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || AzC < j) {
                return AzC;
            }
        }
        return Long.MIN_VALUE;
    }

    public 6YO BGj() {
        return this.A06.BGj();
    }

    public boolean BTn() {
        return this.A06.BTn();
    }

    public void Bdl() {
        KLo kLo = this.A03;
        if (kLo != null) {
            throw kLo;
        }
        this.A06.Bdl();
    }

    public /* bridge */ /* synthetic */ void Brb(6Zn r302) {
        6YW r0 = this.A04;
        r0.getClass();
        r0.Brb(this);
    }

    public void CDa(6Zm r302) {
        if (this.A03 == null) {
            6YW r0 = this.A04;
            r0.getClass();
            r0.CDa(this);
        }
    }

    public long CYF(long j) {
        return 0L;
    }

    public void CYa(6YW r302, long j) {
        this.A04 = r302;
        this.A06.CYa(this, j);
    }

    public long Cb0() {
        long j = this.A01;
        if (j != -9223372036854775807L) {
            this.A01 = -9223372036854775807L;
            long Cb0 = Cb0();
            return Cb0 != -9223372036854775807L ? Cb0 : j;
        }
        long Cb02 = this.A06.Cb0();
        if (Cb02 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        boolean z2 = false;
        if (Cb02 >= this.A02) {
            z2 = true;
        }
        6DP.A04(z2);
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && Cb02 > j2) {
            z = false;
        }
        6DP.A04(z);
        return Cb02;
    }

    public void Cbp(long j) {
        this.A06.Cbp(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r0 > r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long CkG(long r302, boolean r304) {
        /*
            r301 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A01 = r1
            r0 = r301
            X.6a7[] r0 = r0.A05
            r307 = r0
            r0 = r307
            int r0 = r0.length
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = 0
            r310 = r0
        L1c:
            r0 = r310
            r1 = r308
            if (r0 >= r1) goto L3e
            r0 = r307
            r1 = r310
            r0 = r0[r1]
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L35
            r0 = r311
            r1 = 0
            r0.A00 = r1
        L35:
            r0 = r310
            r1 = 1
            int r0 = r0 + r1
            r310 = r0
            goto L1c
        L3e:
            r0 = r301
            X.6Zm r0 = r0.A06
            r311 = r0
            r0 = r311
            r1 = r302
            r2 = r304
            long r0 = r0.CkG(r1, r2)
            r312 = r0
            r0 = r312
            r1 = r302
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r314 = r0
            r0 = r314
            if (r0 == 0) goto L8f
            r0 = r301
            long r0 = r0.A02
            r315 = r0
            r0 = r312
            r1 = r315
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r314 = r0
            r0 = r314
            if (r0 < 0) goto L92
            r0 = r301
            long r0 = r0.A00
            r317 = r0
            r0 = -9223372036854775808
            r315 = r0
            r0 = r317
            r1 = r315
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r314 = r0
            r0 = r314
            if (r0 == 0) goto L8f
            r0 = r312
            r1 = r317
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r314 = r0
            r0 = r314
            if (r0 > 0) goto L92
        L8f:
            r0 = 1
            r309 = r0
        L92:
            r0 = r309
            X.6DP.A04(r0)
            r0 = r312
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6a6.CkG(long, boolean):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0138, code lost:
    
        if (r0 > r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long CkN(X.6Zf[] r302, X.6Y9[] r303, boolean[] r304, boolean[] r305, long r306) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6a6.CkN(X.6Zf[], X.6Y9[], boolean[], boolean[], long):long");
    }

    public void Csi(boolean z) {
        this.A06.Csi(z);
    }

    public boolean D4i(long j) {
        return false;
    }

    public boolean D4j() {
        return false;
    }

    public boolean D4k(long j) {
        return false;
    }

    public void D4l() {
    }

    public void D7G(byte b, boolean z) {
        this.A06.D7G(b, z);
    }
}
