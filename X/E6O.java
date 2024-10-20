package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.payments.p2p.service.model.transactions.FetchMoreTransactionsParams;
import com.google.common.collect.ImmutableList;

/* loaded from: E6O.class */
public final class E6O extends AbstractC2193Dgl {
    public static final String __redex_internal_original_name = "FetchAllMoreTransactionsMethod";

    public E6O() {
        super(AbI.A0G(), (EuC) 1Bn.A0A(99254), AbI.A0s());
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        return AbstractC2193Dgl.A02((FetchMoreTransactionsParams) obj, ActionId.RTMP_PACKET_RECEIVED);
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        ImmutableList immutableList;
        boolean z;
        2JX A0L;
        TreeJNI A0L2;
        2JY r0 = (2JY) obj2;
        if (r0 == null || (A0L = 1BL.A0L(AbF.A0K(r0, 2JX.class, -944550653), 452086327, -1751950499)) == null || (A0L2 = A0L.A0L(883555422, 2JX.class, -2130590609)) == null) {
            immutableList = null;
            z = false;
        } else {
            immutableList = A0L.A2J(1899957318);
            z = A0L2.getBooleanValue(-1575811850);
        }
        return A08(immutableList, z);
    }
}
