package X;

/* renamed from: X.4Bz, reason: invalid class name */
/* loaded from: 4Bz.class */
public final class C4Bz {
    public double A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final C0dp A04;

    public C4Bz(C0dp c0dp, int i, long j) {
        11T.A0F(c0dp, 1);
        this.A04 = c0dp;
        this.A02 = i;
        this.A03 = j;
        this.A00 = i;
    }

    public boolean A00() {
        boolean z;
        synchronized (this) {
            long now = this.A04.now();
            long j = now - this.A01;
            this.A01 = now;
            double d = this.A00;
            double d2 = j;
            double d3 = this.A02;
            double d4 = d + (d2 * (d3 / this.A03));
            this.A00 = d4;
            if (d4 > d3) {
                this.A00 = d3;
                d4 = d3;
            }
            if (d4 < 1.0d) {
                z = false;
            } else {
                this.A00 = d4 - 1.0d;
                z = true;
            }
        }
        return z;
    }
}
