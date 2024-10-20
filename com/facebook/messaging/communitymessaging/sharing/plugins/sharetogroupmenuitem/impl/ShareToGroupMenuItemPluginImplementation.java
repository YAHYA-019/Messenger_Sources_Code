package com.facebook.messaging.communitymessaging.sharing.plugins.sharetogroupmenuitem.impl;

import X.11T;
import X.1Br;
import X.7zM;
import X.BNO;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ShareToGroupMenuItemPluginImplementation.class */
public final class ShareToGroupMenuItemPluginImplementation {
    public static final BNO A05 = BNO.A0m;
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Message A03;
    public final ThreadSummary A04;

    public ShareToGroupMenuItemPluginImplementation(Context context, Message message, ThreadSummary threadSummary) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A03 = message;
        this.A04 = threadSummary;
        this.A02 = 7zM.A0e(context);
        this.A01 = 7zM.A0U();
    }
}
