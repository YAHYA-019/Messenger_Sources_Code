package com.facebook.messaging.avatar.avatardetail.plugins.contextmenu.avatardetail;

import X.11T;
import X.1Br;
import X.7zM;
import X.BNO;
import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AvatarDetailMenuItem.class */
public final class AvatarDetailMenuItem {
    public static final BNO A04 = BNO.A09;
    public final Context A00;
    public final 1Br A01;
    public final Message A02;
    public final ThreadSummary A03;

    public AvatarDetailMenuItem(Context context, Message message, ThreadSummary threadSummary) {
        11T.A0F(context, 3);
        this.A02 = message;
        this.A03 = threadSummary;
        this.A00 = context;
        this.A01 = 7zM.A0U();
    }
}
