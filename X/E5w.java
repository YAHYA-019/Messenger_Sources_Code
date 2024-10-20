package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: E5w.class */
public final class E5w extends Ezy {
    public Context A00;
    public CurrencyAmount A01;
    public P2pPaymentData A02;
    public SettableFuture A03;
    public RSI A04;
    public final C00i A05 = 1BQ.A02(16504);

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        super.A00 = true;
        this.A00 = context;
        this.A02 = p2pPaymentData;
        this.A04 = rsi;
        this.A01 = p2pPaymentConfig.A04;
        if (bundle == null || !bundle.containsKey("extra_amount")) {
            return;
        }
        this.A01 = (CurrencyAmount) bundle.getParcelable("extra_amount");
    }
}
