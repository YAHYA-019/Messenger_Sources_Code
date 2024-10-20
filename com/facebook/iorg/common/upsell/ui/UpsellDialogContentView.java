package com.facebook.iorg.common.upsell.ui;

import X.AbF;
import X.DKD;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: UpsellDialogContentView.class */
public class UpsellDialogContentView extends LinearLayout {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;

    public UpsellDialogContentView(Context context) {
        super(context);
        A00();
    }

    public UpsellDialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    private void A00() {
        DKD.A0A(this).inflate(2132543537, this);
        this.A03 = AbF.A06(this, 2131368272);
        this.A01 = AbF.A06(this, 2131368270);
        this.A02 = AbF.A06(this, 2131368271);
        this.A00 = AbF.A06(this, 2131368269);
        setOrientation(1);
        setVisibility(8);
    }
}
