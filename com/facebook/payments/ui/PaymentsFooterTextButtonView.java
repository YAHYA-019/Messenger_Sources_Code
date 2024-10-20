package com.facebook.payments.ui;

import X.C1oo;
import X.DKC;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.widget.text.BetterTextView;

/* loaded from: PaymentsFooterTextButtonView.class */
public class PaymentsFooterTextButtonView extends PaymentsComponentViewGroup {
    public BetterTextView A00;

    public PaymentsFooterTextButtonView(Context context) {
        super(context);
        A00(context, null);
    }

    public PaymentsFooterTextButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public PaymentsFooterTextButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(Context context, AttributeSet attributeSet) {
        setContentView(2132543065);
        this.A00 = DKC.A0g(this, 2131362743);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A24);
            int color = obtainStyledAttributes.getColor(0, 0);
            if (color != 0) {
                this.A00.setTextColor(color);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
