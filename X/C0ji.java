package X;

import java.util.Iterator;

/* renamed from: X.0ji, reason: invalid class name */
/* loaded from: 0ji.class */
public final class C0ji implements Iterator {
    public int A00;
    public final /* synthetic */ 0GC A01;

    public C0ji(0GC r302) {
        this.A01 = r302;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01.size());
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        0GC r0 = this.A01;
        return new 0fD(r0.A01[i], r0.A02[i]);
    }

    @Override // java.util.Iterator
    public void remove() {
    }
}
