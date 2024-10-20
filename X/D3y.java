package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3y.class */
public final class D3y implements 2eF {
    public static final D3y A00 = new D3y();

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Number number = (Number) obj;
        return 1Kd.A0A(number == null ? null : ThreadKey.A01(number.longValue()));
    }
}
