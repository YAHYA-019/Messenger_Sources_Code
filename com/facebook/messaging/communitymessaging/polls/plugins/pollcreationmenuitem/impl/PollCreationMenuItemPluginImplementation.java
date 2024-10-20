package com.facebook.messaging.communitymessaging.polls.plugins.pollcreationmenuitem.impl;

import X.11T;
import X.1Br;
import X.7zM;
import X.BNO;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: PollCreationMenuItemPluginImplementation.class */
public final class PollCreationMenuItemPluginImplementation {
    public static final BNO A04 = BNO.A0W;
    public final 1Br A00;
    public final Message A01;
    public final ThreadSummary A02;
    public final Context A03;

    public PollCreationMenuItemPluginImplementation(Context context, Message message, ThreadSummary threadSummary) {
        11T.A0F(context, 1);
        this.A03 = context;
        this.A02 = threadSummary;
        this.A01 = message;
        this.A00 = 7zM.A0U();
    }
}
