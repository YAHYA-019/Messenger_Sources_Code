package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8fg, reason: invalid class name */
/* loaded from: 8fg.class */
public final class C8fg extends 1LH {
    public static final int A03 = (7zL.A03() + 14) + 2RH.A06.A00();
    public final MigColorScheme A00;
    public final List A01;
    public final Function1 A02;

    public C8fg(MigColorScheme migColorScheme, List list, Function1 function1) {
        7zR.A1N(migColorScheme, list);
        this.A00 = migColorScheme;
        this.A02 = function1;
        this.A01 = list;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1u3 c1u3;
        int i;
        1Iw A0X = 7zL.A0X(c2k5);
        Dud A01 = Dzc.A01(A0X);
        A01.A0L();
        A01.A0j(1.0f);
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A00;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(BDl), 1));
        C2sn A0U = 7zQ.A0U(A0X);
        C1i A0T = 7zU.A0T();
        1Iw AeS = A0U.AeS();
        CQY A00 = A0T.A00(AeS, migColorScheme);
        List<96C> list = this.A01;
        int size = list.size();
        for (96C r02 : list) {
            EL0 el0 = EL0.A03;
            int ordinal = r02.ordinal();
            switch (ordinal) {
                case 0:
                    c1u3 = C1u3.A4i;
                    break;
                case 1:
                    c1u3 = C1u3.A4S;
                    break;
                case 2:
                    c1u3 = C1u3.A4L;
                    break;
                case 3:
                    c1u3 = C1u3.A6P;
                    break;
                case 4:
                    c1u3 = C1u3.A2N;
                    break;
                case 5:
                    c1u3 = C1u3.A1j;
                    break;
                case 6:
                    c1u3 = C1u3.A4j;
                    break;
                default:
                    throw 1BK.A1F();
            }
            C1u4 c1u4 = C1u4.SIZE_32;
            C1ut c1ut = C1ut.A0A;
            c1u4.getClass();
            c1ut.getClass();
            58N r03 = new 58N(c1u3, c1u4, c1ut, migColorScheme);
            switch (ordinal) {
                case 0:
                    i = 2131964495;
                    break;
                case 1:
                    i = 2131964493;
                    break;
                case 2:
                    i = 2131964497;
                    break;
                case 3:
                    i = 2131964491;
                    break;
                case 4:
                    i = 2131964496;
                    break;
                case 5:
                    i = 2131964492;
                    break;
                default:
                    i = 2131964494;
                    break;
            }
            A00.A0F(new Byf(new 9yV(this, r02, 3), r03, null, el0, 3yH.A09(A0U, i), "", num, null, 0L, true, false, false));
        }
        7zQ.A1E(A00.A09(), 7zQ.A0U(AeS), A0U, 4YV.A0K(7zT.A0N(7zQ.A0X(7zS.A0R((2lO) null, 1.0f), 0S2.A0C, 0.0f), 7zL.A03()), 0S2.A0Y, 7zL.A08(size * A03)));
        return 7zM.A0w(C2so.A02(A0U, c2k5, A0g), A01);
    }
}
