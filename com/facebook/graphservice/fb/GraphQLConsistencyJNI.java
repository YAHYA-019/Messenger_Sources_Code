package com.facebook.graphservice.fb;

import X.2HW;
import X.AnonymousClass001;
import X.C00s;
import X.C0gh;
import X.C2x5;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.config.GraphQLConsistencyConfig;
import com.facebook.graphservice.interfaces.GraphQLConsistency;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoPublishPostProcessorProvider;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: GraphQLConsistencyJNI.class */
public class GraphQLConsistencyJNI extends PandoPublishPostProcessorProvider implements GraphQLConsistency, 2HW {

    /* loaded from: GraphQLConsistencyJNI$MutationHandle.class */
    public class MutationHandle {
        public final HybridData mHybridData;

        static {
            C0gh.A02("graphservice-jni-facebook");
        }

        public MutationHandle(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void commit();

        public native void rollback();
    }

    static {
        C0gh.A02("graphservice-jni-facebook");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GraphQLConsistencyJNI(com.facebook.graphservice.asset.GraphServiceAsset r302, java.util.concurrent.Executor r303, java.util.concurrent.ScheduledExecutorService r304, com.facebook.graphservice.config.GraphQLConsistencyConfig r305, com.facebook.pando.PandoConsistencyServiceJNI r306, boolean r307, java.lang.String r308, java.util.concurrent.Executor r309) {
        /*
            r301 = this;
            r0 = 2052904713(0x7a5cd709, float:2.8666668E35)
            r310 = r0
            java.lang.String r0 = "GraphQLConsistencyJNI.tracedInitHybridData"
            r1 = r310
            X.C00j.A05(r0, r1)
            r0 = r303
            r311 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r305
            r4 = r306
            r5 = r307
            r6 = r308
            r7 = r309
            com.facebook.jni.HybridData r0 = initHybridData(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2c
            r311 = r0
            r0 = -555136628(0xffffffffdee9498c, float:-8.4050605E18)
            X.C00j.A01(r0)
            r0 = r301
            r1 = r311
            r0.<init>(r1)
            return
        L2c:
            r311 = move-exception
            r0 = -572996801(0xffffffffddd8c33f, float:-1.9524247E18)
            X.C00j.A01(r0)
            r0 = r311
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphservice.fb.GraphQLConsistencyJNI.<init>(com.facebook.graphservice.asset.GraphServiceAsset, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, com.facebook.graphservice.config.GraphQLConsistencyConfig, com.facebook.pando.PandoConsistencyServiceJNI, boolean, java.lang.String, java.util.concurrent.Executor):void");
    }

    private native ListenableFuture applyOptimistic(TreeJNI treeJNI, TreeJNI treeJNI2, GraphQLConsistency.MutationPublisherRequest mutationPublisherRequest);

    private native ListenableFuture applyOptimisticBuilder(TreeBuilderJNI treeBuilderJNI, TreeJNI treeJNI, GraphQLConsistency.MutationPublisherRequest mutationPublisherRequest);

    private TreeJNI assertTree(Object obj) {
        if (!(obj instanceof TreeJNI)) {
            throw AnonymousClass001.A0L("Can only subscribe on an instance served from GraphQLService");
        }
        if (((Tree) obj).isValidGraphServicesJNIModelWithLogging()) {
            return (TreeJNI) obj;
        }
        throw AnonymousClass001.A0L("Tree is not backed by native data");
    }

    public static native HybridData initHybridData(GraphServiceAsset graphServiceAsset, Executor executor, ScheduledExecutorService scheduledExecutorService, GraphQLConsistencyConfig graphQLConsistencyConfig, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, boolean z, String str, Executor executor2);

    private native ListenableFuture lookup(TreeJNI treeJNI, Class cls, int i);

    private native ListenableFuture publish(TreeJNI treeJNI, boolean z);

    private native ListenableFuture publishBuilder(TreeBuilderJNI treeBuilderJNI, boolean z);

    private native GraphQLService.Token subscribe(TreeJNI treeJNI, GraphQLService.DataCallbacks dataCallbacks, Executor executor, Class cls, int i, boolean z);

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture applyOptimistic(Tree tree, Tree tree2, GraphQLConsistency.MutationPublisherRequest mutationPublisherRequest) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return applyOptimistic((TreeJNI) tree, (TreeJNI) tree2, mutationPublisherRequest);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture applyOptimisticBuilder(C2x5 c2x5, Tree tree, GraphQLConsistency.MutationPublisherRequest mutationPublisherRequest) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return applyOptimisticBuilder((TreeBuilderJNI) c2x5, (TreeJNI) tree, mutationPublisherRequest);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public ListenableFuture lookup(Object obj) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return lookup(assertTree(obj), obj.getClass(), ((Tree) obj).getTypeTag());
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture publish(Tree tree) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return publish((TreeJNI) tree, false);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency, com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public ListenableFuture publishBuilder(C2x5 c2x5) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return publishBuilder((TreeBuilderJNI) c2x5, false);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency, com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public ListenableFuture publishBuilderWithFullConsistency(C2x5 c2x5) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return publishBuilder((TreeBuilderJNI) c2x5, true);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture publishWithFullConsistency(Tree tree) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return publish((TreeJNI) tree, true);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public GraphQLService.Token subscribe(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return subscribe(assertTree(obj), dataCallbacks, executor, obj.getClass(), ((Tree) obj).getTypeTag(), false);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public GraphQLService.Token subscribeWithFullConsistency(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor) {
        GraphQLServiceJNI graphQLServiceJNI = GraphQLServiceJNI.$redex_init_class;
        C00s.A00();
        return subscribe(assertTree(obj), dataCallbacks, executor, obj.getClass(), ((Tree) obj).getTypeTag(), true);
    }

    public void trimToMinimum() {
    }

    public void trimToNothing() {
    }
}
