package com.facebook.rtc.plugins.calllifecycle.bizrtcgicall;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.GOn;
import X.IY8;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BizRtcGICallLifecycle.class */
public final class BizRtcGICallLifecycle {
    public final 1Br A00;
    public final 1Br A01;
    public final IY8 A02;
    public final Context A03;

    public BizRtcGICallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A03 = context;
        this.A00 = GOn.A0U(context, fbUserSession);
        this.A01 = 1Lm.A00(context, fbUserSession, 99978);
        this.A02 = IY8.A01(this, 62);
    }
}
