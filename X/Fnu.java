package X;

import android.content.Context;
import com.facebook.payments.paymentmethods.picker.PaymentMethodsPickerScreenConfig;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerRunTimeData;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerScreenFetcherParams;
import com.facebook.payments.paymentmethods.picker.protocol.GetPaymentMethodsInfoParams;
import com.facebook.payments.picker.model.PickerScreenConfig;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fnu.class */
public final class Fnu implements GJY {
    public Exy A00;
    public 1BY A01;
    public ListenableFuture A02;
    public final C00i A03 = 1BQ.A01();
    public final C00i A05 = 1BV.A01((1BY) null, 49829);
    public final C15h A04 = new G7H(1Bn.A0E((Context) null, (1BY) null, 16428), this, 8);

    public Fnu(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public void D1f(PaymentMethodsPickerRunTimeData paymentMethodsPickerRunTimeData, GFp gFp) {
        ListenableFuture listenableFuture = this.A02;
        if (listenableFuture == null || listenableFuture.isDone()) {
            this.A00.A01();
            PickerScreenConfig pickerScreenConfig = paymentMethodsPickerRunTimeData.A01;
            PaymentMethodsPickerScreenConfig paymentMethodsPickerScreenConfig = (PaymentMethodsPickerScreenConfig) pickerScreenConfig;
            PaymentMethodsPickerScreenFetcherParams paymentMethodsPickerScreenFetcherParams = paymentMethodsPickerRunTimeData.A02;
            String str = PickerScreenConfig.A00(pickerScreenConfig).sessionId;
            GetPaymentMethodsInfoParams getPaymentMethodsInfoParams = new GetPaymentMethodsInfoParams(paymentMethodsPickerScreenFetcherParams.A00, paymentMethodsPickerScreenConfig.A00.paymentItemType, paymentMethodsPickerScreenConfig.A02, paymentMethodsPickerScreenFetcherParams.A01, str, paymentMethodsPickerScreenFetcherParams.A02);
            boolean z = paymentMethodsPickerScreenFetcherParams.A03;
            Qmm qmm = ((EsI) this.A04.get()).A00;
            if (z) {
                qmm.BPu(getPaymentMethodsInfoParams);
            }
            Object Apt = qmm.Apt(getPaymentMethodsInfoParams);
            this.A02 = Apt != null ? C3o5.A0J(Apt) : G72.A00(qmm.A03, getPaymentMethodsInfoParams, qmm, 7);
            DKF.A0h(this.A05).A03(new C2081Db6(11, gFp, paymentMethodsPickerRunTimeData, this), this.A02, "fetch_payment_methods");
        }
    }

    public void AE9() {
        DKG.A1N(this.A05);
    }

    public void CsU(Exy exy) {
        this.A00 = exy;
    }
}
