package X;

import java.util.Iterator;

/* renamed from: X.0vZ, reason: invalid class name */
/* loaded from: 0vZ.class */
public abstract class C0vZ implements Iterator, AnonymousClass116 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        AnonymousClass172 anonymousClass172 = (AnonymousClass172) this;
        long j = anonymousClass172.A00;
        if (j != anonymousClass172.A02) {
            anonymousClass172.A00 = anonymousClass172.A03 + j;
        } else {
            if (!anonymousClass172.A01) {
                throw AnonymousClass001.A10();
            }
            anonymousClass172.A01 = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
