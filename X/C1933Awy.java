package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.Awy, reason: case insensitive filesystem */
/* loaded from: Awy.class */
public final class C1933Awy extends 1LH {
    public final REU A00;
    public final MigColorScheme A01;
    public final String A02;

    public C1933Awy(REU reu, MigColorScheme migColorScheme, String str) {
        11T.A0F(reu, 2);
        this.A01 = migColorScheme;
        this.A00 = reu;
        this.A02 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1i A0T = 7zU.A0T();
        1Iw r0 = c2k5.A05;
        final MigColorScheme migColorScheme = this.A01;
        CQY A00 = A0T.A00(r0, migColorScheme);
        CNf cNf = new CNf();
        CNf.A01(cNf, this, 0);
        final String str = this.A02;
        cNf.A01 = str;
        cNf.A04(3yH.A09(c2k5, 2131954318), 3yH.A09(c2k5, 2131954317), "UNFILTERED");
        cNf.A04(3yH.A09(c2k5, 2131954310), 3yH.A09(c2k5, 2131954309), 1BJ.A00(ActionId.VIEW_WILL_APPEAR_BEGIN));
        String A09 = 3yH.A09(c2k5, 2131954315);
        String A092 = 3yH.A09(c2k5, 2131954314);
        Integer num = 0S2.A0C;
        cNf.A04(A09, A092, "RED_GREEN");
        String A093 = 3yH.A09(c2k5, 2131954313);
        String A094 = 3yH.A09(c2k5, 2131954312);
        Integer num2 = 0S2.A01;
        cNf.A04(A093, A094, "GREEN_RED");
        CNf.A00(cNf, A00);
        A00.A0B(2131954311);
        2lQ r02 = 2lO.A02;
        2lO A0X = 7zQ.A0X(7zS.A0f(num2, 1.0f), num, 0.0f);
        C2sn A0U = 7zQ.A0U(r0);
        A0U.A00(new 1LH(migColorScheme, str) { // from class: X.8f1
            public final MigColorScheme A00;
            public final String A01;

            {
                1BL.A1F(str, migColorScheme);
                this.A01 = str;
                this.A00 = migColorScheme;
            }

            private final 2cL A01(1Iw r302, C2k6 c2k6, int[] iArr) {
                UserKey userKey = ((User) 1Bu.A00(83430).get()).A0k;
                2lQ r03 = 2lO.A02;
                C1ro c1ro = C1ro.CENTER;
                Integer num3 = 0S2.A00;
                2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num3, c1ro, 0));
                C2sn A0L = 7zS.A0L(c2k6);
                2lO A0L2 = 4YV.A0L((2lO) null, num3, c1ro, 0);
                long A04 = 7zU.A04();
                Integer num4 = 0S2.A0N;
                2lO A0Y = 7zQ.A0Y(A0L2, num4, A04);
                1Iw r04 = A0L.A00;
                C2sn A0U2 = 7zQ.A0U(r04);
                int i = iArr[0];
                8OI A002 = 8mA.A00(r302);
                A002.A2a(9);
                A002.A00.A02 = 7zL.A05(A002, R.dimen.mapbox_eight_dp);
                A002.A1M(2132279342);
                A002.A1W(2132279452);
                A002.A2Z(i);
                A002.A0J();
                8mA r05 = A002.A00;
                11T.A0A(r05);
                A0U2.A00(r05);
                int i2 = 1;
                while (true) {
                    int i3 = i2;
                    int i4 = iArr[i3];
                    8OI A003 = 8mA.A00(r302);
                    A003.A1M(2132279342);
                    A003.A1W(2132279452);
                    A003.A2Z(i4);
                    A003.A0J();
                    8mA r06 = A003.A00;
                    11T.A0A(r06);
                    A0U2.A00(r06);
                    if (i3 == 10) {
                        int i5 = iArr[11];
                        8OI A004 = 8mA.A00(r302);
                        A004.A2a(6);
                        A004.A00.A02 = 7zL.A05(A004, R.dimen.mapbox_eight_dp);
                        A004.A1M(2132279342);
                        A004.A1W(2132279452);
                        A004.A2Z(i5);
                        A004.A0J();
                        8mA r07 = A004.A00;
                        11T.A0A(r07);
                        7zQ.A1F(r07, A0U2, A0L, A0Y);
                        2lO A0Y2 = 7zQ.A0Y(4YV.A0L((2lO) null, num3, c1ro, 0), num4, Double.doubleToRawLongBits(-50.0d));
                        C2sn A0U3 = 7zQ.A0U(r04);
                        8Sl r08 = new 8Sl(new C8je(), r302);
                        r08.A00.A03 = 7zL.A05(r08, 2132279315);
                        r08.A02.set(1);
                        r08.A2X(-1);
                        r08.A1y(c1ro);
                        r08.A0c();
                        r08.A2F(C26z.LEFT, 2132279453);
                        r08.A1W(2132279315);
                        r08.A1M(2132279315);
                        A0U3.A00(r08.A2W());
                        2zT A005 = C2q7.A00(r302);
                        A005.A2Z(userKey);
                        MigColorScheme migColorScheme2 = this.A00;
                        A005.A2Y(migColorScheme2);
                        A005.A2X(C2q0.A08);
                        C2q2 c2q2 = C2q2.A03;
                        C2q7 c2q7 = A005.A01;
                        c2q7.A06 = c2q2;
                        c2q7.A00 = migColorScheme2.B87();
                        A005.A1y(c1ro);
                        7zQ.A1F(A005.A2W(), A0U3, A0L, A0Y2);
                        return C2so.A02(A0L, c2k6, A0g);
                    }
                    i2 = i3 + 1;
                }
            }

            public 1LI A0s(C2k5 c2k52) {
                11T.A0F(c2k52, 0);
                int[] iArr = {2132214714, 2132214716, 2132214717, 2132214718, 2132214719, 2132214720, 2132214721, 2132214722, 2132214723, 2132213878, 2132214715, 2132213871};
                int[] iArr2 = {2132213846, 2132213850, 2132213851, 2132213852, 2132213853, 2132213854, 2132213855, 2132213856, 2132213857, 2132213847, 2132213848, 2132213849};
                int[] iArr3 = {2132214627, 2132214631, 2132214632, 2132214633, 2132214634, 2132214635, 2132214636, 2132214637, 2132214638, 2132214628, 2132214629, 2132214630};
                int[] iArr4 = {2132214322, 2132214326, 2132214327, 2132214328, 2132214329, 2132214330, 2132214331, 2132214332, 2132214333, 2132214323, 2132214324, 2132214325};
                String str2 = this.A01;
                if (!11T.A0O(str2, "UNFILTERED")) {
                    if (11T.A0O(str2, 1BJ.A00(ActionId.VIEW_WILL_APPEAR_BEGIN))) {
                        return A01(c2k52.A05, c2k52, iArr2);
                    }
                    if (11T.A0O(str2, "RED_GREEN")) {
                        return A01(c2k52.A05, c2k52, iArr3);
                    }
                    if (11T.A0O(str2, "GREEN_RED")) {
                        return A01(c2k52.A05, c2k52, iArr4);
                    }
                }
                return A01(c2k52.A05, c2k52, iArr);
            }
        });
        return 7zM.A0l(A00.A09(), A0U, c2k5, A0X);
    }
}
