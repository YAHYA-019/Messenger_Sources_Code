package com.facebook.widget;

import X.0NL;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: ListViewFriendlyViewPager.class */
public class ListViewFriendlyViewPager extends CustomViewPager {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public int A04;
    public int A05;
    public boolean A06;

    public ListViewFriendlyViewPager(Context context) {
        super(context);
        this.A02 = 0L;
        this.A06 = false;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A01 = viewConfiguration.getScaledTouchSlop();
        this.A00 = viewConfiguration.getScaledPagingTouchSlop();
        this.A03 = false;
    }

    public ListViewFriendlyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = 0L;
        this.A06 = false;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A01 = viewConfiguration.getScaledTouchSlop();
        this.A00 = viewConfiguration.getScaledPagingTouchSlop();
        this.A03 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.CustomViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0NL A0H = A0H();
        if (A0H == null || A0H.A0C() <= 0) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.A06 = onInterceptTouchEvent;
        if (onInterceptTouchEvent) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return onInterceptTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0.A0C() <= 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.CustomViewPager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.ListViewFriendlyViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scrollTo(int i, int i2) {
        if (getScrollX() != i) {
            this.A02 = SystemClock.uptimeMillis();
        }
        super/*android.view.View*/.scrollTo(i, i2);
    }
}
