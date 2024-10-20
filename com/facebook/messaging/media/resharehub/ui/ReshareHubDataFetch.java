package com.facebook.messaging.media.resharehub.ui;

import X.11T;
import X.1BL;
import X.1Bn;
import X.1Br;
import X.2Jd;
import X.2Jf;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.7zK;
import X.C1Ur;
import X.C6h2;
import X.C91l;
import X.DKC;
import X.Ee3;
import X.F9Q;
import X.GOm;
import X.Rod;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.media.resharehub.model.ReshareHubTabModel;

/* loaded from: ReshareHubDataFetch.class */
public final class ReshareHubDataFetch extends 5iK {
    public ReshareHubTabModel A00;
    public C91l A01;
    public 5iJ A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.media.resharehub.ui.ReshareHubDataFetch, java.lang.Object] */
    public static ReshareHubDataFetch create(5iJ r301, C91l c91l) {
        ?? obj = new Object();
        obj.A02 = r301;
        obj.A00 = c91l.A01;
        obj.A01 = c91l;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A02;
        ReshareHubTabModel reshareHubTabModel = this.A00;
        boolean A1X = 1BL.A1X(r0, reshareHubTabModel);
        Ee3 ee3 = (Ee3) 1Bn.A0A(99547);
        String str = reshareHubTabModel.A02.value;
        11T.A0F(str, 0);
        2Jd A0Q = DKC.A0Q();
        A0Q.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 11T.A03("POST"));
        GraphQlCallInput A0Q2 = DKC.A0Q();
        A0Q2.A09("query_type", str);
        A0Q2.A09("query", "");
        A0Q2.A0A(GOm.A00(69), 11T.A03(A0Q));
        A0Q2.A0A("result_types", 11T.A03("REEL"));
        A0Q2.A08("num", Integer.valueOf(C1Ur.A00(1Br.A06(((C6h2) 1Br.A0B(ee3.A00)).A00), 100, 36601152951031118L)));
        A0Q2.A09(7zK.A00(272), "SKIP");
        Rod rod = new Rod();
        rod.A01.A01(A0Q2, "request");
        rod.A02 = A1X;
        F9Q f9q = new F9Q((2Jf) null, rod);
        f9q.A02(86400L);
        f9q.A0A = A1X;
        return F9Q.A00(r0, f9q, 1248360392661872L);
    }
}
