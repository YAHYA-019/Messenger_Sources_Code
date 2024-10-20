package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.resources.ui.FbView;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9ne, reason: invalid class name */
/* loaded from: 9ne.class */
public final class C9ne implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C9ne(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C9ne(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.92n, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r311v2, types: [android.view.View] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A01;
        float A012;
        FbTextView fbTextView;
        FbTextView fbTextView2;
        switch (this.A00) {
            case 0:
                11T.A0F(valueAnimator, 0);
                8Bd r0 = (8Bd) this.A01;
                TimeInterpolator timeInterpolator = 8Bd.A08;
                if (!r0.A04) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    11T.A0I(animatedValue, AnonymousClass000.A00(0));
                    r0.setAlpha(AnonymousClass001.A03(animatedValue));
                }
                r0.A04 = !r0.A04;
                return;
            case 1:
                11T.A0F(valueAnimator, 0);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                11T.A0I(animatedValue2, AnonymousClass000.A00(0));
                int A03 = AnonymousClass001.A03(animatedValue2);
                View view = (View) this.A01;
                view.getLayoutParams().height = A03;
                view.requestLayout();
                return;
            case 2:
                11T.A0F(valueAnimator, 0);
                A012 = 7zV.A01(valueAnimator);
                C34s c34s = (C34s) this.A01;
                2OB r02 = c34s.A0Q;
                if (r02 != null) {
                    float f = c34s.A03;
                    int i = -1;
                    float f2 = 0.0f / 0.0f;
                    if (0KF.A01(100.0f * A012) % 10 >= 5) {
                        i = 1;
                    }
                    r02.setRotation(f + (i * 10));
                }
                FbTextView fbTextView3 = c34s.A0Q;
                fbTextView2 = fbTextView3;
                if (fbTextView3 == null) {
                    return;
                }
                A01 = 1.0f - A012;
                fbTextView = fbTextView2;
                fbTextView.setAlpha(A01);
                return;
            case 3:
                11T.A0F(valueAnimator, 0);
                float A013 = 7zV.A01(valueAnimator);
                C34s c34s2 = (C34s) this.A01;
                LithoView lithoView = c34s2.A0D;
                if (lithoView != null) {
                    lithoView.setScaleX(A013);
                }
                LithoView lithoView2 = c34s2.A0D;
                if (lithoView2 != null) {
                    lithoView2.setScaleY(A013);
                    return;
                }
                return;
            case 4:
            case 5:
                11T.A0F(valueAnimator, 0);
                FbTextView fbTextView4 = ((C34s) this.A01).A0P;
                if (fbTextView4 != null) {
                    A01 = 7zV.A01(valueAnimator);
                    fbTextView = fbTextView4;
                    fbTextView.setAlpha(A01);
                    return;
                }
                return;
            case 6:
                11T.A0F(valueAnimator, 0);
                C34s c34s3 = (C34s) this.A01;
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                11T.A0I(animatedValue3, AnonymousClass000.A00(0));
                C34s.A0D(c34s3, AnonymousClass001.A03(animatedValue3));
                return;
            case 7:
                11T.A0F(valueAnimator, 0);
                C34s c34s4 = (C34s) this.A01;
                ?? r311 = c34s4.A0S;
                if (r311 != 0) {
                    A012 = 7zV.A01(valueAnimator);
                    r311.setX(r311.getX() + (10.0f * A012 * c34s4.A02));
                    fbTextView2 = r311;
                    A01 = 1.0f - A012;
                    fbTextView = fbTextView2;
                    fbTextView.setAlpha(A01);
                    return;
                }
                return;
            case 8:
                11T.A0F(valueAnimator, 0);
                2OB r03 = ((C34s) this.A01).A0S;
                if (r03 != null) {
                    r03.setY(r03.getY() + (10.0f * 7zV.A01(valueAnimator)));
                    return;
                }
                return;
            case 9:
                11T.A0F(valueAnimator, 0);
                C34s c34s5 = (C34s) this.A01;
                float A014 = 7zV.A01(valueAnimator);
                FbView fbView = c34s5.A0T;
                if (fbView != null) {
                    fbView.setX(A014 - (fbView.getWidth() / 2));
                    return;
                }
                return;
            case 10:
                11T.A0F(valueAnimator, 0);
                float A015 = 7zV.A01(valueAnimator);
                LithoView lithoView3 = ((C34s) this.A01).A0A;
                if (lithoView3 != null) {
                    lithoView3.setRotation(A015);
                    return;
                }
                return;
            case 11:
            case 13:
            case 14:
            case 15:
            default:
                11T.A0F(valueAnimator, 0);
                C1rn c1rn = (C1rn) this.A01;
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                11T.A0I(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                c1rn.A00(animatedValue4);
                return;
            case 12:
                11T.A0F(valueAnimator, 0);
                float A016 = 7zV.A01(valueAnimator);
                ?? r04 = (C92n) this.A01;
                r04.A01 = 6.0f * (1.0f - Math.abs((1.0f - Math.abs(1.0f - (4.0f * A016))) + 1.0f));
                r04.A00 = 30.0f * (1.0f - Math.abs(1.0f - (A016 * 2.0f)));
                r04.invalidateSelf();
                return;
            case 16:
                11T.A0F(valueAnimator, 0);
                Function1 function1 = (Function1) this.A01;
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                11T.A0I(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                function1.invoke(animatedValue5);
                return;
        }
    }
}
