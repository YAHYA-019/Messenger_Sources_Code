package com.facebook.smartcapture.ui;

import X.11T;
import X.C1oo;
import X.DKE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: ResourcesProgressBar.class */
public final class ResourcesProgressBar extends ProgressBar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesProgressBar(Context context) {
        super(context);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2K);
        11T.A0A(obtainStyledAttributes);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2K);
        11T.A0A(obtainStyledAttributes);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        11T.A0F(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2K);
        11T.A0A(obtainStyledAttributes);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }
}
