package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2am, reason: invalid class name */
/* loaded from: 2am.class */
public abstract /* synthetic */ class C2am {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, Object obj3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
