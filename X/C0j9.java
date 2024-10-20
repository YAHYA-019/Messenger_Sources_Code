package X;

import java.io.File;

/* renamed from: X.0j9, reason: invalid class name */
/* loaded from: 0j9.class */
public final class C0j9 {
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public int A00 = 5;
    public int A01 = 30;

    public static String A00(File file, String str) {
        String str2;
        StringBuilder A0k;
        String name = file.getName();
        if (!name.contains("_anr")) {
            str2 = "soft_error";
            if (name.contains(str2)) {
                A0k = AnonymousClass001.A0k();
            }
            return str;
        }
        A0k = AnonymousClass001.A0k();
        str2 = "anr_";
        A0k.append(str2);
        str = AnonymousClass001.A0d(str, A0k);
        return str;
    }
}
