package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Hzj.class */
public final class Hzj {
    public static Hzj A07;
    public static final HLz A08 = new Object();
    public double A00;
    public int A01;
    public HF0 A02;
    public final Handler A03;
    public final 5NB A04;
    public final AtomicReference A05;
    public final HandlerThread A06;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.5NB] */
    public Hzj() {
        HandlerThread handlerThread = new HandlerThread("spf_signal_listener_handler_thread");
        C0T8.A00(handlerThread);
        this.A06 = handlerThread;
        this.A04 = new Object();
        this.A05 = GOn.A1L(1BK.A1C());
        handlerThread.start();
        this.A03 = new Handler(handlerThread.getLooper());
    }
}
