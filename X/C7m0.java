package X;

/* renamed from: X.7m0, reason: invalid class name */
/* loaded from: 7m0.class */
public abstract class C7m0 {
    public static final C5vv A00(String str) {
        C5vv c5vv;
        C5vv[] values = C5vv.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                c5vv = C5vv.A14;
                break;
            }
            c5vv = values[i2];
            if (11T.A0O(c5vv.actionName, str)) {
                break;
            }
            i = i2 + 1;
        }
        return c5vv;
    }
}
