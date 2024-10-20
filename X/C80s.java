package X;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: X.80s, reason: invalid class name */
/* loaded from: 80s.class */
public abstract class C80s {
    public static void A00(Context context, View view, int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, C0A8.A00(context, i), 0.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }

    public static void A01(final View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.80n
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(alphaAnimation);
    }
}
