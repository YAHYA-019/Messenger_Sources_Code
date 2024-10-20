package X;

import java.util.regex.Pattern;

/* renamed from: X.9li, reason: invalid class name */
/* loaded from: 9li.class */
public final class C9li {
    public static final Pattern A00 = Pattern.compile("[-_./;:]");

    public static int A00(String str) {
        char charAt;
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length && (charAt = str.charAt(i2)) <= '9' && charAt >= '0'; i2++) {
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    public static C28c A01(String str, String str2) {
        int i;
        String str3;
        String trim = "2.13.5".trim();
        if (trim.length() <= 0) {
            return C28c.A00;
        }
        String[] split = A00.split(trim);
        int i2 = 0;
        int A002 = A00(split[0]);
        int length = split.length;
        if (length > 1) {
            i = A00(split[1]);
            if (length > 2) {
                i2 = A00(split[2]);
                if (length > 3) {
                    str3 = split[3];
                    return new C28c(str3, str, str2, A002, i, i2);
                }
            }
        } else {
            i = 0;
        }
        str3 = null;
        return new C28c(str3, str, str2, A002, i, i2);
    }
}
