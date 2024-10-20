package com.facebook.ui.emoji.model;

import X.AnonymousClass001;
import X.C03v;
import android.os.Parcelable;
import com.facebook.smartcapture.logging.SmartCaptureQpl;

/* loaded from: Emoji.class */
public abstract class Emoji implements Parcelable {
    public static final C03v A00 = new C03v(2);
    public static final C03v A01 = new C03v(2);

    public static int A00(String str, int[] iArr) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length && i2 < iArr.length) {
            int codePointAt = Character.codePointAt(str, i);
            iArr[i2] = codePointAt;
            i2++;
            i += Character.charCount(codePointAt);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(int[] r301, int r302, boolean r303) {
        /*
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L5:
            r0 = r304
            r1 = r302
            if (r0 >= r1) goto L53
            r0 = r301
            r1 = r304
            r0 = r0[r1]
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L30
            r0 = 127995(0x1f3fb, float:1.79359E-40)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 < r1) goto L30
            r0 = 127999(0x1f3ff, float:1.79365E-40)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 > r1) goto L3e
        L29:
            r0 = r304
            r1 = 1
            int r0 = r0 + r1
            r304 = r0
            goto L5
        L30:
            r0 = 65039(0xfe0f, float:9.1139E-41)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L3e
            goto L29
        L3e:
            r0 = r305
            r1 = r304
            if (r0 == r1) goto L4a
            r0 = r301
            r1 = r305
            r2 = r306
            r0[r1] = r2
        L4a:
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            goto L29
        L53:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ui.emoji.model.Emoji.A01(int[], int, boolean):int");
    }

    public static String A02(int i) {
        switch (i) {
            case 127995:
                return "light";
            case 127996:
                return "medium-light";
            case 127997:
                return SmartCaptureQpl.ANNOTATION_KEY_MEDIUM;
            case 127998:
                return "medium-dark";
            case 127999:
                return "dark";
            default:
                return null;
        }
    }

    public static String A03(int i, int i2) {
        if (i == 0) {
            return "";
        }
        C03v c03v = A00;
        char[] cArr = (char[]) c03v.A3p();
        if (cArr == null) {
            cArr = new char[19];
        }
        int chars = Character.toChars(i, cArr, 0);
        if (i2 != 0) {
            chars += Character.toChars(i2, cArr, chars);
        }
        String str = new String(cArr, 0, chars);
        c03v.Ccj(cArr);
        return str;
    }

    public static String A04(Emoji emoji) {
        String A07 = emoji.A07();
        int length = A07.length();
        if (length <= 2) {
            if (length != 2) {
                return null;
            }
            return A02(Character.codePointAt(A07, 0));
        }
        int[] A06 = A06();
        int A002 = A00(A07, A06);
        String str = null;
        if (A002 >= 2) {
            int i = 1;
            StringBuilder sb = null;
            do {
                String A02 = A02(A06[i]);
                if (A02 != null) {
                    if (sb == null) {
                        sb = AnonymousClass001.A0k();
                    } else {
                        sb.append(',');
                    }
                    sb.append(A02);
                }
                i++;
            } while (i < A002);
            if (sb != null) {
                str = sb.toString();
            }
        } else if (A002 != 0) {
            str = A02(A06[0]);
        }
        A01.Ccj(A06);
        return str;
    }

    public static String A05(String str) {
        int[] A06 = A06();
        String str2 = new String(A06, 0, A01(A06, A00(str, A06), false));
        A01.Ccj(A06);
        return str2;
    }

    public static int[] A06() {
        int[] iArr = (int[]) A01.A3p();
        if (iArr == null) {
            iArr = new int[11];
        }
        return iArr;
    }

    public String A07() {
        return ((BasicEmoji) this).A00;
    }

    public final String toString() {
        String A07 = A07();
        StringBuilder sb = new StringBuilder(11);
        boolean z = true;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A07.length()) {
                return sb.toString();
            }
            if (z) {
                z = false;
            } else {
                sb.append('_');
            }
            int codePointAt = Character.codePointAt(A07, i2);
            sb.append(Integer.toHexString(codePointAt));
            i = i2 + Character.charCount(codePointAt);
        }
    }
}
