package com.facebook.payments.checkout.activity;

import X.1BK;
import X.1iF;
import X.2S0;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zU;
import X.C00i;
import X.C06c;
import X.DKC;
import X.DKD;
import X.DKG;
import X.DKH;
import X.DZx;
import X.ELS;
import X.FII;
import X.FIR;
import X.Fsa;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.shipping.model.ShippingCommonParams;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;

/* loaded from: ShippingPickerActivity.class */
public class ShippingPickerActivity extends FbFragmentActivity {
    public FII A00;
    public ShippingCommonParams A01;
    public final C00i A02 = 7zL.A0R(this, 442);

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
        Fsa fsa = new Fsa(this, 5);
        A0n.A01(viewGroup, ELS.A02, PaymentsTitleBarStyle.A05, fsa);
        A0n.A03(PaymentsTitleBarTitleStyle.A03, getResources().getString(2131952079), 0);
        A0n.A01.requireViewById(2131362066).setVisibility(8);
        this.A00.getClass();
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            ShippingCommonParams shippingCommonParams = this.A01;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_shipping_params", shippingCommonParams);
            DZx dZx = new DZx();
            dZx.setArguments(A05);
            A0D.A0Q(dZx, "shipping_picker_screen_fragment_tag", 2131362482);
            A0D.A04();
        }
        FII.A02(this, PaymentsDecoratorAnimation.A03);
        if (getWindow() != null) {
            FIR.A01(this, DKD.A0C(this), DKC.A0V(this.A02));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A00 = DKG.A0h(this);
        this.A01 = 7zO.A0H(this).getParcelable("extra_shipping_common_params");
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
        2S0 A0b = BDe().A0b("shipping_picker_screen_fragment_tag");
        if (A0b == null || !(A0b instanceof 2S0) || A0b.Bkd()) {
            super.onBackPressed();
        }
    }
}
