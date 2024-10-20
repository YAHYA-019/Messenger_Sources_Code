package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* loaded from: Lm0.class */
public final class Lm0 implements Runnable {
    public static final String __redex_internal_original_name = "BaseTransientBottomBar$10";
    public final /* synthetic */ LBS A00;

    public Lm0(LBS lbs) {
        this.A00 = lbs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        ValueAnimator valueAnimator;
        LBS lbs = this.A00;
        JYg jYg = lbs.A0D;
        if (jYg != null) {
            if (jYg.getParent() != null) {
                jYg.setVisibility(0);
            }
            if (jYg.A00 == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(C80w.A03);
                ofFloat.addUpdateListener(new LF7(lbs, 19));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                ofFloat2.setInterpolator(C80w.A04);
                ofFloat2.addUpdateListener(new LF7(lbs, 20));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(150L);
                JUI.A00(animatorSet, lbs, 7);
                valueAnimator = animatorSet;
            } else {
                int height = jYg.getHeight();
                ViewGroup.LayoutParams layoutParams = jYg.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                jYg.setTranslationY(height);
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setIntValues(height, 0);
                valueAnimator2.setInterpolator(C80w.A02);
                valueAnimator2.setDuration(250L);
                JUI.A00(valueAnimator2, lbs, 8);
                valueAnimator2.addUpdateListener(new LF7(lbs, 21));
                valueAnimator = valueAnimator2;
            }
            0K6.A00(valueAnimator);
        }
    }
}
