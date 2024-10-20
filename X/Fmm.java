package X;

import com.facebook.inject.FbInjector;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.collect.ImmutableList;

/* loaded from: Fmm.class */
public final class Fmm implements GFb {
    public final C00i A00 = FbInjector.A00;
    public final EfN A02 = (EfN) 1Bn.A0A(99145);
    public final C00i A01 = 1BQ.A01();

    public ImmutableList A00(P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = p2pPaymentConfig.A02().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (!A0i.equals("SEND") || p2pPaymentData.A06.size() == 1) {
                A0h.m11011add((Object) A0i);
            }
        }
        ImmutableList build = A0h.build();
        if (build.size() == 0) {
            1BK.A09(this.A01).D0v("DefaultP2PFlowViewConfiguration", "No buttons will be displayed on P2P send screen");
        }
        return build;
    }

    @Override // X.GFb
    public void BPJ(LLe lLe, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        lLe.A03(2, 2);
        ImmutableList A00 = A00(p2pPaymentConfig, p2pPaymentData);
        boolean contains = A00.contains("SEND");
        boolean contains2 = A00.contains("REQUEST");
        int i = contains ? 2131962868 : 2131962866;
        if (!contains2) {
            i = 2131962867;
        }
        lLe.A0A.CvV(lLe.A01.getString(i));
    }
}
