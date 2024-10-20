package com.facebook.messaging.rtc.incall.plugins.notification.feature.room;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.1qP;
import X.54D;
import X.GOn;
import X.Gpy;
import X.HEt;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RoomImplementation.class */
public final class RoomImplementation extends HEt {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1qP A03;
    public final 54D A04;

    public RoomImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A02 = GOn.A0T(context, fbUserSession);
        this.A01 = 1Lm.A00(context, fbUserSession, 84176);
        this.A04 = new 54D(fbUserSession, context);
        this.A03 = new Gpy(this, 10);
    }
}
