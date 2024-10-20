package com.facebook.models.graphql.legacy;

import X.C0il;
import X.C30G;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.fb.GraphQLServiceJNI;
import com.facebook.jni.HybridData;
import com.facebook.models.interfaces.ManifestLoaderBase;

/* loaded from: GraphQLManifestLoader.class */
public class GraphQLManifestLoader extends ManifestLoaderBase {
    public static final C30G queryString = new C30G(90);

    static {
        C0il.A0B("models");
    }

    public static native HybridData initHybrid(GraphQLServiceJNI graphQLServiceJNI, GraphServiceAsset graphServiceAsset, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, long j, boolean z);
}
