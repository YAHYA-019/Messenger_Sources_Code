package com.facebook.messaging.inbox.fragment.plugins.core.scrolllogger;

import X.03Y;
import X.04R;
import X.11T;
import X.1Bq;
import X.1Br;
import X.2XA;
import X.C0dp;
import X.K94;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* loaded from: InboxFragmentScrollingLoggerPluginImplementation.class */
public final class InboxFragmentScrollingLoggerPluginImplementation {
    public Map A00;
    public final 1Br A01 = 1Bq.A00(99390);
    public final 1Br A02 = 1Bq.A00(16634);

    public static final Map A00(RecyclerView recyclerView, InboxFragmentScrollingLoggerPluginImplementation inboxFragmentScrollingLoggerPluginImplementation) {
        2XA r0 = recyclerView.A0F;
        11T.A0I(r0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r0;
        return 04R.A09(new 03Y[]{new 03Y("si", String.valueOf(linearLayoutManager.A1h())), new 03Y("ei", String.valueOf(linearLayoutManager.A1j())), new 03Y(K94.__redex_internal_original_name, String.valueOf(recyclerView.computeVerticalScrollOffset())), new 03Y("t", String.valueOf(((C0dp) inboxFragmentScrollingLoggerPluginImplementation.A01.A00.get()).now()))});
    }
}
