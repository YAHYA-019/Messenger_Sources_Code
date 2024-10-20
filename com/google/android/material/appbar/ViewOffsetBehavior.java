package com.google.android.material.appbar;

import X.C6c7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: ViewOffsetBehavior.class */
public abstract class ViewOffsetBehavior extends CoordinatorLayout.Behavior {
    public C6c7 viewOffsetHelper;
    public int tempTopBottomOffset = 0;
    public int tempLeftRightOffset = 0;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
    }

    public int getLeftAndRightOffset() {
        C6c7 c6c7 = this.viewOffsetHelper;
        if (c6c7 != null) {
            return c6c7.A02;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        C6c7 c6c7 = this.viewOffsetHelper;
        if (c6c7 != null) {
            return c6c7.A03;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A04 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isHorizontalOffsetEnabled() {
        /*
            r301 = this;
            r0 = r301
            X.6c7 r0 = r0.viewOffsetHelper
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A04
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.ViewOffsetBehavior.isHorizontalOffsetEnabled():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A05 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isVerticalOffsetEnabled() {
        /*
            r301 = this;
            r0 = r301
            X.6c7 r0 = r0.viewOffsetHelper
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A05
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.ViewOffsetBehavior.isVerticalOffsetEnabled():boolean");
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.A0C(view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        layoutChild(coordinatorLayout, view, i);
        C6c7 c6c7 = this.viewOffsetHelper;
        if (c6c7 == null) {
            c6c7 = new C6c7(view);
            this.viewOffsetHelper = c6c7;
        }
        View view2 = c6c7.A06;
        c6c7.A01 = view2.getTop();
        c6c7.A00 = view2.getLeft();
        this.viewOffsetHelper.A00();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            C6c7 c6c72 = this.viewOffsetHelper;
            if (c6c72.A05 && c6c72.A03 != i2) {
                c6c72.A03 = i2;
                c6c72.A00();
            }
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 == 0) {
            return true;
        }
        C6c7 c6c73 = this.viewOffsetHelper;
        if (c6c73.A04 && c6c73.A02 != i3) {
            c6c73.A02 = i3;
            c6c73.A00();
        }
        this.tempLeftRightOffset = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        C6c7 c6c7 = this.viewOffsetHelper;
        if (c6c7 != null) {
            c6c7.A04 = z;
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        C6c7 c6c7 = this.viewOffsetHelper;
        if (c6c7 == null) {
            this.tempLeftRightOffset = i;
            return false;
        }
        if (!c6c7.A04 || c6c7.A02 == i) {
            return false;
        }
        c6c7.A02 = i;
        c6c7.A00();
        return true;
    }

    public boolean setTopAndBottomOffset(int i) {
        C6c7 c6c7 = this.viewOffsetHelper;
        if (c6c7 == null) {
            this.tempTopBottomOffset = i;
            return false;
        }
        if (!c6c7.A05 || c6c7.A03 == i) {
            return false;
        }
        c6c7.A03 = i;
        c6c7.A00();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        C6c7 c6c7 = this.viewOffsetHelper;
        if (c6c7 != null) {
            c6c7.A05 = z;
        }
    }
}
