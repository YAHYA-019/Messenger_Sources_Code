package com.facebookpay.widget.accessibility;

import X.11T;
import X.1BK;
import X.C0Ad;
import X.DKF;
import X.DKG;
import X.DRj;
import X.GK9;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AccessibleTextView.class */
public final class AccessibleTextView extends TextView implements GK9 {
    public final DRj A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        DRj dRj = new DRj(this);
        this.A00 = dRj;
        DRj.A04 = -1;
        dRj.A00 = false;
        C0Ad.A0B(this, dRj);
    }

    public /* synthetic */ AccessibleTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // android.widget.TextView, X.GK9
    public float getTextSize() {
        Layout layout = getLayout();
        if (layout == null) {
            return 0.0f;
        }
        float textSize = layout.getPaint().getTextSize();
        if (textSize > 0.0f) {
            return textSize;
        }
        throw 1BK.A0g();
    }
}
