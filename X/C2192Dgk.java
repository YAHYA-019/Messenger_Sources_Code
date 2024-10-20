package X;

import com.facebook.payments.p2p.service.model.transactions.FetchTransactionListParams;

/* renamed from: X.Dgk, reason: case insensitive filesystem */
/* loaded from: Dgk.class */
public final class C2192Dgk extends C4r3 {
    public static final String __redex_internal_original_name = "FetchTransactionListMethod";
    public final EuC A00;

    public C2192Dgk() {
        super(AbI.A0G(), AbI.A0s());
        this.A00 = (EuC) 1Bn.A0A(99254);
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        int i;
        FetchTransactionListParams fetchTransactionListParams = (FetchTransactionListParams) obj;
        EOe eOe = fetchTransactionListParams.A01;
        int ordinal = eOe.ordinal();
        if (ordinal == 0) {
            i = 108;
        } else if (ordinal == 1) {
            i = 110;
        } else {
            if (ordinal != 2) {
                throw AnonymousClass002.A0C(eOe, "Unknown queryType seen ", AnonymousClass001.A0k());
            }
            i = 112;
        }
        C30G A0H = AbF.A0H(i);
        A0H.A02(Integer.valueOf(fetchTransactionListParams.A00), "max_transactions");
        return A0H;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    @Override // X.C4r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object A07(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2192Dgk.A07(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
