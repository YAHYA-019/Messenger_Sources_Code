package X;

/* loaded from: Gvh.class */
public final class Gvh extends HXS {
    public final boolean A00;

    public Gvh(boolean z) {
        super(true);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Gvh) && this.A00 == ((Gvh) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A0R("Answered(withVideo=", ')', this.A00);
    }
}
