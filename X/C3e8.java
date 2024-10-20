package X;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3e8, reason: invalid class name */
/* loaded from: 3e8.class */
public final class C3e8 implements 1FA {
    public final long A00;
    public final long A01;
    public final C0dr A02;
    public final 1FA A03;
    public final TimeUnit A04;

    public C3e8(C0dr c0dr, 1FA r303, TimeUnit timeUnit, long j, long j2) {
        this.A02 = c0dr;
        this.A03 = r303;
        this.A01 = j;
        this.A00 = j2;
        this.A04 = timeUnit;
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.A03.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.A03.cancel(z);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long delay = getDelay(timeUnit);
        long delay2 = ((Delayed) obj).getDelay(timeUnit);
        if (delay < delay2) {
            i = -1;
        } else {
            i = 0;
            if (delay > delay2) {
                return 1;
            }
        }
        return i;
    }

    public Object get() {
        return this.A03.get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A03.get(j, timeUnit);
    }

    public long getDelay(TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        return timeUnit.convert(timeUnit2.convert(this.A00, this.A04) - (this.A02.now() - this.A01), timeUnit2);
    }

    public boolean isCancelled() {
        return this.A03.isCancelled();
    }

    public boolean isDone() {
        return this.A03.isDone();
    }
}
