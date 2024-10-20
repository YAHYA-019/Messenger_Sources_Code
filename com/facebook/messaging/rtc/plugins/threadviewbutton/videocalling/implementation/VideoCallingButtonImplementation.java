package com.facebook.messaging.rtc.plugins.threadviewbutton.videocalling.implementation;

import X.1Bq;
import X.1Br;
import X.1Bu;
import X.5Sh;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: VideoCallingButtonImplementation.class */
public final class VideoCallingButtonImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A05;
    public final 1Br A06;
    public final ThreadKey A09;
    public final NavigationTrigger A0A;
    public final 5Sh A0B;
    public final String A0C;
    public final 1Br A07 = 1Bu.A00(99984);
    public final 1Br A04 = 1Bu.A00(82663);
    public final 1Br A08 = 1Bq.A00(68252);
    public final 1Br A03 = 1Bu.A00(82664);
    public final 1Br A02 = 1Bq.A00(17012);

    public VideoCallingButtonImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, NavigationTrigger navigationTrigger, 5Sh r306, String str) {
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A09 = threadKey;
        this.A0B = r306;
        this.A0A = navigationTrigger;
        this.A0C = str;
        this.A06 = 1Bu.A01(context, 84855);
        this.A05 = 1Bu.A01(context, 83327);
    }
}
