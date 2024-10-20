package X;

/* loaded from: Hrc.class */
public final class Hrc {
    public final String A00;
    public final String A01;

    public Hrc(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hrc)) {
                return false;
            }
            Hrc hrc = (Hrc) obj;
            if (!11T.A0O(this.A00, hrc.A00) || !11T.A0O(this.A01, hrc.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }
}
