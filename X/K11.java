package X;

import java.io.IOException;

/* loaded from: K11.class */
public final class K11 extends K14 {
    public boolean A00;
    public long A01;
    public final int A02;
    public final 6Yl A03;

    public K11(6Yl r302, 6Yl r303, 6D7 r304, 6DQ r305, Object obj, int i, int i2, long j, long j2, long j3, long j4) {
        super(r302, r304, r305, obj, i, j, j2, -9223372036854775807L, -9223372036854775807L, j3, j4);
        this.A02 = i2;
        this.A03 = r303;
    }

    @Override // X.C6a9
    public void AEC() {
    }

    @Override // X.C6a9
    public void BYQ() {
        C6a5 laf;
        LbJ lbJ = ((K14) this).A00;
        6DP.A01(lbJ);
        C6a4[] c6a4Arr = lbJ.A01;
        for (C6a4 c6a4 : c6a4Arr) {
            if (c6a4.A07 != 0) {
                c6a4.A07 = 0L;
                c6a4.A0H = true;
            }
        }
        int i = this.A02;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = lbJ.A00;
            if (i3 >= iArr.length) {
                5My.A02("BaseMediaChunkOutput", 0Pz.A0T("Unmatched track of type: ", i));
                laf = new Laf();
                break;
            } else {
                if (i == iArr[i3]) {
                    laf = c6a4Arr[i3];
                    break;
                }
                i3++;
            }
        }
        laf.ATn(this.A03);
        try {
            6DQ r0 = this.A06;
            long j = this.A01;
            long j2 = r0.A03;
            long j3 = -1;
            if (j2 != j3) {
                j3 = j2 - j;
            }
            6DQ A00 = r0.A00(j, j3);
            C6aA c6aA = this.A07;
            long CVO = c6aA.CVO(A00);
            if (CVO != -1) {
                CVO += this.A01;
            }
            6aI r02 = new 6aI(c6aA, this.A01, CVO);
            do {
                this.A01 += i2;
                i2 = laf.CjE(r02, (-1) >>> 1, 0, true);
            } while (i2 != -1);
            laf.CjG(null, 1, (int) this.A01, 0, ((Lbf) this).A04);
            try {
                c6aA.close();
            } catch (IOException unused) {
            }
            this.A00 = true;
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
