package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3o6.class */
public final class C00613o6 {
    public final int A00;
    public final int A01;
    public final HandlerThread A02;
    public final 1DP A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap(20, 0.9f, 1);
    public final AtomicBoolean A05;
    public volatile Handler A06;

    public C00613o6(1DP r302, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread("HungTaskTracker", 19);
        C0T8.A00(handlerThread);
        this.A02 = handlerThread;
        this.A05 = new AtomicBoolean();
        this.A03 = r302;
        this.A01 = i;
        this.A00 = i2;
        if (i > 0 || i2 > 0) {
            if (this.A06 == null) {
                synchronized (this) {
                    if (this.A06 == null) {
                        HandlerThread handlerThread2 = this.A02;
                        handlerThread2.start();
                        this.A06 = new 3wE(handlerThread2.getLooper(), this);
                    }
                }
            }
            if (i2 > 0) {
                C0k4.A01("We only enter this method if we've created the handler", this.A06);
                this.A06.sendEmptyMessageDelayed(2, this.A00);
            }
        }
    }
}
