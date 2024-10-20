package com.facebook.messaging.business.notificationmessages.plugins.implementations.optin;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MsysNotificationMessagesOptinCtaHandler.class */
public final class MsysNotificationMessagesOptinCtaHandler {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final AdminMessageCta A04;
    public final ThreadKey A05;
    public final ThreadSummary A06;
    public final String A07;

    public MsysNotificationMessagesOptinCtaHandler(Context context, 06Z r303, FbUserSession fbUserSession, AdminMessageCta adminMessageCta, ThreadKey threadKey, ThreadSummary threadSummary, String str) {
        1BL.A1H(context, fbUserSession, adminMessageCta);
        11T.A0F(threadKey, 5);
        11T.A0F(r303, 7);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A04 = adminMessageCta;
        this.A07 = str;
        this.A05 = threadKey;
        this.A06 = threadSummary;
        this.A01 = r303;
        this.A03 = 1Bq.A00(82484);
    }
}
