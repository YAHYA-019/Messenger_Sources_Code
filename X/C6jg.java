package X;

import java.util.Set;

/* renamed from: X.6jg, reason: invalid class name */
/* loaded from: 6jg.class */
public final class C6jg {
    public static final String A01;
    public static final String A02;
    public volatile Set A00;

    static {
        char[] chars = Character.toChars(10084);
        11T.A0A(chars);
        A01 = new String(chars);
        A02 = new String(new int[]{10084, 65039}, 0, 2);
    }

    public static final boolean A00(String str) {
        boolean z = false;
        if (str != null && !0CU.A0O(str) && (str.equals(A01) || str.equals(A02) || str.equals("<3") || str.equals("&lt;3"))) {
            z = true;
        }
        return z;
    }

    public final boolean A01(String str) {
        boolean z = false;
        if (str != null && !0CU.A0O(str)) {
            if (this.A00 == null) {
                this.A00 = C6jl.A00(36873763115303088L);
            }
            Set set = this.A00;
            if (set == null) {
                throw 1BK.A0h();
            }
            z = set.contains(str);
        }
        return z;
    }
}
