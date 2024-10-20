package com.facebook.rtc.plugins.calllifecycle.rsys;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.2JM;
import X.GOn;
import X.IY8;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RsysCallLifecycle.class */
public final class RsysCallLifecycle {
    public int A00;
    public boolean A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2JM A07;

    public RsysCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A06 = GOn.A0U(context, fbUserSession);
        this.A05 = GOn.A0W(context, fbUserSession);
        this.A04 = 1Bq.A00(115690);
        this.A07 = IY8.A01(this, 63);
    }
}
