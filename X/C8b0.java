package X;

import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.8b0, reason: invalid class name */
/* loaded from: 8b0.class */
public final class C8b0 extends 1LH {
    public final C9be A00;
    public final MigColorScheme A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final boolean A04;

    public C8b0(C9be c9be, MigColorScheme migColorScheme, ImmutableList immutableList, ImmutableList immutableList2, boolean z) {
        11T.A0F(immutableList, 3);
        this.A01 = migColorScheme;
        this.A04 = z;
        this.A02 = immutableList;
        this.A03 = immutableList2;
        this.A00 = c9be;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, new AKO(this, 34));
        4FL.A00(c2k5, new AKX(A00, this, 14), 4YU.A1b(this.A04));
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0k(num, 1.0f));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        String A09 = 3yH.A09(A0U, 2131956731);
        String A092 = 3yH.A09(A0U, 2131956729);
        boolean A1V = 7zP.A1V(A00);
        1Iw AeS2 = A0U.AeS();
        55N A002 = 55M.A00(AeS2);
        CJ4 cj4 = new CJ4();
        cj4.A00 = A09.hashCode();
        cj4.A04(A09);
        cj4.A06 = EL0.A03;
        cj4.A03 = CJh.A01(A092, 3);
        MigColorScheme migColorScheme = this.A01;
        cj4.A07 = migColorScheme;
        cj4.A05 = new C59y(migColorScheme, "faq_setting_toggle_transition_key", A1V, true);
        cj4.A01 = new 9yX(2, A00, this, A1V);
        7zU.A1I(A0U, cj4.A01(), A002);
        if (A1V) {
            ImmutableList immutableList = this.A02;
            2cL r306 = null;
            if (!immutableList.isEmpty()) {
                C2sn A0U2 = 7zQ.A0U(AeS2);
                String A093 = 3yH.A09(A0U2, 2131956724);
                String A094 = 3yH.A09(A0U2, 2131956723);
                1Iw AeS3 = A0U2.AeS();
                55N A003 = 55M.A00(AeS3);
                7sZ r02 = new 7sZ();
                r02.A04 = migColorScheme;
                r02.A07 = A093;
                r02.A05 = A094;
                7zU.A1I(A0U2, r02.A00(), A003);
                C2sn A0U3 = 7zQ.A0U(AeS3);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel = (AutomatedResponseCustomQuestionModel) it.next();
                    String str = automatedResponseCustomQuestionModel.A03;
                    11T.A0A(str);
                    2MQ r03 = 2MQ.A2P;
                    String A095 = 3yH.A09(A0U3, 2131956722);
                    9zI r04 = new 9zI(automatedResponseCustomQuestionModel, this, 13);
                    9yV r05 = new 9yV(this, automatedResponseCustomQuestionModel, 5);
                    55N A004 = 55M.A00(A0U3.AeS());
                    AnonymousClass557 A0p = 7zL.A0p();
                    A0p.A00 = str.hashCode();
                    A0p.A03(C5z6.A01(str, 3));
                    A0p.A01();
                    A0p.A05(migColorScheme);
                    7zN.A1W(A0p, COF.A00(r03, 2Re.A03, r04, migColorScheme, A095));
                    A0p.A01 = r05;
                    A0U3.A00(7zU.A0U(A004, A0p));
                }
                7zN.A1H(A0U3, A0U2);
                r306 = C2so.A00(A0U2);
            }
            A0U.A00(r306);
            2cL r304 = null;
            if (immutableList.size() < 4) {
                ImmutableList immutableList2 = this.A03;
                if (!immutableList2.isEmpty()) {
                    C2sn A0U4 = 7zQ.A0U(AeS2);
                    String A096 = 3yH.A09(A0U4, 2131956727);
                    String A097 = 3yH.A09(A0U4, 2131956726);
                    1Iw AeS4 = A0U4.AeS();
                    55N A005 = 55M.A00(AeS4);
                    7sZ r06 = new 7sZ();
                    r06.A04 = migColorScheme;
                    r06.A07 = A096;
                    r06.A05 = A097;
                    7zU.A1I(A0U4, r06.A00(), A005);
                    C2sn A0U5 = 7zQ.A0U(AeS4);
                    Iterator it2 = immutableList2.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            C0s8.A18();
                            throw 0Q8.createAndThrow();
                        }
                        String str2 = (String) next;
                        11T.A0D(str2);
                        2MQ r07 = 2MQ.A2X;
                        String A098 = 3yH.A09(A0U5, 2131956721);
                        IaY iaY = new IaY(i, 0, this);
                        Rrr rrr = new Rrr(this, i);
                        55N A006 = 55M.A00(A0U5.AeS());
                        AnonymousClass557 A0p2 = 7zL.A0p();
                        A0p2.A00 = str2.hashCode();
                        A0p2.A03(C5z6.A01(str2, 3));
                        A0p2.A01();
                        A0p2.A05(migColorScheme);
                        7zN.A1W(A0p2, COF.A00(r07, 2Re.A03, iaY, migColorScheme, A098));
                        A0p2.A01 = rrr;
                        A0U5.A00(7zU.A0U(A006, A0p2));
                        i = i2;
                    }
                    7zN.A1H(A0U5, A0U4);
                    r304 = C2so.A00(A0U4);
                }
            }
            A0U.A00(r304);
        }
        1LI r08 = new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
        2lO A0X = 7zQ.A0X((2lO) null, num, 1.0f);
        C2sn A0U6 = 7zQ.A0U(AeS);
        Dud A01 = Dzc.A01(A0U6.A00);
        A01.A2c(r08);
        A01.A2Y(30.0f);
        A01.A2h(true);
        7zQ.A1E(A01.A2V(), A0U6, A0L, A0X);
        C1rh c1rh = null;
        if (A1V) {
            ImmutableList immutableList3 = this.A02;
            boolean z = true;
            boolean z2 = false;
            if (immutableList3.size() >= 4) {
                z2 = true;
            }
            Integer num2 = 0S2.A0C;
            2lO A0X2 = 7zQ.A0X((2lO) null, num2, 0.0f);
            2RH r09 = 2RH.A03;
            2lO A0N = 7zT.A0N(7zT.A0J(A0X2, 7zL.A00(r09)), 7zL.A02());
            long A06 = 4YV.A06(r09);
            Integer num3 = 0S2.A1J;
            2lO A0K = 4YV.A0K(A0N, num3, A06);
            C2sn A0U7 = 7zQ.A0U(AeS);
            if (z2) {
                2lO A0d = 7zT.A0d(7zQ.A0X((2lO) null, num2, 0.0f), 2RH.A07, num3);
                C2sn A0K2 = 7zS.A0K(A0U7);
                2KD A0r = 7zL.A0r(A0K2, 0);
                7zQ.A1M(migColorScheme, A0r);
                A0r.A33(AnonymousClass001.A1a(4), 2131956725);
                7zN.A1Q(A0K2, A0r);
                c1rh = C2so.A0M(A0K2, A0U7, A0d);
            }
            A0U7.A00(c1rh);
            8Th A007 = C8nq.A00(A0U7.A00);
            A007.A0e();
            A007.A0l(42.0f);
            A007.A2Z(migColorScheme);
            A007.A2X(2131956720);
            if (immutableList3.size() >= 4) {
                z = false;
            }
            A007.A2b(z);
            7zR.A1A(A007, AnonymousClass843.A00(this, 23));
            c1rh = 7zM.A0l(A007.A2W(), A0U7, A0L, A0K);
        }
        return 7zM.A0l(c1rh, A0L, c2k5, A0g);
    }
}
