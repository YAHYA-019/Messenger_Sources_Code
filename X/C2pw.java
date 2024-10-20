package X;

import android.text.TextUtils;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.2pw, reason: invalid class name */
/* loaded from: 2pw.class */
public final class C2pw extends C1rj {
    public 1LI A00;

    public C2pw() {
        super("M4ThreadItemAdsLoggingWrapperComponent");
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C2pw c2pw = (C2pw) super.A0l();
        1LI r0 = c2pw.A00;
        c2pw.A00 = r0 != null ? r0.A0l() : null;
        return c2pw;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r303 = this.A00;
        ThreadSummary threadSummary = (ThreadSummary) r302.A09(ThreadSummary.class);
        threadSummary.getClass();
        if (!TextUtils.isEmpty(threadSummary.A1y) || !TextUtils.isEmpty(threadSummary.A1n)) {
            C1rq A01 = C1rg.A01(r302, null, 0);
            A01.A2f(r303);
            A01.A1v(1LI.A02(r302, C2pw.class, 0S2.A01, "M4ThreadItemAdsLoggingWrapperComponent", new Object[]{threadSummary}, 904927013));
            r303 = A01.A00;
        }
        return r303;
    }
}
