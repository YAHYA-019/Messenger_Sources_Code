package X;

/* loaded from: Lb3.class */
public final class Lb3 implements 6Zm, 6YW {
    public 6YW A00;
    public final 6Zm A01;
    public final long A02;

    public Lb3(6Zm r302, long j) {
        this.A01 = r302;
        this.A02 = j;
    }

    public void AEE(long j) {
        this.A01.AEE(j);
    }

    public boolean AHs(long j, long j2) {
        return this.A01.AHs(j - this.A02, j2);
    }

    public /* synthetic */ boolean AHt(KjS kjS) {
        return AHs(kjS.A01, kjS.A00);
    }

    public void ANV(long j, boolean z) {
        this.A01.ANV(j - this.A02, z);
    }

    public long AW2(6Vl r302, long j) {
        6Zm r0 = this.A01;
        long j2 = this.A02;
        return r0.AW2(r302, j - j2) + j2;
    }

    public long AaC(long j) {
        return this.A01.AaC(j);
    }

    public long AaF() {
        long AaF = this.A01.AaF();
        long j = Long.MIN_VALUE;
        if (AaF != Long.MIN_VALUE) {
            j = this.A02 + AaF;
        }
        return j;
    }

    public long AzC() {
        long AzC = this.A01.AzC();
        long j = Long.MIN_VALUE;
        if (AzC != Long.MIN_VALUE) {
            j = this.A02 + AzC;
        }
        return j;
    }

    public 6YO BGj() {
        return this.A01.BGj();
    }

    public boolean BTn() {
        return this.A01.BTn();
    }

    public void Bdl() {
        this.A01.Bdl();
    }

    public /* bridge */ /* synthetic */ void Brb(6Zn r302) {
        6YW r0 = this.A00;
        r0.getClass();
        r0.Brb(this);
    }

    public void CDa(6Zm r302) {
        6YW r0 = this.A00;
        r0.getClass();
        r0.CDa(this);
    }

    public long CYF(long j) {
        return 0L;
    }

    public void CYa(6YW r302, long j) {
        this.A00 = r302;
        this.A01.CYa(this, j - this.A02);
    }

    public long Cb0() {
        long Cb0 = this.A01.Cb0();
        long j = -9223372036854775807L;
        if (Cb0 != -9223372036854775807L) {
            j = this.A02 + Cb0;
        }
        return j;
    }

    public void Cbp(long j) {
        this.A01.Cbp(j - this.A02);
    }

    public long CkG(long j, boolean z) {
        6Zm r0 = this.A01;
        long j2 = this.A02;
        return r0.CkG(j - j2, z) + j2;
    }

    public long CkN(6Zf[] r302, 6Y9[] r303, boolean[] zArr, boolean[] zArr2, long j) {
        int length = r302.length;
        6Zf[] r0 = new 6Zf[length];
        int i = 0;
        while (true) {
            int i2 = i;
            6Zf r312 = null;
            if (i2 >= length) {
                break;
            }
            LbD lbD = (LbD) r302[i2];
            if (lbD != null) {
                r312 = lbD.A00;
            }
            r0[i2] = r312;
            i = i2 + 1;
        }
        6Zm r02 = this.A01;
        long j2 = this.A02;
        long CkN = r02.CkN(r0, r303, zArr, zArr2, j - j2);
        for (int i3 = 0; i3 < length; i3++) {
            6Zf r03 = r0[i3];
            if (r03 == null) {
                r302[i3] = null;
            } else {
                6Zf r04 = r302[i3];
                if (r04 == null || ((LbD) r04).A00 != r03) {
                    r302[i3] = new LbD(r03, j2);
                }
            }
        }
        return CkN + j2;
    }

    public void Csi(boolean z) {
        this.A01.Csi(z);
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
        this.A01.D7G(b, z);
    }
}
