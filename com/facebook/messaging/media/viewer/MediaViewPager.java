package com.facebook.messaging.media.viewer;

import X.0FI;
import X.Haa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;

/* loaded from: MediaViewPager.class */
public class MediaViewPager extends ViewPager {
    public float A00;
    public float A01;
    public int A02;
    public VelocityTracker A03;
    public Haa A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;

    public MediaViewPager(Context context) {
        super(context);
        this.A06 = false;
        this.A01 = -1.0f;
        this.A00 = -1.0f;
        this.A02 = 0;
        this.A05 = false;
        this.A08 = false;
        this.A07 = false;
        this.A09 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public MediaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = false;
        this.A01 = -1.0f;
        this.A00 = -1.0f;
        this.A02 = 0;
        this.A05 = false;
        this.A08 = false;
        this.A07 = false;
        this.A09 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    private void A01(MotionEvent motionEvent) {
        if (this.A03 != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            this.A03.addMovement(obtain);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r0 != 3) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0280  */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.viewer.MediaViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-282445648);
        try {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            0FI.A0B(1079561388, A05);
            return onTouchEvent;
        } catch (IllegalArgumentException unused) {
            0FI.A0B(-155950844, A05);
            return false;
        }
    }
}
