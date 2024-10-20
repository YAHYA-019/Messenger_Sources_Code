package com.facebook.payments.p2m.buyershipping.ui;

import X.11T;
import X.1BK;
import X.3Eh;
import X.7zO;
import X.AnonymousClass001;
import X.DKC;
import X.DKF;
import X.DKG;
import X.FXq;
import X.Fcg;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.ui.PaymentFormEditTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: BuyerShippingSelectorView.class */
public final class BuyerShippingSelectorView extends PaymentFormEditTextView {
    public String A00;
    public boolean A01;
    public String[] A02;
    public MigColorScheme A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyerShippingSelectorView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyerShippingSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerShippingSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        String str = this.A00;
        if (str == null) {
            throw 1BK.A0h();
        }
        this.A00 = str;
        A0l();
        this.A01 = false;
        setEnabled(false);
        A01();
    }

    public /* synthetic */ BuyerShippingSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final MigColorScheme A00(BuyerShippingSelectorView buyerShippingSelectorView) {
        MigColorScheme migColorScheme = buyerShippingSelectorView.A03;
        if (migColorScheme == null) {
            migColorScheme = DKF.A0V(buyerShippingSelectorView);
        }
        buyerShippingSelectorView.A03 = migColorScheme;
        11T.A0I(migColorScheme, "null cannot be cast to non-null type com.facebook.mig.scheme.interfaces.MigColorScheme");
        return migColorScheme;
    }

    private final void A01() {
        int i = 2132410548;
        if (A00(this).BDl() == A00(this).BKg()) {
            i = 2132410552;
        }
        setBackgroundResource(i);
    }

    public static final void A02(BuyerShippingSelectorView buyerShippingSelectorView) {
        Drawable A04 = ((Fcg) DKC.A0y()).A04(buyerShippingSelectorView.getContext(), 3Eh.AJ6);
        11T.A0A(A04);
        7zO.A17(PorterDuff.Mode.SRC_IN, A04, A00(buyerShippingSelectorView).B9O());
        buyerShippingSelectorView.A0a(A04);
        buyerShippingSelectorView.A0i(true);
    }

    public static final void A03(BuyerShippingSelectorView buyerShippingSelectorView) {
        String[] strArr = buyerShippingSelectorView.A02;
        if (strArr == null) {
            throw AnonymousClass001.A0N("Dialog cannot be enabled if mOptions is null");
        }
        int length = strArr.length;
        if (!(!AnonymousClass001.A1O(length))) {
            throw AnonymousClass001.A0N("Selector view does not have the requisite information to be enabled");
        }
        String str = buyerShippingSelectorView.A00;
        if (str == null || str.length() == 0) {
            throw AnonymousClass001.A0N("Selector view does not have the requisite information to be enabled");
        }
        if (length != 1) {
            buyerShippingSelectorView.setOnClickListener(FXq.A00(buyerShippingSelectorView, 65));
            return;
        }
        String str2 = strArr[0];
        if (str2 != null) {
            buyerShippingSelectorView.A01 = false;
            buyerShippingSelectorView.setEnabled(false);
            buyerShippingSelectorView.A0i(false);
            buyerShippingSelectorView.A01();
            buyerShippingSelectorView.A0o(str2);
        }
    }

    public final void A0q() {
        this.A01 = false;
        setEnabled(false);
        A0i(false);
        A01();
        A0o("");
    }

    public final void A0r() {
        int i = 2132410547;
        if (A00(this).BDl() == A00(this).BKg()) {
            i = 2132410551;
        }
        setBackgroundResource(i);
    }
}
