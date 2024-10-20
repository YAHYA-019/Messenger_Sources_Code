package com.facebook.messaging.search.messages.listfragment.threadlist;

import X.07S;
import X.1Bi;
import X.1EK;
import X.1iF;
import X.1qF;
import X.2Jf;
import X.4YU;
import X.4YV;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.5iL;
import X.5iN;
import X.AbE;
import X.EA9;
import X.F9Q;
import X.Ffm;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: MessageSearchThreadPaginableListQueryDataFetch.class */
public final class MessageSearchThreadPaginableListQueryDataFetch extends 5iK {
    public String A00;
    public EA9 A01;
    public 5iJ A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.search.messages.listfragment.threadlist.MessageSearchThreadPaginableListQueryDataFetch, java.lang.Object] */
    public static MessageSearchThreadPaginableListQueryDataFetch create(5iJ r301, EA9 ea9) {
        ?? obj = new Object();
        obj.A02 = r301;
        obj.A00 = ea9.A00;
        obj.A01 = ea9;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A02;
        String str = this.A00;
        1qF r02 = (1qF) 1Bi.A03(16824);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "query");
        07S.A00(A0J, "CONTENT", "search_type");
        Ffm ffm = new Ffm();
        GraphQlQueryParamSet graphQlQueryParamSet = ffm.A01;
        4YV.A1A(A0J, graphQlQueryParamSet, "query_params");
        ffm.A02 = true;
        graphQlQueryParamSet.A04(AbE.A00(192), Integer.valueOf(r02.A00(50)));
        F9Q f9q = new F9Q((2Jf) null, ffm);
        f9q.A02(0L);
        f9q.A05 = new 1iF(1EK.A01(), 0L);
        return 5iN.A00(r0, 5iL.A01(r0, f9q));
    }
}
