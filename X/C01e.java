package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.01e, reason: invalid class name */
/* loaded from: 01e.class */
public abstract class C01e {
    public static final java.util.Map A00 = new ConcurrentHashMap();

    public static String A00(Class cls) {
        String name;
        try {
            name = (String) cls.getDeclaredField("__redex_internal_original_name").get(cls);
        } catch (NoSuchFieldException unused) {
            name = cls.getName();
        } catch (Exception e) {
            throw new Error(e);
        }
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return name;
        }
        if (lastIndexOf == name.length()) {
            throw new Error(0Pz.A0j("Unexpected string ", name, " in __redex_internal_original_name"));
        }
        try {
            return name.substring(lastIndexOf + 1);
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }
}
