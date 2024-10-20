package com.facebook.messaging.msys.thread.plugins.banner.actionhandler.disappearingmessagepromotion;

import X.1BL;
import X.1pK;
import X.6tF;
import X.C3o5;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: DisappearingMessagePromotionBannerActionHandler.class */
public final class DisappearingMessagePromotionBannerActionHandler {
    public final Context A00;
    public final FbUserSession A01;
    public final 1pK A02;
    public final ThreadKey A03;
    public final 6tF A04;

    public DisappearingMessagePromotionBannerActionHandler(Context context, FbUserSession fbUserSession, 1pK r304, ThreadKey threadKey, 6tF r306) {
        1BL.A1H(context, fbUserSession, r304);
        C3o5.A0k(threadKey, 4, r306);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = r304;
        this.A03 = threadKey;
        this.A04 = r306;
    }
}
