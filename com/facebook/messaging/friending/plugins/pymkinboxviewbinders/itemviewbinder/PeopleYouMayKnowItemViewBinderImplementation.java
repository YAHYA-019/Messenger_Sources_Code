package com.facebook.messaging.friending.plugins.pymkinboxviewbinders.itemviewbinder;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2YD;
import X.2YH;
import X.2YQ;
import X.2ZG;
import X.7zT;
import X.9Y0;
import X.AbR;
import X.C4Ll;
import X.C9iD;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PeopleYouMayKnowItemViewBinderImplementation.class */
public final class PeopleYouMayKnowItemViewBinderImplementation {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C9iD A04;
    public final 9Y0 A05;
    public final 2YH A06;
    public final 2YD A07;
    public final 2YQ A08;
    public final Context A09;
    public final 06Z A0A;
    public final C4Ll A0B;

    public PeopleYouMayKnowItemViewBinderImplementation(Context context, 06Z r303, FbUserSession fbUserSession, 2YH r305, 2YD r306, 2YQ r307) {
        7zT.A1W(context, fbUserSession, r307, r303);
        11T.A0F(r306, 6);
        this.A09 = context;
        this.A00 = fbUserSession;
        this.A08 = r307;
        this.A0A = r303;
        this.A06 = r305;
        this.A07 = r306;
        this.A01 = 1Bu.A00(897);
        this.A02 = 1Lm.A00(context, fbUserSession, 33213);
        this.A04 = ((AbR) 1Br.A0B(this.A01)).A0S(context, r303, (2ZG) 1Br.A0B(this.A02));
        C4Ll c4Ll = new C4Ll();
        this.A0B = c4Ll;
        this.A05 = new 9Y0(c4Ll, (2ZG) 1Br.A0B(this.A02));
        this.A03 = 1Bu.A00(33214);
    }
}
