package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.0bk, reason: invalid class name */
/* loaded from: 0bk.class */
public final class C0bk extends PhantomReference implements 0kX {
    public final Object A00;

    public C0bk(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = obj2;
    }

    public Object Apr() {
        return this.A00;
    }
}
