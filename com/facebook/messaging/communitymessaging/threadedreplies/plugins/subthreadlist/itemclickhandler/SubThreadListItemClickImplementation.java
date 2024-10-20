package com.facebook.messaging.communitymessaging.threadedreplies.plugins.subthreadlist.itemclickhandler;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.2YQ;
import X.C2gi;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: SubThreadListItemClickImplementation.class */
public final class SubThreadListItemClickImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final CallerContext A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 2YQ A06;
    public final C2gi A07;
    public final String A08;

    public SubThreadListItemClickImplementation(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, 2YQ r306, C2gi c2gi, String str) {
        1BL.A1H(context, callerContext, str);
        11T.A0F(r303, 4);
        11T.A0F(fbUserSession, 5);
        11T.A0F(r306, 7);
        this.A00 = context;
        this.A03 = callerContext;
        this.A08 = str;
        this.A01 = r303;
        this.A02 = fbUserSession;
        this.A07 = c2gi;
        this.A06 = r306;
        this.A04 = 1Bu.A00(68762);
        this.A05 = 1Bu.A00(33266);
    }
}
