package com.facebook.resources.ui;

import X.C1oo;
import X.DKE;
import X.DKF;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

/* loaded from: FbButton.class */
public class FbButton extends Button {
    public FbButton(Context context) {
        super(context);
    }

    public FbButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public FbButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public FbButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A12);
        DKE.A1E(context, obtainStyledAttributes, this, 3);
        DKE.A1G(context, obtainStyledAttributes, this, 1);
        DKF.A10(context, obtainStyledAttributes, this, 2);
        DKE.A1F(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }
}
