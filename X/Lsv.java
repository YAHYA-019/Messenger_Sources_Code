package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: Lsv.class */
public final class Lsv implements List, AnonymousClass116 {
    public final List A00 = new Lsu();

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
        if (obj instanceof MBO) {
            return this.A00.contains(obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MBO) {
            return this.A00.indexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MBO) {
            return this.A00.lastIndexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.A00.listIterator();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return this.A00.listIterator(i);
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
        return this.A00.size();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return this.A00.subList(i, i2);
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
