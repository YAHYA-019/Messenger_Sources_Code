package com.facebook.payments.ui;

import X.AbstractC00793on;
import X.C09s;
import X.C1oo;
import X.DKC;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: FloatingLabelTextView.class */
public class FloatingLabelTextView extends CustomLinearLayout {
    public BetterTextView A00;
    public BetterTextView A01;
    public ProgressBar A02;

    public FloatingLabelTextView(Context context) {
        super(context);
        A00(context, null);
    }

    public FloatingLabelTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public FloatingLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        A0D(2132542024);
        setOrientation(1);
        this.A00 = DKC.A0g(this, 2131364490);
        this.A01 = DKC.A0g(this, 2131367932);
        this.A02 = (ProgressBar) C09s.A01(this, 2131366701);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1Z);
            this.A01.setSingleLine(obtainStyledAttributes.getBoolean(0, false));
            CharSequence A01 = AbstractC00793on.A01(getContext(), obtainStyledAttributes, 1);
            if (A01 == null) {
                A01 = "";
            }
            this.A00.setVisibility(0);
            this.A00.setText(A01);
            this.A00.setTextSize(0, obtainStyledAttributes.getDimension(2, getResources().getDimension(2132279337)));
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(int i) {
        this.A01.setTextColor(i);
    }
}
