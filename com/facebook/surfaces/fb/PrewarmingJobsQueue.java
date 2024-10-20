package com.facebook.surfaces.fb;

import X.0QO;
import X.1BQ;
import X.1Bi;
import X.1MG;
import X.1Od;
import X.1UN;
import X.1UP;
import X.3L6;
import X.4hS;
import X.5Fi;
import X.5TY;
import X.5Tf;
import X.5Tg;
import X.5Th;
import X.5Ti;
import X.5Ts;
import X.5Tt;
import X.C00i;
import X.C04r;
import X.C06474gz;
import X.InterfaceC06464gy;
import X.N1S;
import X.N8R;
import X.N90;
import android.app.Activity;
import android.content.Context;
import com.facebook.inject.FbInjector;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: PrewarmingJobsQueue.class */
public final class PrewarmingJobsQueue implements 1UN {
    public final C00i A04 = new 1BQ(33053);
    public final C00i A01 = new 1BQ(16616);
    public final C00i A03 = new 1BQ(49200);
    public final C00i A02 = FbInjector.A00;
    public final Object A05 = new Object();
    public final AtomicReference A07 = new AtomicReference(null);
    public final Deque A08 = new LinkedList();
    public final C04r A00 = new 0QO(0);
    public final AtomicBoolean A06 = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0QO, X.04r] */
    public PrewarmingJobsQueue() {
        ((1UP) 1Bi.A03(66348)).A01.add(this);
    }

    public static void A00(3L6 r301, 5TY r302, N1S n1s, PrewarmingJobsQueue prewarmingJobsQueue) {
        5Fi r0 = new 5Fi(r301, r302, n1s);
        synchronized (prewarmingJobsQueue.A05) {
            if (!prewarmingJobsQueue.A00.containsKey(r302)) {
                Deque deque = prewarmingJobsQueue.A08;
                deque.addLast(r0);
                if (deque.size() <= 1) {
                    A03(prewarmingJobsQueue);
                }
            }
        }
    }

    public static void A01(PrewarmingJobsQueue prewarmingJobsQueue) {
        AtomicReference atomicReference = prewarmingJobsQueue.A07;
        InterfaceC06464gy interfaceC06464gy = (4hS) atomicReference.get();
        if (interfaceC06464gy == null || !1MG.A00(atomicReference, interfaceC06464gy, (Object) null)) {
            return;
        }
        ((C06474gz) prewarmingJobsQueue.A03.get()).A06(interfaceC06464gy);
    }

    public static void A02(PrewarmingJobsQueue prewarmingJobsQueue) {
        synchronized (prewarmingJobsQueue.A05) {
            5Fi r0 = (5Fi) prewarmingJobsQueue.A08.poll();
            if (r0 != null) {
                r0.A01 = false;
            }
        }
    }

    public static void A03(PrewarmingJobsQueue prewarmingJobsQueue) {
        Context baseContext;
        synchronized (prewarmingJobsQueue.A05) {
            5Fi r0 = (5Fi) prewarmingJobsQueue.A08.peekFirst();
            if (r0 != null && !r0.A01) {
                prewarmingJobsQueue.A06.get();
                if (!A04(r0, prewarmingJobsQueue)) {
                    r0.A01 = true;
                    Activity A08 = ((1Od) prewarmingJobsQueue.A01.get()).A08();
                    WeakReference weakReference = null;
                    if (A08 != null && !A08.isFinishing() && (baseContext = A08.getBaseContext()) != null && baseContext.getApplicationContext() != null) {
                        weakReference = new WeakReference(A08);
                    }
                    5TY r02 = r0.A03;
                    N1S n1s = r0.A04;
                    ((Executor) prewarmingJobsQueue.A04.get()).execute(new N90(new N8R(r0.A02, r02, r0, n1s, prewarmingJobsQueue, weakReference), r02, r0, n1s, prewarmingJobsQueue));
                }
            }
        }
    }

    public static boolean A04(5Fi r301, PrewarmingJobsQueue prewarmingJobsQueue) {
        if (!r301.A00) {
            return false;
        }
        A02(prewarmingJobsQueue);
        A03(prewarmingJobsQueue);
        return true;
    }

    public void A05(5TY r302) {
        synchronized (this.A05) {
            Deque deque = this.A08;
            if (!deque.isEmpty()) {
                Iterator it = deque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    5Fi r0 = (5Fi) it.next();
                    if (r0.A03.equals(r302)) {
                        r0.A00 = true;
                        break;
                    }
                }
            }
        }
    }

    public void AFz() {
        5Ts r0;
        5Th r02;
        synchronized (this.A05) {
            this.A08.clear();
            this.A00.clear();
        }
        5Tg r03 = 5Tf.A00;
        synchronized (r03.A03) {
            r03.A02.clear();
            r03.A01.clear();
            r0 = 5Ts.A03;
            r02 = r0.A02;
            synchronized (r02) {
                r0.A01.clear();
            }
        }
        5Ti r04 = r03.A04;
        synchronized (r04.A02) {
            r04.A01.clear();
            synchronized (r02) {
                r0.A00.clear();
            }
            r04.A00.clear();
            5Tt.A04.set(1);
        }
        A01(this);
    }
}
