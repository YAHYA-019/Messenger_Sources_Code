package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1i1, reason: invalid class name */
/* loaded from: 1i1.class */
public final class C1i1 extends C1i2 {
    public final AtomicIntegerFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;

    public C1i1(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        this.A01 = atomicReferenceFieldUpdater;
        this.A00 = atomicIntegerFieldUpdater;
    }

    @Override // X.C1i2
    public int A00(C1hr c1hr) {
        return this.A00.decrementAndGet(c1hr);
    }
}
