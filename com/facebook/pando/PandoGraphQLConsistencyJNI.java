package com.facebook.pando;

import X.11T;
import X.1BL;
import X.C0il;
import X.C3rw;
import X.GI4;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: PandoGraphQLConsistencyJNI.class */
public final class PandoGraphQLConsistencyJNI {
    public static final C3rw Companion = new Object();
    public final PandoConsistencyServiceJNI consistencyService;
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3rw] */
    static {
        C0il.A0B("pando-graphql-jni");
    }

    public PandoGraphQLConsistencyJNI(PandoConsistencyServiceJNI pandoConsistencyServiceJNI) {
        11T.A0F(pandoConsistencyServiceJNI, 1);
        this.consistencyService = pandoConsistencyServiceJNI;
        this.mHybridData = initHybridData(pandoConsistencyServiceJNI);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(PandoConsistencyServiceJNI pandoConsistencyServiceJNI);

    public static /* synthetic */ void publishTreeUpdaters$default(PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        pandoGraphQLConsistencyJNI.publishTreeUpdaters(list, z);
    }

    private final native IPandoGraphQLService.Result subscribeNative(TreeJNI treeJNI, Class cls, NativeCallbacks nativeCallbacks, Executor executor);

    private final native IPandoGraphQLService.Token subscribeWithJavaASTNative(TreeJNI treeJNI, Class cls, NativeCallbacks nativeCallbacks, Executor executor);

    public final PandoConsistencyServiceJNI getInnerConsistencyService() {
        return this.consistencyService;
    }

    public final native boolean hasSubscribersRacey();

    public final native void publish(String str);

    public final native void publishTreeUpdaters(List list, boolean z);

    public final IPandoGraphQLService.Result subscribe(Object obj, Class cls, GI4 gi4, Executor executor) {
        1BL.A1H(cls, gi4, executor);
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        return subscribeNative((TreeJNI) obj, cls, new NativeCallbacks(gi4), executor);
    }

    public final IPandoGraphQLService.Token subscribeWithJavaAST(TreeJNI treeJNI, GI4 gi4, Executor executor) {
        11T.A0F(treeJNI, 0);
        1BL.A1F(gi4, executor);
        return subscribeWithJavaASTNative(treeJNI, treeJNI.getClass(), new NativeCallbacks(gi4), executor);
    }
}
