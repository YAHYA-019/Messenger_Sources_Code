package com.facebook.payments.picker;

import X.1BK;
import X.1iF;
import X.2S0;
import X.7zO;
import X.7zU;
import X.C06c;
import X.C2048Da9;
import X.DKG;
import X.DKI;
import X.FII;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.picker.model.PickerScreenConfig;

/* loaded from: PickerScreenActivity.class */
public class PickerScreenActivity extends FbFragmentActivity {
    public FII A00;
    public PickerScreenConfig A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541946);
        PaymentsDecoratorParams paymentsDecoratorParams = this.A01.B2r().styleParams.paymentsDecoratorParams;
        FII.A03(this, paymentsDecoratorParams.paymentsTitleBarStyle, paymentsDecoratorParams.isFullScreenModal);
        if (bundle == null) {
            C06c A0D = 7zU.A0D(this);
            PickerScreenConfig pickerScreenConfig = this.A01;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_picker_screen_config", pickerScreenConfig);
            2S0 c2048Da9 = new C2048Da9();
            c2048Da9.setArguments(A05);
            A0D.A0Q(c2048Da9, "picker_screen_fragment_tag", 2131364228);
            A0D.A04();
        }
        FII.A02(this, this.A01.B2r().styleParams.paymentsDecoratorParams.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A00 = DKG.A0h(this);
        PickerScreenConfig pickerScreenConfig = (PickerScreenConfig) 7zO.A0H(this).getParcelable("extra_picker_screen_config");
        this.A01 = pickerScreenConfig;
        FII fii = this.A00;
        PaymentsDecoratorParams paymentsDecoratorParams = pickerScreenConfig.B2r().styleParams.paymentsDecoratorParams;
        fii.A05(this, paymentsDecoratorParams.paymentsTitleBarStyle, paymentsDecoratorParams.isFullScreenModal);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        PickerScreenConfig pickerScreenConfig = this.A01;
        if (pickerScreenConfig != null) {
            FII.A01(this, pickerScreenConfig.B2r().styleParams.paymentsDecoratorParams.paymentsDecoratorAnimation);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "picker_screen_fragment_tag");
        super.onBackPressed();
    }
}
