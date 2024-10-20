package com.facebook.messaging.accountrecovery;

import X.AbF;
import X.DKD;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.resources.ui.FbRadioButton;

/* loaded from: MessengerAccountRecoverySelectionItem.class */
public class MessengerAccountRecoverySelectionItem extends LinearLayout {
    public TextView A00;
    public TextView A01;
    public FbRadioButton A02;

    public MessengerAccountRecoverySelectionItem(Context context) {
        this(context, null);
    }

    public MessengerAccountRecoverySelectionItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessengerAccountRecoverySelectionItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DKD.A0A(this).inflate(2132543313, this);
        this.A01 = AbF.A06(this, 2131365080);
        this.A00 = AbF.A06(this, 2131365075);
        this.A02 = (FbRadioButton) findViewById(2131365079);
    }
}
