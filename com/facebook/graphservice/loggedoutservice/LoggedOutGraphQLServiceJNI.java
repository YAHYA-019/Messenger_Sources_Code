package com.facebook.graphservice.loggedoutservice;

import X.11T;
import X.1BL;
import X.4SD;
import X.AnonymousClass001;
import X.C04144a3;
import X.C0gh;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: LoggedOutGraphQLServiceJNI.class */
public final class LoggedOutGraphQLServiceJNI implements GraphQLService {
    public static final 4SD Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SD, java.lang.Object] */
    static {
        C0gh.A02("graphservice-jni-loggedoutservice");
    }

    public LoggedOutGraphQLServiceJNI() {
    }

    public LoggedOutGraphQLServiceJNI(GraphServiceAsset graphServiceAsset, TigonServiceHolder tigonServiceHolder, ScheduledExecutorService scheduledExecutorService) {
        1BL.A1H(graphServiceAsset, tigonServiceHolder, scheduledExecutorService);
        this.mHybridData = initHybridData(graphServiceAsset, tigonServiceHolder, scheduledExecutorService);
    }

    private final native GraphQLService.Token handleQueryJNI(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    private final native HybridData initHybridData(GraphServiceAsset graphServiceAsset, TigonServiceHolder tigonServiceHolder, ScheduledExecutorService scheduledExecutorService);

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void appendEdgeForKey(String str, Tree tree) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void consumeBugReportToFile(File file) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token handleQuery(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks, Executor executor) {
        11T.A0G(graphQLQuery, 0, executor);
        return handleQueryJNI(graphQLQuery, new C04144a3(graphQLQuery, dataCallbacks), executor);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token handleQuery(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks, Executor executor, String str) {
        return handleQuery(graphQLQuery, dataCallbacks, executor);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token loadNextPageForKey(String str, int i, int i2, boolean z, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z2) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token loadPreviousPageForKey(String str, int i, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void pandoAppendEdgeForKey(String str, Tree tree) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token pandoLoadNextPageForKey(String str, int i, int i2, boolean z, Map map, GraphQLService.OperationCallbacks operationCallbacks, String str2, Executor executor) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token pandoLoadPreviousPageForKey(String str, int i, String str2, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void pandoPrependEdgeForKey(String str, Tree tree) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void prependEdgeForKey(String str, Tree tree) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void replaceEdgeForKey(String str, Tree tree, String str2) {
        throw AnonymousClass001.A0p();
    }
}
