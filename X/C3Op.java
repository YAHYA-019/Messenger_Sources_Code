package X;

import java.util.Random;

/* renamed from: X.3Op, reason: invalid class name */
/* loaded from: 3Op.class */
public final class C3Op {
    public static final String A00() {
        byte[] bArr = new byte[3];
        new Random().nextBytes(bArr);
        char[] cArr = new char[6];
        int i = 0;
        do {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = AnonymousClass365.A0P;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
            i++;
        } while (i < 3);
        String substring = new String(cArr).substring(0, 5);
        11T.A0A(substring);
        return substring;
    }
}
