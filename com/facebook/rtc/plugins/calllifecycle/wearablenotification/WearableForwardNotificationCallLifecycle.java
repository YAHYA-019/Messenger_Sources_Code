package com.facebook.rtc.plugins.calllifecycle.wearablenotification;

import X.11T;
import X.1BL;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.GOn;
import X.IY8;
import android.content.Context;
import android.util.LruCache;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Set;

/* loaded from: WearableForwardNotificationCallLifecycle.class */
public final class WearableForwardNotificationCallLifecycle {
    public final LruCache A00;
    public final 1Br A01;
    public final 1Br A02;
    public final IY8 A03;
    public final Set A04;
    public final Context A05;
    public final FbUserSession A06;

    public WearableForwardNotificationCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A05 = context;
        this.A06 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 99978);
        this.A01 = GOn.A0U(context, fbUserSession);
        Set A0I = 1Bn.A0I(16414);
        11T.A0A(A0I);
        this.A04 = A0I;
        this.A00 = new LruCache(10);
        this.A03 = IY8.A01(this, 64);
    }
}
