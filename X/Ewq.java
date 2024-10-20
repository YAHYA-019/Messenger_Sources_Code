package X;

/* loaded from: Ewq.class */
public final class Ewq {
    public final int A00;
    public final int A01;
    public final String A02;

    public Ewq(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            Ewq ewq = (Ewq) obj;
            if (this.A00 != ewq.A00 || this.A01 != ewq.A01) {
                return false;
            }
            String str = this.A02;
            if (str.length() != 0) {
                return str.equals(ewq.A02);
            }
            if (ewq.A02.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02);
    }
}
