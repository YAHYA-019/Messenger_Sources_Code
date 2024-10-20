package com.facebook.payments.cart;

import X.1BK;
import X.1Bi;
import X.1iF;
import X.7zO;
import X.7zU;
import X.C06c;
import X.DKG;
import X.DZc;
import X.DaA;
import X.Eel;
import X.Es5;
import X.FII;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.cart.model.PaymentsCartParams;

/* loaded from: PaymentsCartActivity.class */
public class PaymentsCartActivity extends FbFragmentActivity {
    public DaA A00;
    public DZc A01;
    public PaymentsCartParams A02;
    public FII A03;
    public final Eel A04 = new Eel(this);
    public final Es5 A05 = (Es5) 1Bi.A03(99074);

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        if (fragment instanceof DZc) {
            ((DZc) fragment).A03 = this.A04;
        } else if (fragment instanceof DaA) {
            ((DaA) fragment).A05 = this.A04;
        }
        super.A2b(fragment);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541946);
        if (this.A00 == null) {
            PaymentsCartParams paymentsCartParams = this.A02;
            DaA daA = new DaA();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("payments_cart_params", paymentsCartParams);
            daA.setArguments(A05);
            this.A00 = daA;
            C06c A0D = 7zU.A0D(this);
            A0D.A0M(this.A00, 2131364228);
            A0D.A04();
        }
        FII.A02(this, this.A02.A00.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A03 = DKG.A0h(this);
        PaymentsCartParams paymentsCartParams = (PaymentsCartParams) 7zO.A0H(this).getParcelable("payments_cart_params");
        this.A02 = paymentsCartParams;
        FII.A00(this, this.A03, paymentsCartParams.A00);
        if (bundle == null) {
            this.A05.A00.clear();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        PaymentsCartParams paymentsCartParams = this.A02;
        if (paymentsCartParams != null) {
            FII.A01(this, paymentsCartParams.A00.paymentsDecoratorAnimation);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.A00.isVisible()) {
            this.A00.Bkd();
            DaA.A04(this.A00);
        } else if (this.A01.isVisible()) {
            this.A01.Bkd();
        }
        super.onBackPressed();
    }
}
