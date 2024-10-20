package X;

import android.content.Context;

/* renamed from: X.9d8, reason: invalid class name */
/* loaded from: 9d8.class */
public final class C9d8 {
    public static boolean A00(Context context, 1pI r302, C6xf c6xf) {
        8GK r310;
        Integer num;
        String str;
        1BV A0R;
        9kN r309;
        1G9 r308;
        11T.A0F(r302, 1);
        if (context == null) {
            return false;
        }
        int ordinal = c6xf.ordinal();
        if (ordinal == 0) {
            1BV A0R2 = 7zL.A0R(context, 68085);
            if (!r302.BVa()) {
                return false;
            }
            9Rf r0 = (9Rf) A0R2.get();
            if (!1Br.A06(((AnonymousClass842) 1Br.A0B(r0.A00)).A01).AZk(36320953580076886L)) {
                return false;
            }
            9kN r02 = (9kN) 1Br.A0B(r0.A01);
            1G9 r03 = 9kN.A02;
            if (1Br.A09(r02.A01).AZn(1G9.A05(r03, 7zT.A0x(r02.A00)), false)) {
                return false;
            }
            r310 = new 8GI();
            9kN.A00(r03, (9kN) 1Br.A0B(((9Rf) A0R2.get()).A01));
            num = 0S2.A0j;
            str = "EMPLOYEE_DISCLOSURE_NUX_FRAGMENT_TAG";
        } else if (ordinal != 3) {
            if (ordinal == 1) {
                A0R = 7zL.A0R(context, 68088);
                if (!r302.BVa()) {
                    return false;
                }
                9Rg r04 = (9Rg) A0R.get();
                if (!1Br.A06(((AnonymousClass842) 1Br.A0B(r04.A00)).A01).AZk(36320953580404568L)) {
                    return false;
                }
                r309 = (9kN) 1Br.A0B(r04.A01);
                r308 = 9kN.A05;
            } else {
                if (ordinal != 2) {
                    throw 1BK.A1F();
                }
                A0R = 7zL.A0R(context, 68088);
                if (!r302.BVa()) {
                    return false;
                }
                9Rg r05 = (9Rg) A0R.get();
                if (!1Br.A06(((AnonymousClass842) 1Br.A0B(r05.A00)).A01).AZk(36320953582698346L)) {
                    return false;
                }
                r309 = (9kN) 1Br.A0B(r05.A01);
                r308 = 9kN.A03;
            }
            if (1Br.A09(r309.A01).AZn(1G9.A05(r308, 7zT.A0x(r309.A00)), false)) {
                return false;
            }
            r310 = new 8GK();
            9kN.A00(r308, (9kN) 1Br.A0B(((9Rg) A0R.get()).A01));
            num = 0S2.A0j;
            str = "PUBLIC_TEST_DISCLOSURE_NUX_FRAGMENT_TAG";
        } else {
            1BV A0R3 = 7zL.A0R(context, 68086);
            if (!r302.BVa()) {
                return false;
            }
            9kN r06 = (9kN) 1Br.A0B(((9Pf) A0R3.get()).A00);
            1G9 r07 = 9kN.A04;
            if (!(!1Br.A09(r06.A01).AZn(1G9.A05(r07, 7zT.A0x(r06.A00)), false))) {
                return false;
            }
            r310 = new 8GJ();
            9kN.A00(r07, (9kN) 1Br.A0B(((9Pf) A0R3.get()).A00));
            num = 0S2.A0j;
            str = "META_AI_DISCLOSURE_NUX_FRAGMENT_TAG";
        }
        r302.Czz(r310, num, str);
        return true;
    }
}
