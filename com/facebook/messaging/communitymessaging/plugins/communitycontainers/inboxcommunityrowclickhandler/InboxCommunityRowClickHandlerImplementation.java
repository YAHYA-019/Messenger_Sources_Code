package com.facebook.messaging.communitymessaging.plugins.communitycontainers.inboxcommunityrowclickhandler;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2YQ;
import X.C2gi;
import X.C49A;
import X.C4Nz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: InboxCommunityRowClickHandlerImplementation.class */
public final class InboxCommunityRowClickHandlerImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2YQ A07;
    public final C2gi A08;
    public final C49A A09;
    public final CallerContext A0A;

    public InboxCommunityRowClickHandlerImplementation(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, 2YQ r306, C2gi c2gi, String str) {
        1BL.A11(1, context, r306, callerContext);
        1BL.A1G(str, r303);
        11T.A0F(fbUserSession, 7);
        this.A00 = context;
        this.A08 = c2gi;
        this.A07 = r306;
        this.A0A = callerContext;
        this.A01 = r303;
        this.A02 = fbUserSession;
        1Br A00 = 1Bu.A00(33266);
        this.A06 = A00;
        this.A09 = ((C4Nz) 1Br.A0B(A00)).A01(context, r303, fbUserSession, callerContext, str);
        this.A04 = 1Bu.A00(68762);
        this.A03 = 1Bq.A00(83164);
        this.A05 = 1Bq.A00(82637);
    }
}
