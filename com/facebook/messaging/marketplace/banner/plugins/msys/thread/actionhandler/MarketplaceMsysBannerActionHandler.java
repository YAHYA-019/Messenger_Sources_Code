package com.facebook.messaging.marketplace.banner.plugins.msys.thread.actionhandler;

import X.1BL;
import X.AQr;
import X.C01i;
import X.C03i;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MarketplaceMsysBannerActionHandler.class */
public final class MarketplaceMsysBannerActionHandler {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;
    public final C01i A03;

    public MarketplaceMsysBannerActionHandler(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        1BL.A1H(context, threadKey, fbUserSession);
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = fbUserSession;
        this.A03 = AQr.A01(this, C03i.A02, 19);
    }
}
