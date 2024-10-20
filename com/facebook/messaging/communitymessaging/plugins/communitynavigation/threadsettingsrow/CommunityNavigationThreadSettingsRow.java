package com.facebook.messaging.communitymessaging.plugins.communitynavigation.threadsettingsrow;

import X.0LS;
import X.1BK;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.2SI;
import X.2Sh;
import X.4iH;
import X.7zR;
import X.AbF;
import X.AbK;
import X.AbL;
import X.C4Ln;
import android.content.Context;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CommunityNavigationThreadSettingsRow.class */
public final class CommunityNavigationThreadSettingsRow {
    public static final long A05 = CommunityNavigationThreadSettingsRow.class.hashCode();
    public final Context A00;
    public final 1Br A01;
    public final ThreadSummary A02;
    public final MigColorScheme A03;
    public final 2Sh A04;

    public CommunityNavigationThreadSettingsRow(Context context, ThreadSummary threadSummary, MigColorScheme migColorScheme, 2Sh r305) {
        1BK.A1K(context, 1, migColorScheme);
        this.A00 = context;
        this.A04 = r305;
        this.A03 = migColorScheme;
        this.A02 = threadSummary;
        this.A01 = 1Bq.A00(83164);
    }

    public static final void A00(CommunityNavigationThreadSettingsRow communityNavigationThreadSettingsRow) {
        4iH r0 = (4iH) 1Bi.A03(99952);
        ThreadSummary threadSummary = communityNavigationThreadSettingsRow.A02;
        String A0e = AbL.A0e(threadSummary.A0l);
        String A17 = AbF.A17(threadSummary);
        7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, A0e, A17, AbK.A17(threadSummary), null, "visit_community_button", "thread_settings", "return_from_thread_to_community", null, null, null));
        ((C4Ln) 1Br.A0B(communityNavigationThreadSettingsRow.A01)).A00(2SI.A06, A17, "visit_community_button");
        if (A0e == null) {
            throw 1BK.A0h();
        }
        0LS.A0A(communityNavigationThreadSettingsRow.A00, r0.A07(A0e, A17, "visit_community_button"));
    }
}
