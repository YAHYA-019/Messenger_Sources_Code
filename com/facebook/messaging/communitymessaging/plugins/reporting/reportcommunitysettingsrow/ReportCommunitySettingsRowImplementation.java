package com.facebook.messaging.communitymessaging.plugins.reporting.reportcommunitysettingsrow;

import X.06Z;
import X.1Br;
import X.1Bu;
import X.2Sh;
import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ReportCommunitySettingsRowImplementation.class */
public final class ReportCommunitySettingsRowImplementation {
    public static final long A05 = ReportCommunitySettingsRowImplementation.class.hashCode();
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final 2Sh A04;

    public ReportCommunitySettingsRowImplementation(Context context, 06Z r303, ThreadSummary threadSummary, 2Sh r305) {
        7zR.A1N(context, r303);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A01 = r303;
        this.A04 = r305;
        this.A02 = 1Bu.A01(context, 68120);
    }
}
