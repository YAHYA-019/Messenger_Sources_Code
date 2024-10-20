package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;

/* loaded from: Lt6.class */
public final class Lt6 implements ListIterator {
    public int A00;
    public K9T A01;
    public K9T A02;
    public K9T A03;
    public final Object A04;
    public final /* synthetic */ LinkedListMultimap A05;

    public Lt6(LinkedListMultimap linkedListMultimap, Object obj) {
        this.A05 = linkedListMultimap;
        this.A04 = obj;
        KSo kSo = (KSo) linkedListMultimap.A04.get(obj);
        this.A02 = kSo == null ? null : kSo.A01;
    }

    public Lt6(LinkedListMultimap linkedListMultimap, Object obj, int i) {
        this.A05 = linkedListMultimap;
        KSo kSo = (KSo) linkedListMultimap.A04.get(obj);
        int i2 = kSo == null ? 0 : kSo.A00;
        Preconditions.checkPositionIndex(i, i2);
        if (i < i2 / 2) {
            this.A02 = kSo == null ? null : kSo.A01;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            this.A03 = kSo == null ? null : kSo.A02;
            this.A00 = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.A04 = obj;
        this.A01 = null;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        this.A03 = LinkedListMultimap.A00(this.A02, this.A05, this.A04, obj);
        this.A00++;
        this.A01 = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1T(this.A02);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return AnonymousClass001.A1T(this.A03);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        K9T k9t = this.A02;
        if (k9t == null) {
            throw AnonymousClass001.A10();
        }
        this.A01 = k9t;
        this.A03 = k9t;
        this.A02 = k9t.A01;
        this.A00++;
        return k9t.A04;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        K9T k9t = this.A03;
        if (k9t == null) {
            throw AnonymousClass001.A10();
        }
        this.A01 = k9t;
        this.A02 = k9t;
        this.A03 = k9t.A03;
        this.A00--;
        return k9t.A04;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        Preconditions.checkState(AnonymousClass001.A1T(this.A01), "no calls to next() since the last call to remove()");
        K9T k9t = this.A01;
        if (k9t != this.A02) {
            this.A03 = k9t.A03;
            this.A00--;
        } else {
            this.A02 = k9t.A01;
        }
        LinkedListMultimap.A01(k9t, this.A05);
        this.A01 = null;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        K9T k9t = this.A01;
        Preconditions.checkState(AnonymousClass001.A1T(k9t));
        k9t.A04 = obj;
    }
}
