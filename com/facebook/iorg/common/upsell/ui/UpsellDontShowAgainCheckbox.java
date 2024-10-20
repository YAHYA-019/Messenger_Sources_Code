package com.facebook.iorg.common.upsell.ui;

import X.DKD;
import X.DKF;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.resources.compat.RedexResourcesCompat;

/* loaded from: UpsellDontShowAgainCheckbox.class */
public class UpsellDontShowAgainCheckbox extends LinearLayout {
    public CheckBox A00;
    public TextView A01;

    public UpsellDontShowAgainCheckbox(Context context) {
        super(context);
        A00();
    }

    public UpsellDontShowAgainCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    private void A00() {
        View inflate = DKD.A0A(this).inflate(2132543539, this);
        this.A01 = DKF.A0F(inflate, 2131368280);
        CheckBox checkBox = (CheckBox) inflate.requireViewById(2131368279);
        this.A00 = checkBox;
        checkBox.setButtonDrawable(RedexResourcesCompat.getIdentifier(Resources.getSystem(), "btn_check_holo_light", "drawable", "android"));
    }
}
