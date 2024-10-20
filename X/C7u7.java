package X;

import android.net.Uri;

/* renamed from: X.7u7, reason: invalid class name */
/* loaded from: 7u7.class */
public final class C7u7 {
    public static final Uri A00(C03853z9 c03853z9, String str) {
        int A04;
        if (str == null) {
            return null;
        }
        String A00 = GOm.A00(232);
        if (0CU.A04(str, A00, 0, false) == -1) {
            return C0A2.A00(new AnonymousClass488(4YV.A0G(), "SecureUriParser"), str);
        }
        03Y r307 = null;
        int A042 = 0CU.A04(str, A00, 0, false);
        if (A042 > 0 && (A04 = 0CU.A04(str, "?", 0, false)) > 0) {
            String substring = str.substring(17, A04);
            11T.A0A(substring);
            try {
                Long A0n = 1BK.A0n(substring);
                String substring2 = str.substring(A042 + 14);
                11T.A0A(substring2);
                r307 = 1BK.A1G(A0n, substring2);
            } catch (NumberFormatException unused) {
            }
        }
        if (r307 != null) {
            return c03853z9.A01((String) r307.second, AnonymousClass001.A05(r307.first));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0372, code lost:
    
        if ((!java.lang.Float.isNaN(r0)) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList A01(com.facebook.messaging.model.threadkey.ThreadKey r302, com.facebook.messaging.model.threadkey.ThreadKey r303, X.90R r304, X.C03853z9 r305, java.lang.Long r306) {
        /*
            Method dump skipped, instructions count: 2649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7u7.A01(com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threadkey.ThreadKey, X.90R, X.3z9, java.lang.Long):java.util.ArrayList");
    }
}
