package com.google.android.material.behavior;

import X.AnonymousClass001;
import X.C80w;
import X.DKC;
import X.JUI;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: HideBottomViewOnScrollBehavior.class */
public class HideBottomViewOnScrollBehavior extends CoordinatorLayout.Behavior {
    public ViewPropertyAnimator A02;
    public int A01 = 0;
    public int A00 = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A01 = view.getMeasuredHeight() + DKC.A0I(view).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        TimeInterpolator timeInterpolator;
        long j;
        ViewPropertyAnimator animate;
        float f;
        if (i2 > 0) {
            if (this.A00 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.A02;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.A00 = 1;
            int i6 = this.A01;
            timeInterpolator = C80w.A01;
            j = 175;
            animate = view.animate();
            f = i6;
        } else {
            if (i2 >= 0 || this.A00 == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.A02;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.A00 = 2;
            timeInterpolator = C80w.A04;
            j = 225;
            animate = view.animate();
            f = 0.0f;
        }
        this.A02 = animate.translationY(f).setInterpolator(timeInterpolator).setDuration(j).setListener(new JUI(this, 6));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return AnonymousClass001.A1Q(i, 2);
    }
}
