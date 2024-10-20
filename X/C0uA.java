package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0uA, reason: invalid class name */
/* loaded from: 0uA.class */
public final class C0uA implements Set, Serializable, AnonymousClass116 {
    public static final C0uA A00 = new Object();
    public static final long serialVersionUID = 3406603774387020532L;

    private final Object readResolve() {
        return A00;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        11T.A0F(collection, 0);
        return collection.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (((java.util.Set) r302).isEmpty() == false) goto L6;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.util.Set
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r302
            java.util.Set r0 = (java.util.Set) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L1b:
            r0 = 0
            r303 = r0
        L1d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0uA.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return C03u.A00;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return 11T.A0Q(this, objArr);
    }

    public String toString() {
        return "[]";
    }
}
