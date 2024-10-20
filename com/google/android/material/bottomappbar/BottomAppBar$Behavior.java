package com.google.android.material.bottomappbar;

import X.AnonymousClass001;
import X.DKC;
import X.DKD;
import X.LKS;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: BottomAppBar$Behavior.class */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public WeakReference A00;
    public final Rect A01;
    public final View.OnLayoutChangeListener A02;

    public BottomAppBar$Behavior() {
        this.A02 = new LKS(this, 5);
        this.A01 = DKC.A0C();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new LKS(this, 5);
        this.A01 = DKC.A0C();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A00 = DKD.A11();
        throw AnonymousClass001.A0Q("findDependentView");
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        throw AnonymousClass001.A0Q("getHideOnScroll");
    }
}
