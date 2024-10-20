package X;

import android.content.Context;
import android.text.format.Formatter;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8W1, reason: invalid class name */
/* loaded from: 8W1.class */
public final class C8W1 extends 1LH {
    public final C9a7 A00;
    public final MigColorScheme A01;

    public C8W1(C9a7 c9a7, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = c9a7;
    }

    public 1LI A0s(C2k5 c2k5) {
        String A0t;
        11T.A0F(c2k5, 0);
        C00i c00i = this.A00.A09.A00;
        List<9Ag> A02 = C9iJ.A02(((9Zn) c00i.get()).A01, c2k5);
        C9iJ.A00(((9Zn) c00i.get()).A00, c2k5);
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A06, 3yH.A04(c2k5));
        C2sn A0I = 7zS.A0I(c2k5);
        long A06 = 3yH.A06(A0I, 2132279369);
        Integer num = 0S2.A01;
        2lO A0K2 = 4YV.A0K((2lO) null, num, A06);
        long A05 = 3yH.A05(A0I);
        Integer num2 = 0S2.A09;
        2lO A0K3 = 4YV.A0K(A0K2, num2, A05);
        1Iw AeS = A0I.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        1Iw r02 = A0U.A00;
        2KD A01 = 2K3.A01(r02, 0);
        Context context = r02.A0D;
        9Zn r03 = (9Zn) c00i.get();
        C96i c96i = C96i.A03;
        List A03 = 11T.A03(c96i);
        long j = 0;
        for (9Ag r04 : (List) r03.A01.getValue()) {
            if (!A03.contains(r04.A01())) {
                j += r04.A00;
            }
        }
        String formatFileSize = Formatter.formatFileSize(context, j);
        11T.A0A(formatFileSize);
        String formatShortFileSize = Formatter.formatShortFileSize(context, ((9Zn) c00i.get()).A00());
        11T.A0A(formatShortFileSize);
        A01.A2z(7zO.A0t(A0U, formatFileSize, formatShortFileSize, 2131966425));
        A01.A2f();
        A01.A2b();
        A01.A0N();
        MigColorScheme migColorScheme = this.A01;
        7zQ.A1K(A0U, migColorScheme, A01);
        A0I.A00(C2so.A0O(A0U, A0I, A0K3));
        2lO A0X = 7zS.A0X((2lO) null, A0I, num, 2132279369);
        long A062 = 3yH.A06(A0I, 2132279298);
        Integer num3 = 0S2.A0A;
        2lO A0K4 = 4YV.A0K(A0X, num3, A062);
        C6nh A0R = 7zO.A0R(AeS, 0);
        A0R.A02(6.0f);
        C26z c26z = C26z.ALL;
        A0R.A07(c26z, 3.0f);
        A0R.A08(c26z, migColorScheme.BDl());
        2lO A0L = 4YV.A0L(A0K4, num, A0R.A01(), 0);
        C2sn A0U2 = 7zQ.A0U(AeS);
        for (9Ag r05 : A02) {
            long j2 = r05.A00;
            if (j2 != 0) {
                float A00 = (((float) j2) / ((float) ((9Zn) c00i.get()).A00())) * 100.0f;
                if (A00 < 1.0f) {
                    A00 = 1.0f;
                }
                int A002 = r05.A00(7zL.A0A(A0U2.A00));
                Integer num4 = 0S2.A00;
                7zN.A1N(A0U2, 7zS.A0X(7zS.A0a(C82m.A04(null, num4, A00, 0), num4, A002), A0U2, num2, 2132279351));
            }
        }
        7zN.A1J(A0U2, A0I, A0L);
        2lO A0K5 = 4YV.A0K((2lO) null, 0S2.A07, 3yH.A03(A0I));
        C2sn A0U3 = 7zQ.A0U(AeS);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            8vP r06 = (9Ag) it.next();
            if (r06.A01() != c96i) {
                Context A0A = 7zL.A0A(A0U3.A00);
                int A003 = r06.A00(A0A);
                if (r06 instanceof 8vP) {
                    8vP r07 = r06;
                    A0t = 4YU.A0u(A0A.getResources(), Formatter.formatFileSize(A0A, ((9Ag) r07).A00), r07.A00.valueResId);
                } else if (r06 instanceof C8vQ) {
                    C8vQ c8vQ = (C8vQ) r06;
                    A0t = A0A.getResources().getString(c8vQ.A00.valueResId, A0A.getResources().getString(2131959933), Formatter.formatFileSize(A0A, ((9Ag) c8vQ).A00));
                } else {
                    A0t = 4YU.A0t(A0A.getResources(), r06.A01().valueResId);
                    2lO A0V = 7zS.A0V((2lO) null, 7zL.A0i(num2, 3yH.A01(A0U3)), num3, 3yH.A06(A0U3, 2132279305));
                    C2sn A0J = 7zS.A0J(A0U3);
                    1Iw r08 = A0J.A00;
                    C6c2 A004 = C6c1.A00(r08);
                    A004.A2Z(A003);
                    A004.A2Y(8.0f);
                    A004.A15(4.0f);
                    2KD A12 = 7zM.A12(A004.A2V(), r08, A0J, 0);
                    A12.A0R();
                    7zR.A1L(migColorScheme, A12, A0t);
                    7zS.A1P(A0J, A0U3, A0V, A12);
                }
                11T.A0A(A0t);
                2lO A0V2 = 7zS.A0V((2lO) null, 7zL.A0i(num2, 3yH.A01(A0U3)), num3, 3yH.A06(A0U3, 2132279305));
                C2sn A0J2 = 7zS.A0J(A0U3);
                1Iw r082 = A0J2.A00;
                C6c2 A0042 = C6c1.A00(r082);
                A0042.A2Z(A003);
                A0042.A2Y(8.0f);
                A0042.A15(4.0f);
                2KD A122 = 7zM.A12(A0042.A2V(), r082, A0J2, 0);
                A122.A0R();
                7zR.A1L(migColorScheme, A122, A0t);
                7zS.A1P(A0J2, A0U3, A0V2, A122);
            }
        }
        7zN.A1I(A0U3, A0I, A0K5);
        return C2so.A02(A0I, c2k5, A0K);
    }
}
