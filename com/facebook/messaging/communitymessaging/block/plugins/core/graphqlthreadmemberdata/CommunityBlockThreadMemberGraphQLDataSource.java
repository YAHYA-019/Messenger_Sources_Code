package com.facebook.messaging.communitymessaging.block.plugins.core.graphqlthreadmemberdata;

import X.03Y;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.7zT;
import X.AYO;
import X.AbG;
import X.AnonymousClass001;
import X.AnonymousClass543;
import X.BNT;
import X.C25;
import X.C3M;
import X.Cw1;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphservice.interfaces.PaginableList;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CommunityBlockThreadMemberGraphQLDataSource.class */
public final class CommunityBlockThreadMemberGraphQLDataSource {
    public static final AnonymousClass543 A0G = new AnonymousClass543(36, 36);
    public static final 03Y A0H = 1BK.A1G(true, AnonymousClass001.A0s());
    public PaginableList A00;
    public ThreadSummary A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final ThreadKey A0B;
    public final BNT A0C;
    public final C25 A0D;
    public final C3M A0E;
    public final AYO A0F;

    public CommunityBlockThreadMemberGraphQLDataSource(Context context, FbUserSession fbUserSession, ThreadKey threadKey, BNT bnt, C25 c25, C3M c3m) {
        11T.A0F(context, 1);
        7zT.A11(3, fbUserSession, bnt, c25, c3m);
        this.A02 = context;
        this.A0B = threadKey;
        this.A03 = fbUserSession;
        this.A0C = bnt;
        this.A0D = c25;
        this.A0E = c3m;
        this.A08 = 1BK.A0C();
        this.A07 = 1Bq.A00(147535);
        this.A05 = 1HG.A00(context, 68574);
        this.A06 = 1Bu.A00(83430);
        this.A04 = 1Bq.A00(83216);
        this.A0A = AbG.A0W();
        this.A09 = 1Bq.A00(16431);
        this.A0F = new Cw1(this);
    }
}
