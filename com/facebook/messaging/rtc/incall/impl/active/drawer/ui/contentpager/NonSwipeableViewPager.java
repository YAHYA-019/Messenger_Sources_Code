package com.facebook.messaging.rtc.incall.impl.active.drawer.ui.contentpager;

import X.0FI;
import X.11T;
import X.1BL;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: NonSwipeableViewPager.class */
public final class NonSwipeableViewPager extends ViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonSwipeableViewPager(Context context) {
        super(context);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean A0V(int i) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        0FI.A0B(1672644810, 0FI.A05(-1932448410));
        return false;
    }
}
