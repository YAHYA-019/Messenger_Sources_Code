package com.facebook.messaging.communitymessaging.plugins.memberactions.removememberfromgroupmenuitem;

import X.06Z;
import X.0Fy;
import X.0G2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1F9;
import X.1Iw;
import X.2MQ;
import X.4YU;
import X.6EX;
import X.7zL;
import X.7zO;
import X.7zT;
import X.AbH;
import X.B0x;
import X.Bs5;
import X.C06z;
import X.C1rh;
import X.C1u3;
import X.CJH;
import X.DD4;
import X.DJY;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: RemoveMemberFromGroupMenuItemImplementation.class */
public final class RemoveMemberFromGroupMenuItemImplementation {
    public static final /* synthetic */ C06z[] A0A = {new 0Fy(RemoveMemberFromGroupMenuItemImplementation.class, "communityId", "getCommunityId()J", 0)};
    public long A00;
    public Long A01;
    public final Context A02;
    public final 06Z A03;
    public final 1Iw A04;
    public final Bs5 A05;
    public final DJY A06;
    public final User A07;
    public final 0G2 A08;
    public final MigColorScheme A09;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0G2, java.lang.Object] */
    public RemoveMemberFromGroupMenuItemImplementation(Context context, 06Z r303, 1Iw r304, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zT.A1W(context, r304, migColorScheme, r303);
        1BL.A1G(user, bs5);
        11T.A0F(djy, 7);
        this.A02 = context;
        this.A04 = r304;
        this.A09 = migColorScheme;
        this.A03 = r303;
        this.A07 = user;
        this.A05 = bs5;
        this.A06 = djy;
        this.A08 = new Object();
    }

    public final C1rh A00() {
        ThreadKey threadKey;
        Long A0l;
        1Iw r0 = this.A04;
        Context A0A2 = 7zL.A0A(r0);
        1Bn.A0E(A0A2, (1BY) null, 83102);
        Bs5 bs5 = this.A05;
        AbH.A1X(this, this.A08, A0A[0], CJH.A00(bs5));
        long A01 = CJH.A01(bs5);
        this.A00 = A01;
        if (bs5.A01 == 1F9.A0B) {
            ThreadSummary threadSummary = bs5.A02;
            if (threadSummary == null || (threadKey = threadSummary.A0n) == null || (A0l = 4YU.A0l(threadKey)) == null) {
                throw 1BK.A0h();
            }
            this.A01 = A0l;
        }
        int i = 2131964316;
        if (6EX.A00.A04(A01)) {
            i = 2131964325;
        }
        C1rh A00 = B0x.A00(2MQ.A10, C1u3.A1x, r0, 7zO.A0U(new DD4(this, 33)), this.A09, A0A2.getString(i));
        11T.A0A(A00);
        return A00;
    }
}
