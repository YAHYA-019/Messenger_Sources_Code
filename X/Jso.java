package X;

import java.util.Set;

/* loaded from: Jso.class */
public final class Jso extends C04v {
    public final long A00;
    public final Jsq A01;
    public final Set A02;

    public Jso(Jsq jsq, Set set, long j) {
        11T.A0F(set, 2);
        this.A01 = jsq;
        this.A02 = set;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jso)) {
                return false;
            }
            Jso jso = (Jso) obj;
            if (!11T.A0O(this.A01, jso.A01) || !11T.A0O(this.A02, jso.A02) || this.A00 != jso.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A02, 1BL.A03(this.A01)) + 1BL.A01(this.A00);
    }
}
