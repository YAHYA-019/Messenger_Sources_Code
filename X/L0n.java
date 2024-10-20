package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: L0n.class */
public final class L0n {
    public final Handler A00;
    public final Jsu A01;
    public final AtomicLong A07 = new AtomicLong(0);
    public final AtomicLong A08 = new AtomicLong(0);
    public final AtomicLong A05 = new AtomicLong(0);
    public final AtomicLong A06 = new AtomicLong(0);
    public final AtomicLong A04 = new AtomicLong(0);
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();
    public final Runnable A02 = new LkE(this);

    public L0n(Handler handler, Jsu jsu) {
        this.A01 = jsu;
        this.A00 = handler;
    }

    public static final void A00(L0n l0n) {
        Number number;
        JSi jSi = (JSi) l0n.A03.peek();
        long j = 5000;
        if (jSi != null) {
            long currentTimeMillis = System.currentTimeMillis() - l0n.A01.A00;
            long j2 = 0;
            if (jSi instanceof JSk ? true : jSi instanceof Jux) {
                Object obj = jSi.A04.get("timestamp");
                if ((obj instanceof Long) && (number = (Number) obj) != null) {
                    j2 = number.longValue();
                }
            }
            long j3 = j2 - currentTimeMillis;
            if (j3 > 5000) {
                j = j3;
            }
        }
        l0n.A00.postDelayed(l0n.A02, j);
    }
}
