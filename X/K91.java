package X;

/* loaded from: K91.class */
public final class K91 extends KRq {
    public final long A00;

    public K91(long j) {
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof KRq) && this.A00 == ((K91) ((KRq) obj)).A00);
    }

    public final int hashCode() {
        return (-724379968) ^ 1BL.A01(this.A00);
    }

    public final String toString() {
        return 0Pz.A0h("EventRecord{eventType=3, eventTimestamp=", "}", this.A00);
    }
}
