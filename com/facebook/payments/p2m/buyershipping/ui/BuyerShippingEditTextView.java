package com.facebook.payments.p2m.buyershipping.ui;

import X.11T;
import X.3Eh;
import X.7zO;
import X.DKC;
import X.DKF;
import X.DKG;
import X.Fcg;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.ui.PaymentFormEditTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: BuyerShippingEditTextView.class */
public final class BuyerShippingEditTextView extends PaymentFormEditTextView {
    public MigColorScheme A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyerShippingEditTextView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyerShippingEditTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerShippingEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A0l();
        A0q();
    }

    public /* synthetic */ BuyerShippingEditTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final MigColorScheme A00() {
        MigColorScheme migColorScheme = this.A00;
        if (migColorScheme == null) {
            migColorScheme = DKF.A0V(this);
        }
        this.A00 = migColorScheme;
        11T.A0I(migColorScheme, "null cannot be cast to non-null type com.facebook.mig.scheme.interfaces.MigColorScheme");
        return migColorScheme;
    }

    public final void A0q() {
        int i = 2132410547;
        if (A00().BDl() == A00().BKg()) {
            i = 2132410551;
        }
        setBackgroundResource(i);
    }

    public final void A0r() {
        int i = 2132410550;
        if (A00().BDl() == A00().BKg()) {
            i = 2132410554;
        }
        setBackgroundResource(i);
    }

    public final void A0s() {
        Drawable A04 = ((Fcg) DKC.A0y()).A04(getContext(), 3Eh.A4h);
        11T.A0A(A04);
        7zO.A17(PorterDuff.Mode.SRC_IN, A04, A00().Ahe());
        A0a(A04);
        A0i(true);
    }
}
