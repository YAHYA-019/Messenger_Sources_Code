package com.facebook.messaging.montage.viewer.seensheet;

import X.1BK;
import X.1BO;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Du;
import X.1Kd;
import X.1VX;
import X.2JX;
import X.2JY;
import X.2Jf;
import X.4YU;
import X.4fE;
import X.7zL;
import X.AbF;
import X.AbH;
import X.AbK;
import X.AbstractC05414dq;
import X.AbstractC2326GOr;
import X.C00i;
import X.C03713yu;
import X.C1pq;
import X.C2397Gbz;
import X.C3sa;
import X.C5op;
import X.GOn;
import X.HU4;
import X.Inh;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ExecutorService;

/* loaded from: MontageViewerFollowerSeenCountSubscription.class */
public final class MontageViewerFollowerSeenCountSubscription implements CallerContextable {
    public int A00;
    public C5op A01;
    public 1BY A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public final Context A09 = AbF.A04((1BY) null);
    public final 4fE A05 = (4fE) 1Bn.A0E((Context) null, (1BY) null, 68126);
    public final C00i A07 = AbH.A0F();
    public final ExecutorService A08 = (ExecutorService) GOn.A16();
    public final C00i A06 = 1BV.A01((1BY) null, 33031);

    public MontageViewerFollowerSeenCountSubscription(1BO r302) {
        this.A02 = 7zL.A0Q(r302);
    }

    public static ImmutableList A00(2JX r301) {
        2JY A0B;
        String A0j;
        if (r301 == null) {
            return null;
        }
        ImmutableList A0a = r301.A0a(-1460929019, 2JX.class);
        if (A0a.isEmpty()) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = A0a.iterator();
        while (it.hasNext()) {
            2JY A0P = 7zL.A0P(it);
            String A0k = A0P.A0k();
            if (A0k != null && (A0B = 1BK.A0B(A0P, 2JX.class, 266399994, -1551541261)) != null && (A0j = A0B.A0j()) != null) {
                UserKey A0X = 1BK.A0X(A0k);
                C1pq.A08("userKey", A0X);
                builder.m11011add((Object) new MontageUser(A0X, A0j, 0L));
            }
        }
        return builder.build();
    }

    public static void A01(FbUserSession fbUserSession, C2397Gbz c2397Gbz, HU4 hu4, MontageViewerFollowerSeenCountSubscription montageViewerFollowerSeenCountSubscription) {
        String str = hu4.A00;
        if (str.startsWith("sent")) {
            return;
        }
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("story_id", str);
        A0M.A03("include_participants", false);
        AbstractC05414dq A09 = 1VX.A09(montageViewerFollowerSeenCountSubscription.A09, fbUserSession);
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FollowerSeenCountQuery", (String) null, "fbandroid", -1853566911, 0, 3964367243L, 3964367243L, false, true);
        AbstractC2326GOr.A1D(A0M, r0);
        C3sa A0L = AbK.A0L(r0);
        4YU.A1J(A0L, 1567251216773138L);
        C03713yu A03 = A09.A03(A0L);
        1Kd.A0D(montageViewerFollowerSeenCountSubscription.A07, new Inh(9, hu4, c2397Gbz, montageViewerFollowerSeenCountSubscription), A03);
    }

    public void A02() {
        C5op c5op = this.A01;
        if (c5op != null) {
            c5op.A00();
            this.A01 = null;
        }
        4fE r0 = this.A05;
        if (r0 != null) {
            r0.A0G();
        }
        this.A03 = null;
        this.A04 = null;
    }
}
