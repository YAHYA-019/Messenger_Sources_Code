package X;

import android.util.Patterns;
import java.util.Locale;

/* renamed from: X.28o, reason: invalid class name */
/* loaded from: 28o.class */
public final class C28o {
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public final 1GS A00 = (1GS) 1Bi.A03(16504);

    static {
        String language = Locale.JAPANESE.getLanguage();
        Locale locale = Locale.US;
        A02 = language.toLowerCase(locale);
        A03 = Locale.KOREAN.getLanguage().toLowerCase(locale);
        A01 = Locale.CHINESE.getLanguage().toLowerCase(locale);
    }

    public static int A00(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= str.length()) {
                return str.codePointAt(0);
            }
            int codePointAt = str.codePointAt(i2);
            if (Character.isLetterOrDigit(codePointAt)) {
                return codePointAt;
            }
            i = i2 + Character.charCount(codePointAt);
        }
    }

    public static String A01(String str) {
        String str2 = null;
        if (!1JF.A0B(str)) {
            String trim = str.trim();
            if (!1JF.A0B(trim) && !Patterns.PHONE.matcher(trim).matches()) {
                StringBuilder A0l = AnonymousClass001.A0l(1);
                A0l.appendCodePoint(A00(trim));
                str2 = A0l.toString();
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (X.C28o.A01.equalsIgnoreCase(r0) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(X.C28o r301) {
        /*
            r0 = r301
            X.1GS r0 = r0.A00
            java.util.Locale r0 = r0.A05()
            java.lang.String r0 = r0.getLanguage()
            r301 = r0
            java.lang.String r0 = X.C28o.A02
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equalsIgnoreCase(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L37
            java.lang.String r0 = X.C28o.A03
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equalsIgnoreCase(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L37
            java.lang.String r0 = X.C28o.A01
            r1 = r301
            boolean r0 = r0.equalsIgnoreCase(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L39
        L37:
            r0 = 1
            r303 = r0
        L39:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28o.A02(X.28o):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r304 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A03(com.facebook.user.model.User r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L5a
            r0 = r301
            boolean r0 = A02(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r302
            com.facebook.user.model.Name r0 = r0.A0X
            java.lang.String r0 = r0.A00()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1b
            r0 = r304
            return r0
        L1b:
            r0 = r302
            com.facebook.user.model.Name r0 = r0.A0X
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.firstName
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L38
            r0 = r305
            java.lang.String r0 = r0.displayName
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L3b
        L38:
            r0 = r304
            r305 = r0
        L3b:
            r0 = r305
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5d
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5a
            r0 = r302
            java.lang.String r0 = r0.A08()
            return r0
        L5a:
            r0 = 0
            r305 = r0
        L5d:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28o.A03(com.facebook.user.model.User):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r304 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A04(com.facebook.user.model.User r302, boolean r303) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L59
            r0 = r303
            if (r0 == 0) goto L16
            r0 = r302
            com.facebook.user.model.Name r0 = r0.A0X
            java.lang.String r0 = r0.A00()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L16
            r0 = r304
            return r0
        L16:
            r0 = r302
            com.facebook.user.model.Name r0 = r0.A0X
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.firstName
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L33
            r0 = r305
            java.lang.String r0 = r0.displayName
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L36
        L33:
            r0 = r304
            r305 = r0
        L36:
            r0 = r305
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5c
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L59
            r0 = r302
            java.lang.String r0 = r0.A08()
            return r0
        L59:
            r0 = 0
            r305 = r0
        L5c:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28o.A04(com.facebook.user.model.User, boolean):java.lang.String");
    }
}
