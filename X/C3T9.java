package X;

import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.params.ThreadPreviewParams;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.msys.mci.TraceLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3T9, reason: invalid class name */
/* loaded from: 3T9.class */
public final class C3T9 {
    public final 1Br A00 = 1Bu.A00(83118);
    public final 1Br A01 = 1Bq.A00(32804);
    public final 1Br A02 = 1Bq.A00(66476);

    public static final void A00(C3T9 c3t9, 2YQ r302, ThreadKey threadKey, ThreadKey threadKey2, ThreadSummary threadSummary, C2gi c2gi, 7UE r307, ThreadPreviewParams threadPreviewParams) {
        5SW r318;
        String str;
        6lX r0 = (6lX) 1Br.A0B(c3t9.A02);
        r0.A00 = 1Br.A01(r0.A05);
        r0.A02 = true;
        String str2 = "messenger_inbox";
        if (r307.A00 == 2SI.A09) {
            r318 = 5SW.A0P;
            str = str2;
        } else {
            r318 = 5SW.A0K;
            str2 = "channel_open_channel_list";
            str = "messenger";
        }
        c3t9.A01(r302, threadKey, threadKey2, threadSummary, c2gi, r307, threadPreviewParams, r318, str2, str);
    }

    private final void A01(2YQ r302, ThreadKey threadKey, ThreadKey threadKey2, ThreadSummary threadSummary, C2gi c2gi, 7UE r307, ThreadPreviewParams threadPreviewParams, 5SW r309, String str, String str2) {
        String str3 = str2;
        Long l = r307.A02;
        long longValue = l != null ? l.longValue() : -1;
        NavigationTrigger navigationTrigger = null;
        if (r309 != 5SW.A0R) {
            String A0w = threadKey2 != null ? 1BK.A0w(threadKey2) : null;
            LinkedHashMap A0A = 04R.A0A(new 03Y[]{1BK.A1G("left_nav", "2")});
            C1296Ad8 c1296Ad8 = (C1296Ad8) 1Br.A0B(this.A00);
            String valueOf = String.valueOf(longValue);
            String A0w2 = 1BK.A0w(threadKey);
            if (str2 == null) {
                str3 = "messenger";
            }
            c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, A0w, valueOf, A0w2, null, str, str3, 4YT.A00(185), null, null, A0A));
        }
        if (c2gi != null) {
            navigationTrigger = 7ND.A01(c2gi, (String) null, "community_list");
        }
        C6el A0H = 1BK.A0H(threadKey);
        A0H.A06 = navigationTrigger;
        A0H.A02(r309);
        A0H.A02 = longValue;
        A0H.A09 = threadPreviewParams;
        ThreadViewParams threadViewParams = new ThreadViewParams(A0H);
        if (threadSummary == null) {
            r302.CWM(c2gi, threadViewParams);
        } else {
            r302.CWQ(threadSummary, r307, threadViewParams);
        }
    }

    public final void A02(2YQ r302, C2gi c2gi, ThreadPreviewParams threadPreviewParams, long j) {
        7UE A0P = 1BL.A0P(c2gi, j);
        ThreadSummary threadSummary = c2gi.A01;
        ThreadKey threadKey = threadSummary.A0n;
        11T.A0A(threadKey);
        A00(this, r302, threadKey, threadSummary.A0l, null, c2gi, A0P, threadPreviewParams);
    }

    public final void A03(2YQ r302, C2gi c2gi, ThreadPreviewParams threadPreviewParams, 5SW r305, long j) {
        String traceIdForAliasId;
        6lX r0 = (6lX) 1Br.A0B(this.A02);
        r0.A00 = 1Br.A01(r0.A05);
        r0.A02 = true;
        C00i c00i = this.A01.A00;
        c00i.get();
        ThreadSummary threadSummary = c2gi.A01;
        ThreadKey threadKey = threadSummary.A0n;
        String A0w = 1BK.A0w(threadKey);
        if (A0w != null && (traceIdForAliasId = TraceLogger.getTraceIdForAliasId(226, A0w)) != null) {
            ((3rE) c00i.get()).A03(traceIdForAliasId, (List) null, 226, 1702, 0);
        }
        7UE A0P = 1BL.A0P(c2gi, j);
        11T.A0A(threadKey);
        A01(r302, threadKey, threadSummary.A0l, null, c2gi, A0P, threadPreviewParams, r305, "channel_open_channel_list", null);
    }
}
