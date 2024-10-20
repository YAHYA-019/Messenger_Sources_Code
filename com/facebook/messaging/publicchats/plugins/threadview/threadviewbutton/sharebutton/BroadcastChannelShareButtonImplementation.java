package com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.sharebutton;

import X.1BL;
import X.1Br;
import X.5Sh;
import X.7zM;
import android.content.Context;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: BroadcastChannelShareButtonImplementation.class */
public final class BroadcastChannelShareButtonImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 5Sh A02;
    public final ThreadViewColorScheme A03;

    public BroadcastChannelShareButtonImplementation(Context context, 5Sh r303, ThreadViewColorScheme threadViewColorScheme) {
        1BL.A1F(threadViewColorScheme, context);
        this.A03 = threadViewColorScheme;
        this.A00 = context;
        this.A02 = r303;
        this.A01 = 7zM.A0U();
    }
}
