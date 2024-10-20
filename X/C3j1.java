package X;

import java.util.concurrent.Executor;

/* renamed from: X.3j1, reason: invalid class name */
/* loaded from: 3j1.class */
public final class C3j1 implements Executor {
    public final 2Zs A00;

    public C3j1(2Zs r302) {
        this.A00 = r302;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        2Zs r0 = this.A00;
        0DL r02 = 0DL.A00;
        if (r0.isDispatchNeeded(r02)) {
            r0.dispatch(r02, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.A00.toString();
    }
}
