package com.facebook.common.pillstub;

import X.1Bi;
import X.1FP;
import X.C1oo;
import X.C66h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: PillViewStub.class */
public class PillViewStub extends View {
    public static final C66h A01 = C66h.A03(40.0d, 7.0d);
    public 1FP A00;

    public PillViewStub(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00(attributeSet, 0, 0);
    }

    public PillViewStub(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet, i, 0);
    }

    public PillViewStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet, i, i2);
    }

    private void A00(AttributeSet attributeSet, int i, int i2) {
        this.A00 = (1FP) 1Bi.A03(67765);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1oo.A28, i, i2);
            obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
        setTag(2131364167, true);
    }
}
