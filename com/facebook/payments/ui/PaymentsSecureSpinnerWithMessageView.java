package com.facebook.payments.ui;

import X.AbstractC00793on;
import X.C1oo;
import X.DKG;
import X.EBe;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbTextView;

/* loaded from: PaymentsSecureSpinnerWithMessageView.class */
public class PaymentsSecureSpinnerWithMessageView extends EBe {
    public FbTextView A00;
    public String A01;

    public PaymentsSecureSpinnerWithMessageView(Context context) {
        this(context, null);
    }

    public PaymentsSecureSpinnerWithMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsSecureSpinnerWithMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DKG.A1S(this, 2132543081);
        this.A00 = (FbTextView) requireViewById(2131365308);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A26, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A01 = AbstractC00793on.A01(context, obtainStyledAttributes, 0);
        }
        String str = this.A01;
        if (str != null && !str.isEmpty()) {
            this.A00.setText(str);
            this.A00.setVisibility(0);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r301v0, types: [com.facebook.payments.ui.PaymentsSecureSpinnerWithMessageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r304v2, types: [android.widget.TextView] */
    public void A0F() {
        FbTextView fbTextView;
        int i;
        String str = this.A01;
        if (str == null || str.isEmpty()) {
            fbTextView = this.A00;
            i = 8;
        } else {
            ?? r304 = this.A00;
            r304.setText(str);
            i = 0;
            fbTextView = r304;
        }
        fbTextView.setVisibility(i);
        setVisibility(0);
    }
}
