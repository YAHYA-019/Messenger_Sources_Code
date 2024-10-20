package com.facebook.widget.refreshableview;

import X.0FI;
import X.0NA;
import X.0S2;
import X.0fH;
import X.1Bi;
import X.2MR;
import X.7zM;
import X.AbH;
import X.C62j;
import X.C66h;
import X.C66i;
import X.DKD;
import X.GOn;
import X.GOp;
import X.HoD;
import X.Q0o;
import X.QTk;
import X.QTl;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FacebookProgressCircleView;
import com.facebook.widget.framerateprogressbar.FrameRateProgressBar;
import com.facebook.widget.loadingindicator.LoadingIndicatorView;

/* loaded from: RefreshableViewItem.class */
public class RefreshableViewItem extends CustomFrameLayout {
    public float A00;
    public int A01;
    public int A02;
    public ImageView A03;
    public C66i A04;
    public C66i A05;
    public C62j A06;
    public FacebookProgressCircleView A07;
    public FrameRateProgressBar A08;
    public LoadingIndicatorView A09;
    public Q0o A0A;
    public Integer A0B;
    public final HoD A0C;
    public static final C66h A0F = C66h.A02(3.0d, 15.0d);
    public static final C66h A0E = C66h.A02(3.0d, 5.0d);
    public static final Interpolator A0D = new DecelerateInterpolator(2.0f);

    public RefreshableViewItem(Context context) {
        super(context);
        this.A01 = -1;
        this.A0C = (HoD) 1Bi.A03(116040);
        A02();
    }

    public RefreshableViewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = -1;
        this.A0C = (HoD) 1Bi.A03(116040);
        A02();
    }

    public RefreshableViewItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = -1;
        this.A0C = (HoD) 1Bi.A03(116040);
        A02();
    }

    private int A00(View view) {
        if (view == null) {
            0fH.A0B(RefreshableViewItem.class, "No background color set for PTR fragment");
            return this.A02;
        }
        Drawable background = view.getBackground();
        if (background == null || background.equals(view.getContext().getDrawable(2132214289))) {
            return A00(GOn.A0H(view));
        }
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        0fH.A0B(RefreshableViewItem.class, "Non color drawables not supported for PTR backgrounds");
        return this.A02;
    }

    private void A01() {
        View findViewById = findViewById(2131366750);
        View findViewById2 = findViewById(2131366751);
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        int A00 = A00(this);
        AbH.A1K(findViewById, A00);
        findViewById2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{16777215 & A00, A00}));
        this.A07.A02(A00);
    }

    private void A02() {
        this.A06 = GOp.A0x();
        Context context = getContext();
        int A03 = 0NA.A03(context, 2130971477, 2132542957);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(A03, this);
        if (this.A0C.A00() != 60) {
            ViewGroup viewGroup = (ViewGroup) requireViewById(2131366752);
            from.inflate(2132543178, viewGroup);
            this.A08 = viewGroup.findViewById(2131366749);
        }
        this.A09 = (LoadingIndicatorView) findViewById(2131366748);
        this.A03 = GOn.A0I(this, 2131366753);
        this.A07 = (FacebookProgressCircleView) findViewById(2131366754);
        this.A02 = 7zM.A02(context, 2MR.A2K);
        this.A00 = DKD.A09(this).density;
        if (this.A05 == null) {
            C66i c66i = new C66i(this.A06);
            c66i.A09(A0F);
            c66i.A06(0.0d);
            c66i.A07(0.0d);
            c66i.A02();
            c66i.A0A(new QTl(this));
            this.A05 = c66i;
        }
        if (this.A04 == null && this.A09 != null) {
            C66i c66i2 = new C66i(this.A06);
            c66i2.A09(A0E);
            c66i2.A06(0.0d);
            c66i2.A02();
            c66i2.A0A(new QTk(this));
            this.A04 = c66i2;
        }
        if (this.A0A == null) {
            Q0o q0o = new Q0o(this.A03.getDrawable());
            this.A0A = q0o;
            q0o.setRepeatMode(1);
            float f = 0.0f / 0.0f;
            this.A0A.setRepeatCount(-1);
            this.A0A.setInterpolator(new LinearInterpolator());
        }
        A01();
    }

    public static void A03(RefreshableViewItem refreshableViewItem) {
        FacebookProgressCircleView facebookProgressCircleView = refreshableViewItem.A07;
        if (facebookProgressCircleView != null) {
            facebookProgressCircleView.setVisibility(0);
            refreshableViewItem.A07.setProgress(0L);
        }
        LoadingIndicatorView loadingIndicatorView = refreshableViewItem.A09;
        if (loadingIndicatorView != null) {
            loadingIndicatorView.setVisibility(8);
        }
        C66i c66i = refreshableViewItem.A05;
        if (c66i != null) {
            c66i.A06(0.0d);
            refreshableViewItem.A05.A02();
        }
        C66i c66i2 = refreshableViewItem.A04;
        if (c66i2 != null) {
            c66i2.A06(0.0d);
            refreshableViewItem.A04.A02();
        }
        ImageView imageView = refreshableViewItem.A03;
        if (imageView != null) {
            imageView.setVisibility(0);
            refreshableViewItem.A03.getDrawable().setLevel(0);
        }
        FrameRateProgressBar frameRateProgressBar = refreshableViewItem.A08;
        if (frameRateProgressBar != null) {
            frameRateProgressBar.setVisibility(8);
        }
        Animation animation = refreshableViewItem.getAnimation();
        if (animation != null) {
            animation.cancel();
            animation.reset();
        }
        refreshableViewItem.clearAnimation();
        for (int i = 0; i < refreshableViewItem.getChildCount(); i++) {
            View childAt = refreshableViewItem.getChildAt(i);
            Animation animation2 = childAt.getAnimation();
            if (animation2 != null) {
                animation2.cancel();
                animation2.reset();
            }
            childAt.clearAnimation();
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Q0o q0o;
        int A06 = 0FI.A06(185267693);
        super.onAttachedToWindow();
        if (this.A0B == 0S2.A0Y && (q0o = this.A0A) != null && !q0o.hasStarted()) {
            startAnimation(this.A0A);
        }
        0FI.A0C(1127705845, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1174882610);
        super.onDetachedFromWindow();
        A03(this);
        0FI.A0C(1557593617, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        A01();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A01();
    }
}
