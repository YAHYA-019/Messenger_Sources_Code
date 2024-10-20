package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.2g5, reason: invalid class name */
/* loaded from: 2g5.class */
public final class C2g5 {
    public final java.util.Map A00;

    public C2g5() {
        this.A00 = new 0QO(0);
    }

    public C2g5(java.util.Map map) {
        0QO r0 = new 0QO(map.size());
        this.A00 = r0;
        r0.putAll(map);
    }

    public 2Sh A00() {
        return new 2Sh(ImmutableMap.copyOf(this.A00));
    }

    public void A01(Class cls, Object obj) {
        A02(cls, obj, null);
    }

    public void A02(Class cls, Object obj, String str) {
        this.A00.put(Integer.valueOf(2Sh.A00(cls, str)), obj);
    }

    public void A03(Object obj) {
        A02(obj.getClass(), obj, null);
    }
}
