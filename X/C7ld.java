package X;

/* renamed from: X.7ld, reason: invalid class name */
/* loaded from: 7ld.class */
public abstract class C7ld {
    public static final C65r A00(C65r c65r, String str) {
        C65r[] values = C65r.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return c65r;
            }
            C65r c65r2 = values[i2];
            String name = c65r2.name();
            if (name != null && name.equalsIgnoreCase(str)) {
                return c65r2;
            }
            i = i2 + 1;
        }
    }
}
