package com.facebook.messaging.montage.composer.ui;

import X.11T;
import X.1Br;
import X.1Bu;
import X.4YT;
import X.5BK;
import X.AbJ;
import X.AbstractC00793on;
import X.C06974ih;
import X.C06984ii;
import X.C07004ik;
import X.C07014il;
import X.C09s;
import X.C1oo;
import X.C66i;
import X.DKF;
import X.DKG;
import X.GOo;
import X.GoE;
import X.HrF;
import X.IKC;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.FbImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: EditorToolsIcon.class */
public final class EditorToolsIcon extends CustomLinearLayout {
    public static final C06974ih A07;
    public View.OnClickListener A00;
    public final int A01;
    public final 1Br A02;
    public final GoE A03;
    public final GoE A04;
    public final FbTextView A05;
    public final FbImageView A06;

    static {
        C07004ik A00 = C06984ii.A00();
        ((C07014il) A00).A04 = 5BK.A05;
        A07 = new C06974ih(A00);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorToolsIcon(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorToolsIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.widget.TextView, android.view.View, com.facebook.resources.ui.FbTextView] */
    public EditorToolsIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A02 = 1Bu.A00(473);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0j, i, 0);
        11T.A0A(obtainStyledAttributes);
        A0D(2132541910);
        FbImageView fbImageView = (FbImageView) C09s.A01(this, 2131364530);
        this.A06 = fbImageView;
        ?? A0X = GOo.A0X(this, 2131364531);
        this.A05 = A0X;
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            fbImageView.setImageResource(resourceId);
        }
        fbImageView.setContentDescription(getContentDescription());
        setImportantForAccessibility(2);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        this.A01 = resourceId2;
        if (resourceId2 != 0) {
            fbImageView.setBackgroundResource(resourceId2);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        if (dimensionPixelSize != 0) {
            fbImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize2 != 0) {
            fbImageView.getLayoutParams().width = dimensionPixelSize2;
            fbImageView.getLayoutParams().height = dimensionPixelSize2;
        }
        String A01 = AbstractC00793on.A01(context, obtainStyledAttributes, 4);
        if (A01 != null) {
            A0X.setText(A01);
        }
        obtainStyledAttributes.recycle();
        GoE A0f = AbJ.A0J(this.A02).A0f((View) A0X);
        this.A04 = A0f;
        A0f.A00 = false;
        A0f.A01 = false;
        GoE A0f2 = AbJ.A0J(this.A02).A0f(fbImageView);
        this.A03 = A0f2;
        A0f2.A01 = false;
    }

    public /* synthetic */ EditorToolsIcon(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public final void A0E() {
        setVisibility(8);
        this.A03.A02();
        this.A04.A02();
    }

    public final void A0F() {
        GoE goE = this.A03;
        C66i c66i = goE.A03;
        c66i.A06(0.0d);
        c66i.A02();
        ((HrF) goE).A00.setVisibility(8);
        GoE goE2 = this.A04;
        C66i c66i2 = goE2.A03;
        c66i2.A06(0.0d);
        c66i2.A02();
        ((HrF) goE2).A00.setVisibility(8);
    }

    public final void A0G() {
        this.A03.A01();
        setVisibility(0);
    }

    public final void A0H(int i) {
        FbImageView fbImageView = this.A06;
        fbImageView.setImageResource(i);
        if (i != 0) {
            fbImageView.setBackgroundResource(this.A01);
        }
    }

    public final void A0I(int i) {
        Drawable drawable = this.A06.getDrawable();
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void A0J(MontageBackgroundColor montageBackgroundColor) {
        11T.A0F(montageBackgroundColor, 0);
        Drawable drawable = this.A06.getDrawable();
        11T.A0I(drawable, 4YT.A00(25));
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, montageBackgroundColor.A01);
        gradientDrawable.setShape(1);
        layerDrawable.setDrawableByLayerId(2131362338, gradientDrawable);
        layerDrawable.invalidateSelf();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        IKC.A00(this.A06, onClickListener, this, 21);
    }
}
