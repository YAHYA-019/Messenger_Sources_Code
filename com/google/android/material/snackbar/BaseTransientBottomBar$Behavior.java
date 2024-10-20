package com.google.android.material.snackbar;

import X.KSZ;
import X.LCp;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: BaseTransientBottomBar$Behavior.class */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final KSZ A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.KSZ, java.lang.Object] */
    public BaseTransientBottomBar$Behavior() {
        ?? obj = new Object();
        this.A01 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        super.A00 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.A02 = 0;
        this.A00 = obj;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        KSZ ksz = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                LCp.A00().A06(ksz.A00);
            }
        } else if (coordinatorLayout.A0E(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            LCp.A00().A05(ksz.A00);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }
}
