package com.facebook.graphservice.fb;

import X.1BQ;
import X.2Jd;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C0gh;
import X.C4Vj;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.config.GraphQLServiceConfig;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;
import com.facebook.livequery.core.common.LiveQueryServiceFactory;
import com.facebook.nativeutil.NativeMap;
import com.facebook.pando.ConnectionManager;
import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.reactivesocket.flipper.common.FlipperLiveDataProviderFactory;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.stash.core.FileStash;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.nativeservice.authed.NativeAuthedTigonServiceHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: GraphQLServiceJNI.class */
public class GraphQLServiceJNI implements GraphQLService {
    public static final GraphQLServiceJNI $redex_init_class = null;
    public final String mAuthToken;
    public final HybridData mHybridData;
    public final NativeAuthedTigonServiceHolder mNativeAuthedTigonServiceHolder;
    public final C00i mFbErrorReporter = new 1BQ(16511);
    public final C00i mSessionlessMC = new 1BQ(16386);

    static {
        C0gh.A02("graphservice-jni-facebook");
    }

    public GraphQLServiceJNI(GraphServiceAsset graphServiceAsset, TigonServiceHolder tigonServiceHolder, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, LiveQueryServiceFactory liveQueryServiceFactory, FlipperLiveDataProviderFactory flipperLiveDataProviderFactory, FileStash fileStash, ExecutorService executorService, GraphQLConsistencyJNI graphQLConsistencyJNI, RealtimeConfigSourceProxy realtimeConfigSourceProxy, GraphQLServiceConfig graphQLServiceConfig, XAnalyticsHolder xAnalyticsHolder, GraphQLObserverExecutor graphQLObserverExecutor, PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, ConnectionManager connectionManager, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.mNativeAuthedTigonServiceHolder = tigonServiceHolder instanceof NativeAuthedTigonServiceHolder ? (NativeAuthedTigonServiceHolder) tigonServiceHolder : null;
        this.mAuthToken = str;
        C00j.A05("GraphQLServiceJNI.tracedInitHybridData", -1497460832);
        try {
            HybridData initHybridData = initHybridData(graphServiceAsset, tigonServiceHolder, scheduledExecutorService, scheduledExecutorService2, liveQueryServiceFactory, flipperLiveDataProviderFactory, fileStash, executorService, graphQLConsistencyJNI, realtimeConfigSourceProxy, graphQLServiceConfig, xAnalyticsHolder, graphQLObserverExecutor, pandoPrimaryExecution, pandoGraphQLConsistencyJNI, connectionManager, str, str2, z, z2, z3, z4, z5);
            C00j.A01(592100453);
            this.mHybridData = initHybridData;
        } catch (Throwable th) {
            C00j.A01(-2061583397);
            throw th;
        }
    }

    private native void appendEdgeForKey(String str, TreeJNI treeJNI);

    private native void consumeBugReportToFile(String str);

    public static NativeMap convertJavaParameterMapToNativeMap(Map map) {
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet(map);
        NativeMap nativeMap = new NativeMap();
        2Jd r0 = graphQlQueryParamSet.A00;
        GraphQlCallInput.A02(r0.A00, r0, nativeMap);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            if (A0z.getValue() == null) {
                nativeMap.put(AnonymousClass001.A0j(A0z), (Object) null);
            }
        }
        return nativeMap;
    }

    private native GraphQLService.Token handleQueryJNI(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    private native GraphQLService.Token handleRefetchQueryJNI(TreeJNI treeJNI, long j, Executor executor);

    public static native HybridData initHybridData(GraphServiceAsset graphServiceAsset, TigonServiceHolder tigonServiceHolder, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, LiveQueryServiceFactory liveQueryServiceFactory, FlipperLiveDataProviderFactory flipperLiveDataProviderFactory, FileStash fileStash, ExecutorService executorService, GraphQLConsistencyJNI graphQLConsistencyJNI, RealtimeConfigSourceProxy realtimeConfigSourceProxy, GraphQLServiceConfig graphQLServiceConfig, XAnalyticsHolder xAnalyticsHolder, GraphQLObserverExecutor graphQLObserverExecutor, PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, ConnectionManager connectionManager, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    private native GraphQLService.Token loadNextPageForKey(String str, int i, int i2, boolean z, NativeMap nativeMap, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z2);

    private native void pandoAppendEdgeForKeyNative(String str, TreeJNI treeJNI);

    private native IPandoGraphQLService.Token pandoLoadNextPageForKeyNative(String str, int i, int i2, boolean z, NativeMap nativeMap, GraphQLService.OperationCallbacks operationCallbacks, String str2, Executor executor);

    private native IPandoGraphQLService.Token pandoLoadPreviousPageForKeyNative(String str, int i, String str2, NativeMap nativeMap, GraphQLService.OperationCallbacks operationCallbacks, Executor executor);

    private native void pandoPrependEdgeForKeyNative(String str, TreeJNI treeJNI);

    private native void prependEdgeForKey(String str, TreeJNI treeJNI);

    private native void replaceEdgeForKey(String str, TreeJNI treeJNI, String str2);

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void appendEdgeForKey(String str, Tree tree) {
        appendEdgeForKey(str, (TreeJNI) tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void consumeBugReportToFile(File file) {
        consumeBugReportToFile(file.getCanonicalPath());
    }

    public native void deleteEdgeForKey(String str, String str2);

    public native GraphQLService.Token experimentalResetForKey(String str, boolean z, GraphQLService.OperationCallbacks operationCallbacks, Executor executor);

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token handleQuery(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks, Executor executor) {
        return handleQuery(graphQLQuery, dataCallbacks, executor, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.mAuthToken) != false) goto L44;
     */
    @Override // com.facebook.graphservice.interfaces.GraphQLService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.graphservice.interfaces.GraphQLService.Token handleQuery(com.facebook.graphservice.interfaces.GraphQLQuery r302, com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks r303, java.util.concurrent.Executor r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphservice.fb.GraphQLServiceJNI.handleQuery(com.facebook.graphservice.interfaces.GraphQLQuery, com.facebook.graphservice.interfaces.GraphQLService$DataCallbacks, java.util.concurrent.Executor, java.lang.String):com.facebook.graphservice.interfaces.GraphQLService$Token");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token loadNextPageForKey(String str, int i, int i2, boolean z, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z2) {
        return loadNextPageForKey(str, i, i2, false, convertJavaParameterMapToNativeMap(map), operationCallbacks, executor, str2, false);
    }

    public native GraphQLService.Token loadPreviousPageForKey(String str, int i, NativeMap nativeMap, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z);

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token loadPreviousPageForKey(String str, int i, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z) {
        return loadPreviousPageForKey(str, i, convertJavaParameterMapToNativeMap(map), operationCallbacks, executor, str2, false);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void pandoAppendEdgeForKey(String str, Tree tree) {
        pandoAppendEdgeForKeyNative(str, (TreeJNI) tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token pandoLoadNextPageForKey(String str, int i, int i2, boolean z, Map map, GraphQLService.OperationCallbacks operationCallbacks, String str2, Executor executor) {
        return new C4Vj(this, pandoLoadNextPageForKeyNative(str, i, i2, false, convertJavaParameterMapToNativeMap(map), operationCallbacks, str2, executor));
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token pandoLoadPreviousPageForKey(String str, int i, String str2, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor) {
        return new C4Vj(this, pandoLoadPreviousPageForKeyNative(str, i, str2, convertJavaParameterMapToNativeMap(map), operationCallbacks, executor));
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void pandoPrependEdgeForKey(String str, Tree tree) {
        pandoPrependEdgeForKeyNative(str, (TreeJNI) tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void prependEdgeForKey(String str, Tree tree) {
        prependEdgeForKey(str, (TreeJNI) tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void replaceEdgeForKey(String str, Tree tree, String str2) {
        replaceEdgeForKey(str, (TreeJNI) tree, str2);
    }
}
