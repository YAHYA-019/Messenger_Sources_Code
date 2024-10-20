package com.facebook.messaging.polling.plugins.core.adminmessagecta;

import X.11T;
import X.1BL;
import X.63D;
import X.BOT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AdminMessageCTAHandler.class */
public final class AdminMessageCTAHandler {
    public final Context A00;
    public final BOT A01;
    public final FbUserSession A02;
    public final AdminMessageCta A03;
    public final ThreadKey A04;
    public final ThreadSummary A05;
    public final 63D A06;
    public final String A07;

    public AdminMessageCTAHandler(Context context, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, ThreadKey threadKey, ThreadSummary threadSummary, 63D r307, String str) {
        1BL.A1H(context, fbUserSession, adminMessageCta);
        11T.A0F(threadKey, 5);
        11T.A0F(r307, 7);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A03 = adminMessageCta;
        this.A07 = str;
        this.A04 = threadKey;
        this.A05 = threadSummary;
        this.A06 = r307;
        this.A01 = BOT.A08;
    }
}
