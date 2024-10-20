package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.auth.model.NuxFollowUpAction;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.p2p.model.VerificationFollowUpAction;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: FnE.class */
public final class FnE implements GJW {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ E64 A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ String A03;

    public FnE(FbUserSession fbUserSession, E64 e64, SettableFuture settableFuture, String str) {
        this.A01 = e64;
        this.A02 = settableFuture;
        this.A03 = str;
        this.A00 = fbUserSession;
    }

    public void CB8(PaymentMethod paymentMethod) {
        this.A02.setFuture(this.A01.A05.A0A(this.A03));
    }

    public void CTb() {
        this.A02.set(ELQ.A01);
    }

    public void CTc(NuxFollowUpAction nuxFollowUpAction, PaymentCard paymentCard, VerificationFollowUpAction verificationFollowUpAction) {
        E66 e66 = this.A01.A05;
        e66.A0I(this.A00, paymentCard);
        this.A02.setFuture(e66.A0A(this.A03));
    }
}
