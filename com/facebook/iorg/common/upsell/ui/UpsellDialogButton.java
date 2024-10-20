package com.facebook.iorg.common.upsell.ui;

import X.DKD;
import X.DKF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;

/* loaded from: UpsellDialogButton.class */
public class UpsellDialogButton extends FbRelativeLayout {
    public ProgressBar A00;
    public TextView A01;

    public UpsellDialogButton(Context context) {
        super(context);
        A00();
    }

    public UpsellDialogButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    private void A00() {
        View inflate = DKD.A0A(this).inflate(2132543536, this);
        this.A01 = DKF.A0F(inflate, 2131368267);
        this.A00 = (ProgressBar) inflate.requireViewById(2131368266);
    }

    public void setTextColor(int i) {
        this.A01.setTextColor(i);
    }
}
