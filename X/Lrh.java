package X;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Lrh.class */
public class Lrh implements Runnable, MNm {
    public static Method A06;
    public static final Set A07 = AnonymousClass001.A0v();
    public static final String __redex_internal_original_name = "LooperWatchdog";
    public long A00;
    public KQL A01;
    public final Looper A02;
    public final Handler A03;
    public final AtomicBoolean A04 = DKC.A1E(true);
    public final AtomicBoolean A05 = 7zO.A15();

    static {
        try {
            Method declaredMethod = MessageQueue.class.getDeclaredMethod("isPolling", new Class[0]);
            A06 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable unused) {
        }
    }

    public Lrh(Handler handler) {
        Looper looper = handler.getLooper();
        this.A02 = looper;
        this.A03 = handler;
        A07.add(looper);
    }

    private String A00(long j) {
        if (!(this instanceof JlY)) {
            String A0W = 0Pz.A0W("Blocked on ", getName());
            long A062 = 4YU.A06(SystemClock.uptimeMillis() - this.A00);
            StringBuilder A0n = AnonymousClass001.A0n(A0W);
            A0n.append(" for ");
            A0n.append(A062);
            StringBuilder A0n2 = AnonymousClass001.A0n(AnonymousClass001.A0d(" seconds; ", A0n));
            A0n2.append("dump took ");
            A0n2.append(j);
            return AnonymousClass001.A0d(" seconds", A0n2);
        }
        JlY jlY = (JlY) this;
        String A0W2 = 0Pz.A0W("Blocked on ", jlY.getName());
        MIE mie = jlY.A00;
        if (mie != null) {
            A0W2 = 0Pz.A0j(A0W2, " in ", mie.getName());
        }
        long A063 = 4YU.A06(SystemClock.uptimeMillis() - jlY.A00);
        StringBuilder A0n3 = AnonymousClass001.A0n(A0W2);
        A0n3.append(" for ");
        A0n3.append(A063);
        StringBuilder A0n4 = AnonymousClass001.A0n(AnonymousClass001.A0d(" seconds; ", A0n3));
        A0n4.append("dump took ");
        A0n4.append(j);
        return AnonymousClass001.A0d(" seconds", A0n4);
    }

    public boolean A01() {
        Method method = A06;
        if (method == null) {
            return false;
        }
        try {
            return AnonymousClass001.A1V(AnonymousClass001.A0S(this.A02.getQueue(), method));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.MNm
    public final boolean AEt() {
        if (this.A04.get()) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTrace = this.A02.getThread().getStackTrace();
        Exception exc = new Exception(A00(4YU.A06(SystemClock.uptimeMillis() - uptimeMillis)));
        exc.setStackTrace(stackTrace);
        this.A01 = exc;
        return false;
    }

    @Override // X.MIE
    public void BeV() {
        if (this.A05.get() || A01()) {
            this.A04.set(true);
            return;
        }
        this.A04.set(false);
        this.A00 = SystemClock.uptimeMillis();
        this.A03.postAtFrontOfQueue(this);
    }

    @Override // X.MNm
    public final void CgM() {
        AtomicBoolean atomicBoolean = this.A04;
        if (!atomicBoolean.get()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StackTraceElement[] stackTrace = this.A02.getThread().getStackTrace();
            Exception exc = new Exception(A00(4YU.A06(SystemClock.uptimeMillis() - uptimeMillis)));
            exc.setStackTrace(stackTrace);
            KQL kql = this.A01;
            if (kql != null) {
                exc.initCause(kql);
            }
            if (!atomicBoolean.get()) {
                L8o.A00().A05(0Pz.A0W("LooperWatchdog-", getName()), exc);
                this.A05.set(true);
                L8o A00 = L8o.A00();
                synchronized (A00.A03) {
                    A00.A05.add(this);
                }
                return;
            }
        }
        this.A01 = null;
    }

    @Override // X.MIE
    public String getName() {
        return this.A02.getThread().getName();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A04.set(true);
        if (this.A05.getAndSet(false)) {
            L8o A00 = L8o.A00();
            synchronized (A00.A03) {
                A00.A05.remove(this);
            }
        }
    }
}
