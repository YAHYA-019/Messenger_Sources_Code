package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.4F5, reason: invalid class name */
/* loaded from: 4F5.class */
public abstract class C4F5 {
    public static Object A00(C4Ez c4Ez) {
        AbstractC00481b7.A05("Must not be called on the main application thread");
        AbstractC00481b7.A00();
        AbstractC00481b7.A03(c4Ez, "Task must not be null");
        if (!c4Ez.A0D()) {
            C4F6 c4f6 = new C4F6(null);
            Executor executor = C4F7.A01;
            c4Ez.A03(c4f6, executor);
            c4Ez.A0A(c4f6, executor);
            c4Ez.A07(c4f6, executor);
            c4f6.A00.await();
        }
        if (c4Ez.A0E()) {
            return c4Ez.A05();
        }
        if (c4Ez.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c4Ez.A04());
    }

    public static Object A01(C4Ez c4Ez, TimeUnit timeUnit, long j) {
        AbstractC00481b7.A05("Must not be called on the main application thread");
        AbstractC00481b7.A00();
        AbstractC00481b7.A03(c4Ez, "Task must not be null");
        if (!c4Ez.A0D()) {
            C4F6 c4f6 = new C4F6(null);
            Executor executor = C4F7.A01;
            c4Ez.A03(c4f6, executor);
            c4Ez.A0A(c4f6, executor);
            c4Ez.A07(c4f6, executor);
            if (!c4f6.A00.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (c4Ez.A0E()) {
            return c4Ez.A05();
        }
        if (c4Ez.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c4Ez.A04());
    }
}
