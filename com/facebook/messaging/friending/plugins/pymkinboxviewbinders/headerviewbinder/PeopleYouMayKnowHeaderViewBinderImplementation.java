package com.facebook.messaging.friending.plugins.pymkinboxviewbinders.headerviewbinder;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Iw;
import X.1Lm;
import X.1pI;
import X.7zT;
import X.C4Ll;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PeopleYouMayKnowHeaderViewBinderImplementation.class */
public final class PeopleYouMayKnowHeaderViewBinderImplementation {
    public final 06Z A00;
    public final 1pI A01;
    public final 1Br A02;
    public final 1Iw A03;
    public final C4Ll A04;
    public final Context A05;
    public final FbUserSession A06;

    public PeopleYouMayKnowHeaderViewBinderImplementation(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, 1Iw r306) {
        7zT.A1W(context, fbUserSession, r306, r305);
        11T.A0F(r303, 5);
        this.A05 = context;
        this.A06 = fbUserSession;
        this.A03 = r306;
        this.A01 = r305;
        this.A00 = r303;
        this.A04 = new C4Ll();
        this.A02 = 1Lm.A00(context, fbUserSession, 33213);
    }
}
