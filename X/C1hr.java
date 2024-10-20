package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: X.1hr, reason: invalid class name */
/* loaded from: 1hr.class */
public abstract class C1hr extends 1FV {
    public static final C1i2 A00;
    public static final 1GE A01 = new 1GE(C1hr.class);
    public volatile int remaining;
    public volatile Set seenExceptions;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.1i2] */
    static {
        Object obj;
        Throwable th = null;
        try {
            new C1i1(AtomicIntegerFieldUpdater.newUpdater(C1hr.class, "remaining"), AtomicReferenceFieldUpdater.newUpdater(C1hr.class, Set.class, "seenExceptions"));
        } catch (Throwable th2) {
            th = th2;
            obj = new Object();
        }
        A00 = obj;
        if (th != null) {
            A01.A00().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
