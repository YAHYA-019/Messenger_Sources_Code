package com.facebook.rtc.plugins.calllifecycle.expression;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.GOn;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RtcExpressionCallLifecycle.class */
public final class RtcExpressionCallLifecycle {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;

    public RtcExpressionCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = GOn.A0Y(context, fbUserSession);
        this.A04 = 1Bu.A00(114745);
        this.A01 = 1Lm.A00(context, fbUserSession, 99846);
        this.A02 = 1Bu.A01(context, 99980);
        this.A03 = 1Bu.A01(context, 99983);
    }
}
