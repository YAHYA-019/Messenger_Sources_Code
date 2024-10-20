package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: Ljb.class */
public final class Ljb implements Runnable {
    public static final String __redex_internal_original_name = "ForwardingListener$TriggerLongPress";
    public final /* synthetic */ LKe A00;

    public Ljb(LKe lKe) {
        this.A00 = lKe;
    }

    @Override // java.lang.Runnable
    public void run() {
        LKe lKe = this.A00;
        LKe.A00(lKe);
        View view = lKe.A07;
        if (view.isEnabled() && !view.isLongClickable() && lKe.A02()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            lKe.A03 = true;
        }
    }
}
