package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.threadviewbanner.ProactiveWarningThreadViewBanner;

/* renamed from: X.7Q2, reason: invalid class name */
/* loaded from: 7Q2.class */
public final class C7Q2 implements C2iz {
    public final ThreadSummary A00;
    public final 7OX A01;
    public final /* synthetic */ ProactiveWarningThreadViewBanner A02;

    public C7Q2(ThreadSummary threadSummary, 7OX r303, ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner) {
        this.A02 = proactiveWarningThreadViewBanner;
        this.A00 = threadSummary;
        this.A01 = r303;
    }

    @Override // X.C2iz
    public void AU9(C2j1 c2j1) {
        11T.A0F(c2j1, 0);
        c2j1.A00(28);
    }

    @Override // X.C2iz
    public void AUA(C2mq c2mq) {
        11T.A0F(c2mq, 0);
        if (c2mq.AU8() == 28) {
            C9rv c9rv = (C9rv) c2mq;
            11T.A0F(c9rv, 0);
            ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner = this.A02;
            proactiveWarningThreadViewBanner.A0H.execute(new AGM(c9rv, this, proactiveWarningThreadViewBanner));
        }
    }
}
