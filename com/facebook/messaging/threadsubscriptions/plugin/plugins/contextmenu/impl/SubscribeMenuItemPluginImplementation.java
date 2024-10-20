package com.facebook.messaging.threadsubscriptions.plugin.plugins.contextmenu.impl;

import X.11T;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.BNO;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;

/* loaded from: SubscribeMenuItemPluginImplementation.class */
public final class SubscribeMenuItemPluginImplementation {
    public static final BNO A05 = BNO.A0o;
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Message A03;
    public final Context A04;

    public SubscribeMenuItemPluginImplementation(Context context, Message message) {
        11T.A0F(context, 2);
        this.A03 = message;
        this.A04 = context;
        this.A02 = 7zM.A0e(context);
        this.A01 = 7zM.A0U();
        this.A00 = 1Bu.A01(context, 68342);
    }
}
