package com.facebook.resources.ui;

import X.C1oo;
import X.DKE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: FbProgressBar.class */
public class FbProgressBar extends ProgressBar {
    public FbProgressBar(Context context) {
        super(context);
    }

    public FbProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1C);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }

    public FbProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1C);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }

    public FbProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1C);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }
}
