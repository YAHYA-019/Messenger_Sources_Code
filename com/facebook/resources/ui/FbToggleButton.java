package com.facebook.resources.ui;

import X.C1oo;
import X.DKE;
import X.DKF;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: FbToggleButton.class */
public class FbToggleButton extends ToggleButton {
    public FbToggleButton(Context context) {
        super(context);
    }

    public FbToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public FbToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public FbToggleButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1M);
        DKE.A1E(context, obtainStyledAttributes, this, 5);
        DKE.A1G(context, obtainStyledAttributes, this, 3);
        DKF.A10(context, obtainStyledAttributes, this, 4);
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            setText(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setTextOff(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId3 != 0) {
            setTextOn(context.getText(resourceId3));
        }
        obtainStyledAttributes.recycle();
    }
}
