package X;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.2hk, reason: invalid class name */
/* loaded from: 2hk.class */
public abstract class C2hk {
    public java.util.Map A00;

    public void A00(int i) {
        A01(Integer.valueOf(i), "span_size");
    }

    public void A01(Object obj, String str) {
        java.util.Map map = this.A00;
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap());
            this.A00 = map;
        }
        map.put(str, obj);
    }

    public void A02(boolean z) {
        A01(Boolean.valueOf(z), "is_sticky");
    }
}
