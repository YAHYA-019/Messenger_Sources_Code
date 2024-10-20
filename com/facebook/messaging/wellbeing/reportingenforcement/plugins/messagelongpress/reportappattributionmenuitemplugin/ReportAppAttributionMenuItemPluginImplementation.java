package com.facebook.messaging.wellbeing.reportingenforcement.plugins.messagelongpress.reportappattributionmenuitemplugin;

import X.06Z;
import X.1BK;
import X.4YT;
import X.4YU;
import X.60P;
import X.6In;
import X.7zK;
import X.7zR;
import X.AbF;
import X.AnonymousClass001;
import X.C0et;
import X.C1296Ad8;
import X.C1q7;
import X.C5yl;
import X.C5yq;
import X.C9U;
import android.os.Bundle;
import com.facebook.messaging.attribution.AttributionReportFragment;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* loaded from: ReportAppAttributionMenuItemPluginImplementation.class */
public final class ReportAppAttributionMenuItemPluginImplementation {
    public static final ReportAppAttributionMenuItemPluginImplementation A00 = new Object();

    public static final void A00(06Z r301, C0et c0et, 6In r303, C5yq c5yq, C9U c9u, Message message, 60P r307, ThreadSummary threadSummary, C5yl c5yl) {
        String str;
        ImmutableList immutableList = C1q7.A07;
        ContentAppAttribution contentAppAttribution = message.A09;
        if (contentAppAttribution != null && (str = contentAppAttribution.A08) != null && c0et != C0et.A0F && !(!r307.A00(message))) {
            AttributionReportFragment attributionReportFragment = new AttributionReportFragment();
            Bundle A05 = 1BK.A05();
            A05.putString(4YT.A00(52), str);
            attributionReportFragment.setArguments(A05);
            attributionReportFragment.A0m(r301, "report_attribution_fragment");
            return;
        }
        if (c5yq != null) {
            c9u.A02(787560780, c5yq.serverLocation);
            if (c5yq == C5yq.A0w) {
                r303.Czv(r301, threadSummary, c5yl);
            } else {
                r303.Czu(r301, c5yq, message, threadSummary, c5yl);
            }
        }
    }

    public static final void A01(Message message, ThreadSummary threadSummary) {
        C1296Ad8 A0W = 7zR.A0W();
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("user_type", "admin");
        ThreadKey threadKey = threadSummary.A0l;
        String valueOf = String.valueOf(threadKey != null ? 4YU.A0l(threadKey) : null);
        String A17 = AbF.A17(threadSummary);
        String valueOf2 = String.valueOf(threadSummary.A0n.A04);
        ParticipantInfo participantInfo = message.A0K;
        A0W.A04(new CommunityMessagingLoggerModel(null, null, valueOf, A17, valueOf2, participantInfo != null ? participantInfo.A00() : null, "report_button", "more_actions_menu", 7zK.A00(410), "thread_view", null, A0u));
    }
}
