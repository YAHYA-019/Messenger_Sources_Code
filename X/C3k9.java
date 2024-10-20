package X;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: X.3k9, reason: invalid class name */
/* loaded from: 3k9.class */
public final class C3k9 extends AbstractOwnableSynchronizer implements Runnable {
    public static final String __redex_internal_original_name = "InterruptibleTask$Blocker";
    public final C1i8 task;

    public C3k9(C1i8 c1i8) {
        this.task = c1i8;
    }

    public static void A00(C3k9 c3k9, Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public String toString() {
        return this.task.toString();
    }
}
