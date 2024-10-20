package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.ui.P2pPaymentMemoView;

/* loaded from: E5z.class */
public final class E5z extends Ezy {
    public 1pK A00;
    public RQD A01;
    public P2pPaymentData A02;
    public EfH A03;
    public P2pPaymentMemoView A04;
    public final 6Gx A05 = DKD.A0Z();

    @Override // X.Ezy
    public View A0D(Context context, ViewGroup viewGroup) {
        return this.A04;
    }

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        super.A00 = true;
        this.A00 = r304;
        this.A04 = new P2pPaymentMemoView(context);
        this.A02 = p2pPaymentData;
        this.A01 = rqd;
        this.A00.mFragmentManager.A0b("theme_picker_fragment_tag");
        P2pPaymentMemoView p2pPaymentMemoView = this.A04;
        p2pPaymentMemoView.A04 = new Rud(this, p2pPaymentData);
        p2pPaymentMemoView.A0F(p2pPaymentData.A0B);
        this.A04.A0E(p2pPaymentConfig.A01());
    }

    @Override // X.Ezy
    public void A0H(P2pPaymentData p2pPaymentData) {
        this.A02 = p2pPaymentData;
        P2pPaymentMemoView p2pPaymentMemoView = this.A04;
        if (p2pPaymentMemoView != null) {
            p2pPaymentMemoView.A0F(p2pPaymentData.A0B);
        }
    }
}
