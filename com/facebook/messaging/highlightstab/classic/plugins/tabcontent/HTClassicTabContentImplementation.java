package com.facebook.messaging.highlightstab.classic.plugins.tabcontent;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.2OO;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: HTClassicTabContentImplementation.class */
public final class HTClassicTabContentImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 2OO A04;
    public final MigColorScheme A05;

    public HTClassicTabContentImplementation(Context context, FbUserSession fbUserSession, 2OO r304, MigColorScheme migColorScheme) {
        1BL.A1H(migColorScheme, context, r304);
        11T.A0F(fbUserSession, 4);
        this.A05 = migColorScheme;
        this.A00 = context;
        this.A04 = r304;
        this.A01 = fbUserSession;
        this.A03 = 1Bq.A00(16839);
        this.A02 = 1Bq.A00(67634);
    }
}
