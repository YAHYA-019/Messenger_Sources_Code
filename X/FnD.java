package X;

import com.facebook.payments.auth.model.NuxFollowUpAction;
import com.facebook.payments.p2p.messenger.core.prefs.PaymentMethodsMessengerPayPreferences;
import com.facebook.payments.p2p.messenger.core.prefs.PaymentsPreferenceActivity;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.p2p.model.VerificationFollowUpAction;

/* loaded from: FnD.class */
public final class FnD implements GJW {
    public final /* synthetic */ PaymentMethodsMessengerPayPreferences A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public FnD(PaymentMethodsMessengerPayPreferences paymentMethodsMessengerPayPreferences, boolean z, boolean z2) {
        this.A00 = paymentMethodsMessengerPayPreferences;
        this.A02 = z;
        this.A01 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r0.A08 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CB8(com.facebook.payments.paymentmethods.model.PaymentMethod r302) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FnD.CB8(com.facebook.payments.paymentmethods.model.PaymentMethod):void");
    }

    public void CTb() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.payments.p2p.messenger.core.prefs.PaymentMethodsMessengerPayPreferences] */
    public void CTc(NuxFollowUpAction nuxFollowUpAction, PaymentCard paymentCard, VerificationFollowUpAction verificationFollowUpAction) {
        ?? r0 = this.A00;
        F5W.A00(nuxFollowUpAction, r0.A04.A0T(r0.getContext(), r0.mFragmentManager), 2131965785, 2131965784);
        PaymentsPreferenceActivity.A01(r0.A06.A00);
    }
}
