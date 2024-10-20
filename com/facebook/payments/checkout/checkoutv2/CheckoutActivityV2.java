package com.facebook.payments.checkout.checkoutv2;

import X.1BK;
import X.1BQ;
import X.1Bi;
import X.1iF;
import X.2S0;
import X.7zU;
import X.C00i;
import X.C06c;
import X.DKG;
import X.DKH;
import X.DZe;
import X.EXE;
import X.Evf;
import X.Ew3;
import X.FI2;
import X.FII;
import X.FIQ;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.payments.checkout.FbPaymentsFragmentActivity;
import com.facebook.payments.checkout.model.CheckoutCommonParams;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;

/* loaded from: CheckoutActivityV2.class */
public class CheckoutActivityV2 extends FbPaymentsFragmentActivity {
    public CheckoutCommonParams A00;
    public FI2 A01;
    public C00i A02;
    public Evf A03;
    public FII A04;
    public final Ew3 A08 = (Ew3) 1Bi.A03(99106);
    public final FIQ A06 = DKG.A0i();
    public final C00i A07 = 1BQ.A02(99120);
    public final C00i A05 = 1BQ.A01();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKH.A0K();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        Evf evf = this.A03;
        evf.getClass();
        evf.A00();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541946);
        CheckoutCommonParams checkoutCommonParams = this.A00;
        this.A01.getClass();
        CheckoutCommonParamsCore checkoutCommonParamsCore = checkoutCommonParams.A02;
        boolean z = !EXE.A00(checkoutCommonParamsCore.A0M);
        this.A04.getClass();
        FII.A03(this, checkoutCommonParamsCore.B28().paymentsTitleBarStyle, z);
        if (bundle == null && BDe().A0b("checkout_fragment") == null) {
            CheckoutCommonParams checkoutCommonParams2 = this.A00;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("checkout_params", checkoutCommonParams2);
            Fragment dZe = new DZe();
            dZe.setArguments(A05);
            C06c A0D = 7zU.A0D(this);
            A0D.A0Q(dZe, "checkout_fragment", 2131364228);
            A0D.A04();
        }
        FII.A02(this, this.A00.A02.B28().paymentsDecoratorAnimation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01bf, code lost:
    
        if (r310 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f2  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A31(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.checkout.checkoutv2.CheckoutActivityV2.A31(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        CheckoutCommonParams checkoutCommonParams = this.A00;
        FII.A01(this, checkoutCommonParams != null ? checkoutCommonParams.A02.B28().paymentsDecoratorAnimation : PaymentsDecoratorAnimation.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        2S0 A0b = BDe().A0b("checkout_fragment");
        if (A0b == null || !(A0b instanceof 2S0) || A0b.Bkd()) {
            super.onBackPressed();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("checkout_params", this.A00);
        super.onSaveInstanceState(bundle);
    }
}
