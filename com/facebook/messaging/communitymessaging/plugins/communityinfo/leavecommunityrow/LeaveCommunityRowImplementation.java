package com.facebook.messaging.communitymessaging.plugins.communityinfo.leavecommunityrow;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.2Sh;
import X.7zR;
import X.DHc;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: LeaveCommunityRowImplementation.class */
public final class LeaveCommunityRowImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final DHc A05;
    public final MigColorScheme A06;
    public final 2Sh A07;

    public LeaveCommunityRowImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, DHc dHc, MigColorScheme migColorScheme, 2Sh r307) {
        7zR.A1O(context, fbUserSession);
        1BL.A1G(migColorScheme, dHc);
        this.A04 = threadSummary;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A07 = r307;
        this.A06 = migColorScheme;
        this.A05 = dHc;
        this.A03 = 1Bu.A00(82454);
        this.A02 = 1Bu.A01(context, 82384);
    }
}
