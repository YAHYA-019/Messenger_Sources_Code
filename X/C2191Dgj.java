package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.payments.p2p.service.model.transactions.FetchPaymentTransactionParams;

/* renamed from: X.Dgj, reason: case insensitive filesystem */
/* loaded from: Dgj.class */
public final class C2191Dgj extends C4r3 {
    public static final String __redex_internal_original_name = "FetchPaymentTransactionMethod";
    public final EuC A00;

    public C2191Dgj() {
        super(AbI.A0G(), AbI.A0s());
        this.A00 = (EuC) 1Bn.A0A(99254);
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(ActionId.TIMEOUT);
        A0H.A03("transaction_id", ((FetchPaymentTransactionParams) obj).A01);
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        2JX r0 = (2JX) obj2;
        if (r0 != null) {
            return this.A00.A00(r0);
        }
        return null;
    }
}
