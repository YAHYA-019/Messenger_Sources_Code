package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.paymentmethods.view.SimplePaymentMethodView;
import com.facebook.payments.simplescreen.model.EditPayPalScreenExtraData;
import com.facebook.payments.simplescreen.model.SimpleScreenExtraData;
import com.facebook.payments.ui.PaymentsFormFooterView;
import com.facebook.widget.titlebar.TitleBarButtonSpec;

/* loaded from: Fod.class */
public final class Fod implements GKO {
    public View A00;
    public ProgressBar A01;
    public PaymentsFormFooterView A02;
    public ETu A03;
    public final Context A04;
    public final Em0 A07;
    public final C00i A06 = DKG.A0T();
    public final 5B0 A05 = DKD.A0L();

    public Fod(Context context) {
        this.A04 = context;
        this.A07 = (Em0) 1Bn.A0E(context, (1BY) null, 98432);
    }

    public void AE4() {
        DKG.A1N(this.A06);
    }

    public String BG6() {
        return this.A04.getResources().getString(2131956264);
    }

    public TitleBarButtonSpec BGA() {
        return null;
    }

    public /* bridge */ /* synthetic */ void BOd(ViewStub viewStub, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, SimpleScreenExtraData simpleScreenExtraData) {
        View A0C = DKF.A0C(viewStub, 2132541907);
        this.A02 = (PaymentsFormFooterView) C09s.A01(A0C, 2131364205);
        this.A01 = (ProgressBar) C09s.A01(A0C, 2131366701);
        this.A00 = C09s.A01(A0C, 2131363330);
        SimplePaymentMethodView A01 = C09s.A01(A0C, 2131366390);
        PayPalBillingAgreement A00 = ((EditPayPalScreenExtraData) simpleScreenExtraData).A00();
        A01.A01(A00);
        PaymentsFormFooterView paymentsFormFooterView = this.A02;
        paymentsFormFooterView.A0E(this.A03);
        5B0 r0 = this.A05;
        Context context = this.A04;
        paymentsFormFooterView.A01.A00.setText(r0.getTransformation(context.getResources().getString(2131964350), this.A02));
        this.A02.A01.setVisibility(0);
        PaymentsFormFooterView paymentsFormFooterView2 = this.A02;
        paymentsFormFooterView2.A02.A0F(4YU.A0F("https://m.facebook.com/payer_protection"), Uri.parse("https://m.facebook.com/payments_terms"));
        FbUserSession A0D = 4YV.A0D(context);
        PaymentsFormFooterView paymentsFormFooterView3 = this.A02;
        paymentsFormFooterView3.A01.setOnClickListener(new FXt(34, A0D, this, A00));
    }

    public void CQj() {
        throw AnonymousClass001.A0p();
    }

    public void CsR(ETu eTu) {
        this.A03 = eTu;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
