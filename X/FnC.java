package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.payments.auth.model.NuxFollowUpAction;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.p2p.model.VerificationFollowUpAction;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: FnC.class */
public final class FnC implements GJW {
    public final /* synthetic */ RTb A00;
    public final /* synthetic */ Fmn A01;
    public final /* synthetic */ SettableFuture A02;

    public FnC(RTb rTb, Fmn fmn, SettableFuture settableFuture) {
        this.A01 = fmn;
        this.A02 = settableFuture;
        this.A00 = rTb;
    }

    public void CB8(PaymentMethod paymentMethod) {
        this.A02.A04();
        6Gx r0 = this.A01.A06;
        FHR A00 = F7K.A00(this.A00, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
        A00.A04(ER3.A01);
        A00.A06(paymentMethod);
        r0.A05(A00);
    }

    public void CTb() {
        AbG.A1W(this.A02, false);
        6Gx r0 = this.A01.A06;
        FHR A00 = F7K.A00(this.A00, "cancel_click");
        A00.A04(ER3.A01);
        r0.A05(A00);
    }

    public void CTc(NuxFollowUpAction nuxFollowUpAction, PaymentCard paymentCard, VerificationFollowUpAction verificationFollowUpAction) {
        this.A02.A04();
        6Gx r0 = this.A01.A06;
        FHR A00 = F7K.A00(this.A00, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
        A00.A04(ER3.A01);
        A00.A06(paymentCard);
        r0.A05(A00);
    }
}
