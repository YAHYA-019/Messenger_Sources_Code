package com.facebook.payments.transactionhub.views;

import X.2MR;
import X.4YU;
import X.C00i;
import X.C1uu;
import X.DKC;
import X.DKD;
import X.DKH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.resources.ui.FbTextView;

/* loaded from: HubBrandingPromiseInfoSectionRowView.class */
public class HubBrandingPromiseInfoSectionRowView extends ConstraintLayout {
    public FbTextView A00;
    public ImageView A01;
    public C00i A02;

    public HubBrandingPromiseInfoSectionRowView(Context context) {
        super(context);
        A00(context);
    }

    public HubBrandingPromiseInfoSectionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public HubBrandingPromiseInfoSectionRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        this.A02 = DKD.A0Q();
        View.inflate(context, 2132542124, this);
        this.A01 = (ImageView) requireViewById(2131366731);
        this.A00 = DKC.A0e(this, 2131366730);
        DKH.A0u(context, this.A01, (C1uu) 4YU.A0p(this.A02), 2MR.A22, 2132345239);
    }
}
