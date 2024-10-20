package X;

import android.content.Context;

/* renamed from: X.2kn, reason: invalid class name */
/* loaded from: 2kn.class */
public abstract class C2kn {
    public static final float A00(Context context, 2TI r302) {
        switch ((r302.A03() ? A06(context, r302.A01()) ? 0S2.A01 : 0S2.A0C : 0S2.A00).intValue()) {
            case 0:
                return 75.0f;
            case 1:
                return 86.0f;
            default:
                return 80.0f;
        }
    }

    public static final float A01(Context context, 2TI r302) {
        switch ((r302.A03() ? A06(context, r302.A01()) ? 0S2.A01 : 0S2.A0C : 0S2.A00).intValue()) {
            case 0:
                return 6.0f;
            case 1:
                return 18.0f;
            default:
                return 12.0f;
        }
    }

    public static final C2q1 A02(Context context, 2TI r302) {
        if (r302.A03()) {
            return A06(context, r302.A01()) ? AbstractC03523yD.A01 : AbstractC03523yD.A00;
        }
        C2q1 c2q1 = C2q0.A08;
        11T.A0D(c2q1);
        return c2q1;
    }

    public static final C2q1 A03(Context context, 2TI r302) {
        return r302.A03() ? A06(context, r302.A01()) ? 3IL.A02 : 3IL.A01 : 3IL.A00;
    }

    public static final boolean A04(Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        if (i != 1) {
            return i == 2 || i == 3 || i == 4;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (X.2Ss.A00(r0).AZk(72340198592875819L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A05(android.content.Context r301, boolean r302) {
        /*
            r0 = r301
            r1 = r302
            boolean r0 = A06(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L49
            r0 = 66516(0x103d4, float:9.3209E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2Ss r0 = (X.2Ss) r0
            r301 = r0
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.2TI r0 = (X.2TI) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.A03()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L49
            r0 = r301
            X.1CO r0 = X.2Ss.A00(r0)
            r305 = r0
            r0 = 72340198592875819(0x1010107001c0d2b, double:7.748645881332385E-304)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L4d
        L49:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L4d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2kn.A05(android.content.Context, boolean):boolean");
    }

    public static final boolean A06(Context context, boolean z) {
        boolean z2;
        if (z) {
            z2 = A04(context);
        } else {
            int i = context.getResources().getConfiguration().screenLayout & 15;
            z2 = false;
            if (i != 1 && i != 2) {
                return i == 3 || i == 4;
            }
        }
        return z2;
    }
}
