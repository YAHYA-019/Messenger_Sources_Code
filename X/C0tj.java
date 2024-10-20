package X;

import android.os.Trace;

/* renamed from: X.0tj, reason: invalid class name */
/* loaded from: 0tj.class */
public abstract class C0tj {
    public static void A00() {
        Trace.endSection();
    }

    public static void A01(String str, String str2, String str3) {
        String A0j = 0Pz.A0j(str, str2, str3);
        if (A0j.length() > 127 && str2 != null) {
            A0j = 0Pz.A0j(str, AnonymousClass001.A0c(str2, (127 - str.length()) - str3.length()), str3);
        }
        Trace.beginSection(A0j);
    }
}
