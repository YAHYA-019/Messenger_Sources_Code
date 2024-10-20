package com.facebook.messaging.rtc.incall.plugins.notification.feature.groupescalation;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.GOn;
import X.Gyx;
import X.HEt;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: GroupEscalationImplementation.class */
public final class GroupEscalationImplementation extends HEt {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Gyx A04;

    public GroupEscalationImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = GOn.A0a(context, fbUserSession);
        this.A02 = GOn.A0W(context, fbUserSession);
        this.A03 = 1Lm.A00(context, fbUserSession, 83620);
        this.A04 = new Gyx(this, 11);
    }
}
