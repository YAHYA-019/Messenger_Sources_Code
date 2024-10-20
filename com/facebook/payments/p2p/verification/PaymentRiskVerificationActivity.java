package com.facebook.payments.p2p.verification;

import X.1BK;
import X.6Gx;
import X.7zU;
import X.AbH;
import X.C06c;
import X.C15h;
import X.C3o5;
import X.DKD;
import X.DKH;
import X.DZG;
import X.FHR;
import X.FXq;
import X.Fch;
import X.FmR;
import X.G7K;
import X.GD5;
import X.GFW;
import X.QqG;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.dialog.PaymentsConfirmDialogFragment;

/* loaded from: PaymentRiskVerificationActivity.class */
public class PaymentRiskVerificationActivity extends FbFragmentActivity implements GD5 {
    public Toolbar A00;
    public DZG A01;
    public String A02;
    public String A03;
    public C15h A04;
    public final Fch A05 = DKD.A0b();
    public final 6Gx A07 = DKD.A0Z();
    public final GFW A06 = new FmR(this, 5);

    public static Intent A12(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        Intent A0D = C3o5.A0D(context, PaymentRiskVerificationActivity.class);
        A0D.putExtra("transaction_id", str);
        A0D.putExtra("recipient_id", str2);
        return A0D;
    }

    public static void A15(PaymentRiskVerificationActivity paymentRiskVerificationActivity) {
        QqG qqG;
        DZG dzg = paymentRiskVerificationActivity.A01;
        if (dzg == null || (qqG = dzg.A00) == null || qqG.isTerminal || paymentRiskVerificationActivity.A04.get() == null || AbH.A1E(paymentRiskVerificationActivity.A04).equals(paymentRiskVerificationActivity.A02)) {
            paymentRiskVerificationActivity.finish();
        } else {
            PaymentsConfirmDialogFragment.A05(paymentRiskVerificationActivity.getString(2131964604), paymentRiskVerificationActivity.getString(2131964601), paymentRiskVerificationActivity.getString(2131964602), paymentRiskVerificationActivity.getString(2131964603)).A0m(paymentRiskVerificationActivity.BDe(), "risk_flow_exit_confirm_dialog_fragment_tag");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof PaymentsConfirmDialogFragment) {
            ((PaymentsConfirmDialogFragment) fragment).A00 = this.A06;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Toolbar A0E = DKH.A0E(this, 2132541548);
        this.A00 = A0E;
        A0E.A0M(2131964598);
        FXq.A02(A0E, this, 80);
        this.A03 = getIntent().getStringExtra("transaction_id");
        this.A02 = getIntent().getStringExtra("recipient_id");
        DZG A0b = BDe().A0b("payment_risk_verification_controller_fragment_tag");
        this.A01 = A0b;
        if (A0b == null) {
            String str = this.A03;
            String str2 = this.A02;
            DZG dzg = new DZG();
            Bundle A05 = 1BK.A05();
            A05.putString("transaction_id", str);
            A05.putString("recipient_id", str2);
            dzg.setArguments(A05);
            this.A01 = dzg;
            C06c A0D = 7zU.A0D(this);
            A0D.A0P(this.A01, "payment_risk_verification_controller_fragment_tag", 2131364227);
            A0D.A04();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A04 = G7K.A01(this, 108);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String obj;
        if (this.A01 != null) {
            6Gx r0 = this.A07;
            FHR A01 = FHR.A01("back_click");
            QqG qqG = this.A01.A00;
            if (qqG != null && (obj = qqG.toString()) != null) {
                A01.A00.A0D("risk_step", obj);
            }
            A01.A09(this.A03);
            r0.A05(A01);
        }
        A15(this);
    }
}
