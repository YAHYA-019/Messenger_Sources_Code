package com.facebook.messaging.graph.plugins.contactinfomenu.reportcontactmenuitem;

import X.06Z;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.7zN;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: ReportContactMenuItemImplementation.class */
public final class ReportContactMenuItemImplementation {
    public final 06Z A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final User A06;
    public final Context A07;

    public ReportContactMenuItemImplementation(Context context, 06Z r303, FbUserSession fbUserSession, User user) {
        1BL.A11(1, context, r303, fbUserSession);
        this.A07 = context;
        this.A06 = user;
        this.A00 = r303;
        this.A01 = fbUserSession;
        this.A05 = 7zN.A0H(context);
        this.A03 = 1Bu.A01(context, 68120);
        this.A04 = 1Bu.A01(context, 68427);
        this.A02 = 1Lm.A00(context, fbUserSession, 17064);
    }
}
