package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.view.View;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* loaded from: LF6.class */
public final class LF6 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public LF6(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v91, types: [android.view.View] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        JXl jXl;
        String str;
        switch (this.A00) {
            case 0:
                11T.A0F(valueAnimator, 0);
                jXl = (JXl) this.A03;
                int i = JXl.A05;
                float f = jXl.A01.A00;
                float f2 = ((11N) this.A02).element;
                Object animatedValue = valueAnimator.getAnimatedValue();
                11T.A0I(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float A01 = GOn.A01(f2, f, 7zM.A00(animatedValue));
                PointF pointF = (PointF) jXl.A01.A02;
                PointF pointF2 = (PointF) ((0CL) this.A01).element;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                11T.A0I(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float A00 = 7zM.A00(animatedValue2);
                jXl.A01 = new DqH(new PointF(GOn.A01(pointF2.x, pointF.x, A00), GOn.A01(pointF2.y, pointF.y, A00)), A01);
                break;
            case 1:
                11T.A0F(valueAnimator, 0);
                KmW kmW = (KmW) this.A02;
                Object animatedValue3 = valueAnimator.getAnimatedValue("x");
                11T.A0I(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float A002 = 7zM.A00(animatedValue3) * 0.1f;
                Drawable drawable = (Drawable) this.A01;
                kmW.A02 = A002 * 7zO.A02(drawable);
                Object animatedValue4 = valueAnimator.getAnimatedValue("y");
                11T.A0I(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                kmW.A03 = 7zM.A00(animatedValue4) * 0.1f * DKD.A02(drawable);
                jXl = (View) this.A03;
                break;
            case 2:
                11T.A0F(valueAnimator, 0);
                int A012 = C06014fk.A04().A01(21);
                JZV A07 = ((FBPayAnimationButton) this.A03).A07();
                C00m c00m = (C00m) this.A02;
                int A05 = 1tG.A05(A012, 0KF.A01(255.0f * valueAnimator.getAnimatedFraction()));
                GradientDrawable gradientDrawable = A07.A01;
                if (gradientDrawable == null) {
                    str = "layerCircleDrawable";
                } else {
                    gradientDrawable.setStroke(A07.getResources().getDimensionPixelSize(2132279309), A05);
                    if (valueAnimator.getAnimatedFraction() != 1.0f) {
                        return;
                    }
                    RotateDrawable rotateDrawable = A07.A02;
                    if (rotateDrawable != null) {
                        rotateDrawable.setAlpha(0);
                        if (c00m != null) {
                            A07.getRootView().postDelayed(new S9s(c00m), 800L);
                        }
                        if (Build.VERSION.SDK_INT >= 30) {
                            A07.performHapticFeedback(16);
                            return;
                        }
                        return;
                    }
                    str = "layerSpinnerRingDrawable";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            default:
                JZD.A00((View) this.A02, (View) this.A03, (JZD) this.A01, valueAnimator.getAnimatedFraction());
                return;
        }
        jXl.invalidate();
    }
}
