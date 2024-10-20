package X;

/* renamed from: X.41m, reason: invalid class name */
/* loaded from: 41m.class */
public final class C41m {
    public int A00 = 0;

    public boolean A00(int i) {
        boolean z;
        synchronized (this) {
            int i2 = this.A00;
            z = false;
            if (((i | 1) & i2) == 0) {
                z = true;
            }
            this.A00 = i | i2;
        }
        return z;
    }

    public boolean A01(int i) {
        boolean A00;
        synchronized (this) {
            A00 = (this.A00 & 9) != 0 ? false : A00(i);
        }
        return A00;
    }
}
