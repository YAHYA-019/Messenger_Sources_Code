package com.facebook.payments.checkout.activity;

import X.1BK;
import X.1iF;
import X.7zM;
import X.7zO;
import X.7zU;
import X.C06c;
import X.DKG;
import X.DKH;
import X.DKI;
import X.DZw;
import X.ELS;
import X.FII;
import X.Fsa;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.shipping.model.ShippingOption;
import com.facebook.payments.shipping.optionpicker.ShippingOptionPickerScreenConfig;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;

/* loaded from: TetraShippingOptionPickerActivity.class */
public class TetraShippingOptionPickerActivity extends FbFragmentActivity {
    public FII A00;
    public ShippingOption A01;
    public ShippingOptionPickerScreenConfig A02;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKH.A0K();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132543335);
        PaymentsTitleBarViewStub A0n = DKG.A0n(this);
        ViewGroup viewGroup = (ViewGroup) 7zM.A0F(this);
        Fsa fsa = new Fsa(this, 6);
        A0n.A01(viewGroup, ELS.A02, PaymentsTitleBarStyle.A05, fsa);
        A0n.A03(PaymentsTitleBarTitleStyle.A03, getResources().getString(2131965945), 0);
        A0n.A01.requireViewById(2131362066).setVisibility(8);
        this.A00.getClass();
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            ShippingOptionPickerScreenConfig shippingOptionPickerScreenConfig = this.A02;
            ShippingOption shippingOption = this.A01;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_shipping_params", shippingOptionPickerScreenConfig);
            A05.putParcelable("extra_shipping_selected_option", shippingOption);
            DZw dZw = new DZw();
            dZw.setArguments(A05);
            A0D.A0Q(dZw, "tetra_shipping_option_fragment_tag", 2131362482);
            A0D.A04();
        }
        FII.A02(this, PaymentsDecoratorAnimation.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A00 = DKG.A0h(this);
        if (bundle == null) {
            bundle = 7zO.A0H(this);
        }
        this.A02 = bundle.getParcelable("extra_shipping_common_params");
        this.A01 = (ShippingOption) bundle.getParcelable("extra_shipping_selected_option");
        FII fii = this.A00;
        fii.getClass();
        fii.A05(this, PaymentsTitleBarStyle.A05, true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, PaymentsDecoratorAnimation.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "tetra_shipping_option_fragment_tag");
        super.onBackPressed();
    }
}
