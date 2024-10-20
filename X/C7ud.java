package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;

/* renamed from: X.7ud, reason: invalid class name */
/* loaded from: 7ud.class */
public final class C7ud {
    public static final int A00(String str, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            if ("MEDIA_LABEL".equals(str)) {
                return 4;
            }
            if ("POST_COVER".equals(str)) {
                return 5;
            }
            if ("POST_LABEL".equals(str)) {
                return 6;
            }
            i = 0;
            if ("WARNING_SCREENS".equals(str)) {
                return 7;
            }
        }
        return i;
    }

    public static final String A01(String str, String str2, boolean z) {
        if (z) {
            return null;
        }
        if ("MEDIA_LABEL".equals(str) || "POST_COVER".equals(str) || "POST_LABEL".equals(str) || "WARNING_SCREENS".equals(str)) {
            return str2;
        }
        return null;
    }

    public final String A02(Context context, 5Et r303, ThreadKey threadKey, C5fv c5fv) {
        1BK.A1K(r303, 3, context);
        ArrayList A0s = AnonymousClass001.A0s();
        boolean A0S = ThreadKey.A0S(threadKey);
        int i = 4;
        if (A0S) {
            i = 15;
        }
        String A02 = r303.A02(((C5fu) c5fv).A0B, A0s, i);
        ArrayList A01 = 5Pq.A01(context, 0S2.A00);
        if (A02 != null) {
            int i2 = 4;
            if (A0S) {
                i2 = 15;
            }
            r303.A05(A02, A01, i2, 2222);
        }
        return A02;
    }

    public final boolean A03(C1AJ c1aj, String str) {
        11T.A0F(c1aj, 1);
        boolean z = true;
        if (str.length() == 0) {
            return false;
        }
        try {
            Uri A00 = C0A2.A00(c1aj, str);
            if (!6C7.A02(A00)) {
                2yD r0 = (2yD) 1Bq.A00(16387).get();
                if (4FS.A00(A00)) {
                    if (r0.AZk(72340108397120535L)) {
                        return true;
                    }
                }
                z = false;
            }
            return z;
        } catch (Exception e) {
            0fH.A0r(GOm.A00(183), " Fail to parse url.", e);
            return false;
        }
    }
}
