package com.facebook.rtc.views.common;

import X.11T;
import X.DKD;
import X.GOn;
import X.HV5;
import X.IG6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.widget.FacebookProgressCircleView;

/* loaded from: CountdownView.class */
public final class CountdownView extends FrameLayout {
    public int A00;
    public ValueAnimator A01;
    public TextView A02;
    public HV5 A03;
    public FacebookProgressCircleView A04;
    public boolean A05;
    public boolean A06;
    public int A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00();
    }

    private final void A00() {
        Context context = getContext();
        TextView textView = new TextView(context);
        this.A02 = textView;
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        TextView textView2 = this.A02;
        11T.A0D(textView2);
        textView2.setPadding(0, 0, 0, 4);
        addView(this.A02);
        TextView textView3 = this.A02;
        11T.A0D(textView3);
        textView3.setTextColor(-1);
        TextView textView4 = this.A02;
        11T.A0D(textView4);
        textView4.setGravity(17);
        FacebookProgressCircleView facebookProgressCircleView = new FacebookProgressCircleView(context);
        this.A04 = facebookProgressCircleView;
        facebookProgressCircleView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.A04);
        this.A07 = GOn.A02(TypedValue.applyDimension(1, 2.0f, DKD.A09(this)));
        FacebookProgressCircleView facebookProgressCircleView2 = this.A04;
        11T.A0D(facebookProgressCircleView2);
        int i = this.A07;
        facebookProgressCircleView2.A05 = i;
        facebookProgressCircleView2.A07.setStrokeWidth(i);
        int[] A1b = GOn.A1b();
        A1b[0] = 100;
        A1b[1] = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1b);
        this.A01 = ofInt;
        11T.A0D(ofInt);
        IG6.A00(ofInt, this, 12);
        ValueAnimator valueAnimator = this.A01;
        11T.A0D(valueAnimator);
        DKD.A17(valueAnimator);
        this.A00 = 3;
        ValueAnimator valueAnimator2 = this.A01;
        11T.A0D(valueAnimator2);
        valueAnimator2.setDuration(this.A00 * 1000);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        FacebookProgressCircleView facebookProgressCircleView = this.A04;
        11T.A0D(facebookProgressCircleView);
        facebookProgressCircleView.setSize(getMeasuredWidth() - this.A07);
        float measuredWidth = (int) (getMeasuredWidth() / DKD.A09(this).density);
        float f = 0.5f;
        if (this.A05) {
            f = 0.4f;
        }
        float f2 = measuredWidth * f;
        TextView textView = this.A02;
        11T.A0D(textView);
        textView.setTextSize(2, f2);
    }

    public final void setColor(int i) {
        TextView textView = this.A02;
        11T.A0D(textView);
        textView.setTextColor(i);
        FacebookProgressCircleView facebookProgressCircleView = this.A04;
        11T.A0D(facebookProgressCircleView);
        facebookProgressCircleView.A02(i);
    }
}
