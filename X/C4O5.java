package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4O5, reason: invalid class name */
/* loaded from: 4O5.class */
public abstract class C4O5 {
    public static 24X A00(Object obj) {
        double doubleValue;
        2DM r302 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.Map) {
            Iterator A0y = AnonymousClass001.A0y((java.util.Map) obj);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                String valueOf = String.valueOf(A0z.getKey());
                24X A00 = A00(A0z.getValue());
                if (A00 != null) {
                    if (r302 == null) {
                        r302 = new 2DM(C26T.A00);
                    }
                    r302.A0e(A00, valueOf);
                }
            }
        } else {
            if (!(obj instanceof Collection)) {
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof Double) {
                            Number number = (Number) obj;
                            if (number != null) {
                                doubleValue = number.doubleValue();
                            }
                        } else if (!(obj instanceof Byte)) {
                            if (obj instanceof Short) {
                                Number number2 = (Number) obj;
                                if (number2 != null) {
                                    return new 4RD(number2.shortValue());
                                }
                            } else {
                                if (!(obj instanceof Long)) {
                                    return obj instanceof Boolean ? AnonymousClass001.A1V(obj) ? C02053tt.A01 : C02053tt.A00 : 2Jz.A00(String.valueOf(obj));
                                }
                                Number number3 = (Number) obj;
                                if (number3 != null) {
                                    return new C02043ts(number3.longValue());
                                }
                            }
                        }
                        return C09924rw.A00;
                    }
                    doubleValue = Double.parseDouble(String.valueOf(obj));
                    r302 = new C08434mx(doubleValue);
                }
                Number number4 = (Number) obj;
                if (number4 != null) {
                    return 2K1.A00(number4.intValue());
                }
                return C09924rw.A00;
            }
            for (Object obj2 : (Collection) obj) {
                24X A002 = A00(obj2);
                if (obj2 != null) {
                    if (r302 == null) {
                        r302 = new C03353xs(C26T.A00);
                    }
                    r302.A0d(A002);
                }
            }
        }
        return r302;
    }

    public static Eul A01(GJ2 gj2, String str, java.util.Map map, java.util.Map map2) {
        Eul A00 = EYM.A00(str);
        A00.A02 = A02(map);
        A00.A01 = map2;
        A00.A00 = gj2;
        return A00;
    }

    public static HashMap A02(java.util.Map map) {
        24X A00;
        HashMap A0u = AnonymousClass001.A0u();
        if (map != null && !map.isEmpty()) {
            A0u.put("server_params", map);
        }
        HashMap A0u2 = AnonymousClass001.A0u();
        String str = "{}";
        if (!A0u.isEmpty() && (A00 = A00(A0u)) != null) {
            str = A00.toString();
        }
        A0u2.put("params", str);
        return A0u2;
    }
}
