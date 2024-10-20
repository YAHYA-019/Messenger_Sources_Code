package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.interfaces.Summary;
import java.util.concurrent.Executor;

/* renamed from: X.Dgs, reason: case insensitive filesystem */
/* loaded from: Dgs.class */
public final class C2200Dgs extends AbstractC04134a1 {
    public final C0dp A00;
    public final 1K9 A01;
    public final String A02;
    public final Executor A03;
    public final Class A04;
    public final /* synthetic */ 4fF A05;

    public C2200Dgs(C0dp c0dp, 4fF r303, 1K9 r304, Class cls, String str, Executor executor) {
        this.A05 = r303;
        super.A03 = false;
        super.A02 = null;
        super.A01 = null;
        this.A04 = cls;
        this.A01 = r304;
        this.A00 = c0dp;
        this.A02 = str;
        this.A03 = executor;
    }

    @Override // X.AbstractC04134a1
    public void onError(Throwable th) {
        Throwable th2 = th;
        4fF r0 = this.A05;
        String simpleName = this.A04.getSimpleName();
        if (th instanceof C4Qa) {
            th2 = ((C4Qa) th).A00(simpleName);
        }
        if (!r0.A00) {
            this.A01.onFailure(th2);
            return;
        }
        4fF.A01(r0, (GraphQLResult) null, this.A01, this.A02, th2, this.A03);
    }

    @Override // X.AbstractC04134a1
    public /* bridge */ /* synthetic */ void onModelUpdate(Object obj, Summary summary) {
        GraphQLResult graphQLResult = new GraphQLResult(1Wu.A00(summary), summary, obj, this.A00.now());
        4fF r0 = this.A05;
        if (!r0.A00) {
            this.A01.onSuccess(graphQLResult);
        } else {
            4fF.A01(r0, graphQLResult, this.A01, this.A02, (Throwable) null, this.A03);
        }
    }
}
