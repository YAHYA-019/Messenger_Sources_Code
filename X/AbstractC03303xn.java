package X;

import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Iterator;

/* renamed from: X.3xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xn.class */
public abstract class AbstractC03303xn {
    public static final ThreadKey A00(1G2 r301) {
        if (r301 == null) {
            return null;
        }
        1G2 r0 = 1NK.A2m;
        if (!r301.A0A(r0)) {
            return null;
        }
        String A08 = r301.A08();
        11T.A0A(A08);
        if (!0CV.A0Z(A08, "muted_until2", false)) {
            String A082 = r301.A08();
            11T.A0A(A082);
            if (!0CV.A0Z(A082, "calls_muted_until", false)) {
                return null;
            }
        }
        String A09 = r301.A09(r0);
        11T.A0A(A09);
        Iterator it = 0CU.A0M(A09, new String[]{"/"}, 0).iterator();
        if (it.hasNext()) {
            return ThreadKey.A0K(Uri.decode((String) it.next()), true);
        }
        return null;
    }

    public static final 1G2 A01(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        return 1G3.A00(1NK.A1J, Uri.encode(threadKey.toString()));
    }

    public static final 1G2 A02(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        return 1G3.A00(1NK.A2m.A0D(Uri.encode(threadKey.toString())), "/member_request_muted");
    }

    public static final 1G2 A03(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        1G2 A0D = 1NK.A2m.A0D(Uri.encode(threadKey.toString())).A0D("/mentions_muted");
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G2 A04(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        1G2 A0D = 1NK.A2m.A0D(Uri.encode(threadKey.toString())).A0D("/calls_muted_until");
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G2 A05(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        1G2 A0D = 1NK.A2m.A0D(Uri.encode(threadKey.toString())).A0D("/group_settings");
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G2 A06(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        1G2 A0D = 1NK.A2m.A0D(Uri.encode(threadKey.toString())).A0D("/muted_until2");
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G2 A07(String str) {
        1G2 A0D = 1NK.A3M.A0D(Uri.encode(str)).A0D("/blockee_warning_was_dismissed");
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G2 A08(String str) {
        11T.A0F(str, 0);
        1G2 A0D = 1NK.A27.A0D(Uri.encode(str));
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G2 A09(String str) {
        11T.A0F(str, 0);
        1G2 A0D = 1NK.A0S.A0D(str);
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G9 A0A(ThreadKey threadKey, String str) {
        11T.A0F(str, 1);
        1G2 A0D = 1NK.A1f.A0D(Uri.encode(threadKey.toString())).A0D("/token");
        11T.A0A(A0D);
        return 1G9.A05(1G9.A04(A0D), str);
    }

    public static final 1G9 A0B(ThreadKey threadKey, String str) {
        11T.A0F(str, 1);
        1G2 A0D = 1NK.A1f.A0D(Uri.encode(threadKey.toString())).A0D("/token_timestamp");
        11T.A0A(A0D);
        return 1G9.A05(1G9.A04(A0D), str);
    }

    public static final 1G9 A0C(String str) {
        return 1G9.A05(1NK.A4J.A0F("setting"), str);
    }
}
