package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xi.class */
public final class C03253xi extends AbstractExecutorService implements 1EC {
    public 1BY A00;
    public final C0dr A01;
    public final PriorityQueue A02;
    public final AlarmManager A03;
    public final PendingIntent A04;
    public final Context A05;
    public final Handler A06;
    public final C01s A07 = (C01s) 1Bi.A03(16511);

    public C03253xi(Handler handler, 1BO r303) {
        Context context = (Context) 1Bn.A0G(this.A00, 83719);
        this.A05 = context;
        this.A01 = (C0dr) 1Bi.A03(84489);
        this.A03 = (AlarmManager) 1Hv.A02(context, 100172);
        this.A02 = new PriorityQueue();
        this.A00 = new 1BY(r303);
        1Bi.A03(67908);
        this.A06 = handler;
        StringBuilder sb = new StringBuilder();
        sb.append("WakingExecutorService.ACTION_ALARM.");
        C0di A00 = C0di.A00();
        11T.A0A(A00);
        sb.append(A00);
        sb.append(".");
        sb.append("Mqtt_Wakeup");
        final String obj = sb.toString();
        Intent intent = new Intent(obj);
        intent.setPackage(context.getPackageName());
        05X r0 = new 05X();
        r0.A0C(intent);
        r0.A0A();
        r0.A0B();
        this.A04 = r0.A02(context, 0, 134217728);
        09X.A00();
        C08l c08l = new C08l(new C08j(this, obj) { // from class: X.3xj
            public final C03253xi A00;
            public final String A01;

            {
                this.A00 = this;
                this.A01 = obj;
            }

            @Override // X.C08j
            public ArrayList Ara() {
                return new ArrayList(Arrays.asList(new IntentFilter(this.A01)));
            }

            @Override // X.C08j
            public void CFb(Context context2, Intent intent2, C01q c01q) {
                ImmutableList build;
                C03253xi c03253xi = this.A00;
                0fH.A0D(C03253xi.class, "Alarm fired");
                synchronized (c03253xi) {
                    0fH.A0D(C03253xi.class, "Removing expired tasks from the queue to be executed");
                    ImmutableList.Builder builder = ImmutableList.builder();
                    while (true) {
                        PriorityQueue priorityQueue = c03253xi.A02;
                        if (priorityQueue.isEmpty() || ((C03293xm) priorityQueue.peek()).A00 > c03253xi.A01.now()) {
                            break;
                        } else {
                            builder.m11011add((Object) ((C03293xm) priorityQueue.remove()).A01);
                        }
                    }
                    build = builder.build();
                    C03253xi.A02(c03253xi);
                }
                0fH.A09(C03253xi.class, Integer.valueOf(build.size()), "Executing %d tasks");
                int size = build.size();
                for (int i = 0; i < size; i++) {
                    ((RunnableC03283xl) build.get(i)).run();
                }
            }
        });
        ((C08m) c08l).A00 = new 0Ea(0GQ.A00, 0GQ.A01, false);
        Iterator it = c08l.A00.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            Integer A02 = c08l.A02();
            if (A02 == 0S2.A00) {
                context.registerReceiver(c08l, intentFilter, null, handler);
            } else {
                boolean z = A02 == 0S2.A01;
                if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
                    context.registerReceiver(c08l, intentFilter, null, handler);
                } else {
                    context.registerReceiver(c08l, intentFilter, null, handler, z ? 2 : 4);
                }
            }
        }
    }

    private void A00(RunnableC03283xl runnableC03283xl, long j) {
        0fH.A09(C03253xi.class, Long.valueOf((j - this.A01.now()) / 1000), "Scheduling task for %d seconds from now");
        synchronized (this) {
            this.A02.add(new C03293xm(runnableC03283xl, j));
            A02(this);
        }
    }

    public static void A01(RunnableC03283xl runnableC03283xl, C03253xi c03253xi, TimeUnit timeUnit, long j) {
        c03253xi.A00(runnableC03283xl, c03253xi.A01.now() + timeUnit.toMillis(j));
    }

    public static void A02(C03253xi c03253xi) {
        PendingIntent pendingIntent = c03253xi.A04;
        if (pendingIntent == null) {
            0fH.A0E(C03253xi.class, "Pending intent is null, not scheduling intent to run");
            return;
        }
        PriorityQueue priorityQueue = c03253xi.A02;
        if (priorityQueue.isEmpty()) {
            0fH.A0D(C03253xi.class, "No pending tasks, so not setting alarm and un-register the receiver");
            c03253xi.A03.cancel(pendingIntent);
            return;
        }
        long j = ((C03293xm) priorityQueue.peek()).A00;
        0fH.A09(C03253xi.class, Long.valueOf((j - c03253xi.A01.now()) / 1000), "Next alarm in %d seconds");
        Context context = c03253xi.A05;
        AlarmManager alarmManager = c03253xi.A03;
        if (0GR.A00(alarmManager, context)) {
            AbstractC03543ya.A00(alarmManager, pendingIntent, c03253xi.A07, 2, j);
        } else {
            alarmManager.set(2, j, pendingIntent);
        }
    }

    public /* bridge */ /* synthetic */ 1FA Cjg(Runnable runnable, TimeUnit timeUnit, long j) {
        RunnableC03283xl runnableC03283xl = new RunnableC03283xl(this, null, runnable);
        A01(runnableC03283xl, this, timeUnit, j);
        return runnableC03283xl;
    }

    public /* bridge */ /* synthetic */ 1FA Cji(Callable callable, TimeUnit timeUnit, long j) {
        RunnableC03283xl runnableC03283xl = new RunnableC03283xl(this, callable);
        A01(runnableC03283xl, this, timeUnit, j);
        return runnableC03283xl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, X.3xl] */
    public /* bridge */ /* synthetic */ ListenableFuture D3B(Runnable runnable) {
        ?? runnableC03283xl = new RunnableC03283xl(this, null, runnable);
        A00(runnableC03283xl, this.A01.now());
        return runnableC03283xl;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, X.3xl] */
    public /* bridge */ /* synthetic */ ListenableFuture D3C(Callable callable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ?? runnableC03283xl = new RunnableC03283xl(this, callable);
        A01(runnableC03283xl, this, timeUnit, 0L);
        return runnableC03283xl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, X.3xl] */
    public /* bridge */ /* synthetic */ ListenableFuture D3G(Object obj, Runnable runnable) {
        ?? runnableC03283xl = new RunnableC03283xl(this, obj, runnable);
        A00(runnableC03283xl, this.A01.now());
        return runnableC03283xl;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        A00(new RunnableC03283xl(this, null, runnable), this.A01.now());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new 4PU(this, obj, runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Callable callable) {
        return new 4PU(this, callable);
    }

    public /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableC03283xl runnableC03283xl = new RunnableC03283xl(this, null, runnable);
        A00(runnableC03283xl, this.A01.now() + timeUnit.toMillis(j));
        return runnableC03283xl;
    }

    public /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableC03283xl runnableC03283xl = new RunnableC03283xl(this, callable);
        A01(runnableC03283xl, this, timeUnit, j);
        return runnableC03283xl;
    }

    public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        RunnableC03283xl runnableC03283xl = new RunnableC03283xl(this, null, runnable);
        A00(runnableC03283xl, this.A01.now());
        return runnableC03283xl;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        RunnableC03283xl runnableC03283xl = new RunnableC03283xl(this, obj, runnable);
        A00(runnableC03283xl, this.A01.now());
        return runnableC03283xl;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        RunnableC03283xl runnableC03283xl = new RunnableC03283xl(this, callable);
        A01(runnableC03283xl, this, timeUnit, 0L);
        return runnableC03283xl;
    }
}
