package X;

/* loaded from: K63.class */
public final class K63 extends K65 {
    public final transient K65 A00;

    public K63(K65 k65) {
        this.A00 = k65;
    }

    @Override // X.K65, X.Ly4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        K65 k65 = this.A00;
        L6F.A01(i, k65.size());
        return k65.get(DKC.A06(k65) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }
}
