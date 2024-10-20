package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.00v, reason: invalid class name */
/* loaded from: 00v.class */
public abstract class C00v extends C00w implements List, AnonymousClass116 {
    @Override // java.util.List
    public void add(int i, Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        11T.A0F(collection, 1);
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            if (!11T.A0O(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        Iterator it = iterator();
        int i = 1;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = (i2 * 31) + AnonymousClass002.A04(it.next());
        }
    }

    public int indexOf(Object obj) {
        int i;
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            i = i2;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (11T.A0O(it.next(), obj)) {
                break;
            }
            i2 = i + 1;
        }
        return i;
    }

    @Override // X.C00w, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0A6(this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (11T.A0O(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new 1AC(this, 0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new 1AC(this, i);
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new C0fy(this, i, i2);
    }
}
