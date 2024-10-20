package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: Lsy.class */
public final class Lsy implements List, C07c {
    public final LtK A00;

    public Lsy(LtK ltK) {
        this.A00 = ltK;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.A00.A08(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.A00.A0C(obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return this.A00.A0B(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        LtK ltK = this.A00;
        return ltK.A0B(ltK.A00, collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.A00.A06();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.A0D(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        LtK ltK = this.A00;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!ltK.A0D(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i) {
        KvC.A00(this, i);
        return this.A00.A02[i];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i;
        LtK ltK = this.A00;
        int i2 = ltK.A00;
        if (i2 > 0) {
            i = 0;
            Object[] objArr = ltK.A02;
            while (!11T.A0O(obj, objArr[i])) {
                i++;
                if (i >= i2) {
                }
            }
            return i;
        }
        i = -1;
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A00.A00);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new Lt9(this, 0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i;
        LtK ltK = this.A00;
        int i2 = ltK.A00;
        if (i2 > 0) {
            i = i2 - 1;
            Object[] objArr = ltK.A02;
            while (!11T.A0O(obj, objArr[i])) {
                i--;
                if (i < 0) {
                }
            }
            return i;
        }
        i = -1;
        return i;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new Lt9(this, 0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new Lt9(this, i);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        KvC.A00(this, i);
        return this.A00.A05(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.A00.A0E(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        LtK ltK = this.A00;
        boolean z = false;
        if (!collection.isEmpty()) {
            int i = ltK.A00;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ltK.A0E(it.next());
            }
            if (i != ltK.A00) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        LtK ltK = this.A00;
        int i = ltK.A00;
        boolean z = true;
        int i2 = i - 1;
        while (true) {
            int i3 = i2;
            if (-1 >= i3) {
                break;
            }
            if (!collection.contains(ltK.A02[i3])) {
                ltK.A05(i3);
            }
            i2 = i3 - 1;
        }
        if (i == ltK.A00) {
            z = false;
        }
        return z;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        KvC.A00(this, i);
        Object[] objArr = this.A00.A02;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        KvC.A01(this, i, i2);
        return new Lsz(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return C0A5.A01(this, objArr);
    }
}
