package com.google.android.material.transformation;

import X.5WH;
import X.AnonymousClass001;
import X.DKC;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: FabTransformationBehavior.class */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00 = DKC.A0C();
    public final RectF A01 = DKC.A0D();
    public final RectF A02 = DKC.A0D();

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw AnonymousClass001.A0N("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(5WH r302) {
        if (r302.A01 == 0) {
            r302.A01 = 80;
        }
    }
}
