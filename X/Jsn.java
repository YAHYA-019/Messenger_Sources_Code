package X;

/* loaded from: Jsn.class */
public final class Jsn extends C04v {
    public boolean A01 = false;
    public long A00 = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsn)) {
                return false;
            }
            Jsn jsn = (Jsn) obj;
            if (this.A01 != jsn.A01 || this.A00 != jsn.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + 1BL.A01(this.A00);
    }
}
