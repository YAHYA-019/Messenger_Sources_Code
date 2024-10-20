package X;

import com.facebook.payments.p2p.messenger.plugins.bloksactions.sendrequestarmadillo.SendRequestArmadilloImplementation;

/* loaded from: G43.class */
public final class G43 implements Runnable {
    public static final String __redex_internal_original_name = "SendRequestArmadilloImplementation$evaluate$1$onCompletion$1";
    public final /* synthetic */ 1Uj A00;
    public final /* synthetic */ SendRequestArmadilloImplementation A01;
    public final /* synthetic */ boolean A02;

    public G43(1Uj r302, SendRequestArmadilloImplementation sendRequestArmadilloImplementation, boolean z) {
        this.A02 = z;
        this.A01 = sendRequestArmadilloImplementation;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A02) {
            return;
        }
        SendRequestArmadilloImplementation sendRequestArmadilloImplementation = this.A01;
        1Uj r0 = this.A00;
        C21h c21h = sendRequestArmadilloImplementation.A00;
        if (c21h != null) {
            C21S.A01(c21h, r0);
            sendRequestArmadilloImplementation.A00 = null;
        }
    }
}
