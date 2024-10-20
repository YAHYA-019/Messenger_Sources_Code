package com.facebook.messaging.bump.plugins.bump.contextmenu;

import X.1Bq;
import X.1Br;
import X.1HG;
import X.1Lm;
import X.7zM;
import X.BNO;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: BumpMenuItemPluginImplementation.class */
public final class BumpMenuItemPluginImplementation {
    public static final BNO A09 = BNO.A0A;
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A05;
    public final 1Br A06;
    public final Message A07;
    public final ThreadSummary A08;
    public final 1Br A04 = 7zM.A0U();
    public final 1Br A03 = 1Bq.A00(85048);
    public final 1Br A02 = 1Bq.A00(83482);

    public BumpMenuItemPluginImplementation(Context context, FbUserSession fbUserSession, Message message, ThreadSummary threadSummary) {
        this.A07 = message;
        this.A08 = threadSummary;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A06 = 1Lm.A00(context, fbUserSession, 49712);
        this.A05 = 1HG.A00(context, 65898);
    }
}
