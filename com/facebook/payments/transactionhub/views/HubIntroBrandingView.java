package com.facebook.payments.transactionhub.views;

import X.2Mg;
import X.AbH;
import X.C00i;
import X.DKC;
import X.DKF;
import X.EVf;
import X.FXq;
import X.FYE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.payments.ui.ctabutton.SingleTextCtaButtonView;
import com.facebook.resources.ui.FbTextView;

/* loaded from: HubIntroBrandingView.class */
public class HubIntroBrandingView extends ConstraintLayout {
    public static final CallerContext A0A = CallerContext.A0B("HubIntroBrandingView");
    public ScrollView A00;
    public ConstraintLayout A01;
    public FbDraweeView A02;
    public FbDraweeView A03;
    public C00i A04;
    public HubBrandingPromiseInfoSectionView A05;
    public SingleTextCtaButtonView A06;
    public FbTextView A07;
    public HubBrandingPaymentIconSectionView A08;
    public FbTextView A09;

    public HubIntroBrandingView(Context context) {
        super(context);
        A00(context);
    }

    public HubIntroBrandingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public HubIntroBrandingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        this.A04 = AbH.A0D();
        View.inflate(context, 2132542125, this);
        this.A03 = (FbDraweeView) findViewById(2131364567);
        this.A02 = (FbDraweeView) findViewById(2131362626);
        this.A06 = (SingleTextCtaButtonView) requireViewById(2131361874);
        this.A07 = DKC.A0e(this, 2131365365);
        this.A09 = (FbTextView) requireViewById(2131365186);
        this.A05 = (HubBrandingPromiseInfoSectionView) findViewById(2131366732);
        this.A08 = findViewById(2131366345);
        SingleTextCtaButtonView singleTextCtaButtonView = this.A06;
        Context context2 = singleTextCtaButtonView.getContext();
        singleTextCtaButtonView.setBackground(context2.getDrawable(2132411591));
        if (EVf.A00(context2, 2Mg.A00)) {
            DKF.A11(context2, singleTextCtaButtonView.A02, 2132214347);
        }
        this.A00 = (ScrollView) requireViewById(2131367122);
        this.A01 = (ConstraintLayout) findViewById(2131361879);
        FXq.A01(this.A09, this, ActionId.ON_VIEW_CREATED_END);
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(new FYE(this, 5));
    }
}
