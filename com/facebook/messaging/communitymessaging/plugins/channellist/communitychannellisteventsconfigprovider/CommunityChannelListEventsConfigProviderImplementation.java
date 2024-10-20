package com.facebook.messaging.communitymessaging.plugins.channellist.communitychannellisteventsconfigprovider;

import X.1Va;
import X.2S4;
import X.7zT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CommunityChannelListEventsConfigProviderImplementation.class */
public final class CommunityChannelListEventsConfigProviderImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 2S4 A02;
    public final ThreadKey A03;
    public final 1Va A04;

    public CommunityChannelListEventsConfigProviderImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, ThreadKey threadKey, 1Va r306) {
        7zT.A1W(context, fbUserSession, r306, r304);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = r306;
        this.A02 = r304;
        this.A03 = threadKey;
    }
}
