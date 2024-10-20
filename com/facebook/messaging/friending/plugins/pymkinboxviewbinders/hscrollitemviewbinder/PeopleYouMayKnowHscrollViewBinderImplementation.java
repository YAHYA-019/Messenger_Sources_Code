package com.facebook.messaging.friending.plugins.pymkinboxviewbinders.hscrollitemviewbinder;

import X.06Z;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.1pI;
import X.2YD;
import X.2YH;
import X.2YQ;
import X.2ZG;
import X.4YV;
import X.7zT;
import X.9Y0;
import X.AbR;
import X.C4Ll;
import X.C9iD;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PeopleYouMayKnowHscrollViewBinderImplementation.class */
public final class PeopleYouMayKnowHscrollViewBinderImplementation {
    public final 1pI A00;
    public final 1Br A01;
    public final 1Br A02;
    public final C9iD A03;
    public final 9Y0 A04;
    public final 2YH A05;
    public final 2YD A06;
    public final 2YQ A07;
    public final Context A08;
    public final 06Z A09;
    public final FbUserSession A0A;

    public PeopleYouMayKnowHscrollViewBinderImplementation(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, 2YH r306, 2YD r307, 2YQ r308) {
        7zT.A1W(context, fbUserSession, r308, r303);
        4YV.A1M(r307, 6, r305);
        this.A08 = context;
        this.A0A = fbUserSession;
        this.A07 = r308;
        this.A09 = r303;
        this.A05 = r306;
        this.A06 = r307;
        this.A00 = r305;
        this.A02 = 1Lm.A00(context, fbUserSession, 33213);
        1Br A00 = 1Bu.A00(897);
        this.A01 = A00;
        this.A03 = ((AbR) 1Br.A0B(A00)).A0S(context, r303, (2ZG) 1Br.A0B(this.A02));
        this.A04 = new 9Y0(new C4Ll(), (2ZG) 1Br.A0B(this.A02));
    }
}
