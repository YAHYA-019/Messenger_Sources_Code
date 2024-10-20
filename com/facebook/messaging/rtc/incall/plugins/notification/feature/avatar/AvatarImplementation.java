package com.facebook.messaging.rtc.incall.plugins.notification.feature.avatar;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.GOn;
import X.Gpo;
import X.HEt;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AvatarImplementation.class */
public final class AvatarImplementation extends HEt {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final Gpo A05;

    public AvatarImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = GOn.A0c(context, fbUserSession);
        this.A02 = 1Bu.A01(context, 114932);
        this.A04 = 1Bu.A00(16430);
        this.A05 = new Gpo(this, 6);
    }
}
