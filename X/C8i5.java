package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8i5, reason: invalid class name */
/* loaded from: 8i5.class */
public final class C8i5 extends 1LH {
    public final int A00;
    public final 2kG A01;
    public final 2lO A02;
    public final C95w A03;
    public final EMg A04;
    public final String A05;
    public final List A06;
    public final C00m A07;
    public final C00m A08;
    public final Function1 A09;
    public final Function1 A0A;
    public final Function1 A0B;
    public final Function1 A0C;
    public final Function2 A0D;
    public final Function2 A0E;
    public final 0Be A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C8i5(2kG r302, 2lO r303, C95w c95w, EMg eMg, String str, List list, C00m c00m, C00m c00m2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function2, Function2 function22, 0Be r316, int i, boolean z, boolean z2, boolean z3) {
        1BL.A1H(list, eMg, function1);
        11T.A0F(function12, 5);
        11T.A0F(r303, 19);
        this.A06 = list;
        this.A04 = eMg;
        this.A09 = function1;
        this.A0F = r316;
        this.A0B = function12;
        this.A0A = function13;
        this.A0D = function2;
        this.A0E = function22;
        this.A0C = function14;
        this.A03 = c95w;
        this.A01 = r302;
        this.A00 = i;
        this.A0G = z;
        this.A0H = z2;
        this.A07 = c00m;
        this.A08 = c00m2;
        this.A05 = str;
        this.A0I = z3;
        this.A02 = r303;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r305.A00 < 3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r315 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C1rh A01(X.C2k6 r301, X.2lO r302, X.2lO r303, X.C8i5 r304, X.9YR r305, X.C0Bd r306, boolean r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8i5.A01(X.2k6, X.2lO, X.2lO, X.8i5, X.9YR, X.0Bd, boolean, boolean):X.1rh");
    }

    public static final boolean A0L(C8i5 c8i5) {
        List list = c8i5.A06;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((9YR) it.next()).A01) {
                return true;
            }
        }
        return false;
    }

    public 1LI A0s(C2k5 c2k5) {
        float f;
        Function1 function1;
        11T.A0F(c2k5, 0);
        long A06 = 7zQ.A06();
        C2lh A00 = C2lc.A00(c2k5, AQK.A00);
        C95w c95w = this.A03;
        EMg eMg = this.A04;
        Object A002 = 2rO.A00(c2k5, new G9G(this, c2k5, 33), new Object[]{c95w, eMg});
        C2lh A003 = C2lc.A00(c2k5, AQJ.A00);
        C2lh A004 = C2lc.A00(c2k5, AQG.A00);
        List list = this.A06;
        int size = list.size();
        Number number = (Number) A004.A02;
        int intValue = number.intValue();
        if (intValue >= 0 && intValue < size && (function1 = this.A0A) != null) {
            function1.invoke(list.get(number.intValue()));
        }
        9cG r0 = (9cG) 2rO.A00(c2k5, AQI.A00, new Object[0]);
        8Du r02 = new 8Du(1, A004, r0, this);
        C2lh A005 = C2lc.A00(c2k5, AQH.A00);
        4FL.A00(c2k5, new G9J(28, A005, r0, this), AnonymousClass001.A1a(list.size()));
        Integer valueOf = Integer.valueOf(list.size());
        9YR r03 = (9YR) 0QD.A0E(list);
        4FL.A00(c2k5, new G9J(29, A005, r0, this), new Object[]{valueOf, r03 != null ? Boolean.valueOf(r03.A01) : null, A005.A02});
        Function2 A02 = 4FN.A02(c2k5, new GBs(this, 27));
        Object A006 = 2rO.A00(c2k5, new AKK(this, 43), new Object[]{list});
        9YR r04 = (9YR) 0QD.A0E(list);
        if (list.size() == 1 && r04 != null && ((r04 instanceof C94p) || (r04 instanceof C94q))) {
            2lO r05 = 2lO.A02;
            2lO A01 = C82m.A01(null, 7zL.A0k(0S2.A0Y, eMg.value), 0);
            2lO r335 = this.A02;
            long A0A = 7zP.A0A();
            long A0F = 7zP.A0F();
            C02963wp A0i = 7zL.A0i(0S2.A08, A0A);
            if (r335 == r05) {
                r335 = null;
            }
            return A01(c2k5, A01, C82m.A04(7zT.A0Z(r335, A0i, A0F), 0S2.A00, 100.0f, 0), this, r04, null, false, false);
        }
        int ordinal = c95w.ordinal();
        if (ordinal == 0) {
            2lQ r06 = 2lO.A02;
            long A0F2 = 7zP.A0F();
            return EWB.A00(c2k5, C82m.A01(7zT.A0Z((2lO) null, 7zL.A0i(0S2.A04, A0F2), A0F2), C82m.A08(0S2.A00, 100.0f, 0), 0), new AVd(r02, A00, A005, A003, r0, this, A06));
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw 1BK.A1F();
            }
            2lO r07 = 2lO.A02;
            2lO A0X = 7zQ.A0X(4YV.A0K((2lO) null, 0S2.A0E, 7zO.A09()), 0S2.A0Y, eMg.value);
            Integer num = 0S2.A01;
            2lO A04 = C82m.A04(A0X, num, 100.0f, 0);
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : list) {
                if ((obj instanceof C94p) || (obj instanceof C94q)) {
                    A0s.add(obj);
                }
            }
            int i = this.A00;
            2kG r08 = this.A01;
            2lO r316 = this.A02;
            long A0F3 = 7zP.A0F();
            C02963wp A0i2 = 7zL.A0i(0S2.A0F, A0F3);
            if (r316 == r07) {
                r316 = null;
            }
            2lO A0K = 4YV.A0K(7zL.A0g(r316, A0i2), 0S2.A04, A0F3);
            long A08 = 7zP.A08();
            2NI r09 = C8nc.A0O;
            1Iw r010 = c2k5.A05;
            C02A c02a = r010.A03.A01;
            C1J8 c1j8 = c02a.A02;
            boolean z = c02a.A0X;
            C9sn A007 = C9sn.A00(r010);
            C9sn.A03(A007, A0s, AUn.A00, new GBn(A004, 41), AUo.A00, new AVZ(10, A002, A04, A004, this));
            return new C8ej(r09, r08, r02, A0K, null, C9mj.A05(r010, c1j8, null, num, 0, i, 7zN.A03(c2k5, A08), false, z), A007.A01, r0, null, null, null, null, null, null, false, false, null, 2, null, null, null, null, null, true);
        }
        int ordinal2 = eMg.ordinal();
        if (ordinal2 == 0) {
            f = 0.65f;
        } else {
            if (ordinal2 != 1) {
                throw 1BK.A1F();
            }
            f = eMg.value;
        }
        2lO r011 = 2lO.A02;
        long A0F4 = 7zP.A0F();
        2lO A0X2 = 7zQ.A0X(4YV.A0K((2lO) null, 0S2.A0G, A0F4), 0S2.A0Y, f);
        Integer num2 = 0S2.A01;
        2lO A042 = C82m.A04(A0X2, num2, 100.0f, 0);
        Integer num3 = 0S2.A00;
        2lO A043 = C82m.A04(A042, num3, 100.0f, 0);
        int i2 = this.A00;
        2kG r012 = this.A01;
        2lO r3162 = this.A02;
        C82m A082 = C82m.A08(num3, 100.0f, 0);
        if (r3162 == r011) {
            r3162 = null;
        }
        2lO A0b = 7zT.A0b(C82m.A02(r3162, A082, num2, 100.0f, 0), 7zN.A0T(A0F4), A0F4);
        AKK akk = new AKK(A005, 41);
        C2lu A0w = 7zL.A0w(A06);
        long A083 = 7zP.A08();
        2NI r013 = C8nc.A0O;
        1Iw r014 = c2k5.A05;
        C02A c02a2 = r014.A03.A01;
        C1J8 c1j82 = c02a2.A02;
        boolean z2 = c02a2.A0X;
        C9sm c9sm = new C9sm(r014);
        C9sm.A01(c9sm, list, AUk.A00, AUl.A00, new AVb(3, A006, this, A003, A043, A02));
        return new C8ej(r013, r012, r02, A0b, null, new C8qt(r014, c1j82, i2, 7zN.A03(c2k5, A083), 2, z2), c9sm.A01, r0, null, null, null, null, null, A0w, null, null, null, 2, null, akk, null, null, null, false);
    }
}
