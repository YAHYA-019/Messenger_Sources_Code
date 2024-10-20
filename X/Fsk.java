package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.zero.common.ZeroToken;
import com.facebook.zero.optin.activity.ZeroOptinInterstitialActivity;

/* loaded from: Fsk.class */
public final class Fsk implements 2BS {
    public final int A00;
    public final Object A01;

    public Fsk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void ByR(1QE r302, String str, Throwable th) {
        switch (this.A00) {
            case 0:
                DNr dNr = (DNr) this.A01;
                dNr.A02.post(new SCa(dNr, 0Pz.A0j(r302.name(), " token fetch failed ", th.getMessage())));
                2BV r0 = dNr.A04;
                2BS r02 = dNr.A00;
                synchronized (r0) {
                    r0.A0A.remove(r02);
                }
                return;
            case 1:
                DKG.A1O(((DZQ) this.A01).A06, this);
                0fH.A0n("FreeMessengerOptinPreferenceFragment", "Successfully opted in/out of free messenger campaign, but token fetch failed.");
                return;
            default:
                Fsy fsy = (Fsy) this.A01;
                ZeroOptinInterstitialActivity zeroOptinInterstitialActivity = fsy.A01;
                CallerContext callerContext = ZeroOptinInterstitialActivity.A0h;
                C00i c00i = zeroOptinInterstitialActivity.A0e;
                DKG.A1O(c00i, this);
                DKC.A0h(c00i).ByR(r302, str, th);
                ZeroOptinInterstitialActivity.A12(fsy.A00, zeroOptinInterstitialActivity, fsy.A03);
                return;
        }
    }

    public void ByS(FbUserSession fbUserSession, ZeroToken zeroToken, 1QE r304, String str) {
        switch (this.A00) {
            case 0:
                DNr dNr = (DNr) this.A01;
                dNr.A02.post(new SCa(dNr, 0Pz.A0W(r304.name(), " token fetched successfully")));
                2BV r0 = dNr.A04;
                2BS r02 = dNr.A00;
                synchronized (r0) {
                    r0.A0A.remove(r02);
                }
                return;
            case 1:
                DZQ dzq = (DZQ) this.A01;
                DKG.A1O(dzq.A06, this);
                AbG.A0B(dzq.A05).Ciz(new G1D(this));
                return;
            default:
                Fsy fsy = (Fsy) this.A01;
                ZeroOptinInterstitialActivity zeroOptinInterstitialActivity = fsy.A01;
                CallerContext callerContext = ZeroOptinInterstitialActivity.A0h;
                C00i c00i = zeroOptinInterstitialActivity.A0e;
                DKG.A1O(c00i, this);
                DKC.A0h(c00i).ByS(fbUserSession, zeroToken, r304, str);
                ZeroOptinInterstitialActivity.A12(fsy.A00, zeroOptinInterstitialActivity, fsy.A03);
                return;
        }
    }
}
