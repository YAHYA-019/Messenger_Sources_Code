package X;

import com.google.common.base.Preconditions;

/* loaded from: Hru.class */
public final class Hru {
    public long A02 = 1;
    public int A00 = 1;
    public int A01 = 0;

    public int A00(int i) {
        int i2 = this.A00;
        Preconditions.checkState(AnonymousClass001.A1N(i2));
        return (int) (((i - this.A01) * this.A02) / i2);
    }

    public int A01(int i) {
        long j = this.A02;
        Preconditions.checkState(AnonymousClass001.A1N((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        return (int) (((i * this.A00) / j) + this.A01);
    }
}
