package com.facebook.rtc.plugins.calllifecycle.mediaprefetch;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ThreadMediaPrefetchLifecycle.class */
public final class ThreadMediaPrefetchLifecycle {
    public String A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;

    public ThreadMediaPrefetchLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A03 = 1Bq.A00(65837);
        this.A04 = 1Bu.A01(context, 49353);
        this.A05 = 1BK.A0C();
    }
}
