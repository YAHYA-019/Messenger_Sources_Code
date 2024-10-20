package X;

/* loaded from: Fyp.class */
public final class Fyp implements GDt {
    public final EyK A00;
    public final int A01;

    public Fyp(EyK eyK, int i) {
        11T.A0F(eyK, 2);
        this.A01 = i;
        this.A00 = eyK;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fyp)) {
                return false;
            }
            Fyp fyp = (Fyp) obj;
            if (this.A01 != fyp.A01 || !11T.A0O(this.A00, fyp.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, this.A01 * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Populated(index=");
        A0k.append(this.A01);
        A0k.append(", suggestion=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
