package com.facebook.payments.receipt;

import X.1BJ;
import X.1BK;
import X.1iF;
import X.2S0;
import X.7zO;
import X.7zU;
import X.AbF;
import X.AbL;
import X.C00i;
import X.C06c;
import X.C3o5;
import X.DKE;
import X.DKG;
import X.DZj;
import X.FII;
import X.FcU;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.receipt.model.ReceiptCommonParams;
import com.facebook.payments.receipt.model.ReceiptComponentControllerParams;
import java.util.List;

/* loaded from: PaymentsReceiptActivity.class */
public class PaymentsReceiptActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public FII A01;
    public PaymentsLoggingSessionData A02;
    public ReceiptCommonParams A03;
    public final C00i A04 = AbF.A0Q(this, 82272);

    public static Intent A12(Context context, ViewerContext viewerContext, ReceiptCommonParams receiptCommonParams) {
        Intent A0D = C3o5.A0D(context, PaymentsReceiptActivity.class);
        A0D.putExtra(1BJ.A00(13), viewerContext);
        A0D.putExtra("extra_receipt_params", receiptCommonParams);
        if (!(context instanceof Activity)) {
            A0D.addFlags(268435456);
        }
        return A0D;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0I();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = AbL.A08(this);
        setTitle(getResources().getString(2131964200));
        setContentView(2132541946);
        if (BDe().A0b("receipt_fragment_tag") == null) {
            C06c A0D = 7zU.A0D(this);
            PaymentsLoggingSessionData paymentsLoggingSessionData = this.A02;
            ReceiptCommonParams receiptCommonParams = this.A03;
            CallerContext callerContext = DZj.A08;
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_receipt_params", receiptCommonParams);
            if (paymentsLoggingSessionData != null) {
                A05.putParcelable("extra_logging_data", paymentsLoggingSessionData);
            }
            DKG.A1H(A05, A0D, new DZj(), "receipt_fragment_tag", 2131364228);
        }
        FII.A02(this, this.A03.A00.paymentsDecoratorAnimation);
        ReceiptComponentControllerParams receiptComponentControllerParams = this.A03.A01;
        if (receiptComponentControllerParams != null) {
            ((FcU) this.A04.get()).A01(receiptComponentControllerParams.A03);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A01 = DKG.A0h(this);
        Bundle A0H = 7zO.A0H(this);
        this.A03 = (ReceiptCommonParams) A0H.getParcelable("extra_receipt_params");
        this.A02 = (PaymentsLoggingSessionData) A0H.getParcelable("extra_logging_data");
        FII.A00(this, this.A01, this.A03.A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        FII.A01(this, this.A03.A00.paymentsDecoratorAnimation);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        2S0 r0;
        List A15 = DKE.A15(this);
        if (A15 != null && !A15.isEmpty() && (r0 = (Fragment) DKE.A0q(A15)) != null && (r0 instanceof 2S0)) {
            r0.Bkd();
        }
        super.onBackPressed();
    }
}
