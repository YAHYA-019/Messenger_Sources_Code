package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.picker.PaymentMethodsPickerScreenConfig;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerRunTimeData;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerScreenFetcherParams;
import com.facebook.payments.picker.model.PickerScreenCommonConfig;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;
import org.json.JSONObject;

/* loaded from: Fo0.class */
public final class Fo0 implements GII {
    public 1BY A00;
    public Exy A01;
    public ETu A02;
    public final C00i A03 = 1BQ.A01();
    public final FIQ A05 = DKG.A0i();
    public final Fnu A09 = (Fnu) 1Bn.A0E((Context) null, (1BY) null, 98953);
    public final C00i A04 = DKG.A0S();
    public final Em0 A06 = (Em0) 1Bn.A0E((Context) null, (1BY) null, 98432);
    public final C15h A08 = G7K.A01(this, ActionId.RTMP_CONNECTION_REQUESTED);
    public final C15h A07 = new G7H(1Bn.A0E((Context) null, (1BY) null, 83719), this, 9);

    public Fo0(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.payments.picker.model.SimplePickerRunTimeData, com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerRunTimeData] */
    public static void A00(Fo0 fo0, PaymentMethodsPickerRunTimeData paymentMethodsPickerRunTimeData, String str, int i) {
        PaymentMethodsPickerScreenFetcherParams paymentMethodsPickerScreenFetcherParams = paymentMethodsPickerRunTimeData.A02;
        JSONObject jSONObject = paymentMethodsPickerScreenFetcherParams.A02;
        PaymentMethodsPickerScreenFetcherParams paymentMethodsPickerScreenFetcherParams2 = new PaymentMethodsPickerScreenFetcherParams(paymentMethodsPickerScreenFetcherParams.A00, paymentMethodsPickerScreenFetcherParams.A01, jSONObject);
        fo0.A09.D1f(new SimplePickerRunTimeData(paymentMethodsPickerRunTimeData.A00, paymentMethodsPickerRunTimeData.A01, paymentMethodsPickerScreenFetcherParams2, paymentMethodsPickerRunTimeData.A03), new Fns(fo0, paymentMethodsPickerRunTimeData, str, i));
    }

    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public void Bhp(Intent intent, PaymentMethodsPickerRunTimeData paymentMethodsPickerRunTimeData, int i, int i2) {
        String stringExtra;
        1RN c2070Dav;
        5iG A0h;
        2FT A0t;
        Object obj;
        AbJ.A1P(this.A00);
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    if (i2 == -1) {
                        PaymentMethodsPickerScreenFetcherParams paymentMethodsPickerScreenFetcherParams = paymentMethodsPickerRunTimeData.A02;
                        ((ETf) this.A07.get()).A01(new PaymentMethodsPickerScreenFetcherParams(paymentMethodsPickerScreenFetcherParams.A00, paymentMethodsPickerScreenFetcherParams.A01, paymentMethodsPickerScreenFetcherParams.A02), Qv0.A05, paymentMethodsPickerRunTimeData, intent.getStringExtra("encoded_credential_id"));
                        return;
                    }
                    return;
                }
                if (i == 201 && i2 == -1 && intent != null) {
                    A02((PaymentMethod) intent.getParcelableExtra("selected_payment_method"));
                    return;
                }
                return;
            }
            if (i2 != -1) {
                return;
            }
            CallerContext callerContext = Fcb.A01;
            String stringExtra2 = intent.getStringExtra("success_uri");
            if (1JF.A0B(stringExtra2 == null ? null : C0A2.A03(stringExtra2).getQueryParameter("paypal_ba_id"))) {
                String A00 = JQw.A00(68);
                if (!1JF.A0B(intent.getStringExtra(A00))) {
                    07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A08.get(), "actor_id");
                    07S.A00(A0J, intent.getStringExtra(A00), A00);
                    PickerScreenCommonConfig pickerScreenCommonConfig = ((PaymentMethodsPickerScreenConfig) paymentMethodsPickerRunTimeData.A01).A00;
                    07S.A00(A0J, pickerScreenCommonConfig.analyticsParams.paymentsLoggingSessionData.sessionId, "session_id");
                    07S.A00(A0J, pickerScreenCommonConfig.paymentItemType.toString(), "payment_type");
                    c2070Dav = new C2069Dau(paymentMethodsPickerRunTimeData, this, 26);
                    this.A01.A01();
                    A0h = DKF.A0h(this.A04);
                    Em0 em0 = this.A06;
                    GraphQlQueryParamSet A0M = 7zL.A0M();
                    4YV.A1A(A0J, A0M, "input");
                    A0t = AbJ.A0t(em0.A02, new Fvf(em0, 46), DKI.A0I(1BK.A04(em0.A01), 5Dh.A00(A0M, new C01643sd(2JX.class, "CompletePaypalLinkingMutation", null, "input", "fbandroid", -624879294, 384, 2847458358L, 2847458358L, false, true))));
                    obj = "complete_paypal_linking_key";
                } else {
                    if (1JF.A0B(intent.getStringExtra("jwt_token"))) {
                        this.A05.A07(PaymentsFlowStep.A06, ((PaymentMethodsPickerScreenConfig) paymentMethodsPickerRunTimeData.A01).A00.analyticsParams.paymentsLoggingSessionData, "payflows_fail");
                        return;
                    }
                    C03z c03z = GraphQlCallInput.A02;
                    String stringExtra3 = intent.getStringExtra("jwt_token");
                    07S A0J2 = 4YU.A0J(c03z, stringExtra3, "paypal_jwt_token");
                    PaymentMethodsPickerScreenConfig paymentMethodsPickerScreenConfig = (PaymentMethodsPickerScreenConfig) paymentMethodsPickerRunTimeData.A01;
                    07S.A00(A0J2, paymentMethodsPickerScreenConfig.A00.analyticsParams.paymentsLoggingSessionData.sessionId, "session_id");
                    07S.A00(A0J2, paymentMethodsPickerScreenConfig.A03, "transfer_id");
                    c2070Dav = new C2070Dav(stringExtra3, this, 3);
                    A0h = DKF.A0h(this.A04);
                    Em0 em02 = this.A06;
                    GraphQlQueryParamSet A0M2 = 7zL.A0M();
                    4YV.A1A(A0J2, A0M2, "input");
                    A0t = AbJ.A0t(em02.A02, new Fvf(em02, 47), DKI.A0I(1BK.A04(em02.A01), 5Dh.A00(A0M2, new C01643sd(2JX.class, "SweepPayPalPaymentTransferMutation", null, "input", "fbandroid", -431679103, 384, 3697610262L, 3697610262L, false, true))));
                    obj = "sweep_paypal_payment_transaction_key";
                }
                A0h.A03(c2070Dav, A0t, obj);
                return;
            }
            String stringExtra4 = intent.getStringExtra("success_uri");
            stringExtra = stringExtra4 == null ? null : C0A2.A03(stringExtra4).getQueryParameter("paypal_ba_id");
        } else if (i2 != -1) {
            return;
        } else {
            stringExtra = intent.getStringExtra("encoded_credential_id");
        }
        A00(this, paymentMethodsPickerRunTimeData, stringExtra, i);
    }

    public void A02(PaymentMethod paymentMethod) {
        Intent A05 = AbF.A05();
        A05.putExtra("selected_payment_method", paymentMethod);
        FHd.A01(DKG.A08(A05), this.A02, 0S2.A00);
    }

    public void AC1(Exy exy, ETu eTu) {
        this.A02 = eTu;
        this.A09.A00 = exy;
        this.A01 = exy;
    }
}
