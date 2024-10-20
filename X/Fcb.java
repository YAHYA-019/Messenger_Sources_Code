package X;

import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.payments.paymentmethods.model.NewNetBankingOption;
import com.facebook.payments.paymentmethods.model.PaymentOption;
import com.facebook.payments.webview.model.PaymentsWebViewOnlinePaymentParams;

/* loaded from: Fcb.class */
public final class Fcb implements CallerContextable {
    public static final CallerContext A01 = CallerContext.A08(Fcb.class, "unknown");
    public static final String __redex_internal_original_name = "PaymentMethodHelper";
    public final C0et A00 = AbJ.A0E();

    public static boolean A00(PaymentOption paymentOption, PaymentOption paymentOption2) {
        if (paymentOption == null && paymentOption2 == null) {
            return true;
        }
        if (paymentOption == null || paymentOption2 == null) {
            return false;
        }
        ERH BHS = paymentOption.BHS();
        if (BHS.equals(paymentOption2.BHS())) {
            return BHS == ERH.A05 ? TextUtils.equals(((NewNetBankingOption) paymentOption).A01, ((NewNetBankingOption) paymentOption2).A01) : paymentOption.getId().equals(paymentOption2.getId());
        }
        return false;
    }

    public PaymentsWebViewOnlinePaymentParams A01(String str) {
        String str2 = this.A00.equals(C0et.A0P) ? "fb-messenger://" : C1ic.A18;
        RO8 ro8 = new RO8();
        ro8.A03 = str;
        C1pq.A08("redirectUrl", str);
        String A00 = 4YT.A00(1369);
        String A0W = 0Pz.A0W(str2, A00);
        ro8.A01 = A0W;
        C1pq.A08("failureDismissUrl", A0W);
        String A0W2 = 0Pz.A0W(str2, A00);
        ro8.A05 = A0W2;
        C1pq.A08("successDismissUrl", A0W2);
        return new PaymentsWebViewOnlinePaymentParams(ro8);
    }
}
