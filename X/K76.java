package X;

import java.util.Iterator;

/* loaded from: K76.class */
public final class K76 extends K78 {
    public final transient K75 A00;
    public final transient LtI A01;

    public K76(K75 k75, LtI ltI) {
        this.A01 = ltI;
        this.A00 = k75;
    }

    @Override // X.Ly5
    public final boolean A09() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.Ly5
    public final int A0A(Object[] objArr, int i) {
        return this.A00.A0A(objArr, 0);
    }

    @Override // X.K78, X.Ly5
    public final K75 A0B() {
        return this.A00;
    }

    @Override // X.Ly5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return AnonymousClass001.A1T(this.A01.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01.size();
    }
}
