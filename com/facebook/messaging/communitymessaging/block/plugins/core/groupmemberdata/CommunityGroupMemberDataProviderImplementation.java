package com.facebook.messaging.communitymessaging.block.plugins.core.groupmemberdata;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.7zT;
import X.AYO;
import X.BNT;
import X.C25;
import X.C3M;
import X.Cw2;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CommunityGroupMemberDataProviderImplementation.class */
public final class CommunityGroupMemberDataProviderImplementation {
    public boolean A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final BNT A07;
    public final C25 A08;
    public final C3M A09;
    public final AYO A0A;
    public final Context A0B;

    public CommunityGroupMemberDataProviderImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, BNT bnt, C25 c25, C3M c3m) {
        11T.A0F(context, 1);
        7zT.A11(3, c25, c3m, bnt, fbUserSession);
        this.A0B = context;
        this.A06 = threadKey;
        this.A08 = c25;
        this.A09 = c3m;
        this.A07 = bnt;
        this.A01 = fbUserSession;
        this.A02 = 1Bu.A01(context, 83215);
        this.A05 = 1Bq.A00(83062);
        this.A04 = 1HG.A00(context, 68574);
        this.A03 = 1Bq.A00(83216);
        this.A0A = new Cw2(this);
    }
}
