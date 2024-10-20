package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LruCache;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: I7n.class */
public final class I7n {
    public static int A0C;
    public static int A0D;
    public static boolean A0E;
    public static boolean A0F;
    public static final HlN A0G = new Object();
    public static final I7n A0H = new I7n();
    public int A00;
    public Handler A01;
    public HandlerThread A02;
    public F8s A03;
    public EqT A04;
    public String A05;
    public volatile int A0A;
    public final Object A07 = AnonymousClass001.A0R();
    public volatile long A0B = -1;
    public final Runnable A09 = new IuJ(this);
    public final CopyOnWriteArrayList A08 = new CopyOnWriteArrayList();
    public final LruCache A06 = new LruCache(100);

    public static final void A00(I7n i7n, long j) {
        Handler handler;
        if (i7n.A01 == null) {
            synchronized (i7n.A07) {
                if (i7n.A01 == null) {
                    if (i7n.A02 == null) {
                        HandlerThread A0E2 = GOo.A0E("PlaybackMLBackgroundController", 10);
                        i7n.A02 = A0E2;
                        A0E2.start();
                    }
                    HandlerThread handlerThread = i7n.A02;
                    11T.A0D(handlerThread);
                    Looper looper = handlerThread.getLooper();
                    if (looper != null) {
                        new Handler(looper);
                    } else {
                        handler = null;
                    }
                    i7n.A01 = handler;
                }
            }
        }
        Handler handler2 = i7n.A01;
        if (handler2 != null) {
            Runnable runnable = i7n.A09;
            handler2.removeCallbacks(runnable);
            0fH.A0j("PlaybackMLController", "start new ML collection");
            handler2.postDelayed(runnable, j);
        }
    }
}
