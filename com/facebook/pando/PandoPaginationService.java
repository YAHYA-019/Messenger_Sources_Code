package com.facebook.pando;

import X.11T;
import X.1BL;
import X.4SP;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.concurrent.Executor;

/* loaded from: PandoPaginationService.class */
public final class PandoPaginationService {
    public static final 4SP Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SP, java.lang.Object] */
    static {
        C0il.A0B("pando-graphql-jni");
    }

    public PandoPaginationService(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager) {
        1BL.A1H(pandoConsistencyServiceJNI, pandoPrimaryExecution, connectionManager);
        this.mHybridData = initHybridData(pandoConsistencyServiceJNI, pandoPrimaryExecution, connectionManager);
    }

    private final native void appendEdgeNative(String str, TreeJNI treeJNI);

    private final native void deleteEdgeNative(String str, TreeJNI treeJNI);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager);

    private final native void prependEdgeNative(String str, TreeJNI treeJNI);

    public void appendEdge(String str, Object obj) {
        11T.A0F(str, 0);
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        appendEdgeNative(str, (TreeJNI) obj);
    }

    public void deleteEdge(String str, Object obj) {
        11T.A0F(str, 0);
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        deleteEdgeNative(str, (TreeJNI) obj);
    }

    public native IPandoGraphQLService.Token loadNextPage(String str, int i, int i2, boolean z, String str2, Executor executor);

    public native IPandoGraphQLService.Token loadPreviousPage(String str, int i, String str2, Executor executor);

    public void prependEdge(String str, Object obj) {
        11T.A0F(str, 0);
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        prependEdgeNative(str, (TreeJNI) obj);
    }
}
