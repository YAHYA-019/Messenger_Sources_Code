package X;

import org.json.JSONObject;

/* renamed from: X.1fg, reason: invalid class name */
/* loaded from: 1fg.class */
public final class C1fg extends 1fL {
    public int A00() {
        return 11;
    }

    public 1fB A01(C1hi c1hi, int i) {
        1fA r0 = 1fA.A00;
        11T.A0A(r0);
        return r0;
    }

    public C1hi A02(JSONObject jSONObject, int i) {
        C1hi c1hi = new C1hi();
        c1hi.A00 = jSONObject.optInt("timeoutInMillis");
        c1hi.A02 = i;
        return c1hi;
    }
}
