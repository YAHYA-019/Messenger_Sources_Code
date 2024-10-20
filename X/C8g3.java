package X;

import android.graphics.Typeface;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8g3, reason: invalid class name */
/* loaded from: 8g3.class */
public final class C8g3 extends 1LH {
    public final int A00;
    public final C84j A01;
    public final MigColorScheme A02;
    public final List A03;

    public C8g3(C84j c84j, MigColorScheme migColorScheme, List list, int i) {
        1BL.A1F(list, migColorScheme);
        this.A03 = list;
        this.A02 = migColorScheme;
        this.A00 = i;
        this.A01 = c84j;
    }

    private final C2hd A01(C2k6 c2k6) {
        C83f A00 = C2hd.A00(c2k6.AeS());
        A00.A2Y(this.A02.Atp());
        A00.A2Z(0);
        A00.A2X(1.0f);
        return A00.A2V();
    }

    public 1LI A0s(C2k5 c2k5) {
        List list = (List) 2rO.A00(c2k5, new AKN(this, 12), 7zL.A1Z(c2k5));
        C2lh A0e = 7zL.A0e(c2k5, APS.A00);
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, C1ro.CENTER, 0));
        long A01 = 3yH.A01(c2k5);
        final MigColorScheme migColorScheme = this.A02;
        int Abp = migColorScheme.Abp();
        long A05 = 3yH.A05(c2k5);
        1Iw r0 = c2k5.A05;
        8Tk A00 = C8mn.A00(r0);
        A00.A2f(true);
        C8mn c8mn = A00.A01;
        c8mn.A03 = Abp;
        c8mn.A00 = 7zO.A03(c2k5, A01);
        c8mn.A01 = 7zO.A03(c2k5, A05);
        A00.A2Z((-1) << (-1));
        c8mn.A07 = 922746880;
        A00.A2c(50331648);
        float f = 0.0f / 0.0f;
        c8mn.A05 = -1;
        C2sn A0U = 7zQ.A0U(r0);
        final C84j c84j = this.A01;
        if (c84j != null) {
            A0U.A00(new 1LH(c84j, migColorScheme) { // from class: X.8f8
                public final C84j A00;
                public final MigColorScheme A01;

                {
                    this.A01 = migColorScheme;
                    this.A00 = c84j;
                }

                public static final 2KZ A01(C2k6 c2k6, String str, int i, int i2, int i3) {
                    2lQ r02 = 2lO.A02;
                    2lO A0g2 = 7zL.A0g((2lO) null, 7zL.A0k(0S2.A01, 1.0f));
                    long A08 = 7zL.A08(i);
                    Typeface typeface = Typeface.DEFAULT;
                    long A082 = 7zP.A08();
                    3yF A0v = 7zM.A0v(c2k6.AeS(), str, 0);
                    A0v.A2x(i2);
                    7zQ.A1L(A0v, c2k6.B7k(), 0, A08);
                    A0v.A34(typeface);
                    7zV.A10(A0v, c2k6, A082);
                    A0v.A2q(1.0f);
                    A0v.A3D(false);
                    A0v.A2v(0);
                    A0v.A2u(i3);
                    A0v.A2b();
                    7zO.A1R(A0v, true, false);
                    A0v.A1w(null);
                    return 7zQ.A0c(A0g2, A0v);
                }

                public 1LI A0s(C2k5 c2k52) {
                    7zM.A1Z(c2k52);
                    2lO A0K = 4YV.A0K(7zS.A0g(0S2.A06, 3yH.A06(c2k52, 2132279298)), 0S2.A00, 3yH.A06(c2k52, 2132279349));
                    C2sn A0U2 = 7zQ.A0U(c2k52.A05);
                    C84j c84j2 = this.A00;
                    String str = c84j2.A01;
                    MigColorScheme migColorScheme2 = this.A01;
                    A0U2.A00(A01(A0U2, str, 16, migColorScheme2.B4i(), 2));
                    return 7zM.A0l(A01(A0U2, c84j2.A00, 10, migColorScheme2.Ahv(), 1), A0U2, c2k52, A0K);
                }
            });
            A0U.A00(A01(A0U));
        }
        for (8K1 r02 : (List) list.get(7zP.A01(A0e))) {
            A0U.A00(new C8fc(null, migColorScheme, r02));
            if (r02.A00 == MfU.A0T) {
                A0U.A00(A01(A0U));
            }
        }
        if (list.size() > 1) {
            A0U.A00(A01(A0U));
            7zL.A1L(A0U.A00);
            A0U.A00(new C8fc(7MU.A00(0S2.A04, 0S2.A0C), migColorScheme, new 8K1(MfU.A0V, 2131960471, (Integer) null, (Integer) null, (String) null, (String) null, new AQf(A0e, list, 20))));
        }
        A00.A2e(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false));
        C5z7.A00(A00, A0g);
        return A00.A2W();
    }
}
