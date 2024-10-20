package X;

/* loaded from: Hrz.class */
public final class Hrz {
    public final int A00;
    public final int A01;
    public final int A02;

    public Hrz(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hrz)) {
                return false;
            }
            Hrz hrz = (Hrz) obj;
            if (this.A00 != hrz.A00 || this.A01 != hrz.A01 || this.A02 != hrz.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02;
    }
}
