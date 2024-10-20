package com.facebook.widget.text;

import X.0S2;
import X.2KU;
import X.6PA;
import X.6PB;
import X.C1oo;
import X.FXA;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbButton;

/* loaded from: BetterButton.class */
public class BetterButton extends FbButton {
    public BetterButton(Context context) {
        this(context, null);
    }

    public BetterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public BetterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0A);
        int i = obtainStyledAttributes.getInt(1, -1);
        int i2 = obtainStyledAttributes.getInt(2, -1);
        2KU.A02(getTypeface(), this, i == -1 ? 0S2.A01 : 6PA.A00[i], i2 == -1 ? 0S2.A0Y : 6PB.A00[i2]);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            setTransformationMethod(new FXA(context.getResources()));
        }
        obtainStyledAttributes.recycle();
    }
}
