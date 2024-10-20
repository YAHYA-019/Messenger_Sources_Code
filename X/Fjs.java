package X;

/* loaded from: Fjs.class */
public final class Fjs implements JDB {
    public final boolean A00;

    public Fjs(boolean z) {
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Fjs) && this.A00 == ((Fjs) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    public String toString() {
        return 0Pz.A19("BugNubViewState{isEnabled=", "}", this.A00);
    }
}
