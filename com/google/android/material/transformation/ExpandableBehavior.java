package com.google.android.material.transformation;

import X.AnonymousClass001;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: ExpandableBehavior.class */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior {
    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw AnonymousClass001.A0Q("isExpanded");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.isLaidOut()) {
            return false;
        }
        List A0A = coordinatorLayout.A0A(view);
        int size = A0A.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return false;
            }
            layoutDependsOn(coordinatorLayout, view, (View) A0A.get(i3));
            i2 = i3 + 1;
        }
    }
}
