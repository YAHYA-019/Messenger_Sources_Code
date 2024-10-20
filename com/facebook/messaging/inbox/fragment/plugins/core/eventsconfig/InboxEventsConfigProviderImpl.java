package com.facebook.messaging.inbox.fragment.plugins.core.eventsconfig;

import X.11T;
import X.1Va;
import X.2S4;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxEventsConfigProviderImpl.class */
public final class InboxEventsConfigProviderImpl {
    public final Context A00;
    public final FbUserSession A01;
    public final 2S4 A02;
    public final 1Va A03;

    public InboxEventsConfigProviderImpl(Context context, FbUserSession fbUserSession, 2S4 r304, 1Va r305) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r305, 3);
        11T.A0F(r304, 4);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = r305;
        this.A02 = r304;
    }
}
