package X;

import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Lrg.class */
public final class Lrg implements Runnable, MNm {
    public static final String __redex_internal_original_name = "ThreadPoolExecutorWatchdog";
    public long A00;
    public Thread A01;
    public KQL A02;
    public final String A03;
    public final ThreadPoolExecutor A04;
    public final Runnable A05;
    public final ExecutorService A06;
    public final AtomicBoolean A07 = DKC.A1E(true);
    public final AtomicBoolean A08 = 7zO.A15();

    public Lrg(String str, ExecutorService executorService, ThreadPoolExecutor threadPoolExecutor) {
        LkF lkF = new LkF(this);
        this.A05 = lkF;
        this.A06 = executorService;
        this.A04 = threadPoolExecutor;
        this.A03 = str;
        executorService.execute(lkF);
    }

    private KQL A00(Thread thread) {
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        long uptimeMillis2 = (SystemClock.uptimeMillis() - uptimeMillis) / 1000;
        StringBuilder A0n = AnonymousClass001.A0n(0Pz.A0W("Blocked on ", this.A03));
        A0n.append(" thread=[num=");
        ThreadPoolExecutor threadPoolExecutor = this.A04;
        A0n.append(threadPoolExecutor.getPoolSize());
        A0n.append(", active=");
        A0n.append(threadPoolExecutor.getActiveCount());
        StringBuilder A0n2 = AnonymousClass001.A0n(AnonymousClass001.A0d("]", A0n));
        A0n2.append(" task=[queuing=");
        A0n2.append(threadPoolExecutor.getQueue().size());
        A0n2.append(", finished=");
        A0n2.append(threadPoolExecutor.getCompletedTaskCount());
        String A0d = AnonymousClass001.A0d("]", A0n2);
        long uptimeMillis3 = (SystemClock.uptimeMillis() - this.A00) / 1000;
        StringBuilder A0n3 = AnonymousClass001.A0n(A0d);
        A0n3.append(" for ");
        A0n3.append(uptimeMillis3);
        StringBuilder A0n4 = AnonymousClass001.A0n(AnonymousClass001.A0d(" seconds; ", A0n3));
        A0n4.append("dump took ");
        A0n4.append(uptimeMillis2);
        Exception exc = new Exception(AnonymousClass001.A0d(" seconds", A0n4));
        exc.setStackTrace(stackTrace);
        return exc;
    }

    @Override // X.MNm
    public boolean AEt() {
        if (this.A07.get()) {
            return true;
        }
        Thread thread = this.A01;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.A02 = A00(thread);
        return false;
    }

    @Override // X.MIE
    public void BeV() {
        boolean z = this.A08.get();
        AtomicBoolean atomicBoolean = this.A07;
        if (z) {
            atomicBoolean.set(true);
            return;
        }
        atomicBoolean.set(false);
        this.A00 = SystemClock.uptimeMillis();
        this.A06.execute(this);
    }

    @Override // X.MNm
    public void CgM() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            Thread thread = this.A01;
            if (thread != null && thread.isAlive()) {
                Throwable A00 = A00(thread);
                Throwable th = this.A02;
                if (th != null) {
                    A00.initCause(th);
                }
                if (!atomicBoolean.get()) {
                    L8o.A00().A05(0Pz.A0W("ThreadPoolExecutorWatchdog-", this.A03), A00);
                }
            }
            this.A08.set(true);
            L8o A002 = L8o.A00();
            synchronized (A002.A03) {
                A002.A05.add(this);
            }
            return;
        }
        this.A02 = null;
    }

    @Override // X.MIE
    public String getName() {
        return this.A03;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01 = Thread.currentThread();
        this.A07.set(true);
        if (this.A08.getAndSet(false)) {
            L8o A00 = L8o.A00();
            synchronized (A00.A03) {
                A00.A05.remove(this);
            }
        }
    }
}
