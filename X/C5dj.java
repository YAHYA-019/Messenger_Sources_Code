package X;

/* renamed from: X.5dj, reason: invalid class name */
/* loaded from: 5dj.class */
public final class C5dj extends C04v {
    public static final C5dj A03 = new C5dj(0, 0, 04R.A0G());
    public final int A00;
    public final int A01;
    public final java.util.Map A02;

    public C5dj(int i, int i2, java.util.Map map) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5dj)) {
                return false;
            }
            C5dj c5dj = (C5dj) obj;
            if (this.A01 != c5dj.A01 || this.A00 != c5dj.A00 || !11T.A0O(this.A02, c5dj.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }
}
