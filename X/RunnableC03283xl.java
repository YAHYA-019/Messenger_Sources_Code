package X;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xl.class */
public class RunnableC03283xl extends 1RE implements Runnable, 1FA, ScheduledFuture {
    public static final String __redex_internal_original_name = "WakingExecutorService$WakingListenableScheduledFuture";
    public final 1QH A00;
    public final /* synthetic */ C03253xi A01;

    public RunnableC03283xl(C03253xi c03253xi, Object obj, Runnable runnable) {
        this.A01 = c03253xi;
        this.A00 = new 1QH(runnable, obj);
    }

    public RunnableC03283xl(C03253xi c03253xi, Callable callable) {
        this.A01 = c03253xi;
        this.A00 = new 1QH(callable);
    }

    public /* bridge */ /* synthetic */ Object A01() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ Future A02() {
        return this.A00;
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C03253xi c03253xi = this.A01;
        synchronized (c03253xi) {
            PriorityQueue priorityQueue = c03253xi.A02;
            Iterator it = priorityQueue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C03293xm c03293xm = (C03293xm) it.next();
                if (c03293xm.A01 == this) {
                    priorityQueue.remove(c03293xm);
                    C03253xi.A02(c03253xi);
                    break;
                }
            }
        }
        return this.A00.cancel(z);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.run();
    }
}
