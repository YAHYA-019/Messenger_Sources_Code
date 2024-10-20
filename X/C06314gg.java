package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gg.class */
public class C06314gg extends AbstractExecutorService {
    public final BlockingQueue A00;
    public final String A03;
    public final Executor A04;
    public volatile int A06 = 1;
    public final RunnableC06324gh A02 = new Runnable() { // from class: X.4gh
        public static final String __redex_internal_original_name = "ConstrainedExecutorService$Worker";

        @Override // java.lang.Runnable
        public void run() {
            try {
                C06314gg c06314gg = C06314gg.this;
                BlockingQueue blockingQueue = c06314gg.A00;
                Runnable runnable = (Runnable) blockingQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
                c06314gg.A01.decrementAndGet();
                if (blockingQueue.isEmpty()) {
                    return;
                }
                C06314gg.A00(c06314gg);
            } catch (Throwable th) {
                C06314gg c06314gg2 = C06314gg.this;
                c06314gg2.A01.decrementAndGet();
                if (!c06314gg2.A00.isEmpty()) {
                    C06314gg.A00(c06314gg2);
                }
                throw th;
            }
        }
    };
    public final AtomicInteger A01 = new AtomicInteger(0);
    public final AtomicInteger A05 = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.4gh] */
    public C06314gg(String str, BlockingQueue blockingQueue, Executor executor) {
        this.A03 = str;
        this.A04 = executor;
        this.A00 = blockingQueue;
    }

    public static void A00(C06314gg c06314gg) {
        int i;
        AtomicInteger atomicInteger = c06314gg.A01;
        do {
            i = atomicInteger.get();
            if (i >= c06314gg.A06) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        c06314gg.A04.execute(c06314gg.A02);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw AnonymousClass001.A0Q(1BJ.A00(2009));
        }
        BlockingQueue blockingQueue = this.A00;
        if (!blockingQueue.offer(runnable)) {
            String str = this.A03;
            throw new RejectedExecutionException(AnonymousClass001.A0e(" queue is full, size=", AnonymousClass001.A0n(str), blockingQueue.size()));
        }
        int size = blockingQueue.size();
        AtomicInteger atomicInteger = this.A05;
        int i = atomicInteger.get();
        if (size > i) {
            atomicInteger.compareAndSet(i, size);
        }
        A00(this);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw AnonymousClass001.A0p();
    }
}
