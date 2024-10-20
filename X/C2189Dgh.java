package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestParams;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Dgh, reason: case insensitive filesystem */
/* loaded from: Dgh.class */
public final class C2189Dgh extends C4r3 {
    public static final String __redex_internal_original_name = "FetchPaymentRequestMethod";

    public C2189Dgh() {
        super(AbI.A0G(), AbI.A0s());
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(ActionId.ABORTED);
        A0H.A03(TraceFieldType.RequestID, ((FetchPaymentRequestParams) obj).A00);
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        return obj2;
    }
}
