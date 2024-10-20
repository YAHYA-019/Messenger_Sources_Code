package com.facebook.payments.ui.titlebar;

import X.1BY;
import X.1Bn;
import X.1Hv;
import X.7zL;
import X.AbL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00i;
import X.C1F6;
import X.EgE;
import X.Foh;
import X.GGc;
import X.GL6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.inject.FbInjector;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;

/* loaded from: PaymentsTitleBarViewStub.class */
public final class PaymentsTitleBarViewStub extends View {
    public SearchView A00;
    public Toolbar A01;
    public C00i A02;
    public Foh A03;
    public EgE A04;
    public GGc A05;
    public GL6 A06;

    public PaymentsTitleBarViewStub(Context context) {
        super(context);
        A00();
    }

    public PaymentsTitleBarViewStub(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PaymentsTitleBarViewStub(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public PaymentsTitleBarViewStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A02 = 7zL.A0R(context, 442);
        this.A04 = (EgE) 1Hv.A02(context, 99200);
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 713);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Foh foh = new Foh(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = foh;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(android.view.ViewGroup r302, X.ELS r303, com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle r304, X.GGc r305) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub.A01(android.view.ViewGroup, X.ELS, com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle, X.GGc):void");
    }

    public void A02(PaymentsTitleBarStyle paymentsTitleBarStyle, String str) {
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle;
        Foh foh = this.A03;
        int ordinal = paymentsTitleBarStyle.ordinal();
        if (ordinal == 0) {
            paymentsTitleBarTitleStyle = PaymentsTitleBarTitleStyle.A04;
        } else {
            if (ordinal != 1) {
                throw AnonymousClass002.A0C(paymentsTitleBarStyle, "Invalid titleBarStyle provided: ", AnonymousClass001.A0k());
            }
            paymentsTitleBarTitleStyle = PaymentsTitleBarTitleStyle.A03;
        }
        foh.A00(null, paymentsTitleBarTitleStyle, str, 0);
    }

    public void A03(PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle, String str, int i) {
        this.A03.A00(null, paymentsTitleBarTitleStyle, str, i);
    }
}
