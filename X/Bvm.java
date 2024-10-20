package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: Bvm.class */
public final class Bvm {
    public final GraphQLResult A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableSet A03;
    public final Exception A04;
    public final Exception A05;

    public Bvm(GraphQLResult graphQLResult, ImmutableList immutableList, ImmutableList immutableList2, ImmutableSet immutableSet, Exception exc, Exception exc2) {
        this.A03 = immutableSet;
        this.A01 = immutableList;
        this.A00 = graphQLResult;
        this.A04 = exc;
        this.A02 = immutableList2;
        this.A05 = exc2;
    }
}
