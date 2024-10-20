package com.facebook.video.plugins;

import X.11T;
import X.6TI;
import X.C09s;
import X.C6d6;
import X.FJM;
import X.GPl;
import X.RCf;
import X.RHA;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.animation.Interpolator;
import com.facebook.spherical.ui.SphericalGyroAnimationView;
import com.facebook.spherical.ui.SphericalPhoneAnimationView;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: Video360NuxAnimationPlugin.class */
public final class Video360NuxAnimationPlugin extends C6d6 {
    public SphericalGyroAnimationView A00;
    public SphericalPhoneAnimationView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Video360NuxAnimationPlugin(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        A0C(2132543368);
        this.A00 = (SphericalGyroAnimationView) C09s.A01(this, 2131367509);
        this.A01 = (SphericalPhoneAnimationView) C09s.A01(this, 2131367510);
        this.A00.setVisibility(0);
        A0h(new GPl(this, 95), new GPl(this, 94), new GPl(this, 96));
    }

    @Override // X.C6d6
    public String A0H() {
        return "Video360NuxAnimationPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        SphericalGyroAnimationView sphericalGyroAnimationView = this.A00;
        AnimatorSet animatorSet = sphericalGyroAnimationView.A01;
        if (animatorSet != null && animatorSet.isStarted()) {
            sphericalGyroAnimationView.A01.end();
        }
        Animator animator = sphericalGyroAnimationView.A00;
        if (animator != null) {
            animator.end();
        }
        SphericalPhoneAnimationView sphericalPhoneAnimationView = this.A01;
        AnimatorSet animatorSet2 = sphericalPhoneAnimationView.A03;
        if (animatorSet2 == null || !animatorSet2.isStarted()) {
            return;
        }
        sphericalPhoneAnimationView.A03.end();
    }

    @Override // X.C6d6
    public void A0N() {
        A0M();
        super.A0N();
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        VideoPlayerParams videoPlayerParams = r302.A03;
        if (videoPlayerParams == null || videoPlayerParams.A0U == null) {
            this.A0D = true;
            return;
        }
        this.A0D = false;
        if (z) {
            SphericalGyroAnimationView sphericalGyroAnimationView = this.A00;
            sphericalGyroAnimationView.setAlpha(0.0f);
            ObjectAnimator objectAnimator = sphericalGyroAnimationView.A08;
            objectAnimator.setDuration(2000L);
            objectAnimator.setRepeatMode(1);
            objectAnimator.setRepeatCount(0);
            Interpolator interpolator = RCf.A00;
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sphericalGyroAnimationView, "alpha", 1.0f);
            Interpolator interpolator2 = RCf.A00;
            ofFloat.setInterpolator(interpolator2);
            ofFloat.setDuration(0L);
            animatorSet.play(ofFloat);
            animatorSet.play(objectAnimator).after(ofFloat);
            sphericalGyroAnimationView.A01 = animatorSet;
            animatorSet.addListener(new FJM(sphericalGyroAnimationView, 3));
            RHA rha = new RHA(sphericalGyroAnimationView);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(sphericalGyroAnimationView, "alpha", 0.0f);
            ofFloat2.setInterpolator(interpolator2);
            ofFloat2.setDuration(300L);
            ofFloat2.addListener(new FJM(rha, 4));
            sphericalGyroAnimationView.A00 = ofFloat2;
            SphericalPhoneAnimationView sphericalPhoneAnimationView = this.A01;
            sphericalPhoneAnimationView.setAlpha(0.0f);
            sphericalPhoneAnimationView.A00 = 0.0f;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(sphericalPhoneAnimationView, PropertyValuesHolder.ofFloat("offset", 0.0f, 100.0f));
            ofPropertyValuesHolder.setDuration(2000L);
            ofPropertyValuesHolder.setRepeatMode(1);
            ofPropertyValuesHolder.setRepeatCount(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(sphericalPhoneAnimationView, "alpha", 1.0f);
            ofFloat3.setInterpolator(interpolator2);
            ofFloat3.setDuration(300L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(sphericalPhoneAnimationView, "alpha", 0.0f);
            ofFloat4.setInterpolator(interpolator2);
            ofFloat4.setDuration(300L);
            ofFloat4.addListener(new FJM((Object) null, 4));
            animatorSet2.play(ofFloat3);
            animatorSet2.play(ofPropertyValuesHolder).after(ofFloat3);
            animatorSet2.play(ofFloat4).after(ofPropertyValuesHolder);
            animatorSet2.setStartDelay(5400L);
            sphericalPhoneAnimationView.A03 = animatorSet2;
        }
    }
}
