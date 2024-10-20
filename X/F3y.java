package X;

import android.R;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: F3y.class */
public abstract class F3y {
    public static final int[] A03 = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] A02 = {R.attr.state_enabled};
    public static final Interpolator A01 = new PathInterpolator(0.5f, -1.0f, 1.0f, 1.0f);
    public static final Interpolator A00 = new PathInterpolator(0.5f, 0.0f, 1.0f, 1.0f);

    public static ObjectAnimator A00(Interpolator interpolator, String str, float f, long j) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.setPropertyName(str);
        objectAnimator.setFloatValues(f);
        objectAnimator.setDuration(j);
        return objectAnimator;
    }
}
