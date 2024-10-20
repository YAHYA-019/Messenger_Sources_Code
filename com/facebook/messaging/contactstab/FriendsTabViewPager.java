package com.facebook.messaging.contactstab;

import X.0FI;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: FriendsTabViewPager.class */
public class FriendsTabViewPager extends ViewPager {
    public FriendsTabViewPager(Context context) {
        super(context);
    }

    public FriendsTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        0FI.A0B(-1513880716, 0FI.A05(1354072999));
        return false;
    }
}
