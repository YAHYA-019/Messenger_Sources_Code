package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Dw7.class */
public final class Dw7 extends 1LH {
    public final EzL A00;
    public final C00m A01;
    public final C00m A02;
    public final Function1 A03;
    public final Function1 A04;
    public final C0Bd A05;
    public final 2lO A06;

    public Dw7(2lO r302, EzL ezL, C00m c00m, C00m c00m2, Function1 function1, Function1 function12, C0Bd c0Bd) {
        this.A00 = ezL;
        this.A01 = c00m;
        this.A02 = c00m2;
        this.A04 = function1;
        this.A03 = function12;
        this.A05 = c0Bd;
        this.A06 = r302;
    }

    public static final C94z A01(C2k6 c2k6, C97i c97i, C00m c00m, boolean z) {
        Integer num = 0S2.A00;
        Integer num2 = 0S2.A0Y;
        return new C94z(z ? C97h.A0Q : C97h.A0V, C97i.A0r, c97i, num, num2, num2, num, num, num, num, 0S2.A01, 3yH.A09(c2k6, 2131960321), c00m, true);
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C9cu c9cu = (C9cu) 2rO.A00(c2k5, AQ8.A00, new Object[0]);
        EzL ezL = this.A00;
        F9l f9l = ezL.A00;
        boolean z = f9l.A00;
        4FL.A00(c2k5, new G9H(c9cu, this, 37), 4YU.A1b(z));
        2lO r305 = this.A06;
        Integer num = 0S2.A00;
        C82m A08 = C82m.A08(num, 100.0f, 0);
        if (r305 == 2lO.A02) {
            r305 = null;
        }
        2lO A0g = 7zL.A0g(r305, A08);
        C2sn A0L = 7zR.A0L(c2k5);
        F9z f9z = ezL.A02;
        C8ej c8ej = null;
        if (f9z.A03) {
            8Dm A01 = C9d1.A01(A0L, null, new C2lu(7zP.A0F()), null, null);
            long doubleToRawLongBits = Double.doubleToRawLongBits(12.0d);
            2lO A0L2 = 4YV.A0L(7zT.A0Z(4YV.A0K((2lO) null, 0S2.A04, doubleToRawLongBits), 7zL.A0i(0S2.A08, doubleToRawLongBits), Double.doubleToRawLongBits(f9l.A01 ? 0.0d : 12.0d)), 0S2.A0C, false, 1);
            long A082 = 7zP.A08();
            2NI r0 = C8nc.A0O;
            1Iw AeS = A0L.AeS();
            C02A c02a = AeS.A03.A01;
            C1J8 c1j8 = c02a.A02;
            boolean z2 = c02a.A0X;
            C9sn c9sn = new C9sn(AeS);
            List list = f9z.A00;
            ArrayList A0z = 1BL.A0z(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C0s8.A18();
                    throw 0Q8.createAndThrow();
                }
                Eyk eyk = (Eyk) obj;
                A0z.add(f9z.A01 ? new ACY(i, eyk.A01) : new ACZ(eyk.A01, new G9E(this, 6), new G9J(42, eyk.A00, eyk, this), i));
                i = i2;
            }
            C9sn.A04(c9sn, A0z, AUy.A00, AW3.A00);
            c8ej = new C8ej(r0, A01, null, A0L2, null, C9mj.A04(AeS, c1j8, 7zN.A03(A0L, A082), z2), c9sn.A01, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, true);
        }
        A0L.A00(c8ej);
        C2lh A00 = C2lc.A00(c2k5, new G9E(c9cu, 5));
        boolean z3 = !z;
        String A09 = 3yH.A09(A0L, 2131960329);
        8eV r306 = null;
        if (f9l.A01) {
            Object A0A = A0L.AeS().A0A(C6tP.class);
            if (A0A == null) {
                throw 1BK.A0h();
            }
            Aaq A002 = C9kH.A00((C6tP) A0A);
            Integer num2 = 0S2.A01;
            long A083 = 7zL.A08(A002.Chz(num2));
            G9H g9h = new G9H(c9cu, this, 36);
            G9H g9h2 = new G9H(c9cu, A00, 35);
            ELp eLp = ELp.A06;
            FYa fYa = new FYa(g9h, 19);
            C94z A012 = z3 ? A01(A0L, C97i.A0P, new G9E(g9h, 4), 7zP.A1V(A00)) : A01(A0L, C97i.A0O, GAU.A00, false);
            2lO A0K = 4YV.A0K((2lO) null, num2, A083);
            long A084 = 7zQ.A08();
            2lO A0K2 = 4YV.A0K(A0K, 0S2.A0G, A084);
            long A0F = 7zP.A0F();
            r306 = new 8eV(fYa, 7zQ.A0Z(4YV.A0K(4YV.A0K(4YV.A0K(A0K2, 0S2.A05, A0F), 0S2.A0u, A084), 0S2.A1G, A0F), num, new GBo(this, 15)), c9cu, eLp, C97i.A02, A012, A09, g9h2, (C00m) null, 1, z3);
        }
        return 7zM.A0l(r306, A0L, c2k5, A0g);
    }
}
