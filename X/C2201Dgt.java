package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.interfaces.Summary;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.Dgt, reason: case insensitive filesystem */
/* loaded from: Dgt.class */
public final class C2201Dgt extends AbstractC04134a1 {
    public 2Jg A00;
    public boolean A01;
    public final C0dp A02;
    public final 1K9 A03;
    public final SettableFuture A04;
    public final String A05;
    public final Executor A06;
    public final /* synthetic */ 4fF A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201Dgt(C0dp c0dp, 4fF r303, 2Jg r304, 1K9 r305, SettableFuture settableFuture, String str, Executor executor) {
        super(r304);
        this.A07 = r303;
        this.A01 = true;
        this.A00 = r304;
        this.A03 = r305;
        this.A04 = settableFuture;
        this.A02 = c0dp;
        this.A05 = str;
        this.A06 = executor;
    }

    @Override // X.AbstractC04134a1
    public void onError(Throwable th) {
        Throwable th2 = th;
        0fH.A0k(4YT.A00(626), th.getMessage());
        4fF r0 = this.A07;
        String str = this.A00.A08;
        if (th instanceof C4Qa) {
            th2 = ((C4Qa) th).A00(str);
        }
        if (r0.A00) {
            4fF.A01(r0, (GraphQLResult) null, this.A03, this.A05, th2, this.A06);
        } else if (!this.A01) {
            this.A03.onFailure(th2);
        } else {
            this.A01 = false;
            this.A04.setException(th2);
        }
    }

    @Override // X.AbstractC04134a1
    public void onModelUpdate(Object obj, Summary summary) {
        GraphQLResult graphQLResult = new GraphQLResult(1Wu.A00(summary), summary, obj, this.A02.now());
        4fF r0 = this.A07;
        if (r0.A00) {
            4fF.A01(r0, graphQLResult, this.A03, this.A05, (Throwable) null, this.A06);
        } else if (!this.A01) {
            this.A03.onSuccess(graphQLResult);
        } else {
            this.A01 = false;
            this.A04.set(graphQLResult);
        }
    }
}
