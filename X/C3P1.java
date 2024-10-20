package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3P1, reason: invalid class name */
/* loaded from: 3P1.class */
public abstract class C3P1 {
    public static final HashSet A00(java.util.Map map) {
        HashSet A0v = AnonymousClass001.A0v();
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            String A0i = AnonymousClass001.A0i(A1B);
            if (0CV.A0b(A0i, "p:", false)) {
                String substring = A0i.substring(2);
                11T.A0A(substring);
                A0v.add(substring);
            }
        }
        return A0v;
    }

    public static final void A01(InterfaceC00051a0 interfaceC00051a0, Object obj, String str) {
        if (obj == null) {
            interfaceC00051a0.Cdi(str);
            return;
        }
        if (obj instanceof String) {
            interfaceC00051a0.CaK(str, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC00051a0.Ca2(str, AnonymousClass001.A1V(obj));
            return;
        }
        if (obj instanceof Integer) {
            interfaceC00051a0.CaD(str, AnonymousClass001.A03(obj));
            return;
        }
        if (obj instanceof Long) {
            interfaceC00051a0.CaG(str, AnonymousClass001.A05(obj));
            return;
        }
        if (obj instanceof Float) {
            interfaceC00051a0.CaB(str, ((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            interfaceC00051a0.Ca6(str, ((Number) obj).doubleValue());
        } else {
            0fH.A14("FbSharedPreferencesStartupCache", "Dropping unsupported %s value for %s", new Object[]{AnonymousClass001.A0Y(obj), str});
        }
    }
}
