package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.communitymessaging.plugins.threadview.ondemandthreadviewbanner.ThreadViewOnDemandBannerImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quickpromotion.ondemand.OnDemandControllerManager;

/* loaded from: G3p.class */
public final class G3p implements Runnable {
    public static final String __redex_internal_original_name = "ThreadViewOnDemandBannerImplementation$triggerHandler$1$1";
    public final /* synthetic */ InterstitialTrigger A00;
    public final /* synthetic */ ThreadViewOnDemandBannerImplementation A01;
    public final /* synthetic */ java.util.Map A02;

    public G3p(InterstitialTrigger interstitialTrigger, ThreadViewOnDemandBannerImplementation threadViewOnDemandBannerImplementation, java.util.Map map) {
        this.A01 = threadViewOnDemandBannerImplementation;
        this.A02 = map;
        this.A00 = interstitialTrigger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadKey threadKey;
        ThreadKey threadKey2;
        ThreadViewOnDemandBannerImplementation threadViewOnDemandBannerImplementation = this.A01;
        FbUserSession fbUserSession = threadViewOnDemandBannerImplementation.A03;
        InterstitialTrigger interstitialTrigger = this.A00;
        7zP.A0N(threadViewOnDemandBannerImplementation.A04).AAq();
        7OX r0 = ThreadViewOnDemandBannerImplementation.A0E;
        if (r0 != null) {
            ThreadSummary threadSummary = ThreadViewOnDemandBannerImplementation.A0D;
            Long l = null;
            String A0w = (threadSummary == null || (threadKey2 = threadSummary.A0l) == null) ? null : 1BK.A0w(threadKey2);
            String A00 = ThreadViewOnDemandBannerImplementation.A00(threadSummary);
            ThreadSummary threadSummary2 = ThreadViewOnDemandBannerImplementation.A0D;
            if (threadSummary2 != null && (threadKey = threadSummary2.A0n) != null) {
                l = Long.valueOf(threadKey.A0r());
            }
            A29 a29 = new A29(A0w, A00, String.valueOf(l));
            ((OnDemandControllerManager) 1Lm.A05(threadViewOnDemandBannerImplementation.A02, fbUserSession, 99753)).A01(interstitialTrigger, a29, new Fp5(threadViewOnDemandBannerImplementation, ThreadViewOnDemandBannerImplementation.A0D, r0, a29), EN5.A05);
        }
    }
}
