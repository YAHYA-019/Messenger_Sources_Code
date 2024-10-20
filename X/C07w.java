package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.07w, reason: invalid class name */
/* loaded from: 07w.class */
public final class C07w implements C07v {
    public final AtomicReference A00;

    public C07w(C07v c07v) {
        this.A00 = new AtomicReference(c07v);
    }

    @Override // X.C07v
    public Iterator iterator() {
        C07v c07v = (C07v) this.A00.getAndSet(null);
        if (c07v != null) {
            return c07v.iterator();
        }
        throw AnonymousClass001.A0N("This sequence can be consumed only once.");
    }
}
