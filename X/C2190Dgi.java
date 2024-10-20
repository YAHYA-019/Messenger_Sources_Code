package X;

import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsParams;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsResult;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.Dgi, reason: case insensitive filesystem */
/* loaded from: Dgi.class */
public final class C2190Dgi extends C4r3 {
    public static final String __redex_internal_original_name = "FetchPaymentRequestsMethod";

    public C2190Dgi() {
        super(AbI.A0G(), AbI.A0s());
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        int i = 104;
        if (((FetchPaymentRequestsParams) obj).A00 == EKm.A01) {
            i = 103;
        }
        return AbF.A0H(i);
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        2JY r0 = (2JY) obj2;
        2JY A0B = ((FetchPaymentRequestsParams) obj).A00 == EKm.A01 ? 1BK.A0B(AbF.A0K(r0, 2JX.class, -313609032), 2JX.class, -956314054, 862486696) : 1BK.A0B(AbF.A0K(r0, 2JX.class, -1854929840), 2JX.class, -1808626944, 1373179092);
        ImmutableList of = A0B == null ? ImmutableList.of() : A0B.A0a(-928754971, DpA.class);
        ArrayList A0t = AnonymousClass001.A0t(of.size());
        1Du it = of.iterator();
        while (it.hasNext()) {
            A0t.add(it.next());
        }
        return new FetchPaymentRequestsResult(A0t);
    }
}
