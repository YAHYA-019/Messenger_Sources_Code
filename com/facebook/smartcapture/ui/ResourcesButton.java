package com.facebook.smartcapture.ui;

import X.11T;
import X.C1oo;
import X.DKE;
import X.DKF;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

/* loaded from: ResourcesButton.class */
public final class ResourcesButton extends Button {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesButton(Context context) {
        super(context);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        11T.A0F(context, 1);
        A00(context, attributeSet);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2J);
        11T.A0A(obtainStyledAttributes);
        DKE.A1E(context, obtainStyledAttributes, this, 3);
        DKE.A1G(context, obtainStyledAttributes, this, 1);
        DKF.A10(context, obtainStyledAttributes, this, 2);
        DKE.A1F(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
    }
}
