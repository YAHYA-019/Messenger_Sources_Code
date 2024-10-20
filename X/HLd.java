package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: HLd.class */
public abstract class HLd {
    public static final void A00(JIC jic, Exception exc, String str, java.util.Map map, long j) {
        11T.A0F(map, 2);
        HashMap A0u = AnonymousClass001.A0u();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            Object value = A0z.getValue();
            if (value != null) {
                A0u.put(key, value);
            }
        }
        if (exc != null) {
            AbstractC2326GOr.A1S(exc, A0u);
        }
        if (j >= 0) {
            String valueOf = String.valueOf(j);
            A0u.put("elapsed_time", valueOf);
            A0u.put("dt", valueOf);
        }
        jic.logEvent(str, A0u);
    }
}
