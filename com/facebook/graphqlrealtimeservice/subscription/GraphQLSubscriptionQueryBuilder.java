package com.facebook.graphqlrealtimeservice.subscription;

import X.C0gh;
import com.facebook.graphservice.GraphQLQueryBuilder;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;

/* loaded from: GraphQLSubscriptionQueryBuilder.class */
public class GraphQLSubscriptionQueryBuilder {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphqlrt-subscription-jni");
    }

    public GraphQLSubscriptionQueryBuilder(GraphQLQueryBuilder graphQLQueryBuilder, String str, String str2, int i) {
        this.mHybridData = initHybridData(graphQLQueryBuilder, str, str2, i);
    }

    public static native HybridData initHybridData(GraphQLQueryBuilder graphQLQueryBuilder, String str, String str2, int i);

    public native GraphQLQuery getResult();
}
