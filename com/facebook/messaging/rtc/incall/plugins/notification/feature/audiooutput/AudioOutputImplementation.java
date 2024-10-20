package com.facebook.messaging.rtc.incall.plugins.notification.feature.audiooutput;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.GOn;
import X.HEt;
import X.If4;
import X.JGM;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AudioOutputImplementation.class */
public final class AudioOutputImplementation extends HEt {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final JGM A05;

    public AudioOutputImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A02 = GOn.A0a(context, fbUserSession);
        this.A04 = 1Bq.A00(115627);
        this.A01 = 1Bu.A00(115727);
        this.A03 = 1BK.A0C();
        this.A05 = new If4(this, 3);
    }
}
