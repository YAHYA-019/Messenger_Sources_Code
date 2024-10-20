package X;

/* renamed from: X.4Nb, reason: invalid class name */
/* loaded from: 4Nb.class */
public abstract class C4Nb {
    public static final C4Nc A00(String str) {
        C4Nc c4Nc;
        C4Nc[] values = C4Nc.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                c4Nc = null;
                break;
            }
            c4Nc = values[i2];
            if (11T.A0O(c4Nc.dbValue, str)) {
                break;
            }
            i = i2 + 1;
        }
        return c4Nc;
    }
}
