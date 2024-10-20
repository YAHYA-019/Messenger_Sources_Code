package com.facebook.payments.confirmation;

import X.C09s;
import X.GOK;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.payments.ui.PaymentsComponentViewGroup;
import com.facebook.widget.text.BetterButton;

/* loaded from: PrimaryActionPostPurchaseRowView.class */
public class PrimaryActionPostPurchaseRowView extends PaymentsComponentViewGroup {
    public GOK A00;
    public BetterButton A01;

    public PrimaryActionPostPurchaseRowView(Context context) {
        super(context);
        A00();
    }

    public PrimaryActionPostPurchaseRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PrimaryActionPostPurchaseRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        setContentView(2132543161);
        this.A01 = (BetterButton) C09s.A01(this, 2131366663);
    }
}
