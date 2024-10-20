package X;

import java.util.Locale;

/* renamed from: X.0zf, reason: invalid class name */
/* loaded from: 0zf.class */
public abstract class C0zf {
    public static final String A00(char c) {
        String valueOf = String.valueOf(c);
        11T.A0I(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        11T.A0A(upperCase);
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c != 329) {
            char charAt = upperCase.charAt(0);
            String substring = upperCase.substring(1);
            11T.A0A(substring);
            String lowerCase = substring.toLowerCase(locale);
            11T.A0A(lowerCase);
            upperCase = 0Pz.A0K(lowerCase, charAt);
        }
        return upperCase;
    }
}
