package X;

import android.animation.ValueAnimator;

/* loaded from: ACj.class */
public final class ACj implements Runnable {
    public static final String __redex_internal_original_name = "FastScroller$1";
    public final /* synthetic */ 8Dn A00;

    public ACj(8Dn r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        8Dn r0 = this.A00;
        int i = r0.A02;
        if (i == 1) {
            r0.A0K.cancel();
        } else if (i != 2) {
            return;
        }
        r0.A02 = 3;
        ValueAnimator valueAnimator = r0.A0K;
        valueAnimator.setFloatValues(7zM.A00(valueAnimator.getAnimatedValue()), 0.0f);
        valueAnimator.setDuration(500L);
        0K6.A00(valueAnimator);
    }
}
