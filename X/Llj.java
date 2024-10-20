package X;

import android.animation.ValueAnimator;

/* loaded from: Llj.class */
public final class Llj implements Runnable {
    public static final String __redex_internal_original_name = "HeartsDecorationView$deferredDetachRunnable$1";
    public final /* synthetic */ JXt A00;

    public Llj(JXt jXt) {
        this.A00 = jXt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JXt jXt = this.A00;
        jXt.A02 = true;
        jXt.A00 = null;
        for (KmW kmW : jXt.A05) {
            kmW.A0D.cancel();
            ValueAnimator valueAnimator = kmW.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            kmW.A09 = null;
        }
        jXt.A03.removeCallbacksAndMessages(null);
    }
}
