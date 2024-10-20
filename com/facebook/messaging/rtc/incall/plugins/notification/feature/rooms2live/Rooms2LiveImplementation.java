package com.facebook.messaging.rtc.incall.plugins.notification.feature.rooms2live;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.Gpu;
import X.HEt;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Rooms2LiveImplementation.class */
public final class Rooms2LiveImplementation extends HEt {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Gpu A04;

    public Rooms2LiveImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A02 = 1Lm.A00(context, fbUserSession, 84176);
        this.A03 = 1Bu.A00(16430);
        this.A01 = 1Bu.A00(67963);
        this.A00 = 1Bu.A00(67964);
        this.A04 = new Gpu(context, this);
    }
}
