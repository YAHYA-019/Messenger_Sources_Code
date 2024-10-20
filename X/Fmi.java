package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fmi.class */
public final class Fmi implements GOL, GFf {
    public Fmh A00;

    @Override // X.GFf
    public void Brw(P2pPaymentConfig p2pPaymentConfig, Er2 er2) {
        ThreadKey threadKey = p2pPaymentConfig.A02;
        threadKey.getClass();
        er2.A0A = (threadKey.A1F() || threadKey.A1I()) ? Long.toString(threadKey.A04) : null;
        er2.A0H = p2pPaymentConfig.A0L;
    }

    @Override // X.GOL
    public ListenableFuture Bz7(Context context, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, String str) {
        return this.A00.Bz7(context, p2pPaymentConfig, p2pPaymentData, "SEND");
    }

    @Override // X.GOL
    public ListenableFuture Bz8(P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        return this.A00.Bz8(p2pPaymentConfig, p2pPaymentData);
    }

    @Override // X.GFg
    public void Cqu(RTb rTb) {
        this.A00.A02 = rTb;
    }
}
