package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jpt, reason: case insensitive filesystem */
/* loaded from: Jpt.class */
public final class C3298Jpt extends LVw {
    public long A00;
    public LVx A01;
    public boolean A02;
    public final C0dr A03;
    public final Runnable A04;
    public final ScheduledExecutorService A05;

    public C3298Jpt(C0dr c0dr, MNy mNy, LVx lVx, ScheduledExecutorService scheduledExecutorService) {
        ((LVw) this).A00 = mNy;
        this.A02 = false;
        this.A04 = new Lkk(this);
        this.A01 = lVx;
        this.A03 = c0dr;
        this.A05 = scheduledExecutorService;
    }

    public static void A00(C3298Jpt c3298Jpt) {
        synchronized (c3298Jpt) {
            if (!c3298Jpt.A02) {
                c3298Jpt.A02 = true;
                c3298Jpt.A05.schedule(c3298Jpt.A04, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean AOW(Canvas canvas, Drawable drawable, int i) {
        this.A00 = this.A03.now();
        boolean AOW = super.AOW(canvas, drawable, i);
        A00(this);
        return AOW;
    }
}
