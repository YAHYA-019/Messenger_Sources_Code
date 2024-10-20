package com.facebook.payments.p2p.paypal;

import X.1BK;
import X.33A;
import X.7zO;
import X.7zU;
import X.C06c;
import X.C2046Da7;
import X.DKG;
import X.FII;
import X.Fn2;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;

/* loaded from: P2pPaypalFundingOptionsActivity.class */
public class P2pPaypalFundingOptionsActivity extends FbFragmentActivity {
    public FII A00;
    public P2pPaypalFundingOptionsParams A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof C2046Da7) {
            ((C2046Da7) fragment).A03 = new Fn2(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541946);
        this.A00.getClass();
        PaymentsDecoratorParams A00 = this.A01.A00();
        FII.A03(this, A00.paymentsTitleBarStyle, A00.isFullScreenModal);
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            P2pPaypalFundingOptionsParams p2pPaypalFundingOptionsParams = this.A01;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_paypal_funding_options_param", p2pPaypalFundingOptionsParams);
            33A c2046Da7 = new C2046Da7();
            c2046Da7.setArguments(A05);
            A0D.A0Q(c2046Da7, "paypal_funding_options_fragment_tag", 2131364228);
            A0D.A04();
        }
        FII.A02(this, this.A01.A00().paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A00 = DKG.A0h(this);
        Bundle A0H = 7zO.A0H(this);
        A0H.getClass();
        Parcelable parcelable = A0H.getParcelable("extra_paypal_funding_options_param");
        parcelable.getClass();
        this.A01 = (P2pPaypalFundingOptionsParams) parcelable;
        FII fii = this.A00;
        fii.getClass();
        PaymentsDecoratorParams A00 = this.A01.A00();
        fii.A05(this, A00.paymentsTitleBarStyle, A00.isFullScreenModal);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A01.A00().paymentsDecoratorAnimation);
    }
}
