package com.facebook.messaging.communitymessaging.plugins.memberactions.blockmemberfromgroupmenuitem;

import X.06Z;
import X.0Fy;
import X.0G2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1F9;
import X.1Iw;
import X.2MQ;
import X.4YU;
import X.6EX;
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

/* loaded from: BlockMemberFromGroupMenuItemImplementation.class */
public final class BlockMemberFromGroupMenuItemImplementation {
    public static final /* synthetic */ C06z[] A0A = {new 0Fy(BlockMemberFromGroupMenuItemImplementation.class, "communityId", "getCommunityId()J", 0)};
    public long A00;
    public Long A01;
    public final 06Z A02;
    public final Bs5 A03;
    public final DJY A04;
    public final User A05;
    public final 0G2 A06;
    public final Context A07;
    public final 1Iw A08;
    public final MigColorScheme A09;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0G2, java.lang.Object] */
    public BlockMemberFromGroupMenuItemImplementation(Context context, 06Z r303, 1Iw r304, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zT.A1W(context, r304, migColorScheme, r303);
        1BL.A1G(user, bs5);
        11T.A0F(djy, 7);
        this.A07 = context;
        this.A08 = r304;
        this.A09 = migColorScheme;
        this.A02 = r303;
        this.A05 = user;
        this.A03 = bs5;
        this.A04 = djy;
        this.A06 = new Object();
    }

    public final C1rh A00() {
        ThreadKey threadKey;
        Long A0l;
        1Bn.A0A(83102);
        Bs5 bs5 = this.A03;
        AbH.A1X(this, this.A06, A0A[0], CJH.A00(bs5));
        long A01 = CJH.A01(bs5);
        this.A00 = A01;
        if (bs5.A01 == 1F9.A0B) {
            ThreadSummary threadSummary = bs5.A02;
            if (threadSummary == null || (threadKey = threadSummary.A0n) == null || (A0l = 4YU.A0l(threadKey)) == null) {
                throw 1BK.A0h();
            }
            this.A01 = A0l;
        }
        1Iw r0 = this.A08;
        Context context = r0.A0D;
        int i = 2131953342;
        if (6EX.A00.A04(A01)) {
            i = 2131953343;
        }
        C1rh A00 = B0x.A00(2MQ.A2B, C1u3.A4R, r0, 7zO.A0U(new DD4(this, 29)), this.A09, context.getString(i));
        11T.A0A(A00);
        return A00;
    }
}
