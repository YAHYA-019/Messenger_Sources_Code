package com.facebook.payments.checkout.activity;

import X.1BK;
import X.1iF;
import X.7zU;
import X.C06c;
import X.DKG;
import X.DKH;
import X.DKI;
import X.FII;
import X.Flk;
import X.GKM;
import X.Q4n;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.checkout.model.PaymentMethodPickerParams;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;

/* loaded from: TetraPaymentMethodPickerActivity.class */
public class TetraPaymentMethodPickerActivity extends FbFragmentActivity {
    public PaymentMethodPickerParams A00;
    public FII A01;

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof GKM) {
            ((GKM) fragment).CsS(new Flk(this));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKH.A0K();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132543467);
        this.A01.getClass();
        FII.A03(this, PaymentsTitleBarStyle.A05, false);
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            PaymentMethodPickerParams paymentMethodPickerParams = this.A00;
            Q4n q4n = new Q4n();
            Bundle A05 = 1BK.A05();
            A05.putParcelable("payment_method_picker_screen_param", paymentMethodPickerParams);
            q4n.setArguments(A05);
            A0D.A0Q(q4n, "payment_method_picker_fragment_tag", 2131364228);
            A0D.A04();
        }
        getWindow().setSoftInputMode(3);
        FII.A02(this, PaymentsDecoratorAnimation.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A01 = DKG.A0h(this);
        this.A00 = (PaymentMethodPickerParams) getIntent().getParcelableExtra("payment_method_picker_screen_params");
        FII fii = this.A01;
        fii.getClass();
        fii.A05(this, PaymentsTitleBarStyle.A05, false);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, PaymentsDecoratorAnimation.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "payment_method_picker_fragment_tag");
        super.onBackPressed();
    }
}
