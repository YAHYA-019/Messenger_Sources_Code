package com.facebook.payments.p2m.attachreceipt.ui;

import X.11T;
import X.C09s;
import X.DKC;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PhotoPickerEmptyView.class */
public final class PhotoPickerEmptyView extends CustomFrameLayout {
    public final LithoView A00;
    public final BetterTextView A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoPickerEmptyView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoPickerEmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoPickerEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A0U(2132543103);
        this.A00 = (LithoView) C09s.A01(this, 2131363879);
        this.A01 = DKC.A0g(this, 2131363880);
    }

    public /* synthetic */ PhotoPickerEmptyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
