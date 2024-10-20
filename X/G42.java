package X;

import com.facebook.payments.p2p.messenger.plugins.bloksactions.sendpaymentarmadillo.SendPaymentArmadilloImplementation;

/* loaded from: G42.class */
public final class G42 implements Runnable {
    public static final String __redex_internal_original_name = "SendPaymentArmadilloImplementation$evaluate$1$onCompletion$1";
    public final /* synthetic */ 1Uj A00;
    public final /* synthetic */ SendPaymentArmadilloImplementation A01;
    public final /* synthetic */ boolean A02;

    public G42(1Uj r302, SendPaymentArmadilloImplementation sendPaymentArmadilloImplementation, boolean z) {
        this.A02 = z;
        this.A01 = sendPaymentArmadilloImplementation;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A02) {
            return;
        }
        SendPaymentArmadilloImplementation sendPaymentArmadilloImplementation = this.A01;
        1Uj r0 = this.A00;
        C21h c21h = sendPaymentArmadilloImplementation.A00;
        if (c21h != null) {
            C21S.A01(c21h, r0);
            sendPaymentArmadilloImplementation.A00 = null;
        }
    }
}
