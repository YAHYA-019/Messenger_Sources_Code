package X;

import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.62d, reason: invalid class name */
/* loaded from: 62d.class */
public class C62d extends AbstractList {
    public final List A00;

    public C62d(List list) {
        list.getClass();
        this.A00 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        List list = this.A00;
        int size = size();
        Preconditions.checkPositionIndex(i, size);
        list.add(size - i, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        List list = this.A00;
        int size = size();
        Preconditions.checkElementIndex(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        int size = size();
        Preconditions.checkPositionIndex(i, size);
        final ListIterator listIterator = this.A00.listIterator(size - i);
        return new ListIterator() { // from class: X.62f
            public boolean A00;

            @Override // java.util.ListIterator
            public void add(Object obj) {
                ListIterator listIterator2 = listIterator;
                listIterator2.add(obj);
                listIterator2.previous();
                this.A00 = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return listIterator.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return listIterator.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.A00 = true;
                return listIterator.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                C62d c62d = C62d.this;
                int nextIndex = listIterator.nextIndex();
                int size2 = c62d.size();
                Preconditions.checkPositionIndex(nextIndex, size2);
                return size2 - nextIndex;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.A00 = true;
                return listIterator.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.A00, "no calls to next() since the last call to remove()");
                listIterator.remove();
                this.A00 = false;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                Preconditions.checkState(this.A00);
                listIterator.set(obj);
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        List list = this.A00;
        int size = size();
        Preconditions.checkElementIndex(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        List list = this.A00;
        int size = size();
        Preconditions.checkElementIndex(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        List list = this.A00;
        int size = size();
        Preconditions.checkPositionIndex(i2, size);
        int i3 = size - i2;
        int size2 = size();
        Preconditions.checkPositionIndex(i, size2);
        return 1JW.A05(list.subList(i3, size2 - i));
    }
}
