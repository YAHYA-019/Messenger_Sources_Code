package com.facebook.messaging.publicchats.plugins.threadlist.clickhandler.unjoined;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Hb;
import X.1Lm;
import X.2SG;
import X.2SI;
import X.2YQ;
import X.49D;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C2gi;
import X.C49A;
import X.EnumC3499Mfu;
import X.G9N;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: UnjoinedPublicChannelClickHandlerImplementation.class */
public final class UnjoinedPublicChannelClickHandlerImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 2YQ A06;
    public final C2gi A07;
    public final C01i A08;

    public UnjoinedPublicChannelClickHandlerImplementation(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, 2YQ r306, C2gi c2gi, 49D r308, String str) {
        1BL.A1H(context, r308, callerContext);
        11T.A0F(str, 4);
        11T.A0F(r303, 5);
        1BK.A1L(r306, 7, fbUserSession);
        this.A00 = context;
        this.A07 = c2gi;
        this.A06 = r306;
        this.A01 = fbUserSession;
        this.A05 = 1Bu.A00(33266);
        this.A08 = C01g.A00(C03i.A04, new G9N(callerContext, this, r303, str, 5));
        this.A03 = 1Bq.A00(49223);
        this.A02 = 1Bq.A00(82689);
        this.A04 = 1Lm.A01(fbUserSession, 33197);
        Object value = this.A08.getValue();
        11T.A0A(value);
        r308.A00((C49A) value);
    }

    public static final EnumC3499Mfu A00(UnjoinedPublicChannelClickHandlerImplementation unjoinedPublicChannelClickHandlerImplementation) {
        C2gi c2gi = unjoinedPublicChannelClickHandlerImplementation.A07;
        if (c2gi.A01.A2Q) {
            if (c2gi.A02 == 2SI.A0D) {
                return EnumC3499Mfu.A0j;
            }
            if (((2SG) 1Br.A0B(unjoinedPublicChannelClickHandlerImplementation.A04)).A00 == 1Hb.A06) {
                return EnumC3499Mfu.A0c;
            }
        }
        return EnumC3499Mfu.A0Z;
    }
}
