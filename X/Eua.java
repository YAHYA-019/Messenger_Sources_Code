package X;

import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import java.util.concurrent.ExecutorService;

/* loaded from: Eua.class */
public final class Eua {
    public final GraphQLRealtimeService A00;
    public final 1Wk A01;
    public final 1EZ A02;
    public final ExecutorService A03;

    public Eua(1EZ r302, GraphQLRealtimeService graphQLRealtimeService, 1Wk r304, ExecutorService executorService) {
        this.A00 = graphQLRealtimeService;
        this.A03 = executorService;
        this.A01 = r304;
        this.A02 = r302;
    }

    public C5op A00(C9dz c9dz, C3s4 c3s4, 1K9 r304) {
        ExecutorService executorService = this.A03;
        C5op c5op = new C5op(c9dz, c3s4, r304, executorService);
        c5op.A03.set(this.A00.handleQuery(this.A01.BfE(c3s4.getQuery(), new 3tQ()), new Fgb(c5op), executorService));
        return c5op;
    }
}
