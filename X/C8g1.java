package X;

import android.content.res.Resources;
import android.graphics.PointF;
import android.net.Uri;
import com.mapbox.mapboxsdk.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8g1, reason: invalid class name */
/* loaded from: 8g1.class */
public final class C8g1 extends 1LH {
    public final int A00;
    public final 8KO A01;
    public final Aaf A02;
    public final List A03;

    public C8g1(8KO r302, Aaf aaf, List list, int i) {
        this.A01 = r302;
        this.A00 = i;
        this.A03 = list;
        this.A02 = aaf;
    }

    public static final 5BG A01(5BK r301, 8Lt r302, C2k6 c2k6, 2lO r304, Function1 function1, int i) {
        C07004ik A0H;
        Number number;
        Number number2 = (Number) r302.A01;
        if (number2 == null || (number = (Number) r302.A02) == null) {
            A0H = 7zR.A0H();
        } else {
            A0H = C06984ii.A00();
            A0H.A00(InterfaceC07034in.A0A);
            11T.A0I(number2, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = number2.floatValue();
            11T.A0I(number, "null cannot be cast to non-null type kotlin.Float");
            ((C07014il) A0H).A01 = new PointF(floatValue, number.floatValue());
        }
        ((C07014il) A0H).A04 = r301;
        C06974ih A0L = 7zL.A0L(A0H);
        5BH A01 = 5BG.A01(c2k6.AeS());
        A01.A2b("HeroMediaComponent");
        A01.A2X((Uri) r302.A03);
        A01.A2Z(A0L);
        7zR.A1A(A01, new GAc(i, 11, function1));
        C5z7.A00(A01, r304);
        return 7zL.A0K(A01);
    }

    public 1LI A0s(C2k5 c2k5) {
        double d;
        int floatToRawIntBits;
        long j;
        11T.A0F(c2k5, 0);
        Function1 A01 = 4FN.A01(c2k5, AVB.A01(this, 45));
        List list = this.A03;
        int size = list.size();
        if (size == 1) {
            8Lt r0 = (8Lt) 0QD.A0D(list);
            long A06 = 3yH.A06(c2k5, 2132279428);
            5BK A00 = 5BJ.A00(4YU.A0E(c2k5.AeS()).getDimension(2132279311));
            2lQ r02 = 2lO.A02;
            return A01(A00, r0, c2k5, C82m.A00(7zS.A0g(0S2.A01, A06), 0), A01, 0);
        }
        if (size == 2) {
            long A062 = 3yH.A06(c2k5, 2132279428);
            1Iw AeS = c2k5.AeS();
            Resources A0E = 4YU.A0E(AeS);
            float dimension = A0E.getDimension(2132279311);
            float dimension2 = A0E.getDimension(R.dimen.mapbox_four_dp);
            long A03 = 3yH.A03(c2k5);
            2lQ r03 = 2lO.A02;
            2lO A0g = 7zL.A0g((2lO) null, C82m.A07(0));
            C2sn A0U = 7zQ.A0U(AeS);
            8Lt r04 = (8Lt) 0QD.A0D(list);
            5BK A012 = 5BJ.A01(dimension, dimension2, dimension2, dimension);
            Integer num = 0S2.A01;
            A0U.A00(A01(A012, r04, A0U, 7zQ.A0X(4YV.A0K((2lO) null, num, A062), num, 1.0f), A01, 0));
            return 7zN.A0R(A01(5BJ.A01(dimension2, dimension, dimension, dimension2), (8Lt) list.get(1), A0U, 4YV.A0K(7zS.A0U((2lO) null, 7zL.A0i(num, A062), num, 1.0f), 0S2.A0u, A03), A01, 1), A0U, c2k5, A0g);
        }
        if (size != 3) {
            1Iw AeS2 = c2k5.AeS();
            Resources A0E2 = 4YU.A0E(AeS2);
            float dimension3 = A0E2.getDimension(2132279311);
            float dimension4 = A0E2.getDimension(R.dimen.mapbox_four_dp);
            long A032 = 3yH.A03(c2k5);
            8Dm A013 = C9d1.A01(c2k5, null, 7zL.A0w(A032), 7zL.A0w(A032), 7zL.A0w(A032));
            2lQ r05 = 2lO.A02;
            2lO A0e = 7zT.A0e((2lO) null, c2k5, 2132279329);
            int i = 0;
            long A08 = 7zP.A08();
            2NI r06 = C8nc.A0O;
            C02A c02a = AeS2.A03.A01;
            C1J8 c1j8 = c02a.A02;
            boolean z = c02a.A0X;
            C9sn A002 = C9sn.A00(AeS2);
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C0s8.A18();
                    throw 0Q8.createAndThrow();
                }
                8Lt r07 = (8Lt) obj;
                C9sn.A01(A01(i == 0 ? 5BJ.A01(dimension3, dimension4, dimension4, dimension3) : i == AnonymousClass001.A04(list) ? 5BJ.A01(dimension4, dimension3, dimension3, dimension4) : 5BJ.A00(dimension4), r07, A002, null, A01, i), A002, r07.A03.toString());
                i = i2;
            }
            return new C8ej(r06, A013, null, A0e, null, C9mj.A04(AeS2, c1j8, 7zN.A03(c2k5, A08), z), A002.A01, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, true);
        }
        long A063 = 3yH.A06(c2k5, 2132279428);
        1Iw AeS3 = c2k5.AeS();
        Resources A0E3 = 4YU.A0E(AeS3);
        float dimension5 = A0E3.getDimension(2132279311);
        float dimension6 = A0E3.getDimension(R.dimen.mapbox_four_dp);
        long A033 = 3yH.A03(c2k5);
        2lQ r08 = 2lO.A02;
        2lO A0g2 = 7zL.A0g((2lO) null, C82m.A07(0));
        C2sn A0U2 = 7zQ.A0U(AeS3);
        8Lt r09 = (8Lt) 0QD.A0D(list);
        5BK A014 = 5BJ.A01(dimension5, dimension6, dimension6, dimension5);
        Integer num2 = 0S2.A01;
        A0U2.A00(A01(A014, r09, A0U2, 7zQ.A0X(4YV.A0K((2lO) null, num2, A063), num2, 2.0f), A01, 0));
        2lO A0K = 4YV.A0K(7zQ.A0X((2lO) null, num2, 1.0f), 0S2.A0u, A033);
        C2sn A0K2 = 7zS.A0K(A0U2);
        8Lt r010 = (8Lt) list.get(1);
        5BK A015 = 5BJ.A01(dimension6, dimension5, dimension6, dimension6);
        if ((A063 & 9221120237041090560L) == 9221120237041090560L) {
            long j2 = 9221401712017801216L;
            if ((A063 & 9221401712017801216L) == 9221401712017801216L) {
                floatToRawIntBits = ((int) (A063 & 4294967295L)) / 2;
            } else {
                j2 = 9221683186994511872L;
                if ((A063 & 9221683186994511872L) == 9221683186994511872L) {
                    floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (A063 & 4294967295L)) / 2.0f);
                } else {
                    d = 0.0d / 0.0d;
                }
            }
            j = floatToRawIntBits | j2;
            A0K2.A00(A01(A015, r010, A0K2, 7zS.A0U((2lO) null, 7zL.A0i(num2, j), num2, 1.0f), A01, 1));
            7zQ.A1E(A01(5BJ.A01(dimension6, dimension6, dimension5, dimension6), (8Lt) list.get(2), A0K2, 7zT.A0a(4YV.A0K((2lO) null, num2, j), 7zL.A0k(num2, 1.0f), A033), A01, 2), A0K2, A0U2, A0K);
            return C2so.A0I(A0U2, c2k5, A0g2);
        }
        d = Double.longBitsToDouble(A063) / 2.0d;
        j = Double.doubleToRawLongBits(d);
        A0K2.A00(A01(A015, r010, A0K2, 7zS.A0U((2lO) null, 7zL.A0i(num2, j), num2, 1.0f), A01, 1));
        7zQ.A1E(A01(5BJ.A01(dimension6, dimension6, dimension5, dimension6), (8Lt) list.get(2), A0K2, 7zT.A0a(4YV.A0K((2lO) null, num2, j), 7zL.A0k(num2, 1.0f), A033), A01, 2), A0K2, A0U2, A0K);
        return C2so.A0I(A0U2, c2k5, A0g2);
    }
}
