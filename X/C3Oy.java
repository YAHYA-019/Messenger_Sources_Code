package X;

/* renamed from: X.3Oy, reason: invalid class name */
/* loaded from: 3Oy.class */
public abstract class C3Oy {
    public static boolean A00(String str) {
        boolean z = true;
        if (str.length() > 1) {
            int i = 0;
            if (!str.isEmpty()) {
                if (!str.startsWith("_")) {
                    char[] charArray = str.substring(0).toCharArray();
                    int length = charArray.length;
                    while (i < length) {
                        if (!Character.isDigit(charArray[i])) {
                            break;
                        }
                        i++;
                    }
                } else {
                    char[] charArray2 = str.substring(1).toCharArray();
                    int length2 = charArray2.length;
                    while (i < length2) {
                        if (!Character.isDigit(charArray2[i])) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public static boolean A01(String str) {
        boolean z = true;
        if (str.length() >= 1) {
            int i = 0;
            if (!str.isEmpty()) {
                if (!str.startsWith("_")) {
                    char[] charArray = str.substring(0).toCharArray();
                    int length = charArray.length;
                    while (i < length) {
                        if (!Character.isDigit(charArray[i])) {
                            break;
                        }
                        i++;
                    }
                } else {
                    char[] charArray2 = str.substring(1).toCharArray();
                    int length2 = charArray2.length;
                    while (i < length2) {
                        if (!Character.isDigit(charArray2[i])) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return z;
        }
        z = false;
        return z;
    }
}
