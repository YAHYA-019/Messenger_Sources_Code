package X;

import android.os.Looper;
import com.facebook.fury.context.ReqContext;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;

/* renamed from: X.1vj, reason: invalid class name */
/* loaded from: 1vj.class */
public final class C1vj {
    public String A00;
    public final C00i A06;
    public final C1vo A08;
    public final C00i A0A;
    public final C00i A09 = new 1BQ(16873);
    public final C00i A07 = new 1BQ(16872);
    public LinkedBlockingDeque A02 = new LinkedBlockingDeque();
    public ArrayList A01 = new ArrayList();
    public Semaphore A03 = new Semaphore(3);
    public final C1vl A04 = new C1vl(this);
    public final C1vm A05 = new C1vm(this);

    /* JADX WARN: Type inference failed for: r0v30, types: [X.1vp, X.1vo, java.lang.Object] */
    public C1vj(boolean z) {
        1BV r0 = new 1BV(16854);
        this.A06 = r0;
        1BV r02 = new 1BV(16856);
        this.A0A = r02;
        ?? obj = new Object();
        this.A08 = obj;
        this.A00 = 0Pz.A0W("JobsQueue", z ? "[immediate]" : "[idle]");
        this.A01.add(obj);
        obj.A00 = this.A05;
        C1vp c1vp = (C1vp) r0.get();
        this.A01.add(c1vp);
        c1vp.A00 = this.A05;
        C1vp c1vp2 = (C1vp) r02.get();
        this.A01.add(c1vp2);
        c1vp2.A00 = this.A05;
    }

    public static void A00(final C1vj c1vj) {
        while (true) {
            C1wd c1wd = (C1wd) c1vj.A02.poll();
            if (c1wd == null) {
                Semaphore semaphore = c1vj.A03;
                semaphore.release();
                0fH.A0g(Integer.valueOf(semaphore.availablePermits()), c1vj.A00, "No more jobs to execute, thread released. permitsAvailable[%s]");
                return;
            }
            1wV r0 = c1wd.A00;
            if (!r0.isCancelled()) {
                Iterator it = c1vj.A01.iterator();
                while (it.hasNext()) {
                    if (!((C1vp) it.next()).A00(c1wd)) {
                        break;
                    }
                }
                boolean z = false;
                synchronized (r0) {
                    if (!r0.isCancelled()) {
                        final 1wM r02 = c1wd.A01;
                        Callable callable = new Callable(r02) { // from class: X.1wq
                            public final 1wM A00;

                            {
                                this.A00 = r02;
                            }

                            @Override // java.util.concurrent.Callable
                            public Object call() {
                                1wM r03 = this.A00;
                                int i = ((1wN) r03).A00;
                                String str = ((1wN) r03).A03;
                                C1vj c1vj2 = C1vj.this;
                                String str2 = c1vj2.A00;
                                Integer valueOf = Integer.valueOf(i);
                                0fH.A0a(valueOf, Looper.myLooper() == Looper.getMainLooper() ? "UI" : "BG", str, str2, "Job[%d] running [%s].\t\tname[%s] ");
                                C00i c00i = c1vj2.A07;
                                C1wa c1wa = (C1wa) c00i.get();
                                C1wc c1wc = (C1wc) c1wa.A02.get(valueOf);
                                if (c1wc != null) {
                                    c1wc.A02 = ((C0dr) c1wa.A00.get()).now();
                                }
                                ReqContext reqContext = ((1wN) r03).A02;
                                if (reqContext == null) {
                                    Runnable runnable = r03.A00;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                } else {
                                    ReqContext A01 = AnonymousClass018.A01(reqContext, reqContext.getTag(), reqContext.getType());
                                    try {
                                        Runnable runnable2 = r03.A00;
                                        if (runnable2 != null) {
                                            runnable2.run();
                                        }
                                    } finally {
                                    }
                                }
                                C1wa c1wa2 = (C1wa) c00i.get();
                                C1wc c1wc2 = (C1wc) c1wa2.A02.get(valueOf);
                                if (c1wc2 != null) {
                                    c1wc2.A00 = ((C0dr) c1wa2.A00.get()).now();
                                }
                                C1wa c1wa3 = (C1wa) c00i.get();
                                C1wc c1wc3 = (C1wc) c1wa3.A02.get(valueOf);
                                if (c1wc3 != null) {
                                    1UG A00 = 1UD.A00((04J) c1wa3.A01.get(), 1ZG.A01, "android_job_orchestrator");
                                    if (A00.isSampled()) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("description", str);
                                        hashMap.put("hints", String.valueOf(((1wN) r03).A04));
                                        hashMap.put("scheduled_time", String.valueOf(c1wc3.A01));
                                        hashMap.put("started_time", String.valueOf(c1wc3.A02));
                                        hashMap.put("completed_time", String.valueOf(c1wc3.A00));
                                        A00.A6J("job_info", hashMap);
                                        A00.BZL();
                                    }
                                }
                                0fH.A0d(valueOf, str, str2, "Job[%d] completed.\t\tname[%s] ");
                                return null;
                            }
                        };
                        C1wr c1wr = (C1wr) c1vj.A09.get();
                        EnumSet enumSet = ((1wN) r02).A04;
                        boolean contains = enumSet.contains(C1w2.A0B);
                        boolean contains2 = enumSet.contains(C1w2.A0D);
                        r0.A00(((1ED) (contains ? contains2 ? c1wr.A01 : c1wr.A00 : contains2 ? c1wr.A03 : c1wr.A02).get()).D3C(callable));
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                A00(c1vj);
                return;
            }
        }
    }

    public void A01() {
        while (true) {
            Semaphore semaphore = this.A03;
            if (semaphore.availablePermits() <= 0 || this.A02.isEmpty()) {
                return;
            }
            if (semaphore.tryAcquire()) {
                A00(this);
            }
        }
    }

    public void A02(boolean z) {
        C1vu c1vu = (C1vu) this.A0A.get();
        0fH.A0g(z ? "LOGGED_IN" : "LOGGED_OUT", "LoginStatusJobConstraint", "onLoginStatusChanged state[%s]");
        c1vu.A00.set(z);
    }
}
