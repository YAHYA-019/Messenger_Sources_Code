package com.facebook.graphqlrealtimeservice;

import X.C0gh;
import X.EVx;
import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.jni.HybridData;

/* loaded from: GraphQLRealtimeServiceToken.class */
public final class GraphQLRealtimeServiceToken implements GraphQLRealtimeService.Token {
    public static final EVx Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.EVx] */
    static {
        C0gh.A02("graphqlrealtimeservice-jni");
    }

    public GraphQLRealtimeServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.Token, X.C3rz
    public native void cancel();
}
