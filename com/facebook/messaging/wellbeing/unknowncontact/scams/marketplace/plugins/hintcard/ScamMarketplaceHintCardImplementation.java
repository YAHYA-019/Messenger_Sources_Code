package com.facebook.messaging.wellbeing.unknowncontact.scams.marketplace.plugins.hintcard;

import X.06Z;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.4YV;
import X.6IV;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ScamMarketplaceHintCardImplementation.class */
public final class ScamMarketplaceHintCardImplementation {
    public static String A08;
    public static final 1Br A09 = 1Bq.A00(67196);
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final 6IV A05;
    public final MigColorScheme A06;
    public final String A07;

    public ScamMarketplaceHintCardImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, 6IV r306, MigColorScheme migColorScheme, String str) {
        1BL.A1F(context, migColorScheme);
        4YV.A1M(r303, 6, str);
        this.A00 = context;
        this.A06 = migColorScheme;
        this.A02 = fbUserSession;
        this.A04 = threadSummary;
        this.A05 = r306;
        this.A01 = r303;
        this.A07 = str;
        this.A03 = 1Bu.A00(68165);
    }
}
