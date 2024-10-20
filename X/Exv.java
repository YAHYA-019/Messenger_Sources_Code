package X;

/* loaded from: Exv.class */
public final class Exv {
    public final int A00;
    public final int A01;

    public Exv(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            Exv exv = (Exv) obj;
            if (this.A00 != exv.A00 || this.A01 != exv.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public String toString() {
        return 0Pz.A0b("UTF16Range(", ", ", ')', this.A01, this.A00);
    }
}
