package com.facebook.messaging.tray.plugins.loader.closeconnections;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Te;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: TrayCloseConnectionsLoaderImpl.class */
public final class TrayCloseConnectionsLoaderImpl {
    public final 1Br A00;
    public final 1Br A01;
    public final 2Te A02;
    public final AtomicBoolean A03;

    public TrayCloseConnectionsLoaderImpl(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        1Br A00 = 1Bu.A00(66512);
        this.A00 = A00;
        A00.A00.get();
        this.A02 = new 2Te(context, fbUserSession);
        this.A01 = 1Lm.A00(context, fbUserSession, 66278);
        this.A03 = new AtomicBoolean(false);
    }
}
