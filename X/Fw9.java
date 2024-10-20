package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* loaded from: Fw9.class */
public final class Fw9 implements 1K9 {
    public boolean A00 = true;
    public final 1K9 A01;
    public final SettableFuture A02;
    public final String A03;
    public final Executor A04;
    public final /* synthetic */ 4fF A05;

    public Fw9(4fF r302, 1K9 r303, SettableFuture settableFuture, String str, Executor executor) {
        this.A05 = r302;
        this.A01 = r303;
        this.A02 = settableFuture;
        this.A04 = executor;
        this.A03 = str;
    }

    public void onFailure(Throwable th) {
        4fF r0 = this.A05;
        if (r0.A00) {
            4fF.A01(r0, (GraphQLResult) null, this.A01, this.A03, th, this.A04);
        } else if (!this.A00) {
            this.A01.onFailure(th);
        } else {
            this.A02.setException(th);
            this.A00 = false;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        GraphQLResult graphQLResult = (GraphQLResult) ((AbstractC08294mh) obj);
        4fF r0 = this.A05;
        if (r0.A00) {
            4fF.A01(r0, graphQLResult, this.A01, this.A03, (Throwable) null, this.A04);
        } else if (!this.A00) {
            this.A01.onSuccess(graphQLResult);
        } else {
            this.A02.set(graphQLResult);
            this.A00 = false;
        }
    }
}
