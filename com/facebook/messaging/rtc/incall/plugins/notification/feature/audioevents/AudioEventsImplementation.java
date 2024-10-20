package com.facebook.messaging.rtc.incall.plugins.notification.feature.audioevents;

import X.1BK;
import X.1BL;
import X.1Br;
import X.GOn;
import X.HEt;
import X.IY8;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AudioEventsImplementation.class */
public final class AudioEventsImplementation extends HEt {
    public boolean A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final IY8 A04;

    public AudioEventsImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A03 = GOn.A0U(context, fbUserSession);
        this.A02 = 1BK.A0C();
        this.A04 = IY8.A01(this, 51);
    }
}
