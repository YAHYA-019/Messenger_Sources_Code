package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Pq, reason: invalid class name */
/* loaded from: 3Pq.class */
public final class C3Pq {
    public AtomicReference A00 = new AtomicReference();

    /* JADX WARN: Type inference failed for: r302v2, types: [java.lang.Object, X.3LB] */
    public static 3LB A00(C3Pq c3Pq) {
        AtomicReference atomicReference = c3Pq.A00;
        3LB r302 = (3LB) atomicReference.get();
        3LB r3022 = r302;
        if (r302 == null) {
            ?? obj = new Object();
            ((3LB) obj).A00 = 1;
            ((3LB) obj).A01 = new int[0];
            atomicReference.set(obj);
            r3022 = obj;
        }
        return r3022;
    }
}
