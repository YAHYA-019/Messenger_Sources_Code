package com.google.android.material.behavior;

import X.0Oe;
import X.5WJ;
import X.5XU;
import X.C0Ad;
import X.C3011JgA;
import X.JYg;
import X.LQQ;
import X.MGN;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* loaded from: SwipeDismissBehavior.class */
public class SwipeDismissBehavior extends CoordinatorLayout.Behavior {
    public 5XU A03;
    public MGN A04;
    public boolean A05;
    public int A02 = 2;
    public float A01 = 0.0f;
    public float A00 = 0.5f;
    public final 5WJ A06 = new C3011JgA(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.A05;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.A0E(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A05 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
        }
        if (!z) {
            return false;
        }
        5XU r307 = this.A03;
        if (r307 == null) {
            r307 = new 5XU(coordinatorLayout.getContext(), coordinatorLayout, this.A06);
            this.A03 = r307;
        }
        return r307.A0G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        C0Ad.A09(view, 1048576);
        if ((this instanceof BaseTransientBottomBar$Behavior) && !(view instanceof JYg)) {
            return false;
        }
        C0Ad.A0E(view, 0Oe.A0D, new LQQ(this, 2), null);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        5XU r0 = this.A03;
        if (r0 == null) {
            return false;
        }
        r0.A0C(motionEvent);
        return true;
    }
}
