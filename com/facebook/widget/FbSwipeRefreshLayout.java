package com.facebook.widget;

import X.2MR;
import X.2Me;
import X.2Mg;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: FbSwipeRefreshLayout.class */
public class FbSwipeRefreshLayout extends SwipeRefreshLayout {
    public int A00;
    public float A01;
    public boolean A02;
    public boolean A03;

    public FbSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public FbSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = ViewConfiguration.get(context).getScaledTouchSlop();
        2MR r0 = 2MR.A01;
        2Mg r02 = 2Me.A02;
        A09(r02.A03(context, r0));
        this.A0A.setBackgroundColor(r02.A03(context, 2MR.A0S));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.A03 && (action == 1 || action == 3)) {
            this.A03 = false;
            return false;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.A01 = motionEvent.getX();
            this.A02 = false;
        } else if (action2 == 2) {
            float abs = Math.abs(motionEvent.getX() - this.A01);
            if (this.A02 || abs > this.A00) {
                this.A02 = true;
                return false;
            }
        }
        return !this.A03 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }
}
