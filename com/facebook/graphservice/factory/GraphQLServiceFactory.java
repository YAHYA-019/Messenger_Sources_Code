package com.facebook.graphservice.factory;

import X.0KC;
import X.2tU;
import X.C0gh;
import X.C2x5;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.serialization.TreeJsonSerializerJNI;
import com.facebook.graphservice.serialization.TreeSerializerJNI;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;
import com.google.common.base.Preconditions;

/* loaded from: GraphQLServiceFactory.class */
public class GraphQLServiceFactory implements 2tU {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphservice-jni-factory");
    }

    public GraphQLServiceFactory() {
        this.mHybridData = null;
    }

    public GraphQLServiceFactory(GraphServiceAsset graphServiceAsset) {
        this.mHybridData = initHybridData(graphServiceAsset);
    }

    private native String clientDocIdForQueryNameHash(long j);

    public static native HybridData initHybridData(GraphServiceAsset graphServiceAsset);

    private native long legacyPersistIdForQueryNameHash(long j);

    private native TreeBuilderJNI moveTreeBuilder(TreeBuilderJNI treeBuilderJNI, Class cls, int i);

    private native TreeBuilderJNI newTreeBuilderFromTree(TreeJNI treeJNI, Class cls, int i);

    private native TreeBuilderJNI newTreeBuilderFromType(String str, Class cls, int i, boolean z);

    private native TreeBuilderJNI newUpdateBuilderFromTree(TreeJNI treeJNI, Class cls, int i);

    private native long ossPersistIdForQueryNameHash(long j);

    private native String queryTextForQueryNameHash(long j);

    private native String[] transientParametersForQueryNameHash(long j);

    public String clientDocIdForQuery(String str) {
        return clientDocIdForQueryNameHash(Long.parseLong(0KC.A00(str).substring(0, 8), 16));
    }

    public String createClientDocIdForQueryNameHash(long j) {
        return clientDocIdForQueryNameHash(j);
    }

    public long getLegacyPersistIdForQueryNameHash(long j) {
        return legacyPersistIdForQueryNameHash(j);
    }

    public String getQueryTextForQueryNameHash(long j) {
        return queryTextForQueryNameHash(j);
    }

    public String[] getTransientParametersForQueryNameHash(long j) {
        return transientParametersForQueryNameHash(j);
    }

    public C2x5 newTreeBuilder(String str, Class cls, int i) {
        return newTreeBuilderFromType(str, cls, i, false);
    }

    public C2x5 newTreeBuilder(String str, Class cls, int i, Tree tree) {
        boolean z = true;
        if (!tree.isValidGraphServicesJNIModelWithLogging()) {
            z = false;
        }
        Preconditions.checkArgument(z);
        return newTreeBuilderFromTree((TreeJNI) tree, cls, i);
    }

    public TreeBuilderJNI newTreeBuilder(String str) {
        return newTreeBuilderFromType(str, TreeBuilderJNI.class, 0, false);
    }

    public native TreeJsonSerializerJNI newTreeJsonSerializer();

    public native TreeSerializerJNI newTreeSerializer();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r304.isValidGraphServicesJNIModelWithLogging() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C2x5 newUpdateBuilder(java.lang.Class r302, int r303, com.facebook.graphservice.interfaces.Tree r304) {
        /*
            r301 = this;
            java.lang.Class<X.6As> r0 = X.6As.class
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L18
            r0 = r304
            boolean r0 = r0.isValidGraphServicesJNIModelWithLogging()
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L1b
        L18:
            r0 = 0
            r307 = r0
        L1b:
            r0 = r307
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r304
            com.facebook.graphservice.tree.TreeJNI r0 = (com.facebook.graphservice.tree.TreeJNI) r0
            r304 = r0
            r0 = r301
            r1 = r304
            r2 = r305
            r3 = r303
            com.facebook.graphservice.tree.TreeBuilderJNI r0 = r0.newUpdateBuilderFromTree(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphservice.factory.GraphQLServiceFactory.newUpdateBuilder(java.lang.Class, int, com.facebook.graphservice.interfaces.Tree):X.2x5");
    }

    public String persistIdForQuery(String str) {
        return Long.toString(ossPersistIdForQueryNameHash(Long.parseLong(0KC.A00(str).substring(0, 8), 16)));
    }

    public String schemaForQuery(String str) {
        return null;
    }
}
