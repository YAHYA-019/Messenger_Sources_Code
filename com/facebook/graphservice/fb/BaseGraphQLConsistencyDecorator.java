package com.facebook.graphservice.fb;

import X.2HW;
import X.4YV;
import X.C2x5;
import X.Fgg;
import com.facebook.graphservice.interfaces.GraphQLConsistency;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Tree;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: BaseGraphQLConsistencyDecorator.class */
public abstract class BaseGraphQLConsistencyDecorator implements GraphQLConsistency, 2HW {
    public GraphQLConsistencyJNI A00() {
        return ((GraphQLConsistencyDecorator) this).A00;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture applyOptimistic(Tree tree, Tree tree2, GraphQLConsistency.MutationPublisherRequest mutationPublisherRequest) {
        return 4YV.A0c(A00().applyOptimistic(tree, tree2, mutationPublisherRequest), "GraphQLConsistency_applyOptimistic");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture applyOptimisticBuilder(C2x5 c2x5, Tree tree, GraphQLConsistency.MutationPublisherRequest mutationPublisherRequest) {
        return 4YV.A0c(A00().applyOptimisticBuilder(c2x5, tree, mutationPublisherRequest), "GraphQLConsistency_applyOptimistic");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public ListenableFuture lookup(Object obj) {
        return 4YV.A0c(A00().lookup(obj), "GraphQLConsistency_lookup");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture publish(Tree tree) {
        return 4YV.A0c(A00().publish(tree), "GraphQLConsistency_publish");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency, com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public ListenableFuture publishBuilder(C2x5 c2x5) {
        return 4YV.A0c(A00().publishBuilder(c2x5), "GraphQLConsistency_publish");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency, com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public ListenableFuture publishBuilderWithFullConsistency(C2x5 c2x5) {
        return 4YV.A0c(A00().publishBuilderWithFullConsistency(c2x5), "GraphQLConsistency_publishConsistency");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLConsistency
    public ListenableFuture publishWithFullConsistency(Tree tree) {
        return 4YV.A0c(A00().publishWithFullConsistency(tree), "GraphQLConsistency_publishConsistency");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public GraphQLService.Token subscribe(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor) {
        return A00().subscribe(obj, new Fgg(dataCallbacks), executor);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    public GraphQLService.Token subscribeWithFullConsistency(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor) {
        return A00().subscribeWithFullConsistency(obj, new Fgg(dataCallbacks), executor);
    }

    public void trimToMinimum() {
    }

    public void trimToNothing() {
    }
}
