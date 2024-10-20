package com.facebook.messaging.tray.plugins.loader.presence;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2TJ;
import X.2TM;
import X.C2xd;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: TrayPresenceLoaderImpl.class */
public final class TrayPresenceLoaderImpl {
    public 2TM A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 2TJ A03;
    public final Context A04;

    public TrayPresenceLoaderImpl(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A04 = context;
        1Br A00 = 1Bu.A00(1123);
        this.A01 = A00;
        this.A03 = ((C2xd) A00.A00.get()).A0G(context, fbUserSession);
        this.A02 = 1Bq.A00(66516);
        2TM r0 = 2TM.A03;
        11T.A0A(r0);
        this.A00 = r0;
    }
}
