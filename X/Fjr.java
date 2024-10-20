package X;

/* loaded from: Fjr.class */
public final class Fjr implements JDB {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public Fjr(Boolean bool, String str, String str2) {
        C1pq.A08("callEnded", bool);
        this.A00 = bool;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fjr)) {
                return false;
            }
            Fjr fjr = (Fjr) obj;
            if (!11T.A0O(this.A00, fjr.A00) || !11T.A0O(this.A01, fjr.A01) || !11T.A0O(this.A02, fjr.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }
}
