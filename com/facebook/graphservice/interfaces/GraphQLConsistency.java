package com.facebook.graphservice.interfaces;

import X.C2x5;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: GraphQLConsistency.class */
public interface GraphQLConsistency extends GraphQLBaseConsistency {

    /* loaded from: GraphQLConsistency$MutationPublisherRequest.class */
    public class MutationPublisherRequest {
        public String mutationName;
    }

    ListenableFuture applyOptimistic(Tree tree, Tree tree2, MutationPublisherRequest mutationPublisherRequest);

    ListenableFuture applyOptimisticBuilder(C2x5 c2x5, Tree tree, MutationPublisherRequest mutationPublisherRequest);

    ListenableFuture publish(Tree tree);

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    ListenableFuture publishBuilder(C2x5 c2x5);

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    ListenableFuture publishBuilderWithFullConsistency(C2x5 c2x5);

    ListenableFuture publishWithFullConsistency(Tree tree);
}
