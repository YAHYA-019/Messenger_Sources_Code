package com.facebook.messaging.keyboard;

import X.2OB;
import X.AbstractC00793on;
import X.C09s;
import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.messaging.permissions.PermissionRequestIconView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: PermissionRequestKeyboardView.class */
public class PermissionRequestKeyboardView extends CustomFrameLayout {
    public PermissionRequestIconView A00;

    public PermissionRequestKeyboardView(Context context) {
        super(context);
        A00(context, null);
    }

    public PermissionRequestKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public PermissionRequestKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        A0U(2132541743);
        this.A00 = (PermissionRequestIconView) C09s.A01(this, 2131366408);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A27);
        this.A00.A0V(obtainStyledAttributes.getResourceId(0, -1));
        CharSequence A01 = AbstractC00793on.A01(getContext(), obtainStyledAttributes, 2);
        if (A01 == null) {
            A01 = "";
        }
        2OB r0 = this.A00.A02;
        if (r0 != null) {
            r0.setText(A01);
        }
        obtainStyledAttributes.recycle();
    }
}
