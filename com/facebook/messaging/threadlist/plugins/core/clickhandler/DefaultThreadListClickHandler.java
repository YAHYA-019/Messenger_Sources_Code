package com.facebook.messaging.threadlist.plugins.core.clickhandler;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2YQ;
import X.49D;
import X.C01g;
import X.C01i;
import X.C2gi;
import X.C49A;
import X.C83M;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: DefaultThreadListClickHandler.class */
public final class DefaultThreadListClickHandler {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2YQ A07;
    public final C2gi A08;
    public final C01i A09;

    public DefaultThreadListClickHandler(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, 2YQ r306, C2gi c2gi, 49D r308, String str) {
        11T.A0F(context, 1);
        11T.A0F(r308, 2);
        11T.A0F(callerContext, 3);
        11T.A0F(str, 4);
        11T.A0F(r303, 5);
        11T.A0F(c2gi, 6);
        11T.A0F(r306, 7);
        11T.A0F(fbUserSession, 8);
        this.A00 = context;
        this.A08 = c2gi;
        this.A07 = r306;
        this.A01 = fbUserSession;
        this.A06 = 1Bu.A00(33266);
        this.A09 = C01g.A01(new C83M(this, callerContext, r303, str, 0));
        this.A04 = 1Bq.A00(33013);
        this.A03 = 1Bq.A00(49223);
        this.A02 = 1Bq.A00(82689);
        this.A05 = 1Lm.A00(context, fbUserSession, 33197);
        Object value = this.A09.getValue();
        11T.A0A(value);
        r308.A00((C49A) value);
    }
}
