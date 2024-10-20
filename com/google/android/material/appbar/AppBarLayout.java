package com.google.android.material.appbar;

import X.08D;
import X.0Cm;
import X.0FI;
import X.0K6;
import X.0Oe;
import X.6Hu;
import X.6LR;
import X.6Ld;
import X.6Le;
import X.6Lw;
import X.6Lz;
import X.AnonymousClass001;
import X.C0Ad;
import X.C80w;
import X.C9nb;
import X.JR8;
import X.LQS;
import X.LQT;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.common.callercontext.CallerContext;
import com.mapbox.mapboxsdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: AppBarLayout.class */
public class AppBarLayout extends LinearLayout implements 6LR {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public Drawable A06;
    public 08D A07;
    public WeakReference A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public boolean A0E;
    public int[] A0F;

    /* loaded from: AppBarLayout$BaseBehavior.class */
    public class BaseBehavior extends HeaderBehavior {
        public float A00;
        public int A01;
        public int A02;
        public int A03;
        public ValueAnimator A04;
        public WeakReference A05;
        public boolean A06;

        /* loaded from: AppBarLayout$BaseBehavior$SavedState.class */
        public final class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR = new JR8(1);
            public float A00;
            public int A01;
            public boolean A02;

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.A01);
                parcel.writeFloat(this.A00);
                parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.A03 = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.A03 = -1;
        }

        public static View A00(CoordinatorLayout coordinatorLayout) {
            View view;
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childCount) {
                    view = null;
                    break;
                }
                view = coordinatorLayout.getChildAt(i2);
                if ((view instanceof 0Cm) || (view instanceof ListView) || (view instanceof ScrollView)) {
                    break;
                }
                i = i2 + 1;
            }
            return view;
        }

        public static void A01(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            int topAndBottomOffset = baseBehavior.getTopAndBottomOffset() + baseBehavior.A02;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childCount) {
                    return;
                }
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                6Lw layoutParams = childAt.getLayoutParams();
                if ((layoutParams.A00 & 32) == 32) {
                    top -= ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    bottom += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -topAndBottomOffset;
                if (top <= i3 && bottom >= i3) {
                    if (i2 >= 0) {
                        View childAt2 = appBarLayout.getChildAt(i2);
                        6Lw layoutParams2 = childAt2.getLayoutParams();
                        int i4 = layoutParams2.A00;
                        if ((i4 & 17) == 17) {
                            int i5 = -childAt2.getTop();
                            int i6 = -childAt2.getBottom();
                            if (i2 == appBarLayout.getChildCount() - 1) {
                                i6 += appBarLayout.A02();
                            }
                            if ((i4 & 2) == 2) {
                                i6 += childAt2.getMinimumHeight();
                            } else if ((i4 & 5) == 5) {
                                int minimumHeight = childAt2.getMinimumHeight() + i6;
                                if (topAndBottomOffset < minimumHeight) {
                                    i5 = minimumHeight;
                                } else {
                                    i6 = minimumHeight;
                                }
                            }
                            if ((i4 & 32) == 32) {
                                i5 += ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                                i6 -= ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            }
                            if (topAndBottomOffset < (i6 + i5) / 2) {
                                i5 = i6;
                            }
                            int i7 = -appBarLayout.A03();
                            if (i5 >= i7) {
                                i7 = i5;
                                if (i5 > 0) {
                                    i7 = 0;
                                }
                            }
                            baseBehavior.A03(coordinatorLayout, appBarLayout, i7);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i = i2 + 1;
            }
        }

        public static void A02(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            0Oe r0 = 0Oe.A0Z;
            C0Ad.A09(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getId());
            0Oe r02 = 0Oe.A0X;
            C0Ad.A09(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) r02.A03).getId());
            View A00 = A00(coordinatorLayout);
            if (A00 == null || appBarLayout.A03() == 0 || !(A00.getLayoutParams().A0A instanceof ScrollingViewBehavior)) {
                return;
            }
            if (baseBehavior.getTopAndBottomOffset() + baseBehavior.A02 != (-appBarLayout.A03()) && A00.canScrollVertically(1)) {
                C0Ad.A0E(coordinatorLayout, r0, new LQS(baseBehavior, appBarLayout, false), null);
            }
            if (baseBehavior.getTopAndBottomOffset() + baseBehavior.A02 != 0) {
                if (!A00.canScrollVertically(-1)) {
                    C0Ad.A0E(coordinatorLayout, r02, new LQS(baseBehavior, appBarLayout, true), null);
                    return;
                }
                int i = -appBarLayout.A00();
                if (i != 0) {
                    C0Ad.A0E(coordinatorLayout, r02, new LQT(A00, coordinatorLayout, baseBehavior, appBarLayout, i), null);
                }
            }
        }

        private void A03(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs((getTopAndBottomOffset() + this.A02) - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int topAndBottomOffset = getTopAndBottomOffset() + this.A02;
            ValueAnimator valueAnimator = this.A04;
            if (topAndBottomOffset == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.A04.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.A04 = valueAnimator2;
                valueAnimator2.setInterpolator(C80w.A00);
                this.A04.addUpdateListener(new C9nb(1, appBarLayout, this, coordinatorLayout));
            } else {
                valueAnimator.cancel();
            }
            this.A04.setDuration(Math.min(round, 600));
            this.A04.setIntValues(topAndBottomOffset, i);
            0K6.A00(this.A04);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.util.List] */
        public static void A04(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    int i4 = childAt.getLayoutParams().A00;
                    boolean z2 = false;
                    if ((i4 & 1) != 0) {
                        int minimumHeight = childAt.getMinimumHeight();
                        if (((i2 > 0 && (i4 & 12) != 0) || (i4 & 2) != 0) && (-i) >= (childAt.getBottom() - minimumHeight) - appBarLayout.A02()) {
                            z2 = true;
                        }
                    }
                    if (appBarLayout.A0B) {
                        z2 = appBarLayout.A05(A00(coordinatorLayout));
                    }
                    boolean A06 = appBarLayout.A06(z2);
                    if (!z) {
                        if (!A06) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) coordinatorLayout.A0C.A00.get(appBarLayout);
                        ArrayList emptyList = arrayList == null ? Collections.emptyList() : new ArrayList(arrayList);
                        int size = emptyList.size();
                        int i5 = 0;
                        while (true) {
                            int i6 = i5;
                            if (i6 >= size) {
                                return;
                            }
                            CoordinatorLayout.Behavior behavior = ((View) emptyList.get(i6)).getLayoutParams().A0A;
                            if (!(behavior instanceof ScrollingViewBehavior)) {
                                i5 = i6 + 1;
                            } else if (((HeaderScrollingViewBehavior) behavior).overlayTop == 0) {
                                return;
                            }
                        }
                    }
                    appBarLayout.jumpDrawablesToCurrentState();
                    return;
                }
            }
        }

        public void A08(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i) {
            if (i != 0) {
                int i2 = -appBarLayout.A03();
                int A00 = i < 0 ? appBarLayout.A00() + i2 : 0;
                if (i2 != A00) {
                    iArr[1] = A05(appBarLayout, coordinatorLayout, (getTopAndBottomOffset() + this.A02) - i, i2, A00);
                }
            }
            if (appBarLayout.A0B) {
                appBarLayout.A06(appBarLayout.A05(view));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, int r304) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            if (view.getLayoutParams().height != -2) {
                return false;
            }
            coordinatorLayout.A0D(view, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            A08(view2, coordinatorLayout, (AppBarLayout) view, iArr, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = A05(appBarLayout, coordinatorLayout, (getTopAndBottomOffset() + this.A02) - i4, -appBarLayout.A01(), 0);
            } else if (i4 == 0) {
                A02(coordinatorLayout, this, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.A03 = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.A03 = savedState.A01;
            this.A00 = savedState.A00;
            this.A06 = savedState.A02;
        }

        /* JADX WARN: Type inference failed for: r0v24, types: [android.os.Parcelable, com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState, androidx.customview.view.AbsSavedState] */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    ?? absSavedState2 = new AbsSavedState(absSavedState);
                    absSavedState2.A01 = i;
                    absSavedState2.A02 = bottom == childAt.getMinimumHeight() + appBarLayout.A02();
                    absSavedState2.A00 = bottom / childAt.getHeight();
                    return absSavedState2;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            boolean z;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i & 2) == 0 || (!appBarLayout.A0B && (appBarLayout.A03() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            } else {
                z = true;
                ValueAnimator valueAnimator = this.A04;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.A05 = null;
            this.A01 = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.A01 == 0 || i == 1) {
                A01(coordinatorLayout, this, appBarLayout);
                if (appBarLayout.A0B) {
                    appBarLayout.A06(appBarLayout.A05(view2));
                }
            }
            this.A05 = new WeakReference(view2);
        }
    }

    /* loaded from: AppBarLayout$Behavior.class */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: AppBarLayout$ScrollingViewBehavior.class */
    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 6Ld.A0N);
            this.overlayTop = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = appBarLayout.getLayoutParams().A0A;
            if (!(behavior instanceof BaseBehavior)) {
                return 0;
            }
            BaseBehavior baseBehavior = (BaseBehavior) behavior;
            return baseBehavior.getTopAndBottomOffset() + baseBehavior.A02;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            CoordinatorLayout.Behavior behavior = view2.getLayoutParams().A0A;
            if (behavior instanceof BaseBehavior) {
                view.offsetTopAndBottom((((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).A02) + this.verticalLayoutGap) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.A0B) {
                    appBarLayout.A06(appBarLayout.A05(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public AppBarLayout findFirstDependency(List list) {
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    return null;
                }
                View view = (View) list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
                i = i2 + 1;
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float getOverlapRatioForOffset(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int A03 = appBarLayout.A03();
            int A00 = appBarLayout.A00();
            int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
            if ((A00 == 0 || A03 + appBarLayoutOffset > A00) && (i = A03 - A00) != 0) {
                return (appBarLayoutOffset / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).A03() : view.getMeasuredHeight();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0Ad.A09(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) 0Oe.A0Z.A03).getId());
                C0Ad.A09(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) 0Oe.A0X.A03).getId());
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.A0A(view));
            if (findFirstDependency == null) {
                return false;
            }
            rect.offset(view.getLeft(), view.getTop());
            Rect rect2 = this.tempRect1;
            rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (rect2.contains(rect)) {
                return false;
            }
            int i = 0;
            if (!z) {
                i = 4;
            }
            findFirstDependency.A03 = i | 2 | 8;
            findFirstDependency.requestLayout();
            return true;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968696);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0330, code lost:
    
        if (A02() <= 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int A00() {
        int i;
        int minimumHeight;
        int i2 = this.A00;
        if (i2 == -1) {
            int i3 = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                6Lw layoutParams = childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.A00;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - A02());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - A02());
                    }
                    i3 += i;
                }
            }
            i2 = Math.max(0, i3);
            this.A00 = i2;
        }
        return i2;
    }

    public int A01() {
        int i = this.A01;
        if (i == -1) {
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                6Lw layoutParams = childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i4 = layoutParams.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
                i2++;
            }
            i = Math.max(0, i3);
            this.A01 = i;
        }
        return i;
    }

    public final int A02() {
        08D r0 = this.A07;
        if (r0 != null) {
            return r0.A03();
        }
        return 0;
    }

    public final int A03() {
        int i = this.A04;
        if (i == -1) {
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                6Lw layoutParams = childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i3 -= A02();
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
                i2++;
            }
            i = Math.max(0, i3);
            this.A04 = i;
        }
        return i;
    }

    public void A04(int i) {
        this.A0D = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.A09;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                6Hu r0 = (6Hu) this.A09.get(i2);
                if (r0 != null) {
                    r0.C9o(this, i);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r306 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r301.A08 = new java.lang.ref.WeakReference(r306);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05(android.view.View r302) {
        /*
            r301 = this;
            r0 = r301
            java.lang.ref.WeakReference r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L5a
            r0 = r301
            int r0 = r0.A02
            r304 = r0
            r0 = -1
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L5a
            r0 = r302
            if (r0 == 0) goto L27
            r0 = r302
            r1 = r304
            android.view.View r0 = r0.findViewById(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L4b
        L27:
            r0 = r301
            android.view.ViewParent r0 = r0.getParent()
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof android.view.ViewGroup
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L5a
            r0 = r301
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r303 = r0
            r0 = r303
            r1 = r304
            android.view.View r0 = r0.findViewById(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5a
        L4b:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r303 = r0
            r0 = r303
            r1 = r306
            r0.<init>(r1)
            r0 = r301
            r1 = r303
            r0.A08 = r1
        L5a:
            r0 = r301
            java.lang.ref.WeakReference r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8a
            r0 = r303
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8a
            r0 = r303
            r302 = r0
        L71:
            r0 = r302
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L88
            r0 = r302
            int r0 = r0.getScrollY()
            r305 = r0
            r0 = r305
            if (r0 <= 0) goto L91
        L88:
            r0 = 1
            return r0
        L8a:
            r0 = r302
            if (r0 == 0) goto L91
            goto L71
        L91:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.A05(android.view.View):boolean");
    }

    public boolean A06(boolean z) {
        if (this.A0E == z) {
            return false;
        }
        this.A0E = z;
        refreshDrawableState();
        if (!this.A0B || !(getBackground() instanceof 6Le)) {
            return true;
        }
        final Drawable background = getBackground();
        float dimension = getResources().getDimension(R.dimen.mapbox_four_dp);
        float f = 0.0f;
        if (!z) {
            f = dimension;
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.A05 = ofFloat;
        ofFloat.setDuration(r0.getInteger(2131427329));
        this.A05.setInterpolator(C80w.A03);
        final int i = 3;
        this.A05.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(background, this, i) { // from class: X.3Tq
            public final int A00;
            public final Object A01;
            public final Object A02;

            {
                this.A00 = i;
                this.A02 = background;
                this.A01 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                switch (this.A00) {
                    case 0:
                        11T.A0F(valueAnimator2, 0);
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        11T.A0I(animatedValue, AbstractC00603o4.A00(12));
                        float floatValue = ((Number) animatedValue).floatValue();
                        float height = floatValue * r0.getHeight();
                        ((View) this.A02).setTranslationY(height);
                        2Wt r0 = (2Wt) this.A01;
                        if (r0 != null) {
                            2Rz r02 = r0.A00;
                            CallerContext callerContext = 2Rz.A1U;
                            ViewGroup viewGroup = r02.A05;
                            if (viewGroup == null) {
                                throw 1BK.A0h();
                            }
                            viewGroup.setTranslationY(height);
                            return;
                        }
                        return;
                    case 1:
                        ((6MB) this.A01).A00 = ((Number) valueAnimator2.getAnimatedValue()).floatValue();
                        ((View) this.A02).invalidate();
                        return;
                    case 2:
                        11T.A0F(valueAnimator2, 0);
                        Object animatedValue2 = valueAnimator2.getAnimatedValue();
                        11T.A0I(animatedValue2, AnonymousClass000.A00(0));
                        Number number = (Number) animatedValue2;
                        int intValue = number.intValue();
                        View view = ((7Dc) this.A02).A00;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = intValue;
                            view.setLayoutParams(layoutParams);
                            view.requestLayout();
                        }
                        ((Function1) this.A01).invoke(number);
                        return;
                    default:
                        ((6Le) this.A02).A0F(((Number) valueAnimator2.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        0K6.A00(this.A05);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof 6Lw;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A06;
        if (drawable == null || A02() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, -this.A0D);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ((6Lw) layoutParams).A00 = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ((6Lw) layoutParams).A00 = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new 6Lw(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
        ((6Lw) layoutParams2).A00 = 1;
        return layoutParams2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new 6Lw(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
        ((6Lw) layoutParams2).A00 = 1;
        return layoutParams2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1110133092);
        super.onAttachedToWindow();
        6Le background = getBackground();
        if (background instanceof 6Le) {
            6Lz.A00(this, background);
        }
        0FI.A0C(31956987, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r301.A0E == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r301.A0E == false) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] onCreateDrawableState(int r302) {
        /*
            r301 = this;
            r0 = r301
            int[] r0 = r0.A0F
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L14
            r0 = 4
            r304 = r0
            r0 = r304
            int[] r0 = new int[r0]
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A0F = r1
        L14:
            r0 = r303
            int r0 = r0.length
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = r0 + r1
            r302 = r0
            r0 = r301
            r1 = r302
            int[] r0 = super.onCreateDrawableState(r1)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r301
            boolean r0 = r0.A0C
            r307 = r0
            r0 = 2130971777(0x7f040c81, float:1.7552302E38)
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L37
            r0 = -2130971777(0xffffffff80fbf37f, float:-2.313806E-38)
            r304 = r0
        L37:
            r0 = r303
            r1 = 0
            r2 = r304
            r0[r1] = r2
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L52
            r0 = r301
            boolean r0 = r0.A0E
            r306 = r0
            r0 = 2130971778(0x7f040c82, float:1.7552304E38)
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L55
        L52:
            r0 = -2130971778(0xffffffff80fbf37e, float:-2.3138058E-38)
            r304 = r0
        L55:
            r0 = r303
            r1 = r308
            r2 = r304
            r0[r1] = r2
            r0 = 2
            r306 = r0
            r0 = 2130971774(0x7f040c7e, float:1.7552296E38)
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L6a
            r0 = -2130971774(0xffffffff80fbf382, float:-2.3138064E-38)
            r304 = r0
        L6a:
            r0 = r303
            r1 = r306
            r2 = r304
            r0[r1] = r2
            r0 = 3
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L86
            r0 = r301
            boolean r0 = r0.A0E
            r306 = r0
            r0 = 2130971773(0x7f040c7d, float:1.7552294E38)
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L8a
        L86:
            r0 = -2130971773(0xffffffff80fbf383, float:-2.3138065E-38)
            r304 = r0
        L8a:
            r0 = r303
            r1 = r308
            r2 = r304
            r0[r1] = r2
            r0 = r305
            r1 = r303
            int[] r0 = android.view.View.mergeDrawableStates(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(875153656);
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A08;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A08 = null;
        0FI.A0C(1583163271, A06);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int A02 = A02();
                int childCount = getChildCount() - 1;
                while (true) {
                    int i5 = childCount;
                    if (i5 < 0) {
                        break;
                    }
                    getChildAt(i5).offsetTopAndBottom(A02);
                    childCount = i5 - 1;
                }
            }
        }
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A0A = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= childCount2) {
                break;
            }
            if (getChildAt(i7).getLayoutParams().A01 != null) {
                this.A0A = true;
                break;
            }
            i6 = i7 + 1;
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), A02());
        }
        if (!this.A0B) {
            int childCount3 = getChildCount();
            int i8 = 0;
            while (true) {
                if (i8 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i9 = getChildAt(i8).getLayoutParams().A00;
                if ((i9 & 1) == 1 && (i9 & 10) != 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        if (this.A0C != z2) {
            this.A0C = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == ((-1) << (-1))) {
                    measuredHeight = getMeasuredHeight() + A02();
                    int size = View.MeasureSpec.getSize(i2);
                    if (measuredHeight < 0) {
                        measuredHeight = 0;
                    } else if (measuredHeight > size) {
                        measuredHeight = size;
                    }
                } else if (mode == 0) {
                    measuredHeight += A02();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        6Le background = getBackground();
        if (background instanceof 6Le) {
            background.A0F(f);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw AnonymousClass001.A0L("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r302 == r301.A06) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L16
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A06
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r303 = r0
        L18:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
