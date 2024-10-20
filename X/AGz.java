package X;

import com.facebook.messaging.integrity.frx.proactivewarning.model.ProactiveWarningInfo;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AGz.class */
public final class AGz implements Runnable {
    public static final String __redex_internal_original_name = "ProactiveWarningBannerCtaHandler$triggerFollowUpActionsScreen$1";
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ C5yq A01;
    public final /* synthetic */ C9cb A02;
    public final /* synthetic */ ProactiveWarningInfo A03;
    public final /* synthetic */ ThreadSummary A04;

    public AGz(06Z r302, C5yq c5yq, C9cb c9cb, ProactiveWarningInfo proactiveWarningInfo, ThreadSummary threadSummary) {
        this.A02 = c9cb;
        this.A00 = r302;
        this.A04 = threadSummary;
        this.A03 = proactiveWarningInfo;
        this.A01 = c5yq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6In r0 = (6In) 1Br.A0B(this.A02.A00);
        06Z r02 = this.A00;
        ThreadSummary threadSummary = this.A04;
        ProactiveWarningInfo proactiveWarningInfo = this.A03;
        String str = proactiveWarningInfo.A02;
        11T.A0A(str);
        String str2 = proactiveWarningInfo.A05;
        11T.A0A(str2);
        r0.Czf(r02, this.A01, threadSummary, C5yl.A0G, str, str2, proactiveWarningInfo.A03);
    }
}
