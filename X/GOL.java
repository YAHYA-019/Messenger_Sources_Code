package X;

import android.content.Context;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: GOL.class */
public interface GOL extends GFg {
    ListenableFuture Bz7(Context context, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, String str);

    ListenableFuture Bz8(P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData);
}
