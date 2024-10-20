package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: Dv4.class */
public final class Dv4 extends 1LH {
    public final Runnable A00;
    public final java.util.Map A01;

    public Dv4(Runnable runnable, java.util.Map map) {
        1BL.A1F(runnable, map);
        this.A00 = runnable;
        this.A01 = map;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, GAG.A00);
        C2lh A002 = C2lc.A00(c2k5, GAI.A00);
        C2lh A003 = C2lc.A00(c2k5, GAF.A00);
        AQ8 aq8 = AQ8.A00;
        C9cu c9cu = (C9cu) 2rO.A00(c2k5, aq8, new Object[0]);
        C9cu c9cu2 = (C9cu) 2rO.A00(c2k5, aq8, new Object[0]);
        C2lh A004 = C2lc.A00(c2k5, GAD.A00);
        C2lh A005 = C2lc.A00(c2k5, GAH.A00);
        C2lh A006 = C2lc.A00(c2k5, GAE.A00);
        Object A007 = 2rO.A00(c2k5, GAC.A00, new Object[0]);
        Object A008 = 2rO.A00(c2k5, new AKs(32, A003, A007, A005, c2k5, this), new Object[0]);
        boolean A1V = 7zP.A1V(A005);
        1LI dvL = new DvL(c9cu, c9cu2, new GBn(A004, 25), A1V);
        C01i c01i = FGU.A00;
        Drawable A009 = EZ3.A00(c2k5, new AKU(2132344962, 11, c2k5), AnonymousClass001.A1a(2132344962));
        C3bp A01 = F1p.A01(c2k5, new AKs(33, A007, A008, A006, c2k5, this));
        4FL.A00(c2k5, new G9J(22, A00, A002, c2k5), new Object[]{04S.A00});
        if (7zP.A1V(A003)) {
            return 7zL.A0Y();
        }
        03Y[] A1b = 7zO.A1b(F76.class, A007, 1BK.A1G(F99.class, A008));
        2lQ r0 = 2lO.A02;
        long j = ((C2lu) A002.A02).A00;
        long A0A = 7zP.A0A();
        long A0F = 7zP.A0F();
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A04, A0A);
        Integer num = 0S2.A15;
        2lO A0K2 = 4YV.A0K(A0K, num, A0F);
        Integer num2 = 0S2.A1J;
        2lO A0K3 = 4YV.A0K(A0K2, num2, j);
        Integer num3 = 0S2.A01;
        2lO A0010 = F1p.A00(7zR.A0R(7zQ.A0X(A0K3, num3, 1.0f), new GBq(c2k5, A00, 24), 1), A01);
        C1ro c1ro = C1ro.STRETCH;
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r02 = A0L.A00;
        C2sn A0U = 7zQ.A0U(r02);
        Integer num4 = 0S2.A00;
        A0U.A00(new Dv1(num4, C0ty.A00));
        A0L.A00(C2so.A00(A0U));
        boolean A1V2 = 7zP.A1V(A00);
        if (!A1V2) {
            A0L.A00(new Duq(A1V));
        }
        2lO A0X = 7zQ.A0X(7zQ.A0X((2lO) null, num3, 1.0f), 0S2.A0C, 100.0f);
        long A08 = 7zP.A08();
        long A0B = 7zQ.A0B();
        7zQ.A1G(new DwQ(A009, ImageView.ScaleType.CENTER_INSIDE, (2lO) null, 0, false), 7zQ.A0U(r02), A0L, 7zT.A0Z(A0X, 7zL.A0i(0S2.A08, A08), A0B));
        A0L.A00(dvL);
        A0L.A00(new Dvl(c9cu, c9cu2, (ELZ) A004.A02, new AKK(A006, 8), new AKK(A006, 9), A1V, 7zP.A1V(A006)));
        04J r03 = F3h.A00;
        A0L.A00(new Dw2(c9cu, A1V));
        if (!A1V2) {
            A0L.A00(C2so.A0C(null, A0L, 7zQ.A0X((2lO) null, num3, 1.0f), C1rp.FLEX_END));
            A0L.A00(new Dw1(A1V, "NATIVE_LOGIN_FORM"));
            2lO A0V = 7zS.A0V((2lO) null, 7zL.A0i(num, A0B), num2, Double.doubleToRawLongBits(20.0f - FdG.A00.D18(0S2.A0B)));
            C2sn A0U2 = 7zQ.A0U(r02);
            A0U2.A00(new Dv7(num4, num4));
            A0L.A00(C2so.A0M(A0U2, A0L, A0V));
        }
        return new 7J5(C2so.A0B(A0L, c2k5, A0010, c1ro, c1rp), A1b, (03Y[]) null);
    }
}
