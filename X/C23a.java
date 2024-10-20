package X;

import java.util.HashMap;

/* renamed from: X.23a, reason: invalid class name */
/* loaded from: 23a.class */
public final class C23a {
    public final java.util.Map A00;
    public final java.util.Map A01;

    public C23a() {
        this(null);
    }

    public C23a(java.util.Map map) {
        this.A00 = new HashMap();
        if (map == null) {
            map = 03W.A00;
            11T.A0I(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        this.A01 = map;
    }

    public final Object A00(Object obj) {
        11T.A0F(obj, 0);
        Object obj2 = this.A01.get(obj);
        if (obj2 == null) {
            obj2 = null;
        }
        return obj2;
    }
}
