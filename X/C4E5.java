package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.4E5, reason: invalid class name */
/* loaded from: 4E5.class */
public final class C4E5 {
    public static final C4E5 A00 = new Object();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026a, code lost:
    
        if (r310.equals(r312) == false) goto L14;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x009c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02bc  */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Jj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent A00(android.content.Context r301, android.os.Bundle r302, X.C4U0 r303, java.lang.String r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E5.A00(android.content.Context, android.os.Bundle, X.4U0, java.lang.String, java.lang.String):android.content.Intent");
    }

    public static final Intent A01(Context context, C4U0 c4u0, String str, String str2, char[] cArr, int i) {
        Integer num = 0S2.A0C;
        11T.A0F(context, 0);
        Object A05 = A05(num, cArr, i);
        Boolean bool = false;
        if (bool.equals(A05)) {
            return null;
        }
        return A00(context, null, c4u0, str, str2);
    }

    public static final Intent A02(Context context, C4U0 c4u0, String str, String str2, char[] cArr, int i) {
        Integer num = 0S2.A00;
        11T.A0F(context, 0);
        Object A05 = A05(num, cArr, i);
        Boolean bool = false;
        if (bool.equals(A05)) {
            return null;
        }
        return A00(context, null, c4u0, str, str2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.os.Bundle A03(java.lang.String r301, java.lang.String r302, android.os.Bundle r303) {
        /*
            r0 = r301
            int r0 = r0.hashCode()
            r304 = r0
            r0 = r304
            switch(r0) {
                case -1483898950: goto L32;
                case -983972142: goto L39;
                case 2931858: goto L52;
                case 3151469: goto L40;
                default: goto L30;
            }
        L30:
            r0 = 0
            return r0
        L32:
            java.lang.String r0 = "__tn__"
            r305 = r0
            goto L44
        L39:
            java.lang.String r0 = "pn_ref"
            r305 = r0
            goto L44
        L40:
            java.lang.String r0 = "fref"
            r305 = r0
        L44:
            r0 = r301
            r1 = r305
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L61
            goto L30
        L52:
            java.lang.String r0 = "_ft_"
            r305 = r0
            r0 = r301
            r1 = r305
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L30
        L61:
            r0 = r303
            if (r0 != 0) goto L70
            r0 = 2
            r304 = r0
            android.os.Bundle r0 = new android.os.Bundle
            r303 = r0
            r0 = r303
            r1 = r304
            r0.<init>(r1)
        L70:
            r0 = r303
            r1 = r301
            r2 = r302
            r0.putString(r1, r2)
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E5.A03(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public static final Boolean A04(String str) {
        Boolean bool = null;
        if (str != null) {
            boolean z = true;
            if (!str.equalsIgnoreCase("true") && !str.equals(ConstantsKt.CAMERA_ID_BACK)) {
                if (str.equalsIgnoreCase("false") || str.equals(ConstantsKt.CAMERA_ID_FRONT)) {
                    z = false;
                }
            }
            bool = Boolean.valueOf(z);
        }
        return bool;
    }

    public static final Object A05(Integer num, char[] cArr, int i) {
        String substring;
        int i2 = i + 1;
        int length = cArr.length;
        if (i2 < length && cArr[i] == '/' && cArr[i2] == '?') {
            i2 = i + 2;
        } else if (i >= length || cArr[i] != '?') {
            i2 = -1;
        }
        int i3 = 0;
        if (i2 < 0) {
            return false;
        }
        int i4 = length - i2;
        String A0Q = C3o5.A0Q(cArr, i2, i4);
        Bundle bundle = null;
        boolean z = false;
        while (i3 < i4) {
            int A002 = 0CU.A00(A0Q, '=', i3);
            if (A002 < 0) {
                return false;
            }
            String substring2 = A0Q.substring(i3, A002);
            11T.A0A(substring2);
            int A003 = 0CU.A00(A0Q, '&', A002);
            int i5 = A002 + 1;
            if (A003 > 0) {
                substring = A0Q.substring(i5, A003);
                11T.A0A(substring);
                i3 = A003 + 1;
            } else {
                substring = A0Q.substring(i5);
                11T.A0A(substring);
                i3 = A0Q.length();
            }
            Bundle A03 = A03(substring2, substring, bundle);
            if (A03 != null) {
                bundle = A03;
            } else {
                z = true;
            }
        }
        if (!z || num.intValue() == 2) {
            return bundle;
        }
        return false;
    }

    public static final boolean A06(String str, char[] cArr, int i) {
        int i2;
        int length = cArr.length;
        int length2 = str.length();
        boolean z = false;
        if (length <= i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            i2 = i3;
            if (i >= length || i2 >= length2) {
                break;
            }
            if (cArr[i] != str.charAt(i2)) {
                return false;
            }
            i++;
            i3 = i2 + 1;
        }
        if (length2 <= i2) {
            z = true;
        }
        return z;
    }

    public static final int[] A07(Bundle bundle, String str, char[] cArr, int i) {
        int i2;
        int length = cArr.length;
        int i3 = i;
        while (true) {
            i2 = i3;
            if (length <= i2) {
                break;
            }
            char c = cArr[i2];
            if (c == '/' || c == '?') {
                break;
            }
            i3 = i2 + 1;
        }
        if (i2 == -1) {
            return null;
        }
        bundle.putString(str, C3o5.A0Q(cArr, i, i2 - i));
        return new int[]{i2, 3};
    }
}
