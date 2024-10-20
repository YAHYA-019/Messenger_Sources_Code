package X;

import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.payments.p2p.service.model.transactions.FetchMoreTransactionsParams;
import com.facebook.payments.p2p.service.model.transactions.FetchMoreTransactionsResult;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Dgl, reason: case insensitive filesystem */
/* loaded from: Dgl.class */
public abstract class AbstractC2193Dgl extends C4r3 {
    public static final String __redex_internal_original_name = "FetchMoreTransactionsMethod";
    public final EuC A00;

    public AbstractC2193Dgl(C4r5 c4r5, EuC euC, AnonymousClass244 anonymousClass244) {
        super(c4r5, anonymousClass244);
        this.A00 = euC;
    }

    public static C30G A02(FetchMoreTransactionsParams fetchMoreTransactionsParams, int i) {
        C30G c30g = new C30G(i);
        c30g.A06("max_transactions", 50);
        ((2Jf) c30g).A00.A04("before_time", Long.valueOf(fetchMoreTransactionsParams.A00));
        return c30g;
    }

    public FetchMoreTransactionsResult A08(ImmutableList immutableList, boolean z) {
        if (immutableList == null) {
            return new FetchMoreTransactionsResult(ImmutableList.of(), true);
        }
        EuC euC = this.A00;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            PaymentTransaction A00 = euC.A00(AbG.A0D(it));
            if (A00 != null) {
                A0h.m11011add((Object) A00);
            }
        }
        return new FetchMoreTransactionsResult(A0h.build(), !z);
    }
}
