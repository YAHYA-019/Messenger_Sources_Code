package com.facebook.messaging.nativepagereply.plugins.privatereplytab.tabcontent;

import X.1BL;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1EZ;
import X.1Fw;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PrivateReplyTabContentImplementation.class */
public final class PrivateReplyTabContentImplementation {
    public boolean A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final MigColorScheme A04;
    public final 1EZ A05;

    public PrivateReplyTabContentImplementation(Context context, MigColorScheme migColorScheme) {
        1BL.A1F(migColorScheme, context);
        this.A04 = migColorScheme;
        this.A01 = context;
        this.A03 = 1Bq.A00(16839);
        1EZ r0 = (1EZ) 1Bn.A0E(context, (1BY) null, 16428);
        this.A05 = r0;
        this.A02 = 1Fw.A04(r0);
    }
}
