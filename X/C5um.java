package X;

import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.5um, reason: invalid class name */
/* loaded from: 5um.class */
public final class C5um {
    public final 1GS A00 = (1GS) 1Bi.A03(16504);
    public final PhoneNumberUtil A01 = (PhoneNumberUtil) 1Bi.A03(100133);

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        return A00(android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits(r301));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(java.lang.String r301) {
        /*
            r0 = r301
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto Lc
            java.lang.String r0 = ""
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r301
            int r0 = r0.length()
            r304 = r0
            r0 = 0
            r305 = r0
        L1c:
            r0 = r305
            r1 = r304
            if (r0 >= r1) goto L92
            r0 = r301
            r1 = r305
            char r0 = r0.charAt(r1)
            r306 = r0
            r0 = r306
            r1 = 10
            int r0 = java.lang.Character.digit(r0, r1)
            r307 = r0
            r0 = -1
            r302 = r0
            r0 = r307
            r1 = r302
            if (r0 == r1) goto L4b
            r0 = r303
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
        L42:
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            goto L1c
        L4b:
            r0 = r305
            if (r0 != 0) goto L63
            r0 = 43
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 != r1) goto L63
            r0 = r303
            r1 = r306
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L42
        L63:
            r0 = 97
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 < r1) goto L78
            r0 = 122(0x7a, float:1.71E-43)
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 <= r1) goto L8a
            goto L42
        L78:
            r0 = 65
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 < r1) goto L42
            r0 = 90
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 > r1) goto L42
        L8a:
            r0 = r301
            java.lang.String r0 = android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits(r0)
            java.lang.String r0 = A00(r0)
            return r0
        L92:
            r0 = r303
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5um.A00(java.lang.String):java.lang.String");
    }
}
