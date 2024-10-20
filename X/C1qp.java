package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1qp, reason: invalid class name */
/* loaded from: 1qp.class */
public final class C1qp {
    public final java.util.Map A00 = Collections.synchronizedMap(new HashMap());

    public final Object A00(1sM r302) {
        11T.A0F(r302, 0);
        java.util.Map map = this.A00;
        return map.containsKey(r302) ? map.get(r302) : r302.Ah9();
    }

    public final Object A01(Class cls) {
        return this.A00.get(new 2Yq(cls));
    }

    public final void A02(1sM r302, Object obj) {
        11T.A0F(r302, 0);
        java.util.Map map = this.A00;
        11T.A09(map);
        map.put(r302, obj);
    }

    public final void A03(Class cls, Object obj) {
        11T.A0F(cls, 0);
        2Yq r0 = new 2Yq(cls);
        java.util.Map map = this.A00;
        11T.A09(map);
        map.put(r0, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1qp) {
            return 11T.A0O(this.A00, ((C1qp) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}
