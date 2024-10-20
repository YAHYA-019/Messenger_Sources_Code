package com.facebook.messaging.permissions;

import X.11T;
import X.1Bi;
import X.1Rv;
import X.AbG;
import X.AbstractC00793on;
import X.C09s;
import X.C1oo;
import X.DKF;
import X.DKG;
import X.FXr;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.widget.CustomLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PermissionRequestView.class */
public final class PermissionRequestView extends CustomLinearLayout {
    public TextView A00;
    public 1Rv A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PermissionRequestView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PermissionRequestView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A01 = (1Rv) 1Bi.A03(67262);
        A0D(2132543091);
        this.A00 = AbG.A09(this, 2131366406);
        FXr.A03(C09s.A01(this, 2131366404), this, ActionId.DATA_LOAD_START);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1oo.A27);
        11T.A0A(obtainStyledAttributes);
        String A01 = AbstractC00793on.A01(context2, obtainStyledAttributes, 2);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(A01);
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ PermissionRequestView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
