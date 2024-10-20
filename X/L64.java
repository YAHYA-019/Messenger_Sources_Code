package X;

import android.os.Build;
import java.util.HashSet;

/* loaded from: L64.class */
public abstract class L64 {
    public static HashSet A00(Object... objArr) {
        HashSet A0v = AnonymousClass001.A0v();
        int length = objArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0v;
            }
            A0v.add(objArr[i2]);
            i = i2 + 1;
        }
    }

    public static boolean A01(char c, char c2, char c3) {
        boolean z = false;
        if ("samsung".equals(Build.MANUFACTURER)) {
            String str = Build.FINGERPRINT;
            int indexOf = str.indexOf(":user/");
            if (indexOf == -1) {
                indexOf = str.indexOf(":userdebug/");
            }
            if (indexOf == -1) {
                indexOf = str.indexOf(":eng/");
            }
            if (indexOf >= 3) {
                char charAt = str.charAt(indexOf - 3);
                char charAt2 = str.charAt(indexOf - 2);
                char charAt3 = str.charAt(indexOf - 1);
                if (charAt <= c) {
                    if (charAt == c) {
                        if (charAt2 <= c2) {
                            if (charAt2 == c2 && charAt3 >= c3) {
                                z = true;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r301.contains(X.L8O.A04) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(java.util.Set r301) {
        /*
            X.L8O r0 = X.L8O.A03
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L24
            X.L8O r0 = X.L8O.A04
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L26
        L24:
            r0 = 1
            r303 = r0
        L26:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L64.A02(java.util.Set):boolean");
    }
}
