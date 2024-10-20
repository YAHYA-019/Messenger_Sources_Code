package com.facebook.presence.plugins.status.threadsettingscontextsubheadinglogging;

import X.1BL;
import X.1Br;
import X.7zM;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: RichStatusThreadSettingsLoggerImplementation.class */
public final class RichStatusThreadSettingsLoggerImplementation {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;

    public RichStatusThreadSettingsLoggerImplementation(Context context, ThreadKey threadKey) {
        1BL.A1F(context, threadKey);
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = 7zM.A0e(context);
    }
}
