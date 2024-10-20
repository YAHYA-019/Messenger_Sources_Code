package com.facebook.payments.auth.settings;

import X.1iF;
import X.4YU;
import X.7zL;
import X.C00i;
import X.DKD;
import X.DKG;
import X.Ex8;
import X.FI2;
import X.FII;
import X.Fsa;
import X.GL6;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;

/* loaded from: PaymentPinSettingsActivity.class */
public class PaymentPinSettingsActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public PaymentPinSettingsParams A05;
    public FI2 A06;
    public FII A07;

    public static void A12(PaymentPinSettingsActivity paymentPinSettingsActivity) {
        PaymentsTitleBarViewStub paymentsTitleBarViewStub = (PaymentsTitleBarViewStub) paymentPinSettingsActivity.A2e().B0T(2131368093);
        if (paymentsTitleBarViewStub != null) {
            Fsa.A00((ViewGroup) paymentPinSettingsActivity.findViewById(2131362164), paymentPinSettingsActivity.A05.A01, paymentsTitleBarViewStub, paymentPinSettingsActivity, 1);
            GL6 gl6 = paymentsTitleBarViewStub.A06;
            int i = 2131963100;
            if (((Ex8) 4YU.A0p(paymentPinSettingsActivity.A02)).A01()) {
                i = 2131963101;
            }
            gl6.CvU(i);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0G();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c6, code lost:
    
        if (((X.F80) X.4YU.A0p(r301.A01)).A01() != false) goto L14;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.auth.settings.PaymentPinSettingsActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A07 = DKG.A0h(this);
        this.A06 = DKD.A0X();
        this.A03 = 7zL.A0R(this, 99313);
        this.A04 = 7zL.A0R(this, 99353);
        this.A01 = 7zL.A0R(this, 99396);
        this.A02 = 7zL.A0R(this, 99351);
        this.A05 = (PaymentPinSettingsParams) getIntent().getParcelableExtra("payment_pin_settings_params");
        FII fii = this.A07;
        fii.getClass();
        FII.A00(this, fii, this.A05.A01);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A05.A01.paymentsDecoratorAnimation);
    }
}
