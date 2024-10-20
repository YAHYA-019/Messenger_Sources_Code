package X;

import com.facebook.messaging.integrity.frx.proactivewarning.model.ProactiveWarningInfo;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.threadviewbanner.ProactiveWarningThreadViewBanner;

/* renamed from: X.9y2, reason: invalid class name */
/* loaded from: 9y2.class */
public final class C9y2 implements AYH {
    public final /* synthetic */ ProactiveWarningInfo A00;
    public final /* synthetic */ ThreadSummary A01;
    public final /* synthetic */ ProactiveWarningThreadViewBanner A02;
    public final /* synthetic */ C00m A03;

    public C9y2(ProactiveWarningInfo proactiveWarningInfo, ThreadSummary threadSummary, ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner, C00m c00m) {
        this.A02 = proactiveWarningThreadViewBanner;
        this.A01 = threadSummary;
        this.A00 = proactiveWarningInfo;
        this.A03 = c00m;
    }

    public final void onDismiss() {
        ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner = this.A02;
        ((C9cb) 1Br.A0B(proactiveWarningThreadViewBanner.A0B)).A01(proactiveWarningThreadViewBanner.A06, this.A00, this.A01, proactiveWarningThreadViewBanner.A03, this.A03);
    }
}
