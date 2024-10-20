package X;

import java.util.Locale;

/* renamed from: X.5f6, reason: invalid class name */
/* loaded from: 5f6.class */
public abstract class C5f6 {
    public static final java.util.Map A00 = 04R.A09(new 03Y[]{new 03Y("mkv", "video/x-matroska"), new 03Y("glb", "model/gltf-binary")});

    public static final String A00(String str) {
        11T.A0F(str, 0);
        int length = str.length() - 1;
        int A01 = 0CU.A01(str, '.', length);
        if (A01 < 0 || A01 == length) {
            return null;
        }
        String substring = str.substring(A01 + 1);
        11T.A0A(substring);
        Locale locale = Locale.US;
        11T.A0B(locale);
        String lowerCase = substring.toLowerCase(locale);
        11T.A0A(lowerCase);
        String str2 = (String) C5f7.A01.get(lowerCase);
        if (str2 == null) {
            str2 = C5f7.A00.getMimeTypeFromExtension(lowerCase);
        }
        if (str2 == null) {
            str2 = (String) A00.get(lowerCase);
        }
        return str2;
    }
}
