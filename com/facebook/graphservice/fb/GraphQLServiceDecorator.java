package com.facebook.graphservice.fb;

import X.C3NZ;
import X.Fgi;
import X.Fgj;
import com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Tree;
import com.google.common.base.Preconditions;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: GraphQLServiceDecorator.class */
public class GraphQLServiceDecorator implements GraphQLService {
    public final GraphQLService A00;

    public GraphQLServiceDecorator(GraphQLService graphQLService) {
        Preconditions.checkNotNull(graphQLService, "Got null GraphQLService in GraphQLServiceDecorator");
        this.A00 = graphQLService;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void appendEdgeForKey(String str, Tree tree) {
        this.A00.appendEdgeForKey(str, tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void consumeBugReportToFile(File file) {
        this.A00.consumeBugReportToFile(file);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token handleQuery(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks, Executor executor) {
        C3NZ c3nz = SapienzStacktraceFlowCollector.A05;
        if (c3nz != null) {
            c3nz.A00(graphQLQuery.queryName());
        }
        return this.A00.handleQuery(graphQLQuery, new Fgi(dataCallbacks, graphQLQuery.queryName()), executor);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token handleQuery(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks, Executor executor, String str) {
        C3NZ c3nz = SapienzStacktraceFlowCollector.A05;
        if (c3nz != null) {
            c3nz.A00(graphQLQuery.queryName());
        }
        return this.A00.handleQuery(graphQLQuery, new Fgi(dataCallbacks, graphQLQuery.queryName()), executor, null);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token loadNextPageForKey(String str, int i, int i2, boolean z, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z2) {
        return this.A00.loadNextPageForKey(str, i, i2, false, map, new Fgj(operationCallbacks, str), executor, str2, false);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token loadPreviousPageForKey(String str, int i, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor, String str2, boolean z) {
        return this.A00.loadPreviousPageForKey(str, i, map, new Fgj(operationCallbacks, str), executor, str2, false);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void pandoAppendEdgeForKey(String str, Tree tree) {
        this.A00.pandoAppendEdgeForKey(str, tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token pandoLoadNextPageForKey(String str, int i, int i2, boolean z, Map map, GraphQLService.OperationCallbacks operationCallbacks, String str2, Executor executor) {
        return this.A00.pandoLoadNextPageForKey(str, i, i2, false, map, operationCallbacks, str2, executor);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public GraphQLService.Token pandoLoadPreviousPageForKey(String str, int i, String str2, Map map, GraphQLService.OperationCallbacks operationCallbacks, Executor executor) {
        return this.A00.pandoLoadPreviousPageForKey(str, i, str2, map, operationCallbacks, executor);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void pandoPrependEdgeForKey(String str, Tree tree) {
        this.A00.pandoPrependEdgeForKey(str, tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void prependEdgeForKey(String str, Tree tree) {
        this.A00.prependEdgeForKey(str, tree);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService
    public void replaceEdgeForKey(String str, Tree tree, String str2) {
        this.A00.replaceEdgeForKey(str, tree, str2);
    }
}
