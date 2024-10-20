package com.facebook.resources.ui;

import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: FbFrameLayout.class */
public class FbFrameLayout extends FrameLayout {
    public FbFrameLayout(Context context) {
        super(context);
    }

    public FbFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public FbFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public FbFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01(context, attributeSet);
    }

    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A18);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        obtainStyledAttributes.recycle();
    }
}
