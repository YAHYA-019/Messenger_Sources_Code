package X;

import java.util.Locale;
import java.util.Set;

/* renamed from: X.9eh, reason: invalid class name */
/* loaded from: 9eh.class */
public abstract class C9eh {
    public static final Set A01 = 02H.A02(new Integer[]{5, 7});
    public static final Set A00 = 02H.A02(new Integer[]{4, 6});

    public static final String A00(Integer num, String str) {
        String str2 = "media_label";
        if (!4YU.A18(Locale.ROOT, "AI_GENERATED_CONTENT").equals(str)) {
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 5) {
                str2 = "post_cover";
            } else {
                if (intValue == 7) {
                    return "warning_screens";
                }
                if (intValue != 4) {
                    if (intValue == 6) {
                        return "post_label";
                    }
                    return null;
                }
            }
        }
        return str2;
    }
}
