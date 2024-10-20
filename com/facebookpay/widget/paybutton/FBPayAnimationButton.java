package com.facebookpay.widget.paybutton;

import X.0K6;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BJ;
import X.2yD;
import X.4YT;
import X.4YU;
import X.AnonymousClass001;
import X.C00m;
import X.C01g;
import X.C01i;
import X.C06014fk;
import X.C1oo;
import X.DKB;
import X.DLb;
import X.EL6;
import X.FAF;
import X.FJC;
import X.HLw;
import X.JR0;
import X.JZV;
import X.L9O;
import X.LBg;
import X.LF6;
import X.Qqb;
import X.QuE;
import X.RVu;
import X.SI7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.button.FBPayButton;

/* loaded from: FBPayAnimationButton.class */
public final class FBPayAnimationButton extends ShimmerFrameLayout {
    public static final C01i A0A = C01g.A01(SI7.A00);
    public static final boolean A0B = 2yD.A03(DLb.A00(), 36318084543492161L);
    public Drawable A00;
    public Drawable A01;
    public ViewPropertyAnimator A02;
    public ViewPropertyAnimator A03;
    public TextView A04;
    public FBPayButton A05;
    public JZV A06;
    public C00m A07;
    public final int A08;
    public final AttributeSet A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A09 = attributeSet;
        this.A08 = i;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        setClipChildren(false);
        Context context2 = getContext();
        C06014fk.A04();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(2132607281, C1oo.A0p);
        FAF A04 = C06014fk.A04();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = JR0.A0Y(context2, drawable, C06014fk.A04(), A04, 15);
        FAF A042 = C06014fk.A04();
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        if (drawable2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        C06014fk.A04();
        this.A01 = A042.A04(context2, drawable2, 0);
        obtainStyledAttributes.recycle();
        HLw.A00(this, (Integer) null);
        AttributeSet attributeSet2 = this.A09;
        int i2 = this.A08;
        this.A05 = new FBPayButton(context2, attributeSet2, i2, Qqb.A02);
        A06().setId(2131364020);
        ProgressBar progressBar = new ProgressBar(context2, attributeSet2, i2);
        progressBar.setIndeterminate(true);
        Resources resources = progressBar.getResources();
        progressBar.setIndeterminateDrawable(resources.getDrawable(2132410785, progressBar.getContext().getTheme()));
        int dimensionPixelSize = resources.getDimensionPixelSize(2132279326);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        11T.A0I(indeterminateDrawable, 4YT.A00(25));
        LayerDrawable layerDrawable = (LayerDrawable) indeterminateDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(2131365166);
        11T.A0I(findDrawableByLayerId, DKB.A00(17));
        ((JZV) progressBar).A01 = (GradientDrawable) findDrawableByLayerId;
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(2131365168);
        11T.A0I(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.RotateDrawable");
        ((JZV) progressBar).A02 = (RotateDrawable) findDrawableByLayerId2;
        Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(2131365167);
        11T.A0I(findDrawableByLayerId3, 1BJ.A00(9));
        ((JZV) progressBar).A00 = findDrawableByLayerId3;
        progressBar.A00(20);
        progressBar.A02(QuE.A0P);
        progressBar.A01(16);
        LBg.A01(progressBar, 4);
        progressBar.setVisibility(4);
        this.A06 = progressBar;
        A07().setId(2131364021);
        TextView textView = new TextView(context2, attributeSet2, i2);
        textView.setAlpha(0.0f);
        L9O.A00(textView, 3, 1);
        this.A04 = textView;
        A05().setId(2131364022);
        TextView A05 = A05();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        A05.setLayoutParams(layoutParams);
        addView(A06());
        addView(A07());
        addView(A05());
        A02();
    }

    public static final void A00(FBPayAnimationButton fBPayAnimationButton) {
        ViewPropertyAnimator viewPropertyAnimator = fBPayAnimationButton.A03;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = fBPayAnimationButton.A02;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = fBPayAnimationButton.A07().A03;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        fBPayAnimationButton.A07().setVisibility(8);
        fBPayAnimationButton.A05().setVisibility(8);
    }

    @Override // com.facebook.shimmer.ShimmerFrameLayout
    public void A02() {
        super.A02();
        Drawable drawable = this.A01;
        if (drawable == null) {
            11T.A0L("trasparentBackground");
            throw 0Q8.createAndThrow();
        }
        setBackground(drawable);
        A06().setVisibility(0);
        setFocusable(false);
        setImportantForAccessibility(2);
        A05().setImportantForAccessibility(2);
    }

    @Override // com.facebook.shimmer.ShimmerFrameLayout
    public void A04(boolean z) {
        super.A04(true);
        Drawable drawable = this.A00;
        if (drawable == null) {
            11T.A0L("shimmerViewBackground");
            throw 0Q8.createAndThrow();
        }
        setBackground(drawable);
        A06().setVisibility(8);
        A07().setVisibility(8);
        RVu.A00(this, (Boolean) null, 0S2.A00, A06().getContext().getString(2131956047));
        setImportantForAccessibility(1);
    }

    public final TextView A05() {
        TextView textView = this.A04;
        if (textView != null) {
            return textView;
        }
        11T.A0L("progressMsgView");
        throw 0Q8.createAndThrow();
    }

    public final FBPayButton A06() {
        FBPayButton fBPayButton = this.A05;
        if (fBPayButton != null) {
            return fBPayButton;
        }
        11T.A0L("buttonView");
        throw 0Q8.createAndThrow();
    }

    public final JZV A07() {
        JZV jzv = this.A06;
        if (jzv != null) {
            return jzv;
        }
        11T.A0L("progressBarView");
        throw 0Q8.createAndThrow();
    }

    public final void A08(FJC fjc) {
        EL6 el6 = fjc.A00;
        if (el6 != EL6.A02) {
            removeView(A06());
            if (A07().getScaleX() != 1.0f) {
                A07().setScaleX(1.0f);
                A07().setScaleY(1.0f);
            }
            A00(this);
            if (el6 != null) {
                int ordinal = el6.ordinal();
                if (ordinal == 0) {
                    RVu.A00(this, (Boolean) null, 0S2.A00, getContext().getString(2131956198));
                    setImportantForAccessibility(1);
                    A07().A02(QuE.A0M);
                    JZV A07 = A07();
                    A07.setVisibility(0);
                    A07.A00(4);
                    A07.A01(21);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(250L).addUpdateListener(new LF6(2, 4YU.A08(A07), this, this.A07));
                    0K6.A00(ofFloat);
                    return;
                }
                if (ordinal == 1) {
                    RVu.A00(this, (Boolean) null, 0S2.A00, getContext().getString(2131956199));
                    setImportantForAccessibility(1);
                    A07().A00(4);
                    JZV A072 = A07();
                    A072.A01(4);
                    RotateDrawable rotateDrawable = A072.A02;
                    if (rotateDrawable == null) {
                        11T.A0L("layerSpinnerRingDrawable");
                        throw 0Q8.createAndThrow();
                    }
                    rotateDrawable.setAlpha(0);
                    A07().A02(QuE.A0N);
                    if (Build.VERSION.SDK_INT >= 30) {
                        performHapticFeedback(16);
                    }
                }
            }
        }
    }
}
