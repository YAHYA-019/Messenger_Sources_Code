package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: I5y.class */
public final class I5y {
    public static final UUID A06 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;

    public I5y() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        C0T8.A00(handlerThread);
        this.A05 = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A03 = new Handler(looper);
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        C0T8.A00(handlerThread2);
        this.A04 = handlerThread2;
        handlerThread2.start();
        Looper looper2 = handlerThread2.getLooper();
        looper2.getClass();
        this.A02 = new Handler(looper2);
    }

    public J7a A00(Ht4 ht4, String str, Callable callable) {
        J7a j7a;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            j7a = new J7a(this, str, uuid, callable);
            if (ht4 != null) {
                j7a.A01(ht4);
            }
            this.A03.postAtTime(j7a, this.A01, SystemClock.uptimeMillis());
        }
        return j7a;
    }

    public J7a A01(Ht4 ht4, Callable callable) {
        J7a j7a;
        synchronized (this) {
            UUID uuid = A06;
            j7a = new J7a(this, "load_camera_infos", uuid, callable);
            j7a.A01(ht4);
            this.A03.postAtTime(j7a, uuid, SystemClock.uptimeMillis());
        }
        return j7a;
    }

    public J7a A02(String str, Callable callable, long j) {
        J7a j7a;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            j7a = new J7a(this, str, uuid, callable);
            this.A03.postAtTime(j7a, this.A01, SystemClock.uptimeMillis() + j);
        }
        return j7a;
    }

    public Object A03(String str, Callable callable) {
        J7a j7a;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            j7a = new J7a(this, str, uuid, callable);
            this.A02.post(j7a);
        }
        return j7a.get();
    }

    public Object A04(String str, Callable callable) {
        J7a j7a;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            j7a = new J7a(this, str, uuid, callable);
            this.A02.post(j7a);
        }
        JIp jIp = (JIp) j7a.get();
        jIp.ACQ();
        return jIp.B7p();
    }

    public void A05(Runnable runnable, UUID uuid) {
        synchronized (this) {
            UUID uuid2 = this.A01;
            if ((uuid2 != null && uuid2.equals(uuid)) || A06.equals(uuid)) {
                Handler handler = this.A00;
                if (handler != null) {
                    handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    synchronized (I9z.class) {
                        I9z.A00.postAtTime(runnable, uuid, uptimeMillis);
                    }
                }
            }
        }
    }

    public void A06(String str) {
        if (!A09()) {
            throw GOp.A17(str, " Current thread: ", Thread.currentThread().getName());
        }
    }

    public void A07(String str, Callable callable) {
        synchronized (this) {
            A00(null, str, callable);
        }
    }

    public void A08(FutureTask futureTask) {
        synchronized (this) {
            this.A03.removeCallbacks(futureTask);
        }
    }

    public boolean A09() {
        return AnonymousClass001.A1W(GOo.A11(this.A03), Thread.currentThread());
    }

    public void finalize() {
        int A03 = 0FI.A03(1157831874);
        HandlerThread handlerThread = this.A04;
        handlerThread.quitSafely();
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            AnonymousClass001.A13();
        }
        HandlerThread handlerThread2 = this.A05;
        handlerThread2.quitSafely();
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            AnonymousClass001.A13();
        }
        0FI.A09(767378324, A03);
    }
}
