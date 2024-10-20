package X;

import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* loaded from: I1p.class */
public final class I1p {
    public final 1Br A00 = GOn.A0Q();
    public final java.util.Map A01 = AnonymousClass001.A0u();

    static {
        TimeUnit.MILLISECONDS.convert(3, TimeUnit.SECONDS);
    }

    public final void A00(6TN r302, String str) {
        synchronized (this) {
            Pair create = Pair.create(str, r302);
            java.util.Map map = this.A01;
            if (((Qx1) map.get(create)) == null) {
                ((C0dr) 1Br.A0B(this.A00)).now();
                Object obj = new Object();
                11T.A0D(create);
                map.put(create, obj);
            } else {
                ((C0dr) 1Br.A0B(this.A00)).now();
            }
        }
    }
}
