package X;

/* loaded from: Jtf.class */
public final class Jtf extends C04v implements MCG {
    public final String A00;
    public final String A01;

    public Jtf(String str, String str2) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jtf)) {
                return false;
            }
            Jtf jtf = (Jtf) obj;
            if (!11T.A0O(this.A01, jtf.A01) || !11T.A0O(this.A00, jtf.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + 1BL.A05(this.A00);
    }
}
