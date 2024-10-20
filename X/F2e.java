package X;

import android.graphics.Typeface;

/* loaded from: F2e.class */
public abstract class F2e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x02bd, code lost:
    
        if (r305 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Typeface A00(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F2e.A00(java.lang.String):android.graphics.Typeface");
    }

    public static Ez6 A01(2KP r301, String str, int i, int i2) {
        int A00 = EVH.A00(r301.A03);
        Typeface A002 = A00(str);
        C0A9 c0a9 = LBv.A01;
        0RZ.A01(A00, i, 1000, "weight");
        Typeface create = Typeface.create(A002, A00, false);
        11T.A0A(create);
        return new Ez6(create, r301.A02, r301.A00, r301.A01, i2);
    }
}
