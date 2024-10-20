package com.facebook.messaging.nativepagereply.privatereply.commenttab.data;

import X.02W;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1EZ;
import X.1Fw;
import X.1G1;
import X.1Lo;
import X.2Jf;
import X.2PB;
import X.2yD;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.7zN;
import X.AnonymousClass001;
import X.C91j;
import X.C9fd;
import X.F9Q;
import X.Rof;
import android.content.Context;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: PrivateReplyCommentsDataFetch.class */
public final class PrivateReplyCommentsDataFetch extends 5iK {
    public C91j A00;
    public 5iJ A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.nativepagereply.privatereply.commenttab.data.PrivateReplyCommentsDataFetch, java.lang.Object] */
    public static PrivateReplyCommentsDataFetch create(5iJ r301, C91j c91j) {
        ?? obj = new Object();
        obj.A01 = r301;
        obj.A00 = c91j;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A01;
        11T.A0F(r0, 0);
        02W.A04(AnonymousClass001.A1V(1Bn.A0A(33058)));
        Context context = r0.A00;
        1EZ r02 = (1EZ) 7zN.A0k(context, 16428);
        1G1 A04 = 1Fw.A04(r02);
        String str = A04.A02;
        ((C9fd) 1Lo.A04(context, A04, (1BY) null, 68276)).A02.clear();
        2PB r03 = (2PB) 1Bn.A0A(66600);
        Rof rof = new Rof();
        GraphQlQueryParamSet graphQlQueryParamSet = rof.A01;
        graphQlQueryParamSet.A05("pageID", str);
        rof.A03 = true;
        graphQlQueryParamSet.A05("commType", 2yD.A02(1Br.A07(r03.A00), 36888404658751272L));
        rof.A02 = true;
        F9Q f9q = new F9Q((2Jf) null, rof);
        f9q.A04 = r02.BKF();
        return F9Q.A00(r0, f9q, 367103207806489L);
    }
}
