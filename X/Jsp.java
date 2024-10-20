package X;

/* loaded from: Jsp.class */
public final class Jsp extends C04v {
    public boolean A03 = false;
    public String A01 = null;
    public String A00 = null;
    public String A02 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsp)) {
                return false;
            }
            Jsp jsp = (Jsp) obj;
            if (this.A03 != jsp.A03 || !11T.A0O(this.A01, jsp.A01) || !11T.A0O(this.A00, jsp.A00) || !11T.A0O(this.A02, jsp.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass002.A00(this.A03 ? 1 : 0) * 31) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A00)) * 31) + 7zN.A05(this.A02);
    }
}
