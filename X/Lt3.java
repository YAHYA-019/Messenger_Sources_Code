package X;

import java.util.ListIterator;

/* loaded from: Lt3.class */
public final class Lt3 implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ LyB A01;

    public Lt3(LyB lyB, int i) {
        this.A01 = lyB;
        this.A00 = lyB.A00.listIterator(i);
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
