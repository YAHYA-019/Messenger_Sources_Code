package com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.interactive;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.GgB;
import X.HEt;
import X.HVt;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InteractiveEffectNotificationFeature.class */
public final class InteractiveEffectNotificationFeature extends HEt {
    public final Context A00;
    public final FbUserSession A01;
    public final GgB A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final HVt A06;

    public InteractiveEffectNotificationFeature(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = 1Lm.A00(context, fbUserSession, 114790);
        this.A03 = 1Lm.A00(context, fbUserSession, 98355);
        this.A05 = 1Bu.A01(context, 67579);
        this.A02 = new GgB(this, 3);
        this.A06 = new HVt(this);
    }
}
