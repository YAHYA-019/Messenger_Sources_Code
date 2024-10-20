package X;

/* loaded from: KrG.class */
public final class KrG {
    public final Object A00;

    public KrG(Object obj) {
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof KrG) && this.A00 == ((KrG) obj).A00);
    }

    public int hashCode() {
        return (System.identityHashCode(this.A00) * 31) + 696158121;
    }
}
