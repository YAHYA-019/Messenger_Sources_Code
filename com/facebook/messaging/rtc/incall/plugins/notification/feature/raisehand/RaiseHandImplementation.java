package com.facebook.messaging.rtc.incall.plugins.notification.feature.raisehand;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.GOn;
import X.GqB;
import X.HEt;
import X.HFb;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RaiseHandImplementation.class */
public final class RaiseHandImplementation extends HEt {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final HFb A08;

    public RaiseHandImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A07 = 1Bu.A00(16430);
        this.A05 = GOn.A0b(context, fbUserSession);
        this.A06 = GOn.A0W(context, fbUserSession);
        this.A04 = 1Lm.A00(context, fbUserSession, 114858);
        this.A02 = 1Bu.A01(context, 114937);
        this.A03 = 1Lm.A00(context, fbUserSession, 114845);
        this.A08 = new GqB(this, 5);
    }
}
