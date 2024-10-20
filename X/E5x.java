package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.ui.P2pPaymentMemoView;

/* loaded from: E5x.class */
public final class E5x extends Ezy {
    public P2pPaymentData A00;
    public QVT A01;

    @Override // X.Ezy
    public View A0D(Context context, ViewGroup viewGroup) {
        return this.A01;
    }

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        String str;
        super.A00 = true;
        QVT qvt = new QVT(context);
        this.A01 = qvt;
        this.A00 = p2pPaymentData;
        P2pPaymentMemoView p2pPaymentMemoView = qvt.A00;
        if (p2pPaymentData != null && (str = p2pPaymentData.A0B) != null) {
            p2pPaymentMemoView.A0F(str);
        }
        p2pPaymentMemoView.A04 = new Ruc(this, rqd);
        ((FX1) p2pPaymentMemoView.A01.get()).A00 = 1000;
        p2pPaymentMemoView.A0E(p2pPaymentConfig.A01());
    }
}
