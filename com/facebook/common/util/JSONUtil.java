package com.facebook.common.util;

import X.1JW;
import X.24X;
import X.2DM;
import X.2DO;
import X.2Jz;
import X.2K1;
import X.3Ba;
import X.4RD;
import X.4RE;
import X.4RF;
import X.5DL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C02043ts;
import X.C02053tt;
import X.C03353xs;
import X.C08434mx;
import X.C09924rw;
import X.C26T;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: JSONUtil.class */
public abstract class JSONUtil {
    public static double A00(24X r301) {
        if (r301 != null && !r301.A0W()) {
            if (r301.A0Y()) {
                try {
                    return Double.parseDouble(r301.A0I());
                } catch (NumberFormatException unused) {
                    return 0.0d;
                }
            }
            if (r301.A0X()) {
                return r301.A02();
            }
        }
        return 0.0d;
    }

    public static float A01(24X r301, float f) {
        Float A0D = A0D(r301, Float.valueOf(f));
        A0D.getClass();
        return A0D.floatValue();
    }

    public static int A02(24X r301, int i) {
        if (r301 != null && !r301.A0W()) {
            if (r301.A0Y()) {
                try {
                    return Integer.parseInt(r301.A0I());
                } catch (NumberFormatException unused) {
                    return i;
                }
            }
            if (r301.A0X()) {
                return r301.A04();
            }
        }
        return i;
    }

    public static long A03(24X r301, long j) {
        if (r301 != null && !r301.A0W()) {
            if (r301.A0Y()) {
                try {
                    String A0I = r301.A0I();
                    A0I.getClass();
                    return Long.parseLong(A0I);
                } catch (NumberFormatException unused) {
                    return j;
                }
            }
            if (r301.A0X()) {
                return r301.A08();
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r302 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.common.util.TriState A04(X.24X r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L73
            r0 = r301
            boolean r0 = r0.A0W()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L73
            r0 = r301
            boolean r0 = r0.A0V()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r301
            boolean r0 = r0.A0P()
            r303 = r0
        L1b:
            r0 = r303
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.valueOf(r0)
            return r0
        L20:
            r0 = r301
            boolean r0 = r0.A0Y()
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L62
            r0 = r301
            java.lang.String r0 = r0.A0I()
            r304 = r0
            java.lang.String r0 = "on"
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.equals(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L5d
            java.lang.String r0 = "1"
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.equals(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L5d
            java.lang.String r0 = "true"
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.equals(r1)
            r302 = r0
        L59:
            r0 = r302
            if (r0 == 0) goto L1b
        L5d:
            r0 = 1
            r303 = r0
            goto L1b
        L62:
            r0 = r301
            boolean r0 = r0.A0X()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L73
            r0 = r301
            int r0 = r0.A04()
            r302 = r0
            goto L59
        L73:
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.JSONUtil.A04(X.24X):com.facebook.common.util.TriState");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r302.isInstance(r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.24X A05(X.24X r301, java.lang.Class r302, java.lang.String r303) {
        /*
            r0 = r301
            r1 = r303
            X.24X r0 = r0.A0D(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L19
            r0 = r302
            r1 = r304
            boolean r0 = r0.isInstance(r1)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L1c
        L19:
            r0 = 1
            r306 = r0
        L1c:
            r0 = r302
            java.lang.String r0 = r0.getSimpleName()
            r307 = r0
            r0 = r306
            java.lang.String r1 = "Node %s in not an %s in %s"
            r2 = r303
            r3 = r307
            r4 = r301
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2, r3, r4)
            r0 = r302
            r1 = r304
            java.lang.Object r0 = r0.cast(r1)
            X.24X r0 = (X.24X) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.JSONUtil.A05(X.24X, java.lang.Class, java.lang.String):X.24X");
    }

    public static 24X A06(Object obj) {
        3Ba r302;
        2DM c03353xs;
        if (obj == null) {
            r302 = C09924rw.A00();
        } else if (obj instanceof CharSequence) {
            r302 = new 2Jz(obj.toString());
        } else if (obj instanceof Boolean) {
            r302 = C02053tt.A00(AnonymousClass001.A1V(obj));
        } else if (obj instanceof Float) {
            r302 = 5DL.A00(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            r302 = C08434mx.A00(((Number) obj).doubleValue());
        } else if (obj instanceof Short) {
            r302 = 4RD.A00(((Number) obj).shortValue());
        } else if (obj instanceof Integer) {
            r302 = 2K1.A00(AnonymousClass001.A03(obj));
        } else if (obj instanceof Long) {
            r302 = C02043ts.A00(AnonymousClass001.A05(obj));
        } else if (obj instanceof BigDecimal) {
            r302 = 4RE.A00((BigDecimal) obj);
        } else {
            if (!(obj instanceof BigInteger)) {
                if (obj instanceof Map) {
                    c03353xs = new 2DM(C26T.A00);
                    Iterator A0y = AnonymousClass001.A0y((Map) obj);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0y);
                        c03353xs.A0e(A06(A0z.getValue()), A0z.getKey().toString());
                    }
                } else if (obj instanceof Iterable) {
                    c03353xs = new C03353xs(C26T.A00);
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        c03353xs.A0d(A06(it.next()));
                    }
                } else if (obj instanceof Object[]) {
                    c03353xs = new C03353xs(C26T.A00);
                    for (Object obj2 : (Object[]) obj) {
                        c03353xs.A0d(A06(obj2));
                    }
                } else {
                    Class<?> cls = obj.getClass();
                    if (cls.getAnnotation(JsonSerialize.class) == null) {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("Can't convert to json: ");
                        A0k.append(obj);
                        throw AnonymousClass002.A0C(cls, ", of type: ", A0k);
                    }
                    r302 = new 3Ba(obj);
                }
                return (24X) c03353xs;
            }
            r302 = 4RF.A00((BigInteger) obj);
        }
        return (24X) r302;
    }

    public static C03353xs A07(24X r301, String str) {
        return (C03353xs) A09(r301, C03353xs.class, str);
    }

    public static C03353xs A08(List list) {
        C03353xs c03353xs = new C03353xs(C26T.A00);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c03353xs.A0e((String) it.next());
        }
        return c03353xs;
    }

    public static 2DO A09(24X r301, Class cls, String str) {
        2DO A05 = A05(r301, cls, str);
        if (A05 == null) {
            A05 = A0A(cls);
        }
        return A05;
    }

    public static 2DO A0A(Class cls) {
        C03353xs A01;
        C26T c26t = C26T.A00;
        if (C03353xs.class.equals(cls)) {
            A01 = c26t.A00();
        } else {
            if (!2DM.class.equals(cls)) {
                throw AnonymousClass002.A0C(cls, "Unsupported node type: ", AnonymousClass001.A0k());
            }
            A01 = c26t.A01();
        }
        return A01;
    }

    public static 2DM A0B(Map map) {
        2DM r0 = new 2DM(C26T.A00);
        if (map != null) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                r0.A0o(AnonymousClass001.A0j(A0z), (String) A0z.getValue());
            }
        }
        return r0;
    }

    public static ImmutableList A0C(24X r301, String str) {
        C03353xs A07 = A07(r301, str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) A0F((24X) it.next()));
        }
        return builder.build();
    }

    public static Float A0D(24X r301, Float f) {
        if (r301 != null && !r301.A0W()) {
            if (r301.A0Y()) {
                try {
                    return Float.valueOf(Float.parseFloat(r301.A0I()));
                } catch (NumberFormatException unused) {
                    return f;
                }
            }
            if (r301.A0X()) {
                return Float.valueOf(r301.A0G().floatValue());
            }
        }
        return f;
    }

    public static Iterable A0E(24X r301, String str) {
        return (Iterable) MoreObjects.firstNonNull(A05(r301, C03353xs.class, str), ImmutableList.of());
    }

    public static String A0F(24X r301) {
        return A0H(r301, null);
    }

    public static String A0G(24X r301, String str) {
        String str2;
        24X A0D = r301.A0D(str);
        str2 = "";
        return A0D != null ? A0H(A0D, str2) : "";
    }

    public static String A0H(24X r301, String str) {
        if (r301 != null && !r301.A0W()) {
            if (r301.A0Y()) {
                str = r301.A0I();
            } else if (r301.A0X()) {
                return r301.A0G().toString();
            }
        }
        return str;
    }

    public static ArrayList A0I(JSONArray jSONArray) {
        ArrayList A00 = 1JW.A00(jSONArray.length());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jSONArray.length()) {
                return A00;
            }
            A00.add(jSONArray.getString(i2));
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r303 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0J(X.24X r301, boolean r302) {
        /*
            r0 = r301
            if (r0 == 0) goto L1b
            r0 = r301
            boolean r0 = r0.A0W()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1b
            r0 = r301
            boolean r0 = r0.A0V()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.A0P()
            r302 = r0
        L1b:
            r0 = r302
            return r0
        L1d:
            r0 = r301
            boolean r0 = r0.A0Y()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L62
            r0 = r301
            java.lang.String r0 = r0.A0I()
            r305 = r0
            java.lang.String r0 = "on"
            r306 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L5e
            java.lang.String r0 = "1"
            r306 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L5e
            java.lang.String r0 = "true"
            r306 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
        L5a:
            r0 = r303
            if (r0 == 0) goto L60
        L5e:
            r0 = 1
            r304 = r0
        L60:
            r0 = r304
            return r0
        L62:
            r0 = r301
            boolean r0 = r0.A0X()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r301
            int r0 = r0.A04()
            r303 = r0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.JSONUtil.A0J(X.24X, boolean):boolean");
    }
}
