package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.9iX, reason: invalid class name */
/* loaded from: 9iX.class */
public final class C9iX {
    public static final C9cz A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v53, types: [X.9Gx, java.lang.Object] */
    public static final 8K7 A00(2JX r301, int i) {
        2JY A0B;
        String A0k;
        2JY A0B2;
        String A0k2;
        String str;
        String A0l;
        String A0l2;
        String A0l3;
        8K7 r303 = null;
        if (r301 != null && (A0B = 1BK.A0B(r301, 2JX.class, -1890252483, 1960284883)) != null && (A0k = A0B.A0k()) != null && (A0B2 = 1BK.A0B(A0B, 2JX.class, -1599248542, 1806292900)) != null && (A0k2 = A0B2.A0k()) != null) {
            String A0j = A0B2.A0j();
            str = "";
            if (A0j == null) {
                A0j = str;
            }
            2JY A0S = A0B.A0S(2JX.class, 12235258);
            Uri A002 = (A0S == null || (A0l3 = A0S.A0l()) == null) ? null : C9cz.A00(A0l3);
            2JY A0B3 = 1BK.A0B(A0B, 2JX.class, 2074606664, -1222675315);
            Uri A003 = (A0B3 == null || (A0l2 = A0B3.A0l()) == null) ? null : C9cz.A00(A0l2);
            2JY A0B4 = 1BK.A0B(A0B, 2JX.class, -1421463617, 78953371);
            Uri A004 = (A0B4 == null || (A0l = A0B4.A0l()) == null) ? null : C9cz.A00(A0l);
            List A0Z = A0B2.A0Z(-2031017509);
            if (A0Z == null) {
                A0Z = C0ty.A00;
            }
            String A0r = A0B2.A0r(1746464963);
            str = A0r != null ? A0r : "";
            if (A002 == null) {
                if (A004 != null) {
                    A002 = A004;
                }
            }
            DqM dqM = new DqM(A0k2, A0j, str, A0Z);
            ?? obj = new Object();
            ((9Gx) obj).A00 = null;
            r303 = new 8K7(A002, A004, A003, (9Gx) obj, dqM, A0k, i);
        }
        return r303;
    }
}
