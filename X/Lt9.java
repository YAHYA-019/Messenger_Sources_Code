package X;

import java.util.List;
import java.util.ListIterator;

/* loaded from: Lt9.class */
public final class Lt9 implements ListIterator, AnonymousClass116 {
    public int A00;
    public final List A01;

    public Lt9(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        this.A01.add(this.A00, obj);
        this.A00++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01.size());
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return AnonymousClass001.A1P(this.A00);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        List list = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        int i = this.A00 - 1;
        this.A00 = i;
        return this.A01.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i = this.A00 - 1;
        this.A00 = i;
        this.A01.remove(i);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        this.A01.set(this.A00, obj);
    }
}
