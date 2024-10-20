package com.facebook.messaging.aibot.plugins.core.threadsettings.sharebutton;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.2Sh;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: ThreadSettingsShareAiBotButton.class */
public final class ThreadSettingsShareAiBotButton {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final User A03;
    public final 2Sh A04;

    public ThreadSettingsShareAiBotButton(Context context, ThreadKey threadKey, User user, 2Sh r305) {
        1BL.A11(1, context, threadKey, r305);
        this.A00 = context;
        this.A03 = user;
        this.A02 = threadKey;
        this.A04 = r305;
        this.A01 = 1Bu.A00(82549);
    }
}
