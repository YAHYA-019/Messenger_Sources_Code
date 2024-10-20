package com.facebook.messaging.friendsinboxunit.plugins.memoriesloader.implementation;

import X.11T;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Lo;
import X.2U8;
import X.2UB;
import X.2UE;
import X.2UF;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MemoriesInboxUnitLoaderImplementation.class */
public final class MemoriesInboxUnitLoaderImplementation {
    public boolean A00;
    public final 1Br A01;
    public final 2UF A02;
    public final 2UE A03;
    public final 2UB A04;
    public final 2U8 A05;

    public MemoriesInboxUnitLoaderImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        1Bn.A0A(66127);
        this.A05 = new 2U8(context, fbUserSession);
        1Bn.A0A(66126);
        this.A04 = new 2UB(context, fbUserSession);
        1Bn.A0A(66125);
        this.A03 = new 2UE(context, fbUserSession);
        this.A02 = (2UF) 1Lo.A04(context, fbUserSession, (1BY) null, 67249);
        this.A01 = 1Bu.A00(68662);
    }
}
