package com.facebook.messaging.montage.viewer.swipeablemediapicker;

import X.0K6;
import X.6cN;
import X.C09s;
import X.C2396Gby;
import X.C4s1;
import X.GOn;
import X.GSD;
import X.HmN;
import X.IG2;
import X.IG6;
import X.IKX;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: MontageViewerSwipeableMediaPickerView.class */
public class MontageViewerSwipeableMediaPickerView extends 6cN {
    public int A00;
    public VelocityTracker A01;
    public HmN A02;
    public MontageViewerSwipeableMediaPickerContainerView A03;
    public 6cN A04;
    public C4s1 A05;

    public MontageViewerSwipeableMediaPickerView(Context context) {
        this(context, null);
    }

    public MontageViewerSwipeableMediaPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MontageViewerSwipeableMediaPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0U(2132542760);
        MontageViewerSwipeableMediaPickerContainerView montageViewerSwipeableMediaPickerContainerView = (MontageViewerSwipeableMediaPickerContainerView) C09s.A01(this, 2131365847);
        this.A03 = montageViewerSwipeableMediaPickerContainerView;
        montageViewerSwipeableMediaPickerContainerView.setOnTouchListener(new IKX(this));
        this.A05 = new C4s1(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int A00(MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView) {
        View A0H = GOn.A0H(montageViewerSwipeableMediaPickerView);
        if (A0H == null) {
            return 0;
        }
        return A0H.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int A01(MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView) {
        View findViewById = montageViewerSwipeableMediaPickerView.getRootView().findViewById(R.id.content);
        return findViewById != null ? findViewById.getHeight() : montageViewerSwipeableMediaPickerView.A05.A06();
    }

    private void A02(int i) {
        if (i < A00(this) || i > A01(this)) {
            return;
        }
        int i2 = this.A03.getLayoutParams().height;
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        ofInt.setDuration(250L);
        IG6.A00(ofInt, this, 9);
        if (i < i2) {
            GSD.A00(ofInt, this, 3);
        }
        0K6.A00(ofInt);
    }

    public static void A03(MotionEvent motionEvent, MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView) {
        if (montageViewerSwipeableMediaPickerView.A01 != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            montageViewerSwipeableMediaPickerView.A01.addMovement(obtain);
        }
    }

    public static void A04(View view, MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView) {
        montageViewerSwipeableMediaPickerView.A0V(view, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight(), 80));
        HmN hmN = montageViewerSwipeableMediaPickerView.A02;
        if (hmN != null) {
            C2396Gby c2396Gby = hmN.A00;
            c2396Gby.A1Y(C2396Gby.A03(c2396Gby));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A05(View view, MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView) {
        if (montageViewerSwipeableMediaPickerView.A04 == null) {
            montageViewerSwipeableMediaPickerView.A04 = new CustomFrameLayout(montageViewerSwipeableMediaPickerView.getContext());
            ViewGroup viewGroup = (ViewGroup) montageViewerSwipeableMediaPickerView.getRootView().findViewById(R.id.content);
            if (viewGroup != null) {
                viewGroup.addView(montageViewerSwipeableMediaPickerView.A04);
            }
        }
        if (view.getParent() != montageViewerSwipeableMediaPickerView.A04) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), view.getHeight(), 80);
            6cN r0 = montageViewerSwipeableMediaPickerView.A04;
            if (r0 != null) {
                r0.A0V(view, layoutParams);
            }
            HmN hmN = montageViewerSwipeableMediaPickerView.A02;
            if (hmN != null) {
                hmN.A00();
            }
        }
    }

    public void A0W(boolean z) {
        MontageViewerSwipeableMediaPickerContainerView montageViewerSwipeableMediaPickerContainerView;
        boolean z2;
        if (z) {
            A02(A00(this));
            montageViewerSwipeableMediaPickerContainerView = this.A03;
            z2 = false;
        } else {
            montageViewerSwipeableMediaPickerContainerView = this.A03;
            A05(montageViewerSwipeableMediaPickerContainerView, this);
            A02(A01(this));
            z2 = true;
        }
        int i = montageViewerSwipeableMediaPickerContainerView.A01.getLayoutParams().height;
        int i2 = 0;
        if (z2) {
            i2 = 125;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(100);
        ofInt.addUpdateListener(new IG2(1, montageViewerSwipeableMediaPickerContainerView, z2));
        0K6.A00(ofInt);
    }
}
