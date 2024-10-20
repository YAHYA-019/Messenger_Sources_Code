package X;

/* renamed from: X.1vx, reason: invalid class name */
/* loaded from: 1vx.class */
public final class C1vx {
    public final int A00;
    public final boolean A01;
    public final C1vz[] A02;

    public C1vx(float f, int i, int i2, long j) {
        this.A00 = i2;
        C1vz[] c1vzArr = new C1vz[3];
        boolean z = false;
        int i3 = 0;
        do {
            c1vzArr[i3] = new C1vz(i, f, this.A00);
            i3++;
        } while (i3 < 3);
        this.A02 = c1vzArr;
        this.A01 = j == 1 ? true : z;
    }
}
