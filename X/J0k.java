package X;

import android.animation.AnimatorSet;

/* loaded from: J0k.class */
public final class J0k implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncChromeAnimator$createHideControlsRunnable$1";
    public final /* synthetic */ IAP A00;
    public final /* synthetic */ I8F A01;
    public final /* synthetic */ IAU A02;

    public J0k(IAP iap, I8F i8f, IAU iau) {
        this.A02 = iau;
        this.A00 = iap;
        this.A01 = i8f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAU iau = this.A02;
        AnimatorSet animatorSet = new AnimatorSet();
        iau.A01 = animatorSet;
        animatorSet.playTogether(IAU.A00(this.A00, this.A01, iau, false));
        AnimatorSet animatorSet2 = iau.A01;
        if (animatorSet2 != null) {
            GSD.A00(animatorSet2, iau, 11);
        }
        AnimatorSet animatorSet3 = iau.A01;
        if (animatorSet3 != null) {
            0K6.A00(animatorSet3);
        }
    }
}
