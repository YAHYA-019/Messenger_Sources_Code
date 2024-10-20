package X;

/* loaded from: Kwf.class */
public abstract class Kwf {
    public static String A00(byte[] bArr) {
        int length = bArr.length;
        StringBuilder A0l = AnonymousClass001.A0l(length * 2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0l.toString();
            }
            int i3 = bArr[i2] & 255;
            A0l.append("0123456789abcdef".charAt(i3 / 16));
            A0l.append("0123456789abcdef".charAt(i3 % 16));
            i = i2 + 1;
        }
    }

    public static byte[] A01(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw AnonymousClass001.A0L("Expected a string of even length");
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return bArr;
            }
            int i4 = i3 * 2;
            int digit = Character.digit(str.charAt(i4), 16);
            int digit2 = Character.digit(str.charAt(i4 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                break;
            }
            bArr[i3] = (byte) ((digit * 16) + digit2);
            i2 = i3 + 1;
        }
        throw AnonymousClass001.A0L("input is not hexadecimal");
    }
}
