package com.facebook.messaging.msys.lifecycle.plugins.lifecycle.notifications;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.C1qM;
import X.C21N;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MsysNotificationHandlerPluginImplementation.class */
public final class MsysNotificationHandlerPluginImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;

    public MsysNotificationHandlerPluginImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 115059);
        this.A04 = 1Lm.A00(context, fbUserSession, 67560);
        this.A03 = 1Lm.A00(context, fbUserSession, 33124);
        this.A05 = 1Bq.A00(83258);
        this.A06 = 1Lm.A00(context, fbUserSession, 33115);
        this.A07 = 1Bq.A00(66723);
    }

    public static final void A00(MsysNotificationHandlerPluginImplementation msysNotificationHandlerPluginImplementation, C1qM c1qM) {
        ((C21N) msysNotificationHandlerPluginImplementation.A03.A00.get()).A00(c1qM);
    }

    public static final void A01(MsysNotificationHandlerPluginImplementation msysNotificationHandlerPluginImplementation, C1qM c1qM) {
        ((C21N) msysNotificationHandlerPluginImplementation.A03.A00.get()).A01(c1qM);
    }
}
