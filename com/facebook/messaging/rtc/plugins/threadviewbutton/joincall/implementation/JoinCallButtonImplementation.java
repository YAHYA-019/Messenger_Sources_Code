package com.facebook.messaging.rtc.plugins.threadviewbutton.joincall.implementation;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.5Sh;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: JoinCallButtonImplementation.class */
public final class JoinCallButtonImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final NavigationTrigger A07;
    public final 5Sh A08;
    public final ThreadViewColorScheme A09;
    public final String A0A;

    public JoinCallButtonImplementation(Context context, ThreadKey threadKey, NavigationTrigger navigationTrigger, 5Sh r305, ThreadViewColorScheme threadViewColorScheme, String str) {
        11T.A0F(threadViewColorScheme, 6);
        this.A00 = context;
        this.A06 = threadKey;
        this.A08 = r305;
        this.A07 = navigationTrigger;
        this.A0A = str;
        this.A09 = threadViewColorScheme;
        this.A04 = 1Bu.A00(99984);
        this.A02 = 1Bu.A00(82663);
        this.A05 = 1Bq.A00(68252);
        this.A03 = 1Bu.A01(context, 83327);
        this.A01 = 1Bu.A00(82664);
    }
}
