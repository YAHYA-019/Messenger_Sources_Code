package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: Lt5.class */
public final class Lt5 implements ListIterator {
    public int A00;
    public int A01;
    public K9T A02;
    public K9T A03;
    public K9T A04;
    public final /* synthetic */ LinkedListMultimap A05;

    public Lt5(LinkedListMultimap linkedListMultimap, int i) {
        this.A05 = linkedListMultimap;
        this.A00 = linkedListMultimap.A00;
        int i2 = linkedListMultimap.A01;
        Preconditions.checkPositionIndex(i, i2);
        if (i < i2 / 2) {
            this.A03 = linkedListMultimap.A02;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                A00();
                K9T k9t = this.A03;
                if (k9t == null) {
                    throw AnonymousClass001.A10();
                }
                this.A02 = k9t;
                this.A04 = k9t;
                this.A03 = k9t.A00;
                this.A01++;
                i = i3;
            }
        } else {
            this.A04 = linkedListMultimap.A03;
            this.A01 = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                A00();
                K9T k9t2 = this.A04;
                if (k9t2 == null) {
                    throw AnonymousClass001.A10();
                }
                this.A02 = k9t2;
                this.A03 = k9t2;
                this.A04 = k9t2.A02;
                this.A01--;
                i = i4;
            }
        }
        this.A02 = null;
    }

    private void A00() {
        if (this.A05.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        A00();
        return AnonymousClass001.A1T(this.A03);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        A00();
        return AnonymousClass001.A1T(this.A04);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        A00();
        K9T k9t = this.A03;
        if (k9t == null) {
            throw AnonymousClass001.A10();
        }
        this.A02 = k9t;
        this.A04 = k9t;
        this.A03 = k9t.A00;
        this.A01++;
        return k9t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.A01;
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ Object previous() {
        A00();
        K9T k9t = this.A04;
        if (k9t == null) {
            throw AnonymousClass001.A10();
        }
        this.A02 = k9t;
        this.A03 = k9t;
        this.A04 = k9t.A02;
        this.A01--;
        return k9t;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.A01 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        A00();
        Preconditions.checkState(AnonymousClass001.A1T(this.A02), "no calls to next() since the last call to remove()");
        K9T k9t = this.A02;
        if (k9t != this.A03) {
            this.A04 = k9t.A02;
            this.A01--;
        } else {
            this.A03 = k9t.A00;
        }
        LinkedListMultimap linkedListMultimap = this.A05;
        LinkedListMultimap.A01(k9t, linkedListMultimap);
        this.A02 = null;
        this.A00 = linkedListMultimap.A00;
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw AnonymousClass001.A0p();
    }
}
