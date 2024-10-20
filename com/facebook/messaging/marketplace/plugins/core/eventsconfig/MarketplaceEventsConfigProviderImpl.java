package com.facebook.messaging.marketplace.plugins.core.eventsconfig;

import X.1Va;
import X.2S4;
import X.7zT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MarketplaceEventsConfigProviderImpl.class */
public final class MarketplaceEventsConfigProviderImpl {
    public final Context A00;
    public final FbUserSession A01;
    public final 2S4 A02;
    public final 1Va A03;

    public MarketplaceEventsConfigProviderImpl(Context context, FbUserSession fbUserSession, 2S4 r304, 1Va r305) {
        7zT.A1W(context, fbUserSession, r305, r304);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = r305;
        this.A02 = r304;
    }
}
