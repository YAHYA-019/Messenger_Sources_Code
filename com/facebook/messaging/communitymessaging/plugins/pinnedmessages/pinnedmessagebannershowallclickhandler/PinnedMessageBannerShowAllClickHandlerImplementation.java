package com.facebook.messaging.communitymessaging.plugins.pinnedmessages.pinnedmessagebannershowallclickhandler;

import X.06Z;
import X.0D2;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.63D;
import X.7zR;
import X.94S;
import X.9Ho;
import X.AnonymousClass001;
import X.C1296Ad8;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.pinnedmessages.ui.FeaturedPinnedMessagesBottomSheet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: PinnedMessageBannerShowAllClickHandlerImplementation.class */
public final class PinnedMessageBannerShowAllClickHandlerImplementation {
    public final 1Br A00;
    public final 63D A01;
    public final Context A02;

    public PinnedMessageBannerShowAllClickHandlerImplementation(Context context, 63D r303) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A01 = r303;
        this.A00 = 1Bu.A00(83118);
    }

    public final void A00(ThreadKey threadKey, ThreadSummary threadSummary) {
        Fragment AnK;
        06Z childFragmentManager;
        String str;
        Long l;
        ThreadKey threadKey2;
        ThreadKey threadKey3;
        9Ho r0 = new 9Ho(this);
        94S r02 = MigBottomSheetDialogFragment.A01;
        63D r03 = this.A01;
        String str2 = null;
        if (r03 == null || (AnK = r03.AnK()) == null || (childFragmentManager = AnK.getChildFragmentManager()) == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Bundle A0E = 7zR.A0E(threadKey);
        0D2 featuredPinnedMessagesBottomSheet = new FeaturedPinnedMessagesBottomSheet();
        featuredPinnedMessagesBottomSheet.setArguments(A0E);
        featuredPinnedMessagesBottomSheet.A01 = r0;
        featuredPinnedMessagesBottomSheet.A0m(childFragmentManager, "FeaturedPinnedMessagesBottomSheet ");
        C1296Ad8 c1296Ad8 = (C1296Ad8) 1Br.A0B(this.A00);
        if (threadSummary == null || (threadKey3 = threadSummary.A0l) == null) {
            str = null;
            if (threadSummary == null) {
                l = null;
                String valueOf = String.valueOf(l);
                if (threadSummary != null && (threadKey2 = threadSummary.A0n) != null) {
                    str2 = 1BK.A0w(threadKey2);
                }
                c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, str, valueOf, str2, null, "featured_message_text", "featured_message_banner", "render_featured_messages_bottom_sheet", "thread_view", null, null));
            }
        } else {
            str = 1BK.A0w(threadKey3);
        }
        l = Long.valueOf(threadSummary.A06);
        String valueOf2 = String.valueOf(l);
        if (threadSummary != null) {
            str2 = 1BK.A0w(threadKey2);
        }
        c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, str, valueOf2, str2, null, "featured_message_text", "featured_message_banner", "render_featured_messages_bottom_sheet", "thread_view", null, null));
    }
}
