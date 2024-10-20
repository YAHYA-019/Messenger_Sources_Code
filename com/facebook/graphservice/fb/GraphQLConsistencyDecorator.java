package com.facebook.graphservice.fb;

import com.facebook.graphservice.interfaces.GraphQLConsistency;

/* loaded from: GraphQLConsistencyDecorator.class */
public class GraphQLConsistencyDecorator extends BaseGraphQLConsistencyDecorator implements GraphQLConsistency {
    public final GraphQLConsistencyJNI A00;

    public GraphQLConsistencyDecorator(GraphQLConsistencyJNI graphQLConsistencyJNI) {
        this.A00 = graphQLConsistencyJNI;
    }
}
