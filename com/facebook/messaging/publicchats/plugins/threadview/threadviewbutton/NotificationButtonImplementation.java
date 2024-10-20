package com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton;

import X.1Br;
import X.1Bu;
import X.5Sh;
import X.7zM;
import X.7zR;
import X.AbG;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* loaded from: NotificationButtonImplementation.class */
public final class NotificationButtonImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final 5Sh A07;
    public final ThreadViewColorScheme A08;

    public NotificationButtonImplementation(Context context, ThreadKey threadKey, 5Sh r304, ThreadViewColorScheme threadViewColorScheme) {
        7zR.A1N(threadViewColorScheme, threadKey);
        this.A08 = threadViewColorScheme;
        this.A00 = context;
        this.A06 = threadKey;
        this.A07 = r304;
        this.A03 = 7zM.A0U();
        this.A02 = 1Bu.A00(82609);
        this.A05 = 1Bu.A01(context, HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
        this.A04 = 1Bu.A01(context, 17010);
        this.A01 = AbG.A0X();
    }
}
