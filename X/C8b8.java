package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8b8, reason: invalid class name */
/* loaded from: 8b8.class */
public final class C8b8 extends 1LH {
    public final 2JX A00;
    public final MigColorScheme A01;
    public final Function1 A02;
    public final Function1 A03;
    public final int A04;

    public C8b8(2JX r302, MigColorScheme migColorScheme, Function1 function1, Function1 function12, int i) {
        7zS.A17(3, migColorScheme, function1, function12);
        this.A00 = r302;
        this.A04 = i;
        this.A01 = migColorScheme;
        this.A03 = function1;
        this.A02 = function12;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        int i = this.A04;
        float f = i * 1.65f;
        2lQ r0 = 2lO.A02;
        AR2 ar2 = new AR2(this, 29);
        Integer num = 0S2.A00;
        2lO A0Z = 7zQ.A0Z((2lO) null, num, ar2);
        C2sn A0L = 7zR.A0L(c2k5);
        2JX r02 = this.A00;
        String A0r = r02.A0r(1315628960);
        if (A0r == null) {
            A0r = "";
        }
        final 8Hp r03 = new 8Hp(A0r);
        String A0r2 = r02.A0r(1615269514);
        String str = A0r2;
        if (A0r2 == null) {
            str = "";
        }
        final C2lu A0w = 7zL.A0w(i | 9221401712017801216L);
        final C2lu A0w2 = 7zL.A0w(((int) f) | 9221401712017801216L);
        String str2 = A0r2;
        if (A0r2 == null) {
            str2 = "";
        }
        final Ehr ehr = new Ehr(str2, new AR2(this, 30));
        final String str3 = str;
        A0L.A00(new 1LH(ehr, r03, A0w, A0w2, str3) { // from class: X.8hx
            public static final CallerContext A09 = CallerContext.A0B("FDSMedia");
            public final Ehr A00;
            public final AWf A01;
            public final EMk A02;
            public final 99D A03;
            public final 96P A04;
            public final C2lu A05;
            public final C2lu A06;
            public final Integer A07;
            public final String A08;

            {
                Integer num2 = 0S2.A00;
                EMk eMk = EMk.A03;
                9sL r04 = 9sL.A00;
                96P r05 = 96P.A02;
                11T.A0F(r04, 11);
                this.A03 = r03;
                this.A08 = str3;
                this.A06 = A0w;
                this.A05 = A0w2;
                this.A07 = num2;
                this.A02 = eMk;
                this.A00 = ehr;
                this.A01 = r04;
                this.A04 = r05;
            }

            public static float A01(Integer num2) {
                switch (num2.intValue()) {
                    case 1:
                        return 1.7777778f;
                    case 2:
                        return 1.5f;
                    case 3:
                        return 1.3333334f;
                    case 4:
                        return 1.25f;
                    case 5:
                        return 1.0f;
                    case 6:
                        return 0.8f;
                    case 7:
                        return 0.6f;
                    case 8:
                        return 0.5625f;
                    default:
                        return 0.0f;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v118, types: [X.1LI] */
            public 1LI A0s(C2k5 c2k52) {
                2lO A00;
                double A002;
                boolean A1W = 7zL.A1W(c2k52);
                2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A0u, true, 1));
                String str4 = this.A08;
                if (str4 != null) {
                    A0g = 7zS.A0d(A0g, str4);
                }
                C2lu c2lu = this.A06;
                C2lu c2lu2 = this.A05;
                if (c2lu != null) {
                    long j = c2lu.A00;
                    Integer num2 = 0S2.A00;
                    C02963wp A0i = 7zL.A0i(num2, j);
                    if (c2lu2 != null) {
                        A00 = A0g.A00(4YV.A0K(7zL.A0g((2lO) null, A0i), 0S2.A01, c2lu2.A00));
                    } else {
                        A00 = A0g.A00(7zL.A0g((2lO) null, A0i));
                        Integer num3 = this.A07;
                        if (num3 != num2) {
                            A00 = A00.A00(7zQ.A0X((2lO) null, 0S2.A0Y, A01(num3)));
                        }
                    }
                } else if (c2lu2 != null) {
                    long j2 = c2lu2.A00;
                    Integer num4 = 0S2.A00;
                    A00 = A0g.A00(4YV.A0K((2lO) null, num4, j2));
                    Integer num5 = this.A07;
                    if (num5 != num4) {
                        A00 = A00.A00(7zQ.A0X((2lO) null, 0S2.A0Y, A01(num5)));
                    }
                } else {
                    A00 = A0g.A00(7zQ.A0X(7zS.A0R((2lO) null, 1.0f), 0S2.A0C, 0.0f));
                }
                1Iw r04 = c2k52.A05;
                C2sn A0U = 7zQ.A0U(r04);
                8Hp r05 = this.A03;
                if (!(r05 instanceof 8Hp)) {
                    throw 1BK.A1F();
                }
                C07004ik A003 = C06984ii.A00();
                8Hp r06 = r05;
                A003.A06(null);
                EMk eMk = this.A02;
                if (eMk.radius != null) {
                    Evm evm = FAL.A05;
                    1Iw r07 = A0U.A00;
                    7zM.A1K(A003, evm.A00(r07).A02(eMk.radius, r07));
                }
                C06974ih A0L2 = 7zL.A0L(A003);
                String str5 = r06.A00;
                5BH A0N = 7zO.A0N(A0U);
                7zN.A1A(A0N, str5);
                A0N.A2Z(A0L2);
                A0N.A0e();
                A0N.A0e();
                A0N.A2b(A09);
                7zU.A1A(A0N, A0U);
                if (eMk.radius != null) {
                    1Iw r08 = A0U.A00;
                    8O3 A004 = 8nD.A00(r08);
                    Context context = r08.A0D;
                    2Mg r09 = 2Me.A02;
                    A004.A01.A01 = r09.A00(context);
                    FAL A005 = FAL.A05.A00(r08);
                    EPF epf = eMk.radius;
                    11T.A0F(epf, A1W ? 1 : 0);
                    float A006 = FHY.A00(epf, A005.A01);
                    A004.A01.A00 = 7zL.A04(A004, A006);
                    A004.A0c();
                    C26z c26z = C26z.ALL;
                    A004.A2E(c26z, A1W ? 1 : 0);
                    C6nh c6nh = new C6nh(r08);
                    c6nh.A0A(c26z, 1);
                    c6nh.A08(c26z, r09.A00(context));
                    A004.A1h(c6nh.A01());
                    A004.A0J();
                    A0U.A00(A004.A01);
                }
                C1rh A0I = C2so.A0I(A0U, c2k52, A00);
                Ehr ehr2 = this.A00;
                if (ehr2 != null) {
                    if (eMk.radius == null) {
                        A002 = 0.0d;
                    } else {
                        FAL A007 = FAL.A05.A00(r04);
                        EPF epf2 = eMk.radius;
                        11T.A0F(epf2, A1W ? 1 : 0);
                        A002 = FHY.A00(epf2, A007.A01);
                    }
                    A0I = FHU.A02(new C9eq(0S2.A01), ehr2, new 9sJ(Double.doubleToRawLongBits(A002)), new 9fE(this.A04.scaleFactor, this.A01), A0I, c2k52);
                }
                return A0I;
            }
        });
        if (A0r2 == null) {
            A0r2 = "";
        }
        2KD A0a = 7zO.A0a(A0L, 0);
        7zS.A1M(A0a, 7zS.A0Z(7zQ.A0Y(7zS.A0S((2lO) null, 0), 0S2.A0N, 7zQ.A06()), num, 99.0d), num, C1ro.CENTER, 0);
        A0a.A2z(A0r2);
        A0a.A2e();
        A0a.A2j();
        A0a.A2x(this.A01);
        A0a.A2X();
        7zN.A1Q(A0L, A0a);
        return C2so.A02(A0L, c2k5, A0Z);
    }
}
