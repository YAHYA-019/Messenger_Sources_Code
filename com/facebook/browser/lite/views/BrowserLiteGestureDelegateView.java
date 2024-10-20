package com.facebook.browser.lite.views;

import X.0FI;
import X.0S2;
import X.GOn;
import X.L9d;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.regex.Pattern;

/* loaded from: BrowserLiteGestureDelegateView.class */
public class BrowserLiteGestureDelegateView extends LinearLayout {
    public double A00;
    public float A01;
    public int A02;
    public GestureDetector A03;
    public BrowserLiteWrapperView A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public BrowserLiteGestureDelegateView(Context context) {
        super(context);
    }

    public BrowserLiteGestureDelegateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean A00() {
        BrowserLiteWrapperView browserLiteWrapperView = this.A04;
        if (browserLiteWrapperView == null) {
            return false;
        }
        this.A01 = 0.0f;
        this.A06 = false;
        if (this.A07) {
            this.A07 = false;
            return false;
        }
        float f = -browserLiteWrapperView.getY();
        BrowserLiteWrapperView browserLiteWrapperView2 = this.A04;
        if (f < browserLiteWrapperView2.A03 * 0.34f) {
            browserLiteWrapperView2.A01(6, null);
            return true;
        }
        browserLiteWrapperView2.A02(new DecelerateInterpolator(1.5f), null, browserLiteWrapperView2.A00, 300L);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer num;
        BrowserLiteWrapperView browserLiteWrapperView = this.A04;
        boolean z = false;
        if (browserLiteWrapperView != null && this.A09 && !browserLiteWrapperView.A0A) {
            int action = motionEvent.getAction();
            if (action == 0) {
                BrowserLiteWrapperView browserLiteWrapperView2 = this.A04;
                if (!browserLiteWrapperView2.A0A) {
                    View view = browserLiteWrapperView2.A08.A0A;
                    if (view == null) {
                        num = 0S2.A0N;
                    } else {
                        Pattern pattern = L9d.A01;
                        int[] A1b = GOn.A1b();
                        view.getLocationInWindow(A1b);
                        num = ((float) A1b[1]) > motionEvent.getRawY() ? 0S2.A00 : motionEvent.getRawY() > ((float) (A1b[1] + this.A04.A09.Aoz())) ? 0S2.A0C : 0S2.A01;
                    }
                    this.A05 = num;
                    BrowserLiteWrapperView browserLiteWrapperView3 = this.A04;
                    if (!browserLiteWrapperView3.A0A) {
                        ObjectAnimator objectAnimator = browserLiteWrapperView3.A04;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        ViewPropertyAnimator viewPropertyAnimator = browserLiteWrapperView3.A06;
                        if (viewPropertyAnimator != null) {
                            viewPropertyAnimator.cancel();
                        }
                    }
                }
            } else if (action == 1 || action == 3) {
                A00();
            }
            z = this.A03.onTouchEvent(motionEvent);
        }
        return z;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        BrowserLiteWrapperView browserLiteWrapperView;
        int A05 = 0FI.A05(-1134559594);
        boolean z = false;
        if (!this.A09 || (browserLiteWrapperView = this.A04) == null || browserLiteWrapperView.A0A) {
            i = -1461012081;
        } else {
            boolean onTouchEvent = this.A03.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                0FI.A0B(-1808168411, A05);
                return true;
            }
            if (action == 1 || action == 3) {
                z = A00();
                i = 332757770;
            } else {
                if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                    z = true;
                }
                i = 1411668866;
            }
        }
        0FI.A0B(i, A05);
        return z;
    }
}
