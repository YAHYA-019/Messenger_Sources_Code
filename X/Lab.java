package X;

import android.util.SparseArray;

/* loaded from: Lab.class */
public final class Lab implements 6Zo, MG1 {
    public 6aL A00;
    public 6Yl[] A01;
    public long A02;
    public MCm A03;
    public boolean A04;
    public final 6aM A05;
    public final int A06;
    public final SparseArray A07 = DKC.A0E();
    public final 6Yl A08;
    public static final MG0 A0A = new LbI();
    public static final 6aB A09 = new Object();

    public Lab(6Yl r302, 6aM r303, int i) {
        this.A05 = r303;
        this.A06 = i;
        this.A08 = r302;
    }

    public void AQI() {
        SparseArray sparseArray = this.A07;
        6Yl[] r0 = new 6Yl[sparseArray.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= sparseArray.size()) {
                this.A01 = r0;
                return;
            }
            6Yl r02 = ((Lag) sparseArray.valueAt(i2)).A00;
            6DP.A01(r02);
            r0[i2] = r02;
            i = i2 + 1;
        }
    }

    @Override // X.MG1
    public void BOr(MCm mCm, long j, long j2) {
        this.A03 = mCm;
        this.A02 = j2;
        boolean z = this.A04;
        6aM r0 = this.A05;
        if (!z) {
            r0.BOq(this);
            if (j != -9223372036854775807L) {
                r0.Ck6(0L, j);
            }
            this.A04 = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        r0.Ck6(0L, j);
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = this.A07;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ((Lag) sparseArray.valueAt(i2)).A00(mCm, j2);
            i = i2 + 1;
        }
    }

    public void Ck8(6aL r302) {
        this.A00 = r302;
    }

    public C6a5 D4h(int i, int i2) {
        SparseArray sparseArray = this.A07;
        Lag lag = (Lag) sparseArray.get(i);
        if (lag == null) {
            6DP.A04(AnonymousClass001.A1U(this.A01));
            lag = new Lag(i2 == this.A06 ? this.A08 : null, i, i2);
            lag.A00(this.A03, this.A02);
            sparseArray.put(i, lag);
        }
        return lag;
    }
}
