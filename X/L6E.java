package X;

import android.text.TextUtils;

/* loaded from: L6E.class */
public abstract class L6E {
    public static String A00(String str, String str2) {
        int i;
        int i2;
        StringBuilder A0k = AnonymousClass001.A0k();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] A02 = A02(str2);
        if (A02[0] != -1) {
            A0k.append(str2);
            A01(A0k, A02[1], A02[2]);
            return A0k.toString();
        }
        int[] A022 = A02(str);
        if (A02[3] == 0) {
            A0k.append((CharSequence) str, 0, A022[3]);
            return AnonymousClass001.A0d(str2, A0k);
        }
        if (A02[2] == 0) {
            A0k.append((CharSequence) str, 0, A022[2]);
            return AnonymousClass001.A0d(str2, A0k);
        }
        int i3 = A02[1];
        if (i3 != 0) {
            int i4 = A022[0] + 1;
            A0k.append((CharSequence) str, 0, i4);
            A0k.append(str2);
            return A01(A0k, A02[1] + i4, i4 + A02[2]);
        }
        if (str2.charAt(i3) == '/') {
            A0k.append((CharSequence) str, 0, A022[1]);
            A0k.append(str2);
            i = A022[1];
            i2 = A02[2] + i;
        } else {
            int i5 = A022[0] + 2;
            int i6 = A022[1];
            if (i5 >= i6 || i6 != A022[2]) {
                int lastIndexOf = str.lastIndexOf(47, A022[2] - 1);
                int i7 = lastIndexOf + 1;
                if (lastIndexOf == -1) {
                    i7 = i6;
                }
                A0k.append((CharSequence) str, 0, i7);
                A0k.append(str2);
                return A01(A0k, A022[1], i7 + A02[2]);
            }
            A0k.append((CharSequence) str, 0, i6);
            A0k.append('/');
            A0k.append(str2);
            i = A022[1];
            i2 = A02[2] + i + 1;
        }
        return A01(A0k, i, i2);
    }

    public static String A01(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            if (sb.charAt(i) == '/') {
                i++;
            }
            int i5 = i;
            int i6 = i;
            while (i5 <= i2) {
                if (i5 == i2) {
                    i3 = i5;
                } else if (sb.charAt(i5) == '/') {
                    i3 = i5 + 1;
                } else {
                    i5++;
                }
                int i7 = i6 + 1;
                if (i5 == i7 && sb.charAt(i6) == '.') {
                    sb.delete(i6, i3);
                    i4 = i3 - i6;
                } else if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i6 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i;
                    if (i6 > i) {
                        i8 = i6;
                    }
                    sb.delete(i8, i3);
                    i4 = i3 - i8;
                } else {
                    i6 = i5 + 1;
                    i5 = i6;
                }
                i2 -= i4;
                i5 = i6;
            }
        }
        return sb.toString();
    }

    public static int[] A02(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }
}
