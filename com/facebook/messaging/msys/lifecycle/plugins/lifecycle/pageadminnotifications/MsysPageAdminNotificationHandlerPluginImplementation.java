package com.facebook.messaging.msys.lifecycle.plugins.lifecycle.pageadminnotifications;

import X.11T;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.AnonymousClass205;
import X.C1qM;
import X.CxN;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MsysPageAdminNotificationHandlerPluginImplementation.class */
public final class MsysPageAdminNotificationHandlerPluginImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final C1qM A03;
    public final AnonymousClass205 A04;

    public MsysPageAdminNotificationHandlerPluginImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 33124);
        this.A04 = (AnonymousClass205) 1Bn.A0E(context, (1BY) null, 16894);
        this.A03 = new CxN(this, 2);
    }
}
