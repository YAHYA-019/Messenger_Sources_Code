package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: Ly8.class */
public abstract class Ly8 extends AbstractList implements MRS {
    public boolean A00;

    public Ly8(boolean z) {
        this.A00 = z;
    }

    public final void A03() {
        if (!this.A00) {
            throw AnonymousClass001.A0p();
        }
    }

    @Override // X.MRS
    public final void DCK() {
        if (this.A00) {
            this.A00 = false;
        }
    }

    @Override // X.MRS
    public final boolean DCS() {
        return this.A00;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        A03();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        A03();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        A03();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        A03();
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
    public final boolean remove(Object obj) {
        A03();
        return JR1.A1b(obj, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        A03();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        A03();
        return super.retainAll(collection);
    }
}