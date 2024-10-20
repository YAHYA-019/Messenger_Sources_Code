package com.google.android.material.floatingactionbutton;

import X.0Q8;
import X.5WH;
import X.6Ld;
import X.AnonymousClass001;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* loaded from: ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.class */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends CoordinatorLayout.Behavior {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 6Ld.A07);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(5WH r302) {
        if (r302.A01 == 0) {
            r302.A01 = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 instanceof AppBarLayout) {
            throw AnonymousClass001.A0Q("getLayoutParams");
        }
        5WH layoutParams = view2.getLayoutParams();
        if ((layoutParams instanceof 5WH) && (layoutParams.A0A instanceof BottomSheetBehavior)) {
            throw AnonymousClass001.A0Q("getLayoutParams");
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        List A0A = coordinatorLayout.A0A(null);
        int size = A0A.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                coordinatorLayout.A0C(null, i);
                throw 0Q8.createAndThrow();
            }
            View view2 = (View) A0A.get(i3);
            if (view2 instanceof AppBarLayout) {
                throw AnonymousClass001.A0Q("getLayoutParams");
            }
            5WH layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof 5WH) && (layoutParams.A0A instanceof BottomSheetBehavior)) {
                throw AnonymousClass001.A0Q("getLayoutParams");
            }
            i2 = i3 + 1;
        }
    }
}
