package X;

import android.content.Context;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.base.Function;

/* loaded from: C4v.class */
public final class C4v {
    public Function A00;
    public 1BY A02;
    public final 1K9 A03 = D4q.A00(this, 98);
    public Boolean A01 = false;

    public C4v(1BO r302) {
        this.A02 = 7zL.A0Q(r302);
    }

    public void A00(Function function) {
        Context A04 = AbF.A04(this.A02);
        this.A00 = function;
        GraphQlQueryParamSet A0M = 7zL.A0M();
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FetchHasUserOptedOutEpdConsentQuery", (String) null, "fbandroid", 2125672702, 0, 4032955749L, 4032955749L, false, true);
        r0.A00 = A0M;
        C3sa A0L = AbK.A0L(r0);
        A0L.A0B = false;
        4YU.A1J(A0L, 881081412356415L);
        1Kd.A0E(this.A03, 7zR.A0n(A04, A0L));
    }
}
