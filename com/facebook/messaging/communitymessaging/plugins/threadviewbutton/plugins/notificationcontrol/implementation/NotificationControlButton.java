package com.facebook.messaging.communitymessaging.plugins.threadviewbutton.plugins.notificationcontrol.implementation;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Bu;
import X.5Sh;
import X.64W;
import X.6FI;
import X.7zM;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: NotificationControlButton.class */
public final class NotificationControlButton {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final ThreadKey A07;
    public final 5Sh A08;
    public final 64W A09;
    public final ThreadViewColorScheme A0A;
    public final 6FI A0B;

    public NotificationControlButton(Context context, 06Z r303, ThreadKey threadKey, 5Sh r305, 64W r306, ThreadViewColorScheme threadViewColorScheme, 6FI r308) {
        11T.A0F(context, 1);
        7zT.A11(3, threadViewColorScheme, threadKey, r303, r308);
        11T.A0F(r306, 7);
        this.A00 = context;
        this.A08 = r305;
        this.A0A = threadViewColorScheme;
        this.A07 = threadKey;
        this.A01 = r303;
        this.A0B = r308;
        this.A09 = r306;
        this.A06 = 1Bu.A01(context, 67632);
        this.A05 = 1Bu.A01(context, 17005);
        this.A04 = 7zM.A0U();
        this.A02 = 1Bu.A01(context, 83118);
        this.A03 = 1Bu.A01(context, 82374);
    }
}
