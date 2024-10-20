package com.facebook.payments.ui;

import X.DKC;
import X.DKG;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: ReceiptTextItemView.class */
public class ReceiptTextItemView extends CustomLinearLayout {
    public BetterTextView A00;
    public BetterTextView A01;

    public ReceiptTextItemView(Context context) {
        super(context);
        A00();
    }

    public ReceiptTextItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ReceiptTextItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        DKG.A1S(this, 2132543229);
        this.A01 = DKC.A0g(this, 2131368067);
        this.A00 = DKC.A0g(this, 2131367726);
    }
}
