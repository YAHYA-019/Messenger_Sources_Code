package X;

import java.util.Iterator;

/* renamed from: X.0ud, reason: invalid class name */
/* loaded from: 0ud.class */
public final class C0ud implements Iterator, AnonymousClass116 {
    public int A00;
    public final Iterator A01;

    public C0ud(Iterator it) {
        11T.A0F(it, 1);
        this.A01 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= 0) {
            return new C13h(i, this.A01.next());
        }
        C0s8.A18();
        throw 0Q8.createAndThrow();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
