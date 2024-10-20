package com.facebook.resources.ui;

import X.C1oo;
import X.DKE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: FbView.class */
public class FbView extends View {
    public FbView(Context context) {
        super(context);
    }

    public FbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1N);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }

    public FbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1N);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }

    public FbView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1N);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }
}
