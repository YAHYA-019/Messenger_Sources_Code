package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C32.class */
public final class C32 {
    public final 1Br A00;
    public final 1De A01;

    public C32(1De r302) {
        this.A01 = r302;
        this.A00 = AbI.A0O(r302);
    }

    public final void A00(FbUserSession fbUserSession, ThreadKey threadKey, int i) {
        11T.A0F(fbUserSession, 0);
        if (threadKey == null || i <= 0) {
            return;
        }
        Q6v q6v = new Q6v();
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, 4YU.A0z(threadKey), "contact_id");
        07S.A00(A0J, Integer.valueOf(i), "delay_seconds");
        4YV.A1A(A0J, ((2Jf) q6v).A00, "input");
        5Dh r0 = new 5Dh(q6v);
        AbstractC05414dq A06 = 1VX.A06(AbJ.A05(this.A00), fbUserSession);
        4YU.A1J(r0, 578781263070712L);
        A06.A04(r0, 5Dj.A00);
    }
}
