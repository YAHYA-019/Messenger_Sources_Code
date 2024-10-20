package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: C3x.class */
public final class C3x {
    public final C00i A00 = 7zM.A0P();
    public final 1Br A01;
    public final 1De A02;

    public C3x(1De r302) {
        this.A02 = r302;
        this.A01 = AbI.A0O(r302);
    }

    public final void A00(FbUserSession fbUserSession, DH7 dh7, String str) {
        11T.A0F(fbUserSession, 0);
        07S A02 = GraphQlCallInput.A02.A02();
        GraphQlQueryParamSet A0N = 4YU.A0N(A02, str, "marketplace_meeting_plan_id");
        4YV.A1A(A02, A0N, "input");
        ListenableFuture A0z = AbK.A0z(1VX.A06(AbJ.A05(this.A01), fbUserSession), 5Dh.A00(A0N, new C01643sd(Q8F.class, "DeleteMarketplaceMeetingPlanV2Mutation", null, "input", "fbandroid", -70552896, 96, 626503333L, 626503333L, false, true)), 4235075889840483L);
        1Kd.A0D(this.A00, D4q.A00(dh7, 41), A0z);
    }
}
