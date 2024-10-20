package com.facebook.browser.lite.views;

import X.0K6;
import X.DKC;
import X.JR1;
import X.JgX;
import X.L9d;
import X.LpK;
import X.ML7;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import java.util.regex.Pattern;

/* loaded from: BrowserLiteWrapperView.class */
public class BrowserLiteWrapperView extends LinearLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public ObjectAnimator A04;
    public View A05;
    public ViewPropertyAnimator A06;
    public JgX A07;
    public JgX A08;
    public ML7 A09;
    public boolean A0A;

    public BrowserLiteWrapperView(Context context) {
        super(context);
        this.A01 = 0;
    }

    public BrowserLiteWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 0;
    }

    public static void A00(BrowserLiteWrapperView browserLiteWrapperView) {
        if (browserLiteWrapperView.A02 != 2) {
            FragmentActivity activity = browserLiteWrapperView.A08.getActivity();
            Pattern pattern = L9d.A01;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            JR1.A19(activity, displayMetrics);
            browserLiteWrapperView.A03 = displayMetrics.heightPixels;
            int i = browserLiteWrapperView.A01;
            ViewGroup.LayoutParams layoutParams = browserLiteWrapperView.A05.getLayoutParams();
            int Aoz = browserLiteWrapperView.A09.Aoz();
            layoutParams.height = browserLiteWrapperView.A03 + Aoz;
            browserLiteWrapperView.A05.setLayoutParams(layoutParams);
            ViewGroup.MarginLayoutParams A0I = DKC.A0I(browserLiteWrapperView.A08.A0B);
            int i2 = browserLiteWrapperView.A03 - i;
            ((ViewGroup.LayoutParams) A0I).height = i2;
            A0I.setMargins(A0I.leftMargin, -Aoz, A0I.rightMargin, A0I.bottomMargin);
            browserLiteWrapperView.A08.A0B.setLayoutParams(A0I);
            ViewGroup.LayoutParams layoutParams2 = browserLiteWrapperView.getLayoutParams();
            layoutParams2.height = browserLiteWrapperView.A03 + i2;
            browserLiteWrapperView.setLayoutParams(layoutParams2);
            browserLiteWrapperView.A00 = -i2;
        }
    }

    public void A01(int i, String str) {
        A02(null, new LpK(this, str, i), 0.0f, 300L);
        this.A0A = true;
    }

    public void A02(Interpolator interpolator, Runnable runnable, float f, long j) {
        if (this.A0A) {
            return;
        }
        float f2 = this.A00;
        if (f < f2) {
            f = f2;
        } else if (f > 0.0f) {
            f = 0.0f;
        }
        this.A04 = ObjectAnimator.ofFloat(this.A05, "alpha", (f / f2) * 0.4f).setDuration(j);
        ViewPropertyAnimator duration = animate().y(f).setDuration(j);
        this.A06 = duration;
        if (runnable != null) {
            duration.withEndAction(runnable);
        }
        if (interpolator != null) {
            this.A06.setInterpolator(interpolator);
            this.A04.setInterpolator(interpolator);
        }
        0K6.A00(this.A04);
        this.A06.start();
    }
}
