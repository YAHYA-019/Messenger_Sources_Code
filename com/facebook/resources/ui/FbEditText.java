package com.facebook.resources.ui;

import X.1Bi;
import X.6P9;
import X.C03903zR;
import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;

/* loaded from: FbEditText.class */
public class FbEditText extends 6P9 {
    public int A00;
    public int A01;
    public C03903zR A02;

    public FbEditText(Context context) {
        super(context);
        this.A01 = 0;
        this.A00 = 0;
    }

    public FbEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        6P9.A05(context, attributeSet, this);
        this.A01 = 0;
        this.A00 = 0;
        A04(context, attributeSet);
    }

    public FbEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        6P9.A05(context, attributeSet, this);
        this.A01 = 0;
        this.A00 = 0;
        A04(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A04(Context context, AttributeSet attributeSet) {
        C03903zR c03903zR = (C03903zR) 1Bi.A03(32845);
        this.A02 = c03903zR;
        c03903zR.getClass();
        addTextChangedListener(c03903zR);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A17);
        this.A01 = obtainStyledAttributes.getColor(1, 0);
        this.A00 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.onLayout(z, i, i2, i3, i4);
        if (!z || this.A01 == 0 || this.A00 == 0) {
            return;
        }
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.A01, this.A00, Shader.TileMode.CLAMP));
    }
}
