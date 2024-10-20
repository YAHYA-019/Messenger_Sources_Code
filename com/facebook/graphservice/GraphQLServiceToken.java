package com.facebook.graphservice;

import X.C0gh;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.jni.HybridData;

/* loaded from: GraphQLServiceToken.class */
public class GraphQLServiceToken implements GraphQLService.Token {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphservice-jni");
    }

    public GraphQLServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.Token, X.C3rz
    public native void cancel();
}
