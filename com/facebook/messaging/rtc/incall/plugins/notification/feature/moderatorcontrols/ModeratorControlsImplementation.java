package com.facebook.messaging.rtc.incall.plugins.notification.feature.moderatorcontrols;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.7zM;
import X.GOn;
import X.HEt;
import X.HxJ;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ModeratorControlsImplementation.class */
public final class ModeratorControlsImplementation extends HEt {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final HxJ A0B;

    public ModeratorControlsImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A05 = 1Lm.A00(context, fbUserSession, 114855);
        this.A08 = 7zM.A0P();
        this.A06 = 1Bu.A01(context, 67579);
        this.A02 = GOn.A0b(context, fbUserSession);
        this.A0A = 1Lm.A00(context, fbUserSession, 67965);
        this.A03 = GOn.A0Z(context, fbUserSession);
        this.A07 = GOn.A0W(context, fbUserSession);
        this.A01 = GOn.A0a(context, fbUserSession);
        this.A04 = GOn.A0R(context);
        this.A09 = GOn.A0T(context, fbUserSession);
        this.A0B = new HxJ(this);
    }
}
