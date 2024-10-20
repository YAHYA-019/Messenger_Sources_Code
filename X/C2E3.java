package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2E3, reason: invalid class name */
/* loaded from: 2E3.class */
public final class C2E3 implements Set, 0eD {
    public final Set A00;
    public final int A01;

    public C2E3(Set set, int i) {
        this.A00 = set;
        this.A01 = i;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        while (size() >= this.A01) {
            remove(0QD.A07(this));
        }
        return this.A00.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        11T.A0F(collection, 0);
        return this.A00.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.A00.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        11T.A0F(collection, 0);
        return this.A00.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        11T.A0F(collection, 0);
        return this.A00.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        11T.A0F(collection, 0);
        return this.A00.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        11T.A0F(objArr, 0);
        return C0A5.A01(this, objArr);
    }
}
