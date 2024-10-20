package X;

/* loaded from: Iit.class */
public final class Iit implements JJD {
    public int A00;
    public int A01;

    public Iit(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean AMl() {
        return true;
    }

    public HC9 BHT() {
        return HC9.A0M;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Iit iit = (Iit) obj;
            if (this.A01 != iit.A01 || this.A00 != iit.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
