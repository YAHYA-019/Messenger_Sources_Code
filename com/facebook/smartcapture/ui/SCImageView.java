package com.facebook.smartcapture.ui;

import X.11T;
import X.C1oo;
import X.C53e;
import X.C53f;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: SCImageView.class */
public final class SCImageView extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context) {
        super(context);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(context, attributeSet, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        11T.A0F(context, 1);
        A00(context, attributeSet, i);
    }

    private final void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2O, i, 0);
            11T.A0A(obtainStyledAttributes);
            try {
                setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (i != 0) {
            try {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                C53e c53e = new C53e();
                ((C53f) c53e).A00 = resources.getDrawable(i, theme);
                setImageDrawable(c53e);
            } catch (Exception unused) {
                super.setImageResource(i);
            }
        }
    }
}
