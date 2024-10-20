package X;

import com.facebook.zero.protocol.results.FetchZeroInterstitialContentResult;

/* loaded from: Fsx.class */
public final class Fsx implements GIn {
    public final /* synthetic */ DZQ A00;

    public Fsx(DZQ dzq) {
        this.A00 = dzq;
    }

    @Override // X.GIn
    public void ByP(Throwable th) {
        0fH.A0n("FreeMessengerOptinPreferenceFragment", "Failed to send optin request for free messenger campaign");
    }

    @Override // X.GIn
    public void ByQ(FetchZeroInterstitialContentResult fetchZeroInterstitialContentResult) {
        DZQ dzq = this.A00;
        if (dzq.A02 != null) {
            DKC.A0h(dzq.A06).A0G(dzq.A02);
        }
        DKC.A0h(dzq.A06).A0I(1QE.A02);
    }
}
