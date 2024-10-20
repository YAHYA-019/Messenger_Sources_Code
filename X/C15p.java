package X;

import java.util.HashMap;

/* renamed from: X.15p, reason: invalid class name */
/* loaded from: 15p.class */
public abstract class C15p {
    public static String A00(long j) {
        return AnonymousClass002.A0L("%.3f", new Object[]{Double.valueOf(j / 1000.0d)});
    }

    public static HashMap A01(String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            throw AnonymousClass001.A0L("Map must have an even (or zero) number of parameters");
        }
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0u;
            }
            String str = strArr[i2];
            if (str == null) {
                str = "";
            }
            String str2 = strArr[i2 + 1];
            if (str2 == null) {
                str2 = "";
            }
            A0u.put(str, str2);
            i = i2 + 2;
        }
    }
}
