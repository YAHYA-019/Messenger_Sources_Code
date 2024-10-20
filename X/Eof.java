package X;

import com.facebook.graphql.executor.GraphQLResult;
import java.util.concurrent.Executor;

/* loaded from: Eof.class */
public final class Eof {
    public final GraphQLResult A00;
    public final InterfaceC01753sq A01;
    public final InterfaceC01743sp A02;
    public final Throwable A03;
    public final Executor A04;

    public Eof(GraphQLResult graphQLResult, InterfaceC01753sq interfaceC01753sq, InterfaceC01743sp interfaceC01743sp, Throwable th, Executor executor) {
        this.A02 = interfaceC01743sp;
        this.A01 = interfaceC01753sq;
        this.A00 = graphQLResult;
        this.A03 = th;
        this.A04 = executor;
    }
}
