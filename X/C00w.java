package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.00w, reason: invalid class name */
/* loaded from: 00w.class */
public abstract class C00w implements Collection, AnonymousClass116 {
    public abstract int A08();

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if ((this instanceof Collection) && isEmpty()) {
            return false;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            if (11T.A0O(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        11T.A0F(collection, 0);
        boolean z = true;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!contains(it.next())) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(size());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return A08();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        11T.A0F(objArr, 0);
        return C0A5.A01(this, objArr);
    }

    public String toString() {
        return 0QD.A0K(", ", "[", "]", this, new 0gB(this), -1);
    }
}
