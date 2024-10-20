package X;

/* loaded from: L42.class */
public final class L42 {
    public static final L42 A02 = new L42(0, 0);
    public final long A00;
    public final long A01;

    public L42(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            L42 l42 = (L42) obj;
            if (this.A01 != l42.A01 || this.A00 != l42.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public String toString() {
        return 0Pz.A0u("[timeUs=", ", position=", "]", this.A01, this.A00);
    }
}
