package X;

import java.util.TimeZone;

/* loaded from: L6q.class */
public abstract class L6q {
    public static final TimeZone A00 = TimeZone.getTimeZone("UTC");

    public static int A00(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i3 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException(0Pz.A0W("Invalid number: ", str.substring(i, i2)));
            }
            i4 = -digit;
        } else {
            i3 = i;
            i4 = 0;
        }
        while (i3 < i2) {
            int i5 = i3 + 1;
            int digit2 = Character.digit(str.charAt(i3), 10);
            if (digit2 < 0) {
                throw new NumberFormatException(0Pz.A0W("Invalid number: ", str.substring(i, i2)));
            }
            i4 = (i4 * 10) - digit2;
            i3 = i5;
        }
        return -i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301.charAt(r303) != r302) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(java.lang.String r301, char r302, int r303) {
        /*
            r0 = r301
            int r0 = r0.length()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 >= r1) goto L19
            r0 = r301
            r1 = r303
            char r0 = r0.charAt(r1)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            r1 = r302
            if (r0 == r1) goto L1b
        L19:
            r0 = 0
            r304 = r0
        L1b:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L6q.A01(java.lang.String, char, int):boolean");
    }
}
