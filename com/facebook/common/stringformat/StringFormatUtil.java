package com.facebook.common.stringformat;

import X.0Pz;
import X.AnonymousClass001;
import java.util.Formatter;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;

/* loaded from: StringFormatUtil.class */
public class StringFormatUtil {
    public static final Object[] A00 = {null};

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r308 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        r309 = -3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        return r309;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.Object r301, java.lang.Object r302, java.lang.Object r303, java.lang.Object r304, java.lang.String r305, java.lang.StringBuilder r306, int r307) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A00(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.StringBuilder, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0158, code lost:
    
        if (r313 == null) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0174 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(java.lang.Object r301, java.lang.String r302, java.lang.StringBuilder r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A01(java.lang.Object, java.lang.String, java.lang.StringBuilder, int, boolean):int");
    }

    public static int A02(String str, int i) {
        int i2;
        char charAt;
        int length = str.length();
        boolean z = false;
        while (i < length) {
            if (str.charAt(i) == '%' && length > (i2 = i + 1) && ((charAt = str.charAt(i2)) == 's' || charAt == 'd' || charAt == '%')) {
                int i3 = i + 1;
                if (str.charAt(i3) != '%') {
                    return i + 2;
                }
                i = i3;
                z = true;
            }
            i++;
        }
        int i4 = -200;
        if (z) {
            i4 = -201;
        }
        return i4;
    }

    public static int A03(String str, StringBuilder sb, int i, int i2, boolean z) {
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                i++;
                if (length <= i || str.charAt(i) != '%') {
                    if (z) {
                        return -1;
                    }
                    throw new AssertionError();
                }
            }
            if (sb == null) {
                i3++;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        int i4 = -3;
        if (z) {
            i4 = i2 + i3;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        r304 = r312;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(java.lang.String r301, java.lang.StringBuilder r302, java.lang.Object... r303) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A04(java.lang.String, java.lang.StringBuilder, java.lang.Object[]):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.String] */
    public static String A05(Object obj, Object obj2, Object obj3, Object obj4, String str, Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int A04 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? A04(str, null, objArr) : A00(obj, obj2, obj3, obj4, str, null, 4) : A00(obj, obj2, obj3, null, str, null, 3) : A00(obj, obj2, null, null, str, null, 2) : A00(obj, null, null, null, str, null, 1) : A00(null, null, null, null, str, null, 0);
        if (A04 != -1) {
            if (A04 == -2) {
                return str;
            }
            StringBuilder A0l = AnonymousClass001.A0l(A04);
            if (i == -1) {
                A04(str, A0l, objArr2);
            } else {
                A00(obj, obj2, obj3, obj4, str, A0l, i);
            }
            return A0l.toString();
        }
        if (i == 0) {
            objArr2 = new Object[0];
        } else if (i == 1) {
            objArr2 = new Object[]{obj};
        } else if (i == 2) {
            objArr2 = new Object[]{obj, obj2};
        } else if (i == 3) {
            objArr2 = new Object[]{obj, obj2, obj3};
        } else if (i == 4) {
            objArr2 = new Object[]{obj, obj2, obj3, obj4};
        }
        ?? r0 = 0;
        try {
            r0 = String.format(null, str, objArr2);
            return r0;
        } catch (MissingFormatArgumentException | UnknownFormatConversionException unused) {
            throw AnonymousClass001.A0T(0Pz.A0j(r0.getMessage(), ": ", str));
        }
    }

    public static void appendFormatStrLocaleSafe(StringBuilder sb, String str, Object... objArr) {
        int A04 = A04(str, null, objArr);
        if (A04 == -1) {
            new Formatter(sb).format(null, str, objArr);
        } else if (A04 == -2) {
            sb.append(str);
        } else {
            sb.ensureCapacity(A04);
            A04(str, sb, objArr);
        }
    }

    public static String formatStrLocaleSafe(String str) {
        return A05(null, null, null, null, str, null, 0);
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        return A05(obj, null, null, null, str, null, 1);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        return A05(obj, obj2, null, null, str, null, 2);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        return A05(obj, obj2, obj3, null, str, null, 3);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return A05(obj, obj2, obj3, obj4, str, null, 4);
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        return A05(null, null, null, null, str, objArr, -1);
    }
}
