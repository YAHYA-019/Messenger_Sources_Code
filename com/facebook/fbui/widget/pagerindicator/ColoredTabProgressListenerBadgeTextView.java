package com.facebook.fbui.widget.pagerindicator;

import X.C1oo;
import X.GEf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.facebook.fbui.widget.text.BadgeTextView;

/* loaded from: ColoredTabProgressListenerBadgeTextView.class */
public class ColoredTabProgressListenerBadgeTextView extends BadgeTextView implements GEf {
    public int A00;
    public int A01;
    public float A02;

    public ColoredTabProgressListenerBadgeTextView(Context context) {
        this(context, null);
    }

    public ColoredTabProgressListenerBadgeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColoredTabProgressListenerBadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0P, i, 0);
        this.A01 = obtainStyledAttributes.getColor(1, -5066062);
        this.A00 = obtainStyledAttributes.getColor(0, -10972929);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GEf
    public void CPi(float f) {
        float f2 = (f * 20.0f) / 20.0f;
        if (this.A02 != f2) {
            int i = this.A01;
            int i2 = this.A00;
            setTextColor(((Color.alpha(i) + ((int) ((Color.alpha(i2) - r0) * f2))) << 24) | ((Color.red(i) + ((int) ((Color.red(i2) - r0) * f2))) << 16) | ((Color.green(i) + ((int) ((Color.green(i2) - r0) * f2))) << 8) | (Color.blue(i) + ((int) ((Color.blue(i2) - r0) * f2))));
            this.A02 = f2;
        }
    }
}
