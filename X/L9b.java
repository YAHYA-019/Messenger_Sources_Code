package X;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: L9b.class */
public abstract class L9b {
    public static final Charset A00 = Charset.forName("UTF-8");

    public static int A00() {
        int i;
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        do {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        } while (i == 0);
        return i;
    }

    public static final L4o A01(String str) {
        char charAt;
        int length = str.length();
        byte[] bArr = new byte[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return new L4o(bArr, length);
            }
            charAt = str.charAt(i2);
            if (charAt < '!' || charAt > '~') {
                break;
            }
            bArr[i2] = (byte) charAt;
            i = i2 + 1;
        }
        throw new RuntimeException(0Pz.A0J("Not a printable ASCII character: ", charAt));
    }

    public static boolean A02(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        int length2 = bArr.length;
        boolean z = false;
        if (length >= length2) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length2) {
                    z = true;
                    break;
                }
                if (bArr2[i2] != bArr[i2]) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }
}
