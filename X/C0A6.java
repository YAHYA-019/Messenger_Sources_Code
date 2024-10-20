package X;

import java.util.Iterator;

/* renamed from: X.0A6, reason: invalid class name */
/* loaded from: 0A6.class */
public class C0A6 implements Iterator, AnonymousClass116 {
    public int A00;
    public final /* synthetic */ C00v A01;

    public C0A6(C00v c00v) {
        this.A01 = c00v;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = false;
        if (this.A00 < this.A01.size()) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        C00v c00v = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return c00v.get(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
