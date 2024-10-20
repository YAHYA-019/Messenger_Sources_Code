package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: LyA.class */
public abstract class LyA extends AbstractList implements MRQ {
    public boolean A00;

    public LyA() {
        this(true);
    }

    public LyA(boolean z) {
        this.A00 = z;
    }

    public void A01() {
        if (!this.A00) {
            throw AnonymousClass001.A0p();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        A01();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        A01();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        A01();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        A01();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            boolean z = false;
            if (obj instanceof List) {
                if (obj instanceof RandomAccess) {
                    List list = (List) obj;
                    int size = size();
                    if (size == list.size()) {
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= size) {
                                break;
                            }
                            if (!get(i2).equals(list.get(i2))) {
                                break;
                            }
                            i = i2 + 1;
                        }
                    }
                } else {
                    z = super.equals(obj);
                }
            }
            return z;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return i;
            }
            i = 1BK.A03(get(i3), i * 31);
            i2 = i3 + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        A01();
        return JR1.A1b(obj, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        A01();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        A01();
        return super.retainAll(collection);
    }
}
