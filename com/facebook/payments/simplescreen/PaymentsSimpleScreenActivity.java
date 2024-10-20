package com.facebook.payments.simplescreen;

import X.1BK;
import X.1iF;
import X.7zO;
import X.7zU;
import X.C06c;
import X.DKG;
import X.DKI;
import X.FII;
import X.Q4h;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.simplescreen.model.PaymentsSimpleScreenParams;

/* loaded from: PaymentsSimpleScreenActivity.class */
public class PaymentsSimpleScreenActivity extends FbFragmentActivity {
    public FII A00;
    public PaymentsSimpleScreenParams A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541482);
        if (BDe().A0b("fragment_tag") == null) {
            C06c A0D = 7zU.A0D(this);
            PaymentsSimpleScreenParams paymentsSimpleScreenParams = this.A01;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_screen_params", paymentsSimpleScreenParams);
            DKG.A1H(A05, A0D, new Q4h(), "fragment_tag", 2131364227);
        }
        FII.A02(this, this.A01.A00().paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A00 = DKG.A0h(this);
        this.A01 = (PaymentsSimpleScreenParams) 7zO.A0H(this).getParcelable("extra_screen_params");
        FII fii = this.A00;
        fii.getClass();
        FII.A00(this, fii, this.A01.A00());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A01.A00().paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DKI.A0T(BDe(), "fragment_tag");
        super.onBackPressed();
    }
}
