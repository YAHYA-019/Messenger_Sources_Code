package X;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.4hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hc.class */
public final class C06584hc {
    public final AtomicLong A00 = new AtomicLong(System.currentTimeMillis());

    public Bundle A00(C54o c54o) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("connectionFreshness", c54o);
        bundle.putLong("paramsId", this.A00.incrementAndGet());
        return bundle;
    }
}
