package com.facebook.graphservice.interfaces;

import X.C2x5;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: GraphQLBaseConsistency.class */
public interface GraphQLBaseConsistency {
    ListenableFuture lookup(Object obj);

    ListenableFuture publishBuilder(C2x5 c2x5);

    ListenableFuture publishBuilderWithFullConsistency(C2x5 c2x5);

    GraphQLService.Token subscribe(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    GraphQLService.Token subscribeWithFullConsistency(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);
}
