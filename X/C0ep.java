package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.0ep, reason: invalid class name */
/* loaded from: 0ep.class */
public final class C0ep implements ListIterator, AnonymousClass116 {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final 0R9 A03;

    public C0ep(0R9 r302, int i) {
        this.A03 = r302;
        this.A01 = i;
        this.A00 = 0R9.A01(r302);
    }

    private final void A00() {
        if (0OI.A01(this.A03.root) != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        A00();
        0R9 r0 = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        r0.add(i, obj);
        this.A02 = -1;
        this.A00 = 0R9.A01(r0);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A01, this.A03.length);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return AnonymousClass001.A1P(this.A01);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        A00();
        int i = this.A01;
        0R9 r0 = this.A03;
        if (i >= r0.length) {
            throw AnonymousClass001.A10();
        }
        this.A01 = i + 1;
        this.A02 = i;
        return r0.backing[r0.offset + i];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.A01;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        A00();
        int i = this.A01;
        if (i <= 0) {
            throw AnonymousClass001.A10();
        }
        int i2 = i - 1;
        this.A01 = i2;
        this.A02 = i2;
        0R9 r0 = this.A03;
        return r0.backing[r0.offset + i2];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.A01 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        A00();
        int i = this.A02;
        if (i == -1) {
            throw AnonymousClass001.A0N("Call next() or previous() before removing element from the iterator.");
        }
        0R9 r0 = this.A03;
        r0.remove(i);
        this.A01 = this.A02;
        this.A02 = -1;
        this.A00 = 0R9.A01(r0);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        A00();
        int i = this.A02;
        if (i == -1) {
            throw AnonymousClass001.A0N("Call next() or previous() before replacing element from the iterator.");
        }
        this.A03.set(i, obj);
    }
}
