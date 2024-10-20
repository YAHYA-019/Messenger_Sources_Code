package X;

import java.util.Locale;

/* renamed from: X.7ls, reason: invalid class name */
/* loaded from: 7ls.class */
public abstract class C7ls {
    public static final 6TL A00(String str) {
        6TL r305;
        if (str != null) {
            6TL[] values = 6TL.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                r305 = values[i];
                String obj = r305.toString();
                Locale locale = Locale.getDefault();
                11T.A0A(locale);
                if (11T.A0O(obj, 4YU.A18(locale, str))) {
                    break;
                }
            }
        }
        r305 = 6TL.A1p;
        return r305;
    }
}
