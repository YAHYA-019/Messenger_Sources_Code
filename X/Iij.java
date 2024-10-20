package X;

/* loaded from: Iij.class */
public final class Iij implements JJD {
    public float A00;
    public int A01;
    public int A02;

    public boolean AMl() {
        return true;
    }

    public HC9 BHT() {
        return HC9.A0a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Iij iij = (Iij) obj;
            if (this.A02 != iij.A02 || this.A01 != iij.A01 || this.A00 != iij.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + ((int) this.A00);
    }
}
