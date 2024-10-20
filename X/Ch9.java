package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: Ch9.class */
public final class Ch9 implements GEx {
    public final /* synthetic */ FFo A00;

    public Ch9(FFo fFo) {
        this.A00 = fFo;
    }

    @Override // X.GEx
    public final C3sa Ao9() {
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A04("apps_paginated_first", Integer.valueOf(this.A00.A01));
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "CoplaySupportedAppsPaginatedQuery", (String) null, "fbandroid", 350582153, 0, 1964874365L, 1964874365L, false, true));
        4YV.A1B(A0L);
        return A0L;
    }
}
