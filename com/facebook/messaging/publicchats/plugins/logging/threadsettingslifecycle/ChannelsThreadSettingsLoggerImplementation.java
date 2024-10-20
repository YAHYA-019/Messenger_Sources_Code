package com.facebook.messaging.publicchats.plugins.logging.threadsettingslifecycle;

import X.11T;
import X.1Bq;
import X.1Br;
import X.AbG;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ChannelsThreadSettingsLoggerImplementation.class */
public final class ChannelsThreadSettingsLoggerImplementation {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final Context A04;

    public ChannelsThreadSettingsLoggerImplementation(Context context, ThreadKey threadKey) {
        11T.A0F(context, 1);
        this.A04 = context;
        this.A03 = threadKey;
        this.A02 = AbG.A0W();
        this.A01 = 1Bq.A00(82310);
        this.A00 = AbG.A0X();
    }
}
