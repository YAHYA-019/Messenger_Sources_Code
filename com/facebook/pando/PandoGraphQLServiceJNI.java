package com.facebook.pando;

import X.11T;
import X.4SO;
import X.C0il;
import X.C3o5;
import X.GI4;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PandoGraphQLServiceJNI.class */
public final class PandoGraphQLServiceJNI implements IPandoGraphQLService {
    public static final 4SO Companion = new Object();
    public final PandoGraphQLConsistencyJNI mGraphqlConsistency;
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SO, java.lang.Object] */
    static {
        C0il.A0B("pando-graphql-jni");
    }

    public PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor) {
        this.mGraphqlConsistency = pandoGraphQLConsistencyJNI;
        this.mHybridData = initHybridData(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, z2, z3, executor);
    }

    public /* synthetic */ PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : executor);
    }

    public /* synthetic */ PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor, DefaultConstructorMarker defaultConstructorMarker) {
        this(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, z2, z3, executor);
    }

    public static final PandoGraphQLServiceJNI createDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, Executor executor) {
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, true, z, z2, executor);
    }

    public static final PandoGraphQLServiceJNI createNonDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, Executor executor) {
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, false, true, false, executor);
    }

    public static /* synthetic */ void getMGraphqlConsistency$annotations() {
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor);

    public static /* synthetic */ HybridData initHybridData$default(PandoGraphQLServiceJNI pandoGraphQLServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor, int i, Object obj) {
        if ((i & 32) != 0) {
            executor = null;
        }
        return pandoGraphQLServiceJNI.initHybridData(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, z2, z3, executor);
    }

    private final native IPandoGraphQLService.Result initiateNative(String str, PandoGraphQLRequest pandoGraphQLRequest, NativeCallbacks nativeCallbacks, Executor executor);

    @Override // com.facebook.pando.IPandoGraphQLService
    public PandoGraphQLConsistencyJNI graphQLConsistency() {
        return this.mGraphqlConsistency;
    }

    @Override // com.facebook.pando.IPandoGraphQLService
    public IPandoGraphQLService.Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, GI4 gi4, Executor executor) {
        11T.A0F(pandoGraphQLRequest, 1);
        NativeCallbacks nativeCallbacks = null;
        if (gi4 != null) {
            nativeCallbacks = new NativeCallbacks(gi4);
        }
        return initiateNative(str, pandoGraphQLRequest, nativeCallbacks, executor);
    }

    public void pandoAppendEdge(String str, TreeJNI treeJNI) {
        11T.A0H(str, treeJNI);
        pandoAppendEdgeNative(str, treeJNI);
    }

    public final native void pandoAppendEdgeNative(String str, TreeJNI treeJNI);

    public IPandoGraphQLService.Token pandoLoadNextPage(String str, int i, int i2, boolean z, String str2, Executor executor) {
        11T.A0F(str, 0);
        C3o5.A0k(str2, 4, executor);
        return pandoLoadNextPageNative(str, i, i2, z, str2, executor);
    }

    public final native IPandoGraphQLService.Token pandoLoadNextPageNative(String str, int i, int i2, boolean z, String str2, Executor executor);

    public IPandoGraphQLService.Token pandoLoadPreviousPage(String str, int i, String str2, Executor executor) {
        11T.A0G(str, 0, str2);
        11T.A0F(executor, 3);
        return pandoLoadPreviousPageNative(str, i, str2, executor);
    }

    public final native IPandoGraphQLService.Token pandoLoadPreviousPageNative(String str, int i, String str2, Executor executor);

    public void pandoPrependEdge(String str, TreeJNI treeJNI) {
        11T.A0H(str, treeJNI);
        pandoPrependEdgeNative(str, treeJNI);
    }

    public final native void pandoPrependEdgeNative(String str, TreeJNI treeJNI);
}
