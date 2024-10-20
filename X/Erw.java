package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Erw.class */
public final class Erw {
    public final /* synthetic */ E1q A00;

    public Erw(E1q e1q) {
        this.A00 = e1q;
    }

    public void A00(String str) {
        E1q e1q = this.A00;
        Context context = e1q.A00;
        FbUserSession A0F = 4YV.A0F(context);
        FAS fas = (FAS) 4YU.A0n(A0F, e1q.A01, 99471);
        fas.A0J.clear();
        fas.A0A = true;
        E1q.A01(A0F, e1q);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("app_id", str);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "CoplaySupportedAppQuery", (String) null, "fbandroid", -1112523107, 0, 3714058738L, 3714058738L, false, true));
        A0L.A0A(86400L);
        1FV A09 = ((DKN) 1Bu.A06(context, 68643)).A01().A09(A0L);
        1Br.A0D(e1q.A07, new Fw1(10, A0F, fas, e1q), A09);
    }
}
