package X;

import android.view.LayoutInflater;
import com.facebook.payments.p2p.datamodel.GeneralP2pPaymentCustomConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.interfaces.P2pPaymentCustomConfig;
import com.facebook.payments.p2p.messenger.core.ui.MessengerPayTitleView;
import com.google.common.collect.ImmutableList;

/* loaded from: Fmk.class */
public final class Fmk implements GFb {
    public final Fmm A00 = (Fmm) 1Bn.A0A(99191);

    @Override // X.GFb
    public void BPJ(LLe lLe, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        ImmutableList immutableList;
        lLe.A03(18, 26);
        lLe.A0A.Cnm(AbG.A08(LayoutInflater.from(lLe.A02()), lLe.A0A.A09, 2132542593));
        MessengerPayTitleView messengerPayTitleView = lLe.A0A.A06;
        messengerPayTitleView.getClass();
        MessengerPayTitleView messengerPayTitleView2 = messengerPayTitleView;
        ImmutableList A00 = this.A00.A00(p2pPaymentConfig, p2pPaymentData);
        P2pPaymentCustomConfig p2pPaymentCustomConfig = p2pPaymentConfig.A09;
        if ((p2pPaymentCustomConfig instanceof GeneralP2pPaymentCustomConfig) && (immutableList = ((GeneralP2pPaymentCustomConfig) p2pPaymentCustomConfig).A02) != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = A00.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (immutableList.contains(next)) {
                    builder.m11011add(next);
                }
            }
            A00 = builder.build();
        }
        boolean contains = A00.contains("SEND");
        boolean contains2 = A00.contains("REQUEST");
        int i = contains ? 2131962868 : 2131962866;
        if (!contains2) {
            i = 2131962867;
        }
        messengerPayTitleView2.A00.setText(i);
    }
}
