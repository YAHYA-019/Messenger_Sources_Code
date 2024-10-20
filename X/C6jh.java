package X;

import java.util.Set;

/* renamed from: X.6jh, reason: invalid class name */
/* loaded from: 6jh.class */
public final class C6jh {
    public static final String A01;
    public volatile Set A00;

    static {
        char[] chars = Character.toChars(127880);
        11T.A0A(chars);
        A01 = new String(chars);
    }

    public final boolean A00(String str) {
        boolean z = false;
        if (str != null && !0CU.A0O(str)) {
            if (this.A00 == null) {
                this.A00 = C6jl.A00(36873763115237551L);
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
