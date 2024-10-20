package com.facebook.messaging.privacyframework.cmcd.messenger.plugins.cmcddbsource.cmcdperiodicdataloading;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.AG9;
import X.AnonymousClass001;
import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: CMCDPeriodicDataUpdateImplementation.class */
public final class CMCDPeriodicDataUpdateImplementation {
    public final Handler A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Runnable A03;
    public final Context A04;

    public CMCDPeriodicDataUpdateImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A04 = context;
        this.A02 = 1Bq.A00(99801);
        this.A00 = AnonymousClass001.A07();
        this.A01 = 1Lm.A00(context, fbUserSession, 84153);
        this.A03 = new AG9(this);
    }
}
