package X;

/* loaded from: Gvj.class */
public final class Gvj extends HXS {
    public final boolean A00;

    public Gvj(boolean z) {
        super(true);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Gvj) && this.A00 == ((Gvj) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A0R("Ended(wasDeclined=", ')', this.A00);
    }
}
