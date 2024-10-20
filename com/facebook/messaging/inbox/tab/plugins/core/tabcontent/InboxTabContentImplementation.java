package com.facebook.messaging.inbox.tab.plugins.core.tabcontent;

import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Mg;
import X.2OO;
import X.C00i;
import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: InboxTabContentImplementation.class */
public final class InboxTabContentImplementation {
    public final int A00;
    public final Context A01;
    public final 2OO A08;
    public final MigColorScheme A09;
    public final boolean A0A;
    public final User A0B;
    public final C00i A07 = new 1BQ(16839);
    public final C00i A05 = new 1BQ(66550);
    public final C00i A06 = new 1BV(973);
    public final C00i A03 = new 1BQ(68519);
    public final C00i A04 = new 1BV(66416);
    public final 1Mg A02 = (1Mg) 1Bi.A03(100175);

    public InboxTabContentImplementation(Context context, 2OO r303, MigColorScheme migColorScheme, User user, int i, boolean z) {
        this.A01 = context;
        this.A08 = r303;
        this.A09 = migColorScheme;
        this.A0B = user;
        this.A0A = z;
        this.A00 = i;
    }
}
