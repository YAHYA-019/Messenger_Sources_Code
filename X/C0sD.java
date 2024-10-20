package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.0sD, reason: invalid class name */
/* loaded from: 0sD.class */
public final class C0sD implements Iterator, AnonymousClass116 {
    public final /* synthetic */ Enumeration A00;

    public C0sD(Enumeration enumeration) {
        this.A00 = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A00.hasMoreElements();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.A00.nextElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
