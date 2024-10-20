package com.facebook.messaging.games.plugins.cta.subscribebot;

import X.11T;
import X.1BL;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: SubscribeBotCtaImplementation.class */
public final class SubscribeBotCtaImplementation {
    public final 1Br A00;
    public final AdminMessageCta A01;
    public final ThreadKey A02;
    public final String A03;
    public final Context A04;
    public final FbUserSession A05;

    public SubscribeBotCtaImplementation(Context context, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        1BL.A1H(context, fbUserSession, adminMessageCta);
        11T.A0F(threadKey, 5);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A01 = adminMessageCta;
        this.A03 = str;
        this.A02 = threadKey;
        this.A00 = 1Lm.A00(context, fbUserSession, 67441);
    }
}
