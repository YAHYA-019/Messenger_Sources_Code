package X;

import java.util.ListIterator;

/* loaded from: Lt4.class */
public final class Lt4 implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ LyD A01;

    public Lt4(LyD lyD, int i) {
        this.A01 = lyD;
        this.A00 = lyD.A00.listIterator(i);
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.A00.nextIndex();
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.A00.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw AnonymousClass001.A0p();
    }
}
