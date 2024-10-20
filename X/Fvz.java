package X;

import com.facebook.graphql.executor.GraphQLResult;
import java.util.concurrent.Executor;

/* loaded from: Fvz.class */
public final class Fvz implements 1K9 {
    public final 1K9 A00;
    public final String A01;
    public final Executor A02;
    public final /* synthetic */ 4fF A03;

    public Fvz(4fF r302, 1K9 r303, String str, Executor executor) {
        this.A03 = r302;
        this.A00 = r303;
        this.A02 = executor;
        this.A01 = str;
    }

    public void onFailure(Throwable th) {
        4fF r0 = this.A03;
        if (!r0.A00) {
            this.A00.onFailure(th);
        } else {
            4fF.A01(r0, (GraphQLResult) null, this.A00, this.A01, th, this.A02);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        GraphQLResult graphQLResult = (GraphQLResult) ((AbstractC08294mh) obj);
        4fF r0 = this.A03;
        if (!r0.A00) {
            this.A00.onSuccess(graphQLResult);
        } else {
            4fF.A01(r0, graphQLResult, this.A00, this.A01, (Throwable) null, this.A02);
        }
    }
}
