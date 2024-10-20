package X;

/* loaded from: Jt6.class */
public final class Jt6 extends C04v {
    public static final Jt6 A02 = new Jt6(C2q2.A0G, null);
    public final C2q2 A00;
    public final String A01;

    public Jt6(C2q2 c2q2, String str) {
        this.A00 = c2q2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jt6)) {
                return false;
            }
            Jt6 jt6 = (Jt6) obj;
            if (this.A00 != jt6.A00 || !11T.A0O(this.A01, jt6.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1BL.A05(this.A01);
    }
}
