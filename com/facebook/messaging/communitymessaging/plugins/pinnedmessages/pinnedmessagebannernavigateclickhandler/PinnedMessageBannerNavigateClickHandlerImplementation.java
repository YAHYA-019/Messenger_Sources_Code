package com.facebook.messaging.communitymessaging.plugins.pinnedmessages.pinnedmessagebannernavigateclickhandler;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.63D;
import X.7zV;
import X.AnonymousClass001;
import X.C1296Ad8;
import android.content.Context;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.HashSet;

/* loaded from: PinnedMessageBannerNavigateClickHandlerImplementation.class */
public final class PinnedMessageBannerNavigateClickHandlerImplementation {
    public final 1Br A00;
    public final Context A01;
    public final 63D A02;

    public PinnedMessageBannerNavigateClickHandlerImplementation(Context context, 63D r303) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A02 = r303;
        this.A00 = 1Bu.A00(83118);
    }

    public final void A00(ThreadSummary threadSummary, String str) {
        String str2;
        Long l;
        ThreadKey threadKey;
        ThreadKey threadKey2;
        63D r0 = this.A02;
        if (r0 != null) {
            HashSet A0v = AnonymousClass001.A0v();
            if (str == null) {
                throw 1BK.A0h();
            }
            r0.Bdd(7zV.A0M(str, A0v, true), true);
        }
        C1296Ad8 c1296Ad8 = (C1296Ad8) 1Br.A0B(this.A00);
        String str3 = null;
        if (threadSummary == null || (threadKey2 = threadSummary.A0l) == null) {
            str2 = null;
            if (threadSummary == null) {
                l = null;
                String valueOf = String.valueOf(l);
                if (threadSummary != null && (threadKey = threadSummary.A0n) != null) {
                    str3 = 1BK.A0w(threadKey);
                }
                c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, str2, valueOf, str3, null, "featured_message_text", "featured_message_banner", "render_featured_message", "thread_view", null, null));
            }
        } else {
            str2 = 1BK.A0w(threadKey2);
        }
        l = Long.valueOf(threadSummary.A06);
        String valueOf2 = String.valueOf(l);
        if (threadSummary != null) {
            str3 = 1BK.A0w(threadKey);
        }
        c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, str2, valueOf2, str3, null, "featured_message_text", "featured_message_banner", "render_featured_message", "thread_view", null, null));
    }
}
