package com.facebook.messaging.magicwords.plugins.production.adminmessagecta;

import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MagicWordsAdminMessageCta.class */
public final class MagicWordsAdminMessageCta {
    public final FbUserSession A00;
    public final 1Br A01;
    public final AdminMessageCta A02;
    public final ThreadKey A03;
    public final String A04;
    public final Context A05;

    public MagicWordsAdminMessageCta(Context context, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        1BL.A1H(context, fbUserSession, adminMessageCta);
        11T.A0F(threadKey, 5);
        this.A05 = context;
        this.A00 = fbUserSession;
        this.A02 = adminMessageCta;
        this.A04 = str;
        this.A03 = threadKey;
        this.A01 = 1Bu.A01(context, 67734);
    }
}
