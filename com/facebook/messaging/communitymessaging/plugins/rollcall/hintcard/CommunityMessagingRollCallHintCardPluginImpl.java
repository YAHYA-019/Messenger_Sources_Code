package com.facebook.messaging.communitymessaging.plugins.rollcall.hintcard;

import X.11T;
import X.1Br;
import X.1G1;
import X.64W;
import X.7zM;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CommunityMessagingRollCallHintCardPluginImpl.class */
public final class CommunityMessagingRollCallHintCardPluginImpl {
    public final Context A00;
    public final 1Br A01;
    public final ThreadSummary A02;
    public final 64W A03;
    public final String A04;
    public final FbUserSession A05;

    public CommunityMessagingRollCallHintCardPluginImpl(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, 64W r305) {
        11T.A0F(r305, 2);
        this.A00 = context;
        this.A03 = r305;
        this.A02 = threadSummary;
        this.A05 = fbUserSession;
        this.A01 = 7zM.A0f(context);
        this.A04 = ((1G1) fbUserSession).A02;
    }
}
