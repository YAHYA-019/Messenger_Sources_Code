package com.facebook.graphqlrealtimeservice.interfaces;

import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;
import java.util.concurrent.Executor;

/* loaded from: GraphQLRealtimeService.class */
public interface GraphQLRealtimeService {

    /* loaded from: GraphQLRealtimeService$RealtimeDataCallbacks.class */
    public interface RealtimeDataCallbacks extends GraphQLService.DataCallbacks {
        void onStatusChange(StreamStatus streamStatus, Summary summary);
    }

    /* loaded from: GraphQLRealtimeService$Token.class */
    public interface Token extends GraphQLService.Token {
    }

    Token handleQuery(GraphQLQuery graphQLQuery, RealtimeDataCallbacks realtimeDataCallbacks, Executor executor);
}
