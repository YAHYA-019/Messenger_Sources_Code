package com.facebook.graphql.rtgql.graphqlsubscriptionssdk;

import X.11T;
import X.C0il;
import X.HHT;
import com.facebook.graphql.rtgql.sdk.SessionToken;
import com.facebook.jni.HybridData;

/* loaded from: GraphQLSubscriptionsSDK.class */
public final class GraphQLSubscriptionsSDK {
    public static final HHT Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HHT, java.lang.Object] */
    static {
        C0il.A0B("graphqlsubscriptionssdk");
    }

    public GraphQLSubscriptionsSDK(GraphQLSubscriptionsSDKProvider graphQLSubscriptionsSDKProvider) {
        11T.A0F(graphQLSubscriptionsSDKProvider, 1);
        this.mHybridData = initHybrid(graphQLSubscriptionsSDKProvider);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(GraphQLSubscriptionsSDKProvider graphQLSubscriptionsSDKProvider);

    public final native SessionToken subscribe(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, GraphQLSDKRequestStreamDataCallbacks graphQLSDKRequestStreamDataCallbacks);
}
