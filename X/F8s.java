package X;

/* loaded from: F8s.class */
public final class F8s {
    public static F8s A02 = new F8s(500, 2000);
    public final int A00;
    public final int A01;

    public F8s(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof F8s)) {
                return false;
            }
            F8s f8s = (F8s) obj;
            if (this.A00 == f8s.A00 && this.A01 == f8s.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }
}
