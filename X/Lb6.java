package X;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: Lb6.class */
public final class Lb6 implements 6Zm, 6ZQ {
    public int A00;
    public boolean A01;
    public byte[] A02;
    public final long A03;
    public final 6Yl A04;
    public final 6ZL A05;
    public final 6YO A06;
    public final 6ZG A07;
    public final 6Zy A08;
    public final 6Cl A09;
    public final 6DQ A0A;
    public final 5M9 A0B;
    public final ArrayList A0C;

    public Lb6(6Yl r302, 6ZL r303, 6Cl r304, 6DQ r305, 6ZG r306, 5M9 r307, long j) {
        this.A0A = r305;
        this.A09 = r304;
        this.A0B = r307;
        this.A04 = r302;
        this.A03 = j;
        this.A07 = r306;
        this.A05 = r303;
        6YO r0 = 6YO.A03;
        this.A06 = new 6YO(new 6YP[]{new 6YP("", new 6Yl[]{r302})});
        this.A0C = AnonymousClass001.A0s();
        this.A08 = new 6Zy("Loader:SingleSampleMediaPeriod", false, false, false, false);
    }

    public void AEE(long j) {
    }

    public boolean AHs(long j, long j2) {
        if (this.A01) {
            return false;
        }
        6Zy r0 = this.A08;
        if (r0.A01 != null || r0.A02 != null) {
            return false;
        }
        6D7 AJR = this.A09.AJR();
        5M9 r02 = this.A0B;
        if (r02 != null) {
            AJR.A7c(r02);
        }
        6DQ r03 = this.A0A;
        Lbg lbg = new Lbg(AJR, r03);
        int i = this.A07.A00;
        if (i == -1) {
            i = 3;
        }
        this.A05.A04(this.A04, new 6aC(r03, lbg.A01, r0.A01(this, lbg, i)), (Object) null, 1, -1, 0, 0L, this.A03);
        return true;
    }

    public /* synthetic */ boolean AHt(KjS kjS) {
        return AHs(kjS.A01, kjS.A00);
    }

    public void ANV(long j, boolean z) {
    }

    public long AW2(6Vl r302, long j) {
        return j;
    }

    public long AaC(long j) {
        return this.A01 ? Long.MIN_VALUE : 0L;
    }

    public long AaF() {
        return this.A01 ? Long.MIN_VALUE : 0L;
    }

    public long AzC() {
        return (this.A01 || this.A08.A01 != null) ? Long.MIN_VALUE : 0L;
    }

    public 6YO BGj() {
        return this.A06;
    }

    public boolean BTn() {
        return AnonymousClass001.A1T(this.A08.A01);
    }

    public void Bdl() {
    }

    public /* bridge */ /* synthetic */ void C3r(C6a9 c6a9, long j, long j2, boolean z) {
        Lbg lbg = (Lbg) c6a9;
        this.A05.A03((6Yl) null, JR0.A0j(lbg.A02, lbg.A03), (Object) null, 1, -1, 0, 0L, this.A03);
    }

    public /* bridge */ /* synthetic */ void C3v(C6a9 c6a9, long j, long j2) {
        Lbg lbg = (Lbg) c6a9;
        C6aA c6aA = lbg.A03;
        this.A00 = (int) c6aA.A00;
        byte[] bArr = lbg.A00;
        bArr.getClass();
        this.A02 = bArr;
        this.A01 = true;
        this.A05.A05(this.A04, JR0.A0j(lbg.A02, c6aA), (Object) null, lbg, (Object) null, 1, -1, 0, 0L, this.A03);
    }

    public /* bridge */ /* synthetic */ C6a0 C41(C6a9 c6a9, IOException iOException, int i, long j, long j2) {
        C6a0 c6a0;
        int i2;
        boolean z;
        Lbg lbg = (Lbg) c6a9;
        6aC A0j = JR0.A0j(lbg.A02, lbg.A03);
        6Yl r0 = this.A04;
        long j3 = this.A03;
        6aF r02 = new 6aF(r0, (Object) null, 1, -1, 0, 0L, Util.A0C(j3));
        6ZF r03 = this.A07;
        long B7w = r03.B7w(new KkU(A0j, r02, iOException, i));
        if (B7w != -9223372036854775807L) {
            int i3 = r03.A00;
            if (i3 == -1) {
                i3 = 3;
            }
            if (i < i3) {
                c6a0 = new C6a0(0, B7w);
                i2 = c6a0.A00;
                z = true;
                if (i2 != 0 && i2 != 1) {
                    z = false;
                }
                this.A05.A01(r0, A0j, iOException, (Object) null, 1, -1, 0, 0L, j3, !z);
                return c6a0;
            }
        }
        5My.A06("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
        this.A01 = true;
        c6a0 = 6Zy.A09;
        i2 = c6a0.A00;
        z = true;
        if (i2 != 0) {
            z = false;
        }
        this.A05.A01(r0, A0j, iOException, (Object) null, 1, -1, 0, 0L, j3, !z);
        return c6a0;
    }

    public /* bridge */ /* synthetic */ void C4M(C6a9 c6a9, IOException iOException, int i, long j, long j2, boolean z) {
        this.A05.A06(this.A04, ((Lbg) c6a9).A02, iOException, (Object) null, 1, -1, 0, i, 0L, this.A03, z);
    }

    public /* synthetic */ void C4R(C6a9 c6a9, int i, long j, long j2) {
    }

    public long CYF(long j) {
        return 0L;
    }

    public void CYa(6YW r302, long j) {
        r302.CDa(this);
    }

    public long Cb0() {
        return -9223372036854775807L;
    }

    public void Cbp(long j) {
    }

    public long CkG(long j, boolean z) {
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A0C;
            if (i2 >= arrayList.size()) {
                return j;
            }
            LbF lbF = (LbF) arrayList.get(i2);
            if (lbF.A00 == 2) {
                lbF.A00 = 1;
            }
            i = i2 + 1;
        }
    }

    public long CkN(6Zf[] r302, 6Y9[] r303, boolean[] zArr, boolean[] zArr2, long j) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= r303.length) {
                return j;
            }
            6Zf r0 = r302[i2];
            if (r0 != null && (r303[i2] == null || !zArr[i2])) {
                this.A0C.remove(r0);
                r302[i2] = null;
            }
            if (r302[i2] == null && r303[i2] != null) {
                LbF lbF = new LbF(this);
                this.A0C.add(lbF);
                r302[i2] = lbF;
                zArr2[i2] = true;
            }
            i = i2 + 1;
        }
    }

    public void Csi(boolean z) {
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
    }
}
