package com.facebook.payments.p2m.attachreceipt.ui;

import X.11T;
import X.7zR;
import X.AbH;
import X.C09s;
import X.DKC;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.litho.LithoView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PhotoPermissionRequestView.class */
public final class PhotoPermissionRequestView extends CustomFrameLayout {
    public final LithoView A00;
    public final LithoView A01;
    public final BetterTextView A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoPermissionRequestView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoPermissionRequestView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.TextView, com.facebook.widget.text.BetterTextView] */
    public PhotoPermissionRequestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A0U(2132543105);
        this.A01 = (LithoView) C09s.A01(this, 2131366403);
        ?? A0g = DKC.A0g(this, 2131366409);
        this.A02 = A0g;
        if (A0g != 0) {
            AbH.A1M((TextView) A0g, 7zR.A0c(context));
        }
        this.A00 = (LithoView) C09s.A01(this, 2131366405);
    }

    public /* synthetic */ PhotoPermissionRequestView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
