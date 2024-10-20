package X;

import java.util.Collections;
import java.util.WeakHashMap;

/* renamed from: X.2ty, reason: invalid class name */
/* loaded from: 2ty.class */
public final class C2ty extends 2Ct {
    public java.util.Map A00;
    public final C00i A01;

    public C2ty() {
        super((2Ck) 1Bi.A03(67910));
        this.A01 = new 1BQ(99936);
        this.A00 = Collections.synchronizedMap(new WeakHashMap());
    }

    public static boolean A00(C2ty c2ty) {
        1JE r0 = (1JE) c2ty.A01.get();
        if (r0.A00 == null) {
            1JE.A00(r0);
        }
        boolean z = false;
        if (r0.A00 == 0S2.A0C) {
            z = true;
        }
        return z;
    }

    public void A07(String str) {
        if (A00(this)) {
            A05("total_request", 1L);
            java.util.Map map = this.A00;
            Number number = (Number) map.get(str);
            if (number != null) {
                1BK.A1P(str, map, number.intValue() + 1);
            } else {
                map.put(str, 1);
                A05("unique_request", 1L);
            }
        }
    }
}
