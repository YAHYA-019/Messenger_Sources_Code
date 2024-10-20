package X;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: I8d.class */
public final class I8d {
    public final 1Br A00 = 1Bq.A00(67262);

    public static final boolean A00(I8d i8d, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 34) {
            ArrayList A0s = AnonymousClass001.A0s();
            int length = strArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                String str = strArr[i2];
                if (7zL.A1X(str, AbE.A00(0))) {
                    A0s.add(str);
                }
                i = i2 + 1;
            }
            strArr = C3o5.A0n(A0s);
        }
        return ((1Rv) 1Br.A0B(i8d.A00)).A09(strArr);
    }

    public static final String[] A01(Context context) {
        String[] A01 = 48U.A01(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, true);
        11T.A0A(A01);
        return A01;
    }

    public final boolean A02() {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((1Rv) 1Br.A0B(this.A00)).A08(AbE.A00(0));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (A02() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(java.lang.String[] r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = A00(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L15
            r0 = r301
            boolean r0 = r0.A02()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            r303 = r0
        L17:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8d.A03(java.lang.String[]):boolean");
    }
}
