package X;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: GzR.class */
public final class GzR extends GzS {
    public final ValueAnimator A00;

    public GzR(I1o i1o) {
        super(i1o);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A00 = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
    }
}
