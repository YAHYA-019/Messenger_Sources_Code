package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: Lsw.class */
public final class Lsw implements List, AnonymousClass116 {
    public final int A00;
    public final int A01;
    public final /* synthetic */ Lsx A02;

    public Lsw(Lsx lsx, int i, int i2) {
        this.A02 = lsx;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof LPR) {
            return 4YV.A1W(indexOf(obj), -1);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        Object obj = this.A02.A04[i + this.A01];
        11T.A0I(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof LPR)) {
            return -1;
        }
        int i = this.A01;
        int i2 = this.A00;
        if (i > i2) {
            return -1;
        }
        while (!JQz.A1Z(obj, this.A02.A04, i)) {
            if (i == i2) {
                return -1;
            }
            i++;
        }
        return i - i;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(size());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        Lsx lsx = this.A02;
        int i = this.A01;
        return new LtB(lsx, i, i, this.A00);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof LPR)) {
            return -1;
        }
        int i = this.A00;
        int i2 = this.A01;
        if (i2 > i) {
            return -1;
        }
        while (!JQz.A1Z(obj, this.A02.A04, i)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        Lsx lsx = this.A02;
        int i = this.A01;
        return new LtB(lsx, i, i, this.A00);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        Lsx lsx = this.A02;
        int i2 = this.A01;
        return new LtB(lsx, i + i2, i2, this.A00);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        Lsx lsx = this.A02;
        int i3 = this.A01;
        return new Lsw(lsx, i + i3, i3 + i2);
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
