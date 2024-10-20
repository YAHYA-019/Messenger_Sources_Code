package X;

/* loaded from: Iii.class */
public final class Iii implements JJD {
    public int A00;
    public int A01;

    public boolean AMl() {
        return true;
    }

    public HC9 BHT() {
        return HC9.A0O;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Iii iii = (Iii) obj;
            if (this.A00 != iii.A00 || this.A01 != iii.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }
}
