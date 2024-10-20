package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;

/* loaded from: F20.class */
public abstract class F20 {
    public static ValueAnimator A00(View view, int i, int i2, long j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new FJV(view, layoutParams, 4));
        return ofInt;
    }

    public static AlphaAnimation A01(boolean z) {
        float f = 0.0f;
        float f2 = 1.0f;
        if (!z) {
            f = 1.0f;
            f2 = 0.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(500L);
        return alphaAnimation;
    }
}
