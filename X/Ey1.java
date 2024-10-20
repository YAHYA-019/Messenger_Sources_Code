package X;

/* loaded from: Ey1.class */
public final class Ey1 {
    public final int A00;
    public final String A01;

    public Ey1(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey1)) {
                return false;
            }
            Ey1 ey1 = (Ey1) obj;
            if (!11T.A0O(this.A01, ey1.A01) || this.A00 != ey1.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + this.A00;
    }

    public String toString() {
        return 0Pz.A0n("AuthTicketCapabilities(name=", this.A01, ", ttl=", ')', this.A00);
    }
}
