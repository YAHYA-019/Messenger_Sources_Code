package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* loaded from: Lju.class */
public final class Lju implements Runnable {
    public static final String __redex_internal_original_name = "AutoScrollHelper$ScrollAnimationRunnable";
    public final /* synthetic */ LKd A00;

    public Lju(LKd lKd) {
        this.A00 = lKd;
    }

    @Override // java.lang.Runnable
    public void run() {
        LKd lKd = this.A00;
        if (lKd.A03) {
            if (lKd.A06) {
                lKd.A06 = false;
                L0m l0m = lKd.A0F;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                l0m.A06 = currentAnimationTimeMillis;
                l0m.A07 = -1;
                l0m.A05 = currentAnimationTimeMillis;
                l0m.A00 = 0.5f;
            }
            L0m l0m2 = lKd.A0F;
            if ((l0m2.A07 > 0 && AnimationUtils.currentAnimationTimeMillis() > l0m2.A07 + l0m2.A02) || !lKd.A02()) {
                lKd.A03 = false;
                return;
            }
            if (lKd.A05) {
                lKd.A05 = false;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                lKd.A0C.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (l0m2.A05 == 0) {
                throw AnonymousClass001.A0T("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float A00 = L0m.A00(l0m2, currentAnimationTimeMillis2);
            float f = ((-4.0f) * A00 * A00) + (A00 * 4.0f);
            long j = currentAnimationTimeMillis2 - l0m2.A05;
            l0m2.A05 = currentAnimationTimeMillis2;
            lKd.A0E.scrollListBy((int) (((float) j) * f * l0m2.A01));
            lKd.A0C.postOnAnimation(this);
        }
    }
}
