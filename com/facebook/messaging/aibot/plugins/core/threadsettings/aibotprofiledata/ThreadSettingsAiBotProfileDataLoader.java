package com.facebook.messaging.aibot.plugins.core.threadsettings.aibotprofiledata;

import X.1BL;
import X.1X9;
import X.C1x;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ThreadSettingsAiBotProfileDataLoader.class */
public final class ThreadSettingsAiBotProfileDataLoader {
    public 1X9 A00;
    public final Context A01;
    public final ThreadKey A02;
    public final C1x A03;
    public final AtomicBoolean A04;

    public ThreadSettingsAiBotProfileDataLoader(Context context, ThreadKey threadKey, C1x c1x) {
        1BL.A1H(context, threadKey, c1x);
        this.A01 = context;
        this.A02 = threadKey;
        this.A03 = c1x;
        this.A04 = new AtomicBoolean();
    }
}
