package com.facebook.messaging.publicchats.plugins.channelinvites.publicchannelinvitesitemsupplier;

import X.0S2;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2SI;
import X.2Si;
import X.2T7;
import X.2V5;
import X.Bge;
import X.C2xd;
import X.C87v;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.StaticUnitConfig;

/* loaded from: PublicChannelInvitesItemSupplierImplementation.class */
public final class PublicChannelInvitesItemSupplierImplementation {
    public static final StaticUnitConfig A07 = new StaticUnitConfig(0S2.A01, "1553637598292592", 2T7.A00("1553637598292592"), false);
    public C87v A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 2Si A03;
    public final Bge A04;
    public final 2V5 A05;
    public final Context A06;

    public PublicChannelInvitesItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304) {
        1BL.A1H(fbUserSession, r304, context);
        this.A03 = r304;
        this.A06 = context;
        this.A01 = 1Lm.A00(context, fbUserSession, 82725);
        1Br A00 = 1Bu.A00(17160);
        this.A02 = A00;
        this.A05 = ((C2xd) 1Br.A0B(A00)).A0I(context, fbUserSession, 2SI.A0D);
        this.A04 = new Bge(this);
    }
}
