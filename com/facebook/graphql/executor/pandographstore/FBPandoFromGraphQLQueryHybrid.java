package com.facebook.graphql.executor.pandographstore;

import X.C0il;
import X.EVv;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.NativeCallbacks;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.pando.PandoToken;
import java.util.concurrent.Executor;

/* loaded from: FBPandoFromGraphQLQueryHybrid.class */
public final class FBPandoFromGraphQLQueryHybrid {
    public static final EVv Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EVv, java.lang.Object] */
    static {
        C0il.A0B("pando-graphstore-jni");
    }

    public static final native PandoToken initiate(GraphQLQuery graphQLQuery, PandoGraphQLServiceJNI pandoGraphQLServiceJNI, NativeCallbacks nativeCallbacks, Executor executor, Class cls, GraphServiceAsset graphServiceAsset, boolean z);

    public static final native IPandoGraphQLService.Result subscribe(PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, TreeJNI treeJNI, GraphQLService.DataCallbacks dataCallbacks, Executor executor, Class cls, int i);
}
