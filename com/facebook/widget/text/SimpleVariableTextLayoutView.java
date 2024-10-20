package com.facebook.widget.text;

import X.AbstractC00793on;
import X.C1oo;
import X.DP1;
import X.FsR;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: SimpleVariableTextLayoutView.class */
public class SimpleVariableTextLayoutView extends DP1 {
    public final FsR A00;

    public SimpleVariableTextLayoutView(Context context) {
        this(context, null, 0);
    }

    public SimpleVariableTextLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.FsR, java.lang.Object] */
    public SimpleVariableTextLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ?? obj = new Object();
        this.A00 = obj;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2T);
        String A01 = AbstractC00793on.A01(context, obtainStyledAttributes, 1);
        A07(A01 == null ? "" : A01);
        ((FsR) obj).A00 = obtainStyledAttributes.getBoolean(0, false) ? null : TextUtils.TruncateAt.END;
        obtainStyledAttributes.recycle();
    }

    public void A08(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        A07(charSequence);
    }
}
