package com.facebook.iorg.common.upsell.ui;

import X.1Bn;
import X.DKD;
import X.FcO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.picassolike.PicassoLikeViewStub;

/* loaded from: UpsellDialogExtraTitleBarView.class */
public class UpsellDialogExtraTitleBarView extends LinearLayout {
    public View A00;
    public FcO A01;

    public UpsellDialogExtraTitleBarView(Context context) {
        super(context);
        A00();
    }

    public UpsellDialogExtraTitleBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    private void A00() {
        this.A01 = (FcO) 1Bn.A0A(98460);
        DKD.A0A(this).inflate(2132543538, this);
        this.A00 = ((PicassoLikeViewStub) requireViewById(2131368278)).A00();
    }
}
