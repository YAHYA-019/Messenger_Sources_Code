package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.HeaderBehavior;

/* renamed from: X.9nb, reason: invalid class name */
/* loaded from: 9nb.class */
public final class C9nb implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C9nb(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        6Rb r0;
        if (this.A00 != 0) {
            ((HeaderBehavior) this.A01).A07((CoordinatorLayout) this.A03, (View) this.A02, AnonymousClass001.A03(valueAnimator.getAnimatedValue()));
            return;
        }
        11T.A0F(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        11T.A0I(animatedValue, AnonymousClass000.A00(0));
        int A03 = AnonymousClass001.A03(animatedValue);
        C6m8 c6m8 = (C6m8) this.A03;
        c6m8.A01 = A03;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.A01;
        if (layoutParams != null) {
            layoutParams.height = A03;
        }
        View view = (View) this.A02;
        if (view != null) {
            view.requestLayout();
        }
        6Rw r02 = c6m8.A09;
        if (r02 == null || (r0 = r02.A02.A00.A0F) == null) {
            return;
        }
        r0.A02();
    }
}
