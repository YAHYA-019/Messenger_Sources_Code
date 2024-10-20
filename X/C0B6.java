package X;

/* renamed from: X.0B6, reason: invalid class name */
/* loaded from: 0B6.class */
public abstract class C0B6 {
    public static String A00(double... dArr) {
        int length = dArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(dArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static String A01(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        int i = 0;
        do {
            A0k.append(iArr[i]);
            A0k.append(",,,");
            i++;
        } while (i < length);
        A0k.setLength(A0k.length() - 3);
        return A0k.toString();
    }

    public static String A02(long... jArr) {
        int length = jArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(jArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static String A03(String... strArr) {
        int length = strArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(strArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static String A04(boolean... zArr) {
        int length = zArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        int i = 0;
        do {
            A0k.append(zArr[i]);
            A0k.append(",,,");
            i++;
        } while (i < length);
        A0k.setLength(A0k.length() - 3);
        return A0k.toString();
    }
}
