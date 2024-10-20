package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: Lt0.class */
public final class Lt0 implements List, C07c {
    public int A00;
    public int A01;
    public final int A02;
    public final Lsu A03;

    public Lt0(Lsu lsu, int i, int i2) {
        this.A03 = lsu;
        this.A02 = i;
        this.A01 = lsu.A03();
        this.A00 = i2 - i;
    }

    private final void A00() {
        if (this.A03.A03() != this.A01) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        A00();
        Lsu lsu = this.A03;
        lsu.add(this.A02 + i, obj);
        this.A00 = size() + 1;
        this.A01 = lsu.A03();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        A00();
        Lsu lsu = this.A03;
        lsu.add(this.A02 + size(), obj);
        this.A00 = size() + 1;
        this.A01 = lsu.A03();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        A00();
        Lsu lsu = this.A03;
        boolean addAll = lsu.addAll(i + this.A02, collection);
        if (addAll) {
            this.A00 = JQz.A0G(collection, size());
            this.A01 = lsu.A03();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int i;
        MRG mrg;
        Snapshot A00;
        boolean z;
        if (size() > 0) {
            A00();
            Lsu lsu = this.A03;
            int i2 = this.A02;
            int size = size() + i2;
            do {
                Object obj = Kwx.A00;
                synchronized (obj) {
                    L2v l2v = lsu.A00;
                    C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                    i = A0Z.A00;
                    mrg = A0Z.A02;
                }
                11T.A0D(mrg);
                LzA ACx = mrg.ACx();
                ACx.subList(i2, size).clear();
                MRG A0P = ACx.A0P();
                if (11T.A0O(A0P, mrg)) {
                    break;
                }
                L2v l2v2 = lsu.A00;
                11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (LEY.A07) {
                    A00 = LEY.A00();
                    C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, lsu, l2v2);
                    synchronized (obj) {
                        int i3 = c2882Jc3.A00;
                        z = true;
                        if (i3 == i) {
                            c2882Jc3.A02 = A0P;
                            c2882Jc3.A00 = i3 + 1;
                            c2882Jc3.A01++;
                        } else {
                            z = false;
                        }
                    }
                }
                LEY.A0F(A00, lsu);
            } while (!z);
            this.A00 = 0;
            this.A01 = lsu.A03();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return 1BL.A1S(indexOf(obj));
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i) {
        A00();
        Kwx.A00(i, size());
        return this.A03.get(this.A02 + i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        A00();
        int i = this.A02;
        Iterator it = 07C.A07(i, size() + i).iterator();
        while (it.hasNext()) {
            int A06 = 7zL.A06(it);
            if (11T.A0O(obj, this.A03.get(A06))) {
                return A06 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(size());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        A00();
        int i = this.A02;
        int size = i + size();
        do {
            size--;
            if (size < i) {
                return -1;
            }
        } while (!11T.A0O(obj, this.A03.get(size)));
        return size - i;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.0PI] */
    @Override // java.util.List
    public ListIterator listIterator(int i) {
        A00();
        ?? obj = new Object();
        ((0PI) obj).element = i - 1;
        return new LtA(this, (0PI) obj);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        A00();
        Lsu lsu = this.A03;
        Object remove = lsu.remove(this.A02 + i);
        this.A00 = size() - 1;
        this.A01 = lsu.A03();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean z;
        Iterator it = collection.iterator();
        while (true) {
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    return z2;
                }
                z = remove(it.next()) || z2;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i;
        MRG mrg;
        Snapshot A00;
        boolean z;
        A00();
        Lsu lsu = this.A03;
        int i2 = this.A02;
        int size = size() + i2;
        int size2 = lsu.size();
        do {
            Object obj = Kwx.A00;
            synchronized (obj) {
                L2v l2v = lsu.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            LzA ACx = mrg.ACx();
            ACx.subList(i2, size).retainAll(collection);
            MRG A0P = ACx.A0P();
            if (11T.A0O(A0P, mrg)) {
                break;
            }
            L2v l2v2 = lsu.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, lsu, l2v2);
                synchronized (obj) {
                    int i3 = c2882Jc3.A00;
                    z = true;
                    if (i3 == i) {
                        c2882Jc3.A02 = A0P;
                        c2882Jc3.A00 = i3 + 1;
                        c2882Jc3.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            LEY.A0F(A00, lsu);
        } while (!z);
        int size3 = size2 - lsu.size();
        if (size3 <= 0) {
            return false;
        }
        this.A01 = lsu.A03();
        this.A00 = size() - size3;
        return true;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        Kwx.A00(i, size());
        A00();
        Lsu lsu = this.A03;
        Object obj2 = lsu.set(i + this.A02, obj);
        this.A01 = lsu.A03();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw AnonymousClass001.A0L("fromIndex or toIndex are out of bounds");
        }
        A00();
        Lsu lsu = this.A03;
        int i3 = this.A02;
        return new Lt0(lsu, i + i3, i2 + i3);
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
