package com.facebook.graphservice.interfaces;

import X.C3rz;
import com.facebook.tigon.TigonErrorException;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: GraphQLService.class */
public interface GraphQLService {

    /* loaded from: GraphQLService$DataCallbacks.class */
    public interface DataCallbacks {
        void onError(TigonErrorException tigonErrorException, Summary summary);

        void onUpdate(Tree tree, Summary summary);
    }

    /* loaded from: GraphQLService$OperationCallbacks.class */
    public interface OperationCallbacks {
        void onError(TigonErrorException tigonErrorException);

        void onSuccess();
    }

    /* loaded from: GraphQLService$Token.class */
    public interface Token extends C3rz {
        @Override // X.C3rz
        void cancel();
    }

    void appendEdgeForKey(String str, Tree tree);

    void consumeBugReportToFile(File file);

    Token handleQuery(GraphQLQuery graphQLQuery, DataCallbacks dataCallbacks, Executor executor);

    Token handleQuery(GraphQLQuery graphQLQuery, DataCallbacks dataCallbacks, Executor executor, String str);

    Token loadNextPageForKey(String str, int i, int i2, boolean z, Map map, OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z2);

    Token loadPreviousPageForKey(String str, int i, Map map, OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z);

    void pandoAppendEdgeForKey(String str, Tree tree);

    Token pandoLoadNextPageForKey(String str, int i, int i2, boolean z, Map map, OperationCallbacks operationCallbacks, String str2, Executor executor);

    Token pandoLoadPreviousPageForKey(String str, int i, String str2, Map map, OperationCallbacks operationCallbacks, Executor executor);

    void pandoPrependEdgeForKey(String str, Tree tree);

    void prependEdgeForKey(String str, Tree tree);

    void replaceEdgeForKey(String str, Tree tree, String str2);
}
