package com.google.android.material.appbar;

import X.6Lw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.AbstractList;

/* loaded from: HeaderBehavior.class */
public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public VelocityTracker A00;
    public OverScroller A01;
    public Runnable A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;

    public HeaderBehavior() {
        this.A03 = -1;
        this.A05 = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = -1;
        this.A05 = -1;
    }

    public int A05(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
        AbstractList abstractList;
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int topAndBottomOffset = baseBehavior.getTopAndBottomOffset() + baseBehavior.A02;
        int i4 = 0;
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3) {
            baseBehavior.A02 = 0;
        } else {
            if (i >= i2) {
                i2 = i;
                if (i > i3) {
                    i2 = i3;
                }
            }
            if (topAndBottomOffset != i2) {
                int i5 = i2;
                if (appBarLayout.A0A) {
                    int abs = Math.abs(i2);
                    int childCount = appBarLayout.getChildCount();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        int i8 = i7;
                        if (i8 >= childCount) {
                            break;
                        }
                        View childAt = appBarLayout.getChildAt(i8);
                        6Lw layoutParams = childAt.getLayoutParams();
                        Interpolator interpolator = layoutParams.A01;
                        if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                            i7 = i8 + 1;
                        } else if (interpolator != null) {
                            int i9 = layoutParams.A00;
                            if ((i9 & 1) != 0) {
                                i6 = childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                                if ((i9 & 2) != 0) {
                                    i6 -= childAt.getMinimumHeight();
                                }
                            }
                            if (childAt.getFitsSystemWindows()) {
                                i6 -= appBarLayout.A02();
                            }
                            if (i6 > 0) {
                                int top = abs - childAt.getTop();
                                float f = i6;
                                i5 = Integer.signum(i2) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(top / f)));
                            }
                        }
                    }
                }
                boolean topAndBottomOffset2 = baseBehavior.setTopAndBottomOffset(i5);
                i4 = topAndBottomOffset - i2;
                baseBehavior.A02 = i2 - i5;
                if (!topAndBottomOffset2 && appBarLayout.A0A && (abstractList = (AbstractList) coordinatorLayout.A0C.A00.get(appBarLayout)) != null && !abstractList.isEmpty()) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 >= abstractList.size()) {
                            break;
                        }
                        View view2 = (View) abstractList.get(i11);
                        CoordinatorLayout.Behavior behavior = view2.getLayoutParams().A0A;
                        if (behavior != null) {
                            behavior.onDependentViewChanged(coordinatorLayout, view2, appBarLayout);
                        }
                        i10 = i11 + 1;
                    }
                }
                appBarLayout.A04(baseBehavior.getTopAndBottomOffset());
                int i12 = 1;
                if (i2 < topAndBottomOffset) {
                    i12 = -1;
                    float f2 = 0.0f / 0.0f;
                }
                AppBarLayout.BaseBehavior.A04(coordinatorLayout, appBarLayout, i2, i12, false);
            }
        }
        AppBarLayout.BaseBehavior.A02(coordinatorLayout, baseBehavior, appBarLayout);
        return i4;
    }

    public void A06(View view, CoordinatorLayout coordinatorLayout) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        AppBarLayout.BaseBehavior.A01(coordinatorLayout, (AppBarLayout.BaseBehavior) this, appBarLayout);
        if (appBarLayout.A0B) {
            appBarLayout.A06(appBarLayout.A05(AppBarLayout.BaseBehavior.A00(coordinatorLayout)));
        }
    }

    public void A07(CoordinatorLayout coordinatorLayout, View view, int i) {
        A05(view, coordinatorLayout, i, (-1) << (-1), (-1) >>> 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        if (r302.A0E(r303, r0, r0) == false) goto L29;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, android.view.MotionEvent r304) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022d  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, android.view.MotionEvent r304) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
