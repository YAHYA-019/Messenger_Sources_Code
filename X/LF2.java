package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: LF2.class */
public final class LF2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C3237JnY A01;

    public LF2(C3237JnY c3237JnY, float f) {
        this.A01 = c3237JnY;
        this.A00 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        C3237JnY c3237JnY = this.A01;
        View view2 = c3237JnY.A00;
        if (view2 == null || (view = c3237JnY.A01) == null) {
            return;
        }
        float A01 = JR0.A01(valueAnimator);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = (int) (this.A00 * A01);
        view2.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        view.setLayoutParams(new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height, 2.0f * A01));
        view2.setVisibility(0);
        view.setVisibility(0);
        view2.setAlpha((float) Math.max(0.0d, (A01 - 0.3d) / 0.7d));
    }
}
