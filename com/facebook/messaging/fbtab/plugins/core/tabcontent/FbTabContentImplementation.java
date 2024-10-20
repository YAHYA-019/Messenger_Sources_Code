package com.facebook.messaging.fbtab.plugins.core.tabcontent;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2PF;
import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: FbTabContentImplementation.class */
public final class FbTabContentImplementation {
    public final Context A00;
    public final 2PF A01;
    public final 1Br A02;
    public final 1Br A03;
    public final MigColorScheme A04;

    public FbTabContentImplementation(Context context, MigColorScheme migColorScheme) {
        1BL.A1F(context, migColorScheme);
        this.A00 = context;
        this.A04 = migColorScheme;
        this.A01 = new 2PF(2000L);
        this.A02 = 1Bu.A01(context, 49963);
        this.A03 = 1Bq.A00(16839);
    }
}
