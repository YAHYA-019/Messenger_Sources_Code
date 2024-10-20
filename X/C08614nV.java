package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4nV, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4nV.class */
public final class C08614nV implements Iterator {
    public Deque A00;
    public Iterator A01;
    public Iterator A02;
    public Iterator A03;

    @Override // java.util.Iterator
    public boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.A01;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.A02;
                if (it3 != null && it3.hasNext()) {
                    it = this.A02;
                    break;
                }
                Deque deque = this.A00;
                if (deque == null || deque.isEmpty()) {
                    break;
                }
                this.A02 = (Iterator) this.A00.removeFirst();
            }
            it = null;
            this.A02 = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.A01 = it4;
            if (it4 instanceof C08614nV) {
                C08614nV c08614nV = (C08614nV) it4;
                this.A01 = c08614nV.A01;
                Deque deque2 = this.A00;
                if (deque2 == null) {
                    deque2 = new ArrayDeque();
                    this.A00 = deque2;
                }
                deque2.addFirst(this.A02);
                if (c08614nV.A00 != null) {
                    while (!c08614nV.A00.isEmpty()) {
                        this.A00.addFirst(c08614nV.A00.removeLast());
                    }
                }
                this.A02 = c08614nV.A02;
            }
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.A01;
        this.A03 = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator it = this.A03;
        if (it == null) {
            throw AnonymousClass001.A0N("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.A03 = null;
    }
}
