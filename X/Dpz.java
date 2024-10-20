package X;

/* loaded from: Dpz.class */
public final class Dpz extends C04v {
    public final String A00;
    public final C00m A01;

    public Dpz(String str, C00m c00m) {
        1BL.A1F(str, c00m);
        this.A00 = str;
        this.A01 = c00m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dpz)) {
                return false;
            }
            Dpz dpz = (Dpz) obj;
            if (!11T.A0O(this.A00, dpz.A00) || !11T.A0O(this.A01, dpz.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 4YV.A02(this.A00));
    }
}
