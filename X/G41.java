package X;

import com.facebook.payments.p2p.messenger.plugins.bloksactions.acceptrequestarmadillo.AcceptRequestArmadilloImplementation;

/* loaded from: G41.class */
public final class G41 implements Runnable {
    public static final String __redex_internal_original_name = "AcceptRequestArmadilloImplementation$evaluate$1$onCompletion$1";
    public final /* synthetic */ 1Uj A00;
    public final /* synthetic */ AcceptRequestArmadilloImplementation A01;
    public final /* synthetic */ boolean A02;

    public G41(1Uj r302, AcceptRequestArmadilloImplementation acceptRequestArmadilloImplementation, boolean z) {
        this.A02 = z;
        this.A01 = acceptRequestArmadilloImplementation;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A02) {
            return;
        }
        AcceptRequestArmadilloImplementation acceptRequestArmadilloImplementation = this.A01;
        1Uj r0 = this.A00;
        C21h c21h = acceptRequestArmadilloImplementation.A00;
        if (c21h != null) {
            C21S.A01(c21h, r0);
            acceptRequestArmadilloImplementation.A00 = null;
        }
    }
}
