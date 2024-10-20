package X;

/* renamed from: X.2wd, reason: invalid class name */
/* loaded from: 2wd.class */
public final class C2wd {
    public final 0AE A00;

    public C2wd() {
        this.A00 = new 0AE(10);
    }

    public C2wd(int i) {
        this.A00 = new 0AE(i);
    }

    public final int[] A00() {
        0AE r0 = this.A00;
        int A00 = r0.A00();
        int[] iArr = new int[A00];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                return iArr;
            }
            iArr[i2] = r0.A02(i2);
            i = i2 + 1;
        }
    }
}
