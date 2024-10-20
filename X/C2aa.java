package X;

import java.util.concurrent.Executor;

/* renamed from: X.2aa, reason: invalid class name */
/* loaded from: 2aa.class */
public final class C2aa extends 2Zr implements Executor {
    public static final 2Zs A00;
    public static final C2aa A01 = new 2Zs();

    static {
        C2ab c2ab = C2ab.A00;
        int i = 2aR.A00;
        int i2 = 64;
        if (64 < i) {
            i2 = i;
        }
        A00 = c2ab.limitedParallelism((int) 2aQ.A00(i2, "kotlinx.coroutines.io.parallelism", 2147483647L));
    }

    public void dispatch(0DE r302, Runnable runnable) {
        A00.dispatch(r302, runnable);
    }

    public void dispatchYield(0DE r302, Runnable runnable) {
        A00.dispatchYield(r302, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        A00.dispatch(0DL.A00, runnable);
    }

    public 2Zs limitedParallelism(int i) {
        return C2ab.A00.limitedParallelism(i);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
