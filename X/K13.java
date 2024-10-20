package X;

import java.io.IOException;

/* loaded from: K13.class */
public final class K13 extends Lbf {
    public MCm A00;
    public long A01;
    public final MG1 A02;
    public final boolean A03;
    public volatile boolean A04;

    public K13(6Yl r302, MG1 mg1, 6D7 r304, 6DQ r305, Object obj, int i, boolean z) {
        super(r302, r304, r305, obj, 2, i, -9223372036854775807L, -9223372036854775807L);
        this.A02 = mg1;
        this.A03 = z;
    }

    @Override // X.C6a9
    public void AEC() {
        this.A04 = true;
    }

    @Override // X.C6a9
    public void BYQ() {
        int Cap;
        if (this.A01 == 0) {
            this.A02.BOr(this.A00, -9223372036854775807L, -9223372036854775807L);
        }
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
            6aI r02 = new 6aI(c6aA, A00.A02, c6aA.CVO(A00));
            do {
                try {
                    if (this.A04) {
                        break;
                    }
                    Cap = ((Lab) this.A02).A05.Cap(r02, Lab.A09);
                    6DP.A04(4YV.A1W(Cap, 1));
                } finally {
                    this.A01 = r02.A02 - r0.A02;
                }
            } while (Cap == 0);
            try {
                c6aA.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
