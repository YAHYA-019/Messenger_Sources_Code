package com.facebook.graphql.rtgql.graphqllivequeriessdk.di;

import X.1De;
import X.1EZ;
import X.1Fw;
import X.4YU;
import X.HhC;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.api.GraphQLLiveQueriesSDKProviderAPI;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;

/* loaded from: GraphQLLiveQueriesSDKProviderDI.class */
public final class GraphQLLiveQueriesSDKProviderDI implements GraphQLLiveQueriesSDKProviderAPI {
    public final 1EZ A00;
    public final 1De A01;

    public GraphQLLiveQueriesSDKProviderDI(1De r302) {
        this.A01 = r302;
        this.A00 = (1EZ) 1De.A00(r302, 16428);
    }

    @Override // com.facebook.graphql.rtgql.graphqllivequeriessdk.api.GraphQLLiveQueriesSDKProviderAPI
    public GraphQLLiveQueriesSDKProviderBase getGraphQLLiveQueriesSDKProvider() {
        return ((HhC) 4YU.A0n(1Fw.A04(this.A00), this.A01, 115233)).A00;
    }
}
