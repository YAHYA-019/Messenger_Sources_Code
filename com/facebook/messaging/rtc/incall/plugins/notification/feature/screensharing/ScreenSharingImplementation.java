package com.facebook.messaging.rtc.incall.plugins.notification.feature.screensharing;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.HEt;
import X.IYz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ScreenSharingImplementation.class */
public final class ScreenSharingImplementation extends HEt {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final IYz A03;

    public ScreenSharingImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = 1Bu.A01(context, 67579);
        this.A02 = 1Lm.A00(context, fbUserSession, 114987);
        this.A03 = new IYz(this, 5);
    }
}
