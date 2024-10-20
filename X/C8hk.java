package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8hk, reason: invalid class name */
/* loaded from: 8hk.class */
public final class C8hk extends 1LH {
    public static final List A05 = C0s8.A14(96C.A05, 96C.A03, 96C.A06, 96C.A04, 96C.A02, 96C.A08);
    public final 9Ij A00;
    public final 96C A01;
    public final MigColorScheme A02;
    public final Set A03;
    public final boolean A04;

    public C8hk(9Ij r302, 96C r303, MigColorScheme migColorScheme, Set set, boolean z) {
        1BK.A1K(r302, 2, r303);
        this.A02 = migColorScheme;
        this.A00 = r302;
        this.A04 = z;
        this.A01 = r303;
        this.A03 = set;
    }

    private final C58c A01(2MQ r302) {
        Integer num = 0S2.A0C;
        MigColorScheme migColorScheme = this.A02;
        migColorScheme.getClass();
        C1ut c1ut = C1ut.A0A;
        2cQ r0 = 2cQ.A08;
        num.getClass();
        return new C58c(r302, c1ut, r0, migColorScheme, num);
    }

    /* JADX WARN: Type inference failed for: r0v272, types: [X.555, java.lang.Object, X.5A4] */
    public 1LI A0s(C2k5 c2k5) {
        EL0 el0;
        C58c A01;
        String A09;
        String A092;
        boolean z;
        C9ye A012;
        96C r310;
        int i;
        11T.A0F(c2k5, 0);
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A02;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(BDl), 1));
        Integer num2 = 0S2.A01;
        2lO A0X = 7zQ.A0X(A0g, num2, 1.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        Set set = this.A03;
        96C r02 = this.A01;
        if (!set.contains(r02) && (!set.isEmpty())) {
            1Bn.A0A(68891);
        }
        1Iw AeS = A0L.AeS();
        C9zj.A01(A0L, migColorScheme, 7zS.A0l(AeS, migColorScheme, false), this, 55);
        Dud A013 = Dzc.A01(AeS);
        C1ro c1ro = C1ro.CENTER;
        A013.A1y(c1ro);
        A013.A0j(1.0f);
        A013.A2e(true);
        C2sn A0U = 7zQ.A0U(AeS);
        2lO A0L2 = 4YV.A0L((2lO) null, num, c1ro, 0);
        2RH r03 = 2RH.A04;
        2lO A0M = 7zT.A0M(A0L2, 7zL.A00(r03));
        1Iw AeS2 = A0U.AeS();
        C2sn A0U2 = 7zQ.A0U(AeS2);
        1Iw AeS3 = A0U2.AeS();
        2KD A014 = 2K3.A01(AeS3, 0);
        A014.A0j(1.0f);
        7zM.A1X(A014, A0U2, 2131964536);
        A014.A2m();
        A014.A2M(true);
        7zP.A1H(migColorScheme, A014);
        2RH r04 = 2RH.A03;
        4YU.A1N(A014, r04);
        2RH r05 = 2RH.A05;
        7zO.A1K(A014, r05);
        2KD A0d = 7zR.A0d(AeS3, A0U2, A014, 0);
        7zR.A1J(migColorScheme, A0d, A0U2, 2131964523);
        A0d.A2X();
        A0d.A2l();
        A0d.A2d();
        7zO.A1K(A0d, r05);
        4YU.A1N(A0d, r03);
        4YU.A1M(A0d, r04);
        7zS.A1O(A0U2, A0U, A0M, A0d);
        CQY A00 = 7zU.A0T().A00(AeS2, migColorScheme);
        ArrayList A0s = AnonymousClass001.A0s();
        List list = A05;
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (set.contains(obj)) {
                A0s2.add(obj);
            }
        }
        A0s.addAll(A0s2);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            switch (((96C) it.next()).ordinal()) {
                case 0:
                    el0 = EL0.A03;
                    A01 = A01(2MQ.A2M);
                    A09 = 3yH.A09(A0U, 2131964535);
                    A092 = 3yH.A09(A0U, 2131964534);
                    z = !this.A04;
                    A012 = C9ye.A01(this, 41);
                    r310 = 96C.A06;
                    i = 47;
                    break;
                case 1:
                    el0 = EL0.A03;
                    A01 = A01(2MQ.A2C);
                    A09 = 3yH.A09(A0U, 2131964531);
                    A092 = 3yH.A09(A0U, 2131964530);
                    z = !this.A04;
                    A012 = C9ye.A01(this, 39);
                    r310 = 96C.A04;
                    i = 45;
                    break;
                case 2:
                    el0 = EL0.A03;
                    A01 = A01(2MQ.A0v);
                    A09 = 3yH.A09(A0U, 2131964525);
                    A092 = 3yH.A09(A0U, 2131964524);
                    z = !this.A04;
                    A012 = C9ye.A01(this, 36);
                    r310 = 96C.A08;
                    i = 42;
                    break;
                case 3:
                    el0 = EL0.A03;
                    A01 = A01(2MQ.A38);
                    A09 = 3yH.A09(A0U, 2131964527);
                    A092 = 3yH.A09(A0U, 2131964526);
                    z = !this.A04;
                    A012 = C9ye.A01(this, 37);
                    r310 = 96C.A02;
                    i = 43;
                    break;
                case 5:
                    el0 = EL0.A03;
                    A01 = A01(2MQ.A0u);
                    A09 = 3yH.A09(A0U, 2131964529);
                    A092 = 3yH.A09(A0U, 2131964528);
                    z = !this.A04;
                    A012 = C9ye.A01(this, 38);
                    r310 = 96C.A03;
                    i = 44;
                    break;
                case 6:
                    el0 = EL0.A03;
                    A01 = A01(2MQ.A2N);
                    A09 = 3yH.A09(A0U, 2131964533);
                    A092 = 3yH.A09(A0U, 2131964532);
                    z = !this.A04;
                    A012 = C9ye.A01(this, 40);
                    r310 = 96C.A05;
                    i = 46;
                    break;
            }
            AQn A015 = AQn.A01(this, i);
            boolean A1W = AnonymousClass001.A1W(r02, r310);
            C9py A03 = C9py.A03(A015, ActionId.LEGACY_MARKER);
            ?? obj2 = new Object();
            ((5A4) obj2).A02 = A1W;
            ((5A4) obj2).A01 = migColorScheme;
            ((5A4) obj2).A00 = A03;
            A00.A0F(new Byf(A012, A01, obj2, el0, A09, A092, num, null, 0L, z, false, false));
        }
        7zQ.A1E(A00.A09(), 7zQ.A0U(AeS2), A0U, 4YV.A0K(7zT.A0N(7zQ.A0X(7zQ.A0X((2lO) null, num2, 1.0f), 0S2.A0C, 0.0f), 7zL.A00(2RH.A06)), 0S2.A0Y, 7zL.A08(r04.A00() * 4 * set.size())));
        A0L.A00(7zM.A0w(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false), A013));
        2lO A0Z = 7zT.A0Z(4YV.A0L((2lO) null, num, c1ro, 0), 7zN.A0T(4YV.A06(r04)), 4YV.A06(r04));
        C2sn A0U3 = 7zQ.A0U(AeS);
        C1p8 c1p8 = 8gI.A04;
        boolean z2 = this.A04;
        A0U3.A00(new 8gI(C9py.A03(this, ActionId.ACTION_BAR_COMPLETE), migColorScheme, 3yH.A09(A0U3, 2131964522), z2));
        8TU A002 = C8nm.A00(A0U3.A00);
        A002.A2Y(migColorScheme);
        A002.A2a(!z2);
        A002.A2Z(3yH.A09(A0U3, 2131964538));
        7zR.A1A(A002, AVJ.A01(this, 25));
        7zQ.A1G(A002.A2W(), A0U3, A0L, A0Z);
        return C2so.A02(A0L, c2k5, A0X);
    }
}
