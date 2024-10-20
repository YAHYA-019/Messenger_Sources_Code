package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;

/* loaded from: C2z.class */
public final class C2z {
    public final Context A00;
    public final 1De A01;

    public C2z(1De r302) {
        this.A01 = r302;
        this.A00 = AbK.A0A(r302);
    }

    public final void A00(FbUserSession fbUserSession, String str, String str2, String str3) {
        11T.A0F(fbUserSession, 0);
        Q6o q6o = new Q6o();
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, AbstractC00603o4.A00(559));
        07S.A00(A0J, str2, "target_id");
        07S.A00(A0J, str3, "nickname");
        4YV.A1A(A0J, ((2Jf) q6o).A00, "input");
        5Dh r0 = new 5Dh(q6o);
        AbstractC05414dq A05 = 1VX.A05(this.A00, fbUserSession);
        4YU.A1J(r0, 934144090404428L);
        A05.A06(r0);
    }
}
