package com.facebook.interstitial.api;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: GraphQLInterstitialsResultSerializer.class */
public class GraphQLInterstitialsResultSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), GraphQLInterstitialsResult.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        GraphQLInterstitialsResult graphQLInterstitialsResult = (GraphQLInterstitialsResult) obj;
        if (graphQLInterstitialsResult == null) {
            r302.A0Z();
        }
        r302.A0b();
        long j = graphQLInterstitialsResult.clientTimeMs;
        r302.A0o("fetchTimeMs");
        r302.A0g(j);
        boolean z = graphQLInterstitialsResult.isValid;
        r302.A0o("valid");
        r302.A0v(z);
        AbstractC11224vw.A0D(r302, "nuxId", graphQLInterstitialsResult.nuxID);
        int i = graphQLInterstitialsResult.rank;
        r302.A0o("rank");
        r302.A0f(i);
        int i2 = graphQLInterstitialsResult.maxViews;
        r302.A0o("maxViews");
        r302.A0f(i2);
        AbstractC11224vw.A0D(r302, "tree_model", graphQLInterstitialsResult.getModelString());
        r302.A0Y();
    }
}
