package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3z.class */
public final class D3z implements 2eF {
    public static final D3z A00 = new D3z();

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Number number = (Number) obj;
        return 1Kd.A0A(number == null ? null : ThreadKey.A02(number.longValue()));
    }
}
