package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0jG, reason: invalid class name */
/* loaded from: 0jG.class */
public final class C0jG extends AbstractExecutorService implements C1An {
    public static final String A0A = 0Pz.A0W(C0jG.class.getCanonicalName(), ".ACTION_ALARM.");
    public final Handler A00;
    public final RealtimeSinceBootClock A01;
    public final String A02;
    public final AlarmManager A04;
    public final PendingIntent A05;
    public final BroadcastReceiver A06;
    public final Context A07;
    public final 05L A08;
    public final AtomicLong A09 = new AtomicLong(-1);
    public final PriorityQueue A03 = new PriorityQueue();

    public C0jG(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, 05L r305, C16k c16k, String str) {
        PendingIntent pendingIntent;
        StringBuilder A0o = AnonymousClass001.A0o(A0A);
        AnonymousClass002.A0Q(context, str, A0o);
        String obj = A0o.toString();
        this.A02 = obj;
        this.A07 = context;
        this.A01 = realtimeSinceBootClock;
        0Gp A00 = c16k.A00(AlarmManager.class, "alarm");
        if (!A00.A06()) {
            throw AnonymousClass001.A0L("Cannot acquire Alarm service");
        }
        this.A04 = (AlarmManager) A00.A05();
        this.A00 = handler;
        this.A08 = r305;
        Intent intent = new Intent(obj);
        intent.setPackage(context.getPackageName());
        try {
            05X r0 = new 05X();
            r0.A05(intent, (ClassLoader) null);
            r0.A0A();
            pendingIntent = r0.A02(context, 0, 134217728);
        } catch (SecurityException e) {
            pendingIntent = null;
            0fH.A0s("WakingExecutorService", "Failed to create pending intent", e);
        }
        this.A05 = pendingIntent;
        0uN r02 = new 0uN(this, 1);
        this.A06 = r02;
        this.A08.A08(r02, this.A07, new IntentFilter(this.A02), handler, false);
    }

    private void A00(0jI r302, long j) {
        0fH.A0i(AnonymousClass002.A0H(j - SystemClock.elapsedRealtime()), "WakingExecutorService", "Scheduling task for %d seconds from now");
        synchronized (this) {
            this.A03.add(new 17E(r302, j));
            A02(this);
        }
    }

    public static void A01(C0jG c0jG) {
        ArrayList A0s;
        0fH.A0m("WakingExecutorService", "Alarm fired");
        synchronized (c0jG) {
            0fH.A0m("WakingExecutorService", "Removing expired tasks from the queue to be executed");
            A0s = AnonymousClass001.A0s();
            while (true) {
                PriorityQueue priorityQueue = c0jG.A03;
                if (priorityQueue.isEmpty() || ((17E) priorityQueue.peek()).A00 > SystemClock.elapsedRealtime()) {
                    break;
                } else {
                    A0s.add(((17E) priorityQueue.remove()).A01);
                }
            }
            A02(c0jG);
        }
        0fH.A0i(Integer.valueOf(A0s.size()), "WakingExecutorService", "Executing %d tasks");
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            ((0jI) it.next()).run();
        }
    }

    public static void A02(C0jG c0jG) {
        PendingIntent pendingIntent = c0jG.A05;
        if (pendingIntent == null) {
            0fH.A0n("WakingExecutorService", "Pending intent is null, not scheduling intent to run");
            return;
        }
        PriorityQueue priorityQueue = c0jG.A03;
        if (priorityQueue.isEmpty()) {
            0fH.A0m("WakingExecutorService", "No pending tasks, so not setting alarm and un-register the receiver");
            c0jG.A08.A04(c0jG.A04, pendingIntent);
            return;
        }
        long j = ((17E) priorityQueue.peek()).A00;
        AtomicLong atomicLong = c0jG.A09;
        if (atomicLong.get() == j) {
            0fH.A0m("WakingExecutorService", "Next alarm already scheduled. Skipping reset.");
            return;
        }
        0fH.A0i(AnonymousClass002.A0H(j - SystemClock.elapsedRealtime()), "WakingExecutorService", "Next alarm in %d seconds");
        c0jG.A08.A06(c0jG.A07, c0jG.A04, 2, j, pendingIntent);
        atomicLong.set(j);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: Cjf, reason: merged with bridge method [inline-methods] */
    public C0mb schedule(Runnable runnable, TimeUnit timeUnit, long j) {
        0jI r0 = new 0jI(this, (Object) null, runnable);
        A00(r0, SystemClock.elapsedRealtime() + timeUnit.toMillis(j));
        return r0;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        A00(new 0jI(this, (Object) null, runnable), SystemClock.elapsedRealtime());
        this.A00.post(new 17D(this));
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
        return new 0TT(this, obj, runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Callable callable) {
        return new 0TT(this, callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        0jI r0 = new 0jI(this, callable);
        A00(r0, SystemClock.elapsedRealtime() + timeUnit.toMillis(j));
        return r0;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        PendingIntent pendingIntent = this.A05;
        if (pendingIntent != null) {
            this.A08.A04(this.A04, pendingIntent);
        }
        try {
            this.A07.unregisterReceiver(this.A06);
        } catch (IllegalArgumentException e) {
            0fH.A0v("WakingExecutorService", "Failed to unregister broadcast receiver", e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        0jI r0 = new 0jI(this, (Object) null, runnable);
        A00(r0, SystemClock.elapsedRealtime());
        this.A00.post(new 17D(this));
        return r0;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        0jI r0 = new 0jI(this, obj, runnable);
        A00(r0, SystemClock.elapsedRealtime());
        this.A00.post(new 17D(this));
        return r0;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        0jI r0 = new 0jI(this, callable);
        A00(r0, SystemClock.elapsedRealtime() + timeUnit.toMillis(0L));
        this.A00.post(new 17C(this));
        return r0;
    }
}
