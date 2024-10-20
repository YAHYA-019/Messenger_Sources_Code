package com.facebook.messaging.communitymessaging.plugins.communitycontainers.inboxcommunityrowclickhandlerincallback;

import X.06Z;
import X.11T;
import X.1BL;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lo;
import X.22I;
import X.2YQ;
import X.C2gi;
import X.C49A;
import X.C4Nz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: InboxCommunityRowClickHandlerInCallbackImplementation.class */
public final class InboxCommunityRowClickHandlerInCallbackImplementation {
    public final 22I A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 2YQ A06;
    public final C2gi A07;
    public final C49A A08;
    public final Context A09;
    public final 06Z A0A;
    public final FbUserSession A0B;
    public final CallerContext A0C;

    public InboxCommunityRowClickHandlerInCallbackImplementation(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, 2YQ r306, C2gi c2gi, String str) {
        1BL.A11(1, context, r306, callerContext);
        1BL.A1G(str, r303);
        11T.A0F(fbUserSession, 7);
        this.A09 = context;
        this.A07 = c2gi;
        this.A06 = r306;
        this.A0C = callerContext;
        this.A0A = r303;
        this.A0B = fbUserSession;
        this.A01 = 1Bq.A00(83164);
        this.A03 = 1Bq.A00(82637);
        this.A02 = 1Bu.A00(68762);
        this.A04 = 1Bu.A00(33266);
        this.A00 = (22I) 1Lo.A04(context, fbUserSession, (1BY) null, 33183);
        this.A05 = 1Bq.A00(16432);
        this.A08 = ((C4Nz) 1Br.A0B(this.A04)).A01(context, r303, fbUserSession, callerContext, str);
    }
}
