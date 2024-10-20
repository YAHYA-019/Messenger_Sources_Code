package com.facebook.rtc.plugins.calllifecycle.missedcall;

import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.7zM;
import X.GOn;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MissedCallLifecycle.class */
public final class MissedCallLifecycle {
    public final FbUserSession A00;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A02 = 7zM.A0d();
    public final 1Br A07 = 1Bq.A00(99975);
    public final 1Br A03 = 1Bu.A00(83850);
    public final 1Br A01 = 1Bu.A00(68141);

    public MissedCallLifecycle(Context context, FbUserSession fbUserSession) {
        this.A00 = fbUserSession;
        this.A06 = 1Lm.A00(context, fbUserSession, 99978);
        this.A04 = 1Lm.A00(context, fbUserSession, 82473);
        this.A05 = GOn.A0U(context, fbUserSession);
    }
}
