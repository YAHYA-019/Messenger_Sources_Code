package com.facebook.payments.auth.pin.newpinv2;

import X.06Z;
import X.1BK;
import X.1Bn;
import X.1iF;
import X.7zL;
import X.7zU;
import X.AbF;
import X.C06014fk;
import X.C06c;
import X.C15h;
import X.C3o5;
import X.DKG;
import X.DZu;
import X.Es4;
import X.FAC;
import X.FII;
import X.GGu;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.auth.pin.newpin.PaymentPinParams;

/* loaded from: PaymentPinV2Activity.class */
public class PaymentPinV2Activity extends FbFragmentActivity implements GGu {
    public PaymentPinParams A00;
    public boolean A01;
    public boolean A02;
    public DZu A03;
    public Integer A04;
    public final Es4 A05 = new Es4(this);

    public static Intent A12(Context context, PaymentPinParams paymentPinParams) {
        context.getClass();
        Intent A0D = C3o5.A0D(context, PaymentPinV2Activity.class);
        A0D.putExtra("payment_pin_params", paymentPinParams);
        return A0D;
    }

    public static void A15(PaymentPinParams paymentPinParams, PaymentPinV2Activity paymentPinV2Activity, String str) {
        if (paymentPinV2Activity.BDe().A0b(str) == null) {
            C06c A0D = 7zU.A0D(paymentPinV2Activity);
            Bundle A05 = 1BK.A05();
            A05.putParcelable("payment_pin_params", paymentPinParams);
            DKG.A1H(A05, A0D, new DZu(), str, 2131364227);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof DZu) {
            DZu dZu = (DZu) fragment;
            this.A03 = dZu;
            dZu.A08 = this.A05;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0G();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541482);
        if (bundle == null) {
            PaymentPinParams paymentPinParams = this.A00;
            String str = paymentPinParams.A0C;
            if ("CSC".equalsIgnoreCase(str) || "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(str)) {
                06Z BDe = BDe();
                if (BDe.A0b("PAYMENT_CVV_FRAGMENT_TAG") == null) {
                    FAC A0B = C06014fk.A0B();
                    Bundle bundle2 = this.A00.A03;
                    C15h c15h = A0B.A05.A00;
                    c15h.getClass();
                    Fragment fragment = (Fragment) c15h.get();
                    Bundle A05 = 1BK.A05();
                    if (bundle2 != null) {
                        A05.putBundle("CHILD_FRAGMENT_BUNDLE", bundle2);
                    }
                    A05.putString("CHILD_FRAGMENT_IDENTIFIER", "PIN_RESET_BY_CVV_PAYPAL");
                    fragment.setArguments(A05);
                    fragment.setTargetFragment(null, 10);
                    C06c A0G = 7zL.A0G(BDe);
                    A0G.A0Q(fragment, "PAYMENT_CVV_FRAGMENT_TAG", 2131364227);
                    A0G.A04();
                }
            } else {
                A15(paymentPinParams, this, "payment_pin_fragment");
            }
        } else {
            this.A02 = bundle.getBoolean("EXTRA_IS_PIN_LOCKED");
            this.A01 = bundle.getBoolean("SAVE_IS_BIOS_ASKED");
        }
        FII.A02(this, this.A00.A08.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A04 = (Integer) 1Bn.A0A(99962);
        this.A00 = (PaymentPinParams) getIntent().getParcelableExtra("payment_pin_params");
        Resources.Theme theme = getTheme();
        Integer num = this.A04;
        num.getClass();
        theme.applyStyle(num.intValue(), false);
    }

    @Override // X.GGu
    public boolean Bzb(Bundle bundle, int i, boolean z) {
        if (i != 10) {
            return false;
        }
        if (!z) {
            PaymentPinV2Activity paymentPinV2Activity = this.A05.A00;
            paymentPinV2Activity.setResult(0);
            paymentPinV2Activity.finish();
            return true;
        }
        bundle.getClass();
        Intent A05 = AbF.A05();
        A05.putExtras(bundle);
        this.A05.A00(-1, A05);
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A00.A08.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DZu dZu = this.A03;
        if (dZu != null) {
            dZu.Bkd();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putBoolean("SAVE_IS_BIOS_ASKED", this.A01);
            bundle.putBoolean("EXTRA_IS_PIN_LOCKED", this.A02);
        }
    }
}
