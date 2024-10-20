package com.google.android.material.floatingactionbutton;

import X.5WH;
import X.6Ld;
import X.AnonymousClass001;
import X.JYv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* loaded from: FloatingActionButton$BaseBehavior.class */
public class FloatingActionButton$BaseBehavior extends CoordinatorLayout.Behavior {
    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 6Ld.A08);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public boolean A00(CoordinatorLayout coordinatorLayout, JYv jYv, int i) {
        List A0A = coordinatorLayout.A0A(null);
        int size = A0A.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                coordinatorLayout.A0C(null, i);
                throw AnonymousClass001.A0Q("shadowPadding");
            }
            View view = (View) A0A.get(i3);
            if (view instanceof AppBarLayout) {
                throw AnonymousClass001.A0Q("getLayoutParams");
            }
            5WH layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof 5WH) && (layoutParams.A0A instanceof BottomSheetBehavior)) {
                throw AnonymousClass001.A0Q("getLayoutParams");
            }
            i2 = i3 + 1;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        throw AnonymousClass001.A0Q("shadowPadding");
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
        A00(coordinatorLayout, null, i);
        throw null;
    }
}
