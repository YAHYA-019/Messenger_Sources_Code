package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8hp, reason: invalid class name */
/* loaded from: 8hp.class */
public final class C8hp extends 1LH {
    public static final List A06 = C0s8.A14(C95y.A03, C95y.A04, C95y.A02, C95y.A05);
    public final C95y A00;
    public final C95y A01;
    public final 9IX A02;
    public final MigColorScheme A03;
    public final Set A04;
    public final boolean A05;

    public C8hp(C95y c95y, C95y c95y2, 9IX r304, MigColorScheme migColorScheme, Set set, boolean z) {
        7zR.A1O(r304, c95y);
        11T.A0F(c95y2, 5);
        this.A03 = migColorScheme;
        this.A02 = r304;
        this.A00 = c95y;
        this.A05 = z;
        this.A01 = c95y2;
        this.A04 = set;
    }

    private final C58c A01(2MQ r302) {
        Integer num = 0S2.A0C;
        MigColorScheme migColorScheme = this.A03;
        migColorScheme.getClass();
        C1ut c1ut = C1ut.A0A;
        2cQ r0 = 2cQ.A08;
        num.getClass();
        return new C58c(r302, c1ut, r0, migColorScheme, num);
    }

    /* JADX WARN: Type inference failed for: r0v209, types: [X.555, java.lang.Object, X.5A4] */
    public 1LI A0s(C2k5 c2k5) {
        EL0 el0;
        C58c A01;
        String A09;
        String A092;
        boolean z;
        C9ye A012;
        C95y c95y;
        int i;
        11T.A0F(c2k5, 0);
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A03;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(BDl), 1));
        Integer num2 = 0S2.A01;
        2lO A0X = 7zQ.A0X(A0g, num2, 1.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        Set set = this.A04;
        C95y c95y2 = this.A01;
        if (!set.contains(c95y2) || !set.contains(this.A00)) {
            1Bn.A0A(68891);
        }
        1Iw AeS = A0L.AeS();
        C9zj.A01(A0L, migColorScheme, 7zS.A0l(AeS, migColorScheme, false), this, 44);
        Dud A013 = Dzc.A01(AeS);
        C1ro c1ro = C1ro.CENTER;
        A013.A1y(c1ro);
        A013.A0j(1.0f);
        A013.A2e(true);
        C2sn A0U = 7zQ.A0U(AeS);
        2lO A0L2 = 4YV.A0L((2lO) null, num, c1ro, 0);
        2RH r02 = 2RH.A04;
        2lO A0M = 7zT.A0M(A0L2, 7zL.A00(r02));
        1Iw AeS2 = A0U.AeS();
        C2sn A0U2 = 7zQ.A0U(AeS2);
        1Iw AeS3 = A0U2.AeS();
        2KD A014 = 2K3.A01(AeS3, 0);
        A014.A0j(1.0f);
        7zM.A1X(A014, A0U2, 2131952508);
        A014.A2m();
        7zP.A1H(migColorScheme, A014);
        2RH r03 = 2RH.A03;
        4YU.A1N(A014, r03);
        2RH r04 = 2RH.A05;
        7zO.A1K(A014, r04);
        2KD A0d = 7zR.A0d(AeS3, A0U2, A014, 0);
        7zR.A1J(migColorScheme, A0d, A0U2, 2131952499);
        A0d.A2X();
        A0d.A2l();
        A0d.A2d();
        7zO.A1K(A0d, r04);
        4YU.A1N(A0d, r02);
        4YU.A1M(A0d, r03);
        7zS.A1O(A0U2, A0U, A0M, A0d);
        CQY A00 = 7zU.A0T().A00(AeS2, migColorScheme);
        C95y c95y3 = this.A00;
        ArrayList A11 = C0s8.A11(c95y3);
        List list = A06;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (obj != c95y3 && set.contains(obj)) {
                A0s.add(obj);
            }
        }
        A11.addAll(A0s);
        Iterator it = A11.iterator();
        while (it.hasNext()) {
            int ordinal = ((C95y) it.next()).ordinal();
            if (ordinal == 1) {
                el0 = EL0.A03;
                A01 = A01(2MQ.A0u);
                A09 = 3yH.A09(A0U, 2131952505);
                A092 = 3yH.A09(A0U, 2131952504);
                z = !this.A05;
                A012 = C9ye.A01(this, 33);
                c95y = C95y.A03;
                i = 37;
            } else if (ordinal == 2) {
                el0 = EL0.A03;
                A01 = A01(2MQ.A2C);
                A09 = 3yH.A09(A0U, 2131952501);
                A092 = 3yH.A09(A0U, 2131952500);
                z = !this.A05;
                A012 = C9ye.A01(this, 35);
                c95y = C95y.A05;
                i = 39;
            } else if (ordinal == 0) {
                el0 = EL0.A03;
                A01 = A01(2MQ.A2M);
                A09 = 3yH.A09(A0U, 2131952507);
                A092 = 3yH.A09(A0U, 2131952506);
                z = !this.A05;
                A012 = C9ye.A01(this, 34);
                c95y = C95y.A04;
                i = 38;
            } else if (ordinal == 3) {
                el0 = EL0.A03;
                A01 = A01(2MQ.A38);
                A09 = 3yH.A09(A0U, 2131952503);
                A092 = 3yH.A09(A0U, 2131952502);
                z = !this.A05;
                A012 = C9ye.A01(this, 32);
                c95y = C95y.A02;
                i = 36;
            }
            AQv A015 = AQv.A01(this, i);
            boolean A1W = AnonymousClass001.A1W(c95y2, c95y);
            C9py A03 = C9py.A03(A015, 90);
            ?? obj2 = new Object();
            ((5A4) obj2).A02 = A1W;
            ((5A4) obj2).A01 = migColorScheme;
            ((5A4) obj2).A00 = A03;
            A00.A0F(new Byf(A012, A01, obj2, el0, A09, A092, num, null, 0L, z, false, false));
        }
        7zQ.A1E(A00.A09(), 7zQ.A0U(AeS2), A0U, 4YV.A0K(7zT.A0N(7zQ.A0X(7zQ.A0X((2lO) null, num2, 1.0f), 0S2.A0C, 0.0f), 7zL.A00(2RH.A06)), 0S2.A0Y, 7zL.A08(r03.A00() * 4 * set.size())));
        A0L.A00(7zM.A0w(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false), A013));
        2lO A0Z = 7zT.A0Z(4YV.A0L((2lO) null, num, c1ro, 0), 7zN.A0T(4YV.A06(r03)), 4YV.A06(r03));
        C2sn A0U3 = 7zQ.A0U(AeS);
        C1p8 c1p8 = 8gI.A04;
        7zQ.A1G(new 8gI(C9py.A03(this, 91), migColorScheme, 3yH.A09(A0U3, 2131962481), this.A05), A0U3, A0L, A0Z);
        return C2so.A02(A0L, c2k5, A0X);
    }
}
