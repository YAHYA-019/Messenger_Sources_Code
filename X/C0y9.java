package X;

import java.util.HashMap;

/* renamed from: X.0y9, reason: invalid class name */
/* loaded from: 0y9.class */
public final class C0y9 extends 0QJ {
    public final HashMap A00 = new HashMap();

    public 06H A00(Object obj) {
        return (06H) this.A00.get(obj);
    }

    public Object A01(Object obj) {
        Object A01 = super.A01(obj);
        this.A00.remove(obj);
        return A01;
    }

    public Object A02(Object obj, Object obj2) {
        06H A00 = A00(obj);
        if (A00 != null) {
            return A00.A03;
        }
        HashMap hashMap = this.A00;
        06H r0 = new 06H(obj, obj2);
        ((0QJ) this).A00++;
        06H r02 = ((0QJ) this).A01;
        if (r02 == null) {
            ((0QJ) this).A02 = r0;
        } else {
            r02.A00 = r0;
            r0.A01 = r02;
        }
        ((0QJ) this).A01 = r0;
        hashMap.put(obj, r0);
        return null;
    }
}
