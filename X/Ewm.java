package X;

/* loaded from: Ewm.class */
public final class Ewm {
    public final long A00;
    public final long A01;
    public final long A02;

    public Ewm(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ewm)) {
                return false;
            }
            Ewm ewm = (Ewm) obj;
            if (this.A00 != ewm.A00 || this.A01 != ewm.A01 || this.A02 != ewm.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A01(1BL.A01(this.A00) + 31, this.A01), this.A02);
    }
}
