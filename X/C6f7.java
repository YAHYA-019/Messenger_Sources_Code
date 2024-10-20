package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.6f7, reason: invalid class name */
/* loaded from: 6f7.class */
public abstract class C6f7 implements Iterator {
    public int A00;
    public C6ey A01 = null;
    public C6ey A02;
    public final /* synthetic */ C6ex A03;

    public C6f7(C6ex c6ex) {
        this.A03 = c6ex;
        this.A02 = c6ex.header.A02;
        this.A00 = c6ex.modCount;
    }

    public final C6ey A00() {
        C6ey c6ey = this.A02;
        C6ex c6ex = this.A03;
        if (c6ey == c6ex.header) {
            throw new NoSuchElementException();
        }
        if (c6ex.modCount != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A02 = c6ey.A02;
        this.A01 = c6ey;
        return c6ey;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = false;
        if (this.A02 != this.A03.header) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6ey c6ey = this.A01;
        if (c6ey == null) {
            throw new IllegalStateException();
        }
        C6ex c6ex = this.A03;
        c6ex.A05(c6ey, true);
        this.A01 = null;
        this.A00 = c6ex.modCount;
    }
}
