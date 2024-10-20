package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.86q, reason: invalid class name */
/* loaded from: 86q.class */
public abstract class C86q {
    public static final List A00 = C0s8.A14("https://www.", "http://www.", "https://", "http://");

    public static final String A00(String str, String str2) {
        1BK.A1M(str, str2);
        Iterator it = A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            if (0CV.A0b(str, str3, false)) {
                String A0G = 0CU.A0G(str, str3, str);
                int A002 = 0CU.A00(A0G, '/', 0);
                if (A002 >= 0) {
                    str2 = 7zM.A1C(0, A002, A0G);
                }
            }
        }
        return str2;
    }
}
