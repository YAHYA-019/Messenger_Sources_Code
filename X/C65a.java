package X;

/* renamed from: X.65a, reason: invalid class name */
/* loaded from: 65a.class */
public abstract class C65a {
    public static final C65b A00(String str) {
        C65b c65b;
        C65b[] values = C65b.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                c65b = null;
                break;
            }
            c65b = values[i2];
            if (11T.A0O(c65b.name(), str)) {
                break;
            }
            i = i2 + 1;
        }
        return c65b;
    }
}
