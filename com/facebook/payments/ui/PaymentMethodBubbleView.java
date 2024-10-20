package com.facebook.payments.ui;

import X.2MR;
import X.4YU;
import X.5Wh;
import X.7zL;
import X.7zM;
import X.AbH;
import X.AbR;
import X.C00i;
import X.C0A2;
import X.DKH;
import X.FIR;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.text.textwithentitiesview.TextWithEntitiesView;

/* loaded from: PaymentMethodBubbleView.class */
public class PaymentMethodBubbleView extends ConstraintLayout {
    public FbDraweeView A00;
    public GlyphView A01;
    public C00i A02;
    public FbTextView A03;
    public TextWithEntitiesView A04;
    public Guideline A05;

    public PaymentMethodBubbleView(Context context) {
        super(context);
        A00(context);
    }

    public PaymentMethodBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public PaymentMethodBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        this.A02 = 7zL.A0R(context, 442);
        LayoutInflater.from(context).inflate(2132543072, this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2132279327);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.A00 = (FbDraweeView) requireViewById(2131364014);
        this.A03 = (FbTextView) requireViewById(2131364018);
        this.A04 = (TextWithEntitiesView) requireViewById(2131364003);
        this.A01 = (GlyphView) requireViewById(2131364010);
        this.A05 = (Guideline) requireViewById(2131367984);
        FIR A0V = DKH.A0V(context, this.A02);
        AbH.A1K(this.A00, A0V.A0B());
        FIR.A02(this.A03, A0V);
        FIR.A03(this.A04, A0V);
        this.A04.setHighlightColor(A0V.A05());
        this.A01.A00(A0V.A0A());
        this.A04.A01();
        this.A01.setVisibility(8);
        this.A00.setVisibility(0);
        FIR A13 = ((AbR) 4YU.A0p(this.A02)).A13(getContext());
        AbH.A1K(this, FIR.A04(A13) ? FIR.A00(A13).Amg() : 7zM.A02(A13.A00, 2MR.A0U));
    }

    public void A05() {
        this.A01.setVisibility(0);
        this.A00.setVisibility(8);
        Guideline guideline = this.A05;
        5Wh layoutParams = guideline.getLayoutParams();
        if (!guideline.A00 || layoutParams.A01 != 0.0804f) {
            layoutParams.A01 = 0.0804f;
            guideline.setLayoutParams(layoutParams);
        }
        Context context = getContext();
        setBackground(context.getDrawable(2132411332));
        if (getBackground() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) getBackground();
            FIR A0V = DKH.A0V(context, this.A02);
            gradientDrawable.setColor(FIR.A04(A0V) ? FIR.A00(A0V).Amg() : 7zM.A02(A0V.A00, 2MR.A0U));
        }
    }

    public void A06(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.A00.A0G(C0A2.A03(str), CallerContext.A06(ImageDetailView.class));
    }
}
