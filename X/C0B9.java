package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.0B9, reason: invalid class name */
/* loaded from: 0B9.class */
public abstract class C0B9 {
    public static final byte[] A00;
    public static final char[] A01;
    public static final char[] A02;

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[256];
        A01 = cArr2;
        char[] cArr3 = new char[256];
        A02 = cArr3;
        byte b = 0;
        int i = 0;
        do {
            cArr2[i] = cArr[(i >> 4) & 15];
            cArr3[i] = cArr[i & 15];
            i++;
        } while (i < 256);
        byte[] bArr = new byte[ActionId.LEGACY_MARKER];
        A00 = bArr;
        int i2 = 0;
        do {
            bArr[i2] = -1;
            i2++;
        } while (i2 <= 70);
        byte b2 = 0;
        do {
            bArr[b2 + 48] = b2;
            b2 = (byte) (b2 + 1);
        } while (b2 < 10);
        do {
            byte b3 = (byte) (b + 10);
            bArr[b + 65] = b3;
            bArr[b + 97] = b3;
            b = (byte) (b + 1);
        } while (b < 6);
    }

    public static String A00(byte[] bArr, boolean z) {
        int i;
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < length && ((i = bArr[i3] & 255) != 0 || !z); i3++) {
            int i4 = i2 + 1;
            cArr[i2] = A01[i];
            i2 = i4 + 1;
            cArr[i4] = A02[i];
        }
        return new String(cArr, 0, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        throw X.0Pz.A05("Invalid hexadecimal digit: ", r301);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A01(java.lang.String r301) {
        /*
            r0 = r301
            int r0 = r0.length()
            r302 = r0
            r0 = r302
            r1 = 1
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L8d
            r0 = r302
            r1 = 1
            int r0 = r0 >> r1
            r303 = r0
            r0 = r303
            byte[] r0 = new byte[r0]
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L1b:
            r0 = r305
            r1 = r302
            if (r0 >= r1) goto L8b
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            r0 = r301
            r1 = r305
            char r0 = r0.charAt(r1)
            r303 = r0
            r0 = 102(0x66, float:1.43E-43)
            r308 = r0
            r0 = r303
            r1 = r308
            if (r0 > r1) goto L84
            byte[] r0 = X.C0B9.A00
            r309 = r0
            r0 = r309
            r1 = r303
            r0 = r0[r1]
            r310 = r0
            r0 = -1
            r311 = r0
            r0 = r310
            r1 = r311
            if (r0 == r1) goto L84
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            r0 = r301
            r1 = r307
            char r0 = r0.charAt(r1)
            r303 = r0
            r0 = r303
            r1 = r308
            if (r0 > r1) goto L84
            r0 = r309
            r1 = r303
            r0 = r0[r1]
            r312 = r0
            r0 = r312
            r1 = r311
            if (r0 == r1) goto L84
            r0 = r310
            r1 = 4
            int r0 = r0 << r1
            r1 = r312
            r0 = r0 | r1
            byte r0 = (byte) r0
            r303 = r0
            r0 = r304
            r1 = r306
            r2 = r303
            r0[r1] = r2
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L1b
        L84:
            java.lang.String r0 = "Invalid hexadecimal digit: "
            r1 = r301
            java.lang.IllegalArgumentException r0 = X.0Pz.A05(r0, r1)
            throw r0
        L8b:
            r0 = r304
            return r0
        L8d:
            java.lang.String r0 = "Odd number of characters."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0B9.A01(java.lang.String):byte[]");
    }
}
