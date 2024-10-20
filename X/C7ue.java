package X;

import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7ue, reason: invalid class name */
/* loaded from: 7ue.class */
public abstract class C7ue {
    public static final HAC A00(String str) {
        11T.A0F(str, 0);
        if (str.length() != 0) {
            char codePointAt = (char) str.codePointAt(0);
            if (codePointAt == '@') {
                return HAC.A02;
            }
            if (codePointAt == '/') {
                return HAC.A05;
            }
        }
        return HAC.A03;
    }

    public static final String A01(String str) {
        11T.A0F(str, 0);
        11T.A0F("@", 1);
        if (str.startsWith("@")) {
            str = str.substring(1);
            11T.A0A(str);
        }
        return str;
    }

    public static final boolean A02(User user, String str, Locale locale, boolean z) {
        11T.A0F(str, 0);
        11T.A0F(locale, 3);
        Name name = user.A0X;
        String str2 = name.firstName;
        String str3 = name.lastName;
        String A00 = name.A00();
        11T.A0A(A00);
        if (A03(4YU.A18(locale, A00), str, z) || (str2 != null && A03(4YU.A18(locale, str2), str, z))) {
            return true;
        }
        if (str3 != null) {
            return A03(4YU.A18(locale, str3), str, z);
        }
        return false;
    }

    public static final boolean A03(String str, String str2, boolean z) {
        List A08 = 1JF.A08(str, ' ');
        11T.A0A(A08);
        List A082 = 1JF.A08(str2, ' ');
        11T.A0A(A082);
        if (z) {
            return A08.size() == A082.size() && 11T.A0O(0QD.A0f(A08), 0QD.A0f(A082));
        }
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            11T.A0F(A0i, 0);
            if (A0i.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
