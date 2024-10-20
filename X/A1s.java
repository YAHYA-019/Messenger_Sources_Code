package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.unsend.unsendwarningbanner.UnsendWarningBanner;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: A1s.class */
public final class A1s implements 1HN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ThreadSummary A01;
    public final /* synthetic */ 7OX A02;
    public final /* synthetic */ UnsendWarningBanner A03;

    public A1s(Context context, ThreadSummary threadSummary, 7OX r304, UnsendWarningBanner unsendWarningBanner) {
        this.A03 = unsendWarningBanner;
        this.A01 = threadSummary;
        this.A00 = context;
        this.A02 = r304;
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        UnsendWarningBanner unsendWarningBanner = this.A03;
        ThreadSummary threadSummary = this.A01;
        ThreadKey threadKey = threadSummary.A0n;
        7OD r0 = unsendWarningBanner.A03;
        if (r0.A04() && r0.A05(threadKey)) {
            UnsendWarningBanner.A00(this.A00, threadSummary, this.A02, unsendWarningBanner);
        } else {
            this.A02.BNt();
        }
    }
}
