package com.bloks.components.bkavatareditorverticalsplitpane;

import X.11T;
import X.33N;
import X.7zT;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: CustomBehavior.class */
public final class CustomBehavior extends BottomSheetBehavior {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        7zT.A1S(coordinatorLayout, view, view2);
        if (!(view2 instanceof 33N)) {
            return false;
        }
        if (view2.canScrollVertically((int) f2)) {
            return false;
        }
        return super.onNestedPreFling(coordinatorLayout, view, view2, f, f2);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        7zT.A1S(coordinatorLayout, view, view2);
        11T.A0F(iArr, 5);
        if (!(view2 instanceof 33N) || view2.canScrollVertically(i2)) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
    }
}
