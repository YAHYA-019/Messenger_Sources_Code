package com.facebook.messaging.threadview.coordinator;

import X.0QO;
import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C6p4;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: CoordinatorLayoutBehaviorDelegator.class */
public final class CoordinatorLayoutBehaviorDelegator extends CoordinatorLayout.Behavior {
    public final List A00;
    public final Map A01;

    public CoordinatorLayoutBehaviorDelegator() {
        this.A00 = AnonymousClass001.A0s();
        this.A01 = new 0QO(0);
    }

    public CoordinatorLayoutBehaviorDelegator(Context context, AttributeSet attributeSet) {
        11T.A0F(context, 1);
        11T.A0F(attributeSet, 2);
        this.A00 = new ArrayList();
        this.A01 = new 0QO(0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        11T.A0F(coordinatorLayout, 0);
        11T.A0F(view, 1);
        11T.A0F(view2, 2);
        boolean z = false;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00 && c6p4.A01.layoutDependsOn(coordinatorLayout, view, view2)) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        11T.A0F(coordinatorLayout, 0);
        11T.A0F(view, 1);
        11T.A0F(view2, 2);
        boolean z = false;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00 && c6p4.A01.onDependentViewChanged(coordinatorLayout, view, view2)) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        11T.A0H(coordinatorLayout, view);
        11T.A0F(view2, 2);
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00) {
                c6p4.A01.onDependentViewRemoved(coordinatorLayout, view, view2);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        11T.A0F(coordinatorLayout, 0);
        11T.A0F(view, 1);
        boolean z = false;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00 && c6p4.A01.onLayoutChild(coordinatorLayout, view, i)) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        11T.A0F(coordinatorLayout, 0);
        11T.A0F(view, 1);
        boolean z = false;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00 && c6p4.A01.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4)) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4 = i2;
        int i5 = i;
        11T.A0F(coordinatorLayout, 0);
        11T.A0G(view, 1, view2);
        11T.A0F(iArr, 5);
        int i6 = 0;
        int i7 = 0;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00) {
                c6p4.A01.onNestedPreScroll(coordinatorLayout, view, view2, i5, i4, iArr, i3);
                int i8 = iArr[0];
                i5 -= i8;
                int i9 = iArr[1];
                i4 -= i9;
                i6 += i8;
                i7 += i9;
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6 = i4;
        int i7 = i3;
        11T.A0F(coordinatorLayout, 0);
        11T.A0G(view, 1, view2);
        11T.A0F(iArr, 8);
        int i8 = 0;
        int i9 = 0;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00) {
                c6p4.A01.onNestedScroll(coordinatorLayout, view, view2, i, i2, i7, i6, i5, iArr);
                int i10 = iArr[0];
                i7 -= i10;
                int i11 = iArr[1];
                i6 -= i11;
                i8 += i10;
                i9 += i11;
            }
            iArr[0] = i8;
            iArr[1] = i9;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        11T.A0F(coordinatorLayout, 0);
        1BL.A1H(view, view2, view3);
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00) {
                c6p4.A01.onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i, i2);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        11T.A0F(coordinatorLayout, 0);
        11T.A0F(view, 1);
        11T.A0F(rect, 2);
        boolean z2 = false;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00 && c6p4.A01.onRequestChildRectangleOnScreen(coordinatorLayout, view, rect, z)) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        11T.A0F(coordinatorLayout, 0);
        11T.A0F(view, 1);
        11T.A0F(view2, 2);
        11T.A0F(view3, 3);
        boolean z = false;
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00 && c6p4.A01.onStartNestedScroll(coordinatorLayout, view, view2, view3, i, i2)) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        11T.A0H(coordinatorLayout, view);
        11T.A0F(view2, 2);
        for (C6p4 c6p4 : this.A00) {
            if (c6p4.A00) {
                c6p4.A01.onStopNestedScroll(coordinatorLayout, view, view2, i);
            }
        }
    }
}
