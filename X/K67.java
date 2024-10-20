package X;

import java.util.Iterator;

/* loaded from: K67.class */
public final class K67 extends K60 {
    public final transient Object A00;

    public K67(Object obj) {
        this.A00 = obj;
    }

    @Override // X.Ly4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // X.K60, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Iterator, java.lang.Object, X.K6F] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        Object obj = this.A00;
        ?? obj2 = new Object();
        ((K6F) obj2).A00 = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return 0Pz.A0j("[", this.A00.toString(), "]");
    }
}
