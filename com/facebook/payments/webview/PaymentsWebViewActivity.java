package com.facebook.payments.webview;

import X.1BK;
import X.1iF;
import X.7zU;
import X.C06c;
import X.DKG;
import X.FII;
import X.Fov;
import X.Q4j;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.webview.model.PaymentsWebViewParams;

/* loaded from: PaymentsWebViewActivity.class */
public class PaymentsWebViewActivity extends FbFragmentActivity {
    public FII A00;
    public Q4j A01;

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof Q4j) {
            ((Q4j) fragment).A04 = new Fov(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132543085);
        PaymentsWebViewParams paymentsWebViewParams = (PaymentsWebViewParams) getIntent().getParcelableExtra("payments_webview_params");
        if (paymentsWebViewParams.A03) {
            setRequestedOrientation(1);
        }
        Q4j A0b = BDe().A0b("payments_webview_tag");
        this.A01 = A0b;
        if (A0b == null) {
            Bundle A05 = 1BK.A05();
            A05.putParcelable("payments_webview_params", paymentsWebViewParams);
            Q4j q4j = new Q4j();
            q4j.setArguments(A05);
            this.A01 = q4j;
            C06c A0D = 7zU.A0D(this);
            A0D.A0Q(this.A01, "payments_webview_tag", 2131366386);
            A0D.A04();
        }
        FII.A02(this, PaymentsDecoratorAnimation.A01);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        FII A0h = DKG.A0h(this);
        this.A00 = A0h;
        A0h.getClass();
        A0h.A05(this, PaymentsTitleBarStyle.A05, true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, PaymentsDecoratorAnimation.A01);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Q4j q4j = this.A01;
        if (q4j == null || !q4j.Bkd()) {
            super.onBackPressed();
            setResult(0);
            finish();
        }
    }
}
