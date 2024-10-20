package X;

import java.util.ListIterator;

/* loaded from: Lt1.class */
public final class Lt1 implements ListIterator {
    public final ListIterator A00;
    public final /* synthetic */ Ly7 A01;

    public Lt1(Ly7 ly7, int i) {
        this.A01 = ly7;
        this.A00 = ly7.A00.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw AnonymousClass001.A0p();
    }
}
