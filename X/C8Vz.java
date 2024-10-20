package X;

import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Vz, reason: invalid class name */
/* loaded from: 8Vz.class */
public final class C8Vz extends 1LH {
    public final MigColorScheme A00;
    public final 8KB A01;

    public C8Vz(8KB r302, MigColorScheme migColorScheme) {
        11T.A0F(r302, 2);
        this.A00 = migColorScheme;
        this.A01 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        List<8KV> list = this.A01.A07;
        ArrayList A0z = 1BL.A0z(list);
        for (8KV r0 : list) {
            String str = r0.A0F;
            Uri uri = r0.A06;
            if (uri == null) {
                uri = r0.A05;
            }
            int i = r0.A02;
            int i2 = r0.A01;
            Uri uri2 = uri;
            A0z.add(new 8K4(uri2, r0.A08, 7zM.A18(r0.A0O ? 1 : 0), str, i, i2, r0.A04, r0.A03));
        }
        8Lu r02 = new 8Lu(24, new 8Jn(), A0z);
        8Jn r03 = (8Jn) r02.A01;
        C2lh A0e = 7zL.A0e(c2k5, AQV.A00(r02, 35));
        2lO A0P = 7zT.A0P((2lO) null, 7zL.A08(r03.A02), 7zL.A08(r03.A03));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        2KD A01 = 2K3.A01(AeS, 0);
        A01.A10(100.0f);
        7zM.A1X(A01, A0L, 2131967326);
        A01.A2q(1);
        A01.A2n();
        A01.A2b();
        A01.A2X();
        MigColorScheme migColorScheme = this.A00;
        2K3 A0Z = 7zN.A0Z(migColorScheme, A01);
        2KD A012 = 2K3.A01(AeS, 0);
        A012.A10(100.0f);
        A012.A2z((CharSequence) A0e.A02);
        A012.A2q(1);
        A012.A2g();
        A012.A2b();
        A012.A2X();
        2K3 A0Z2 = 7zN.A0Z(migColorScheme, A012);
        Integer num = 0S2.A00;
        2lO A04 = C82m.A04(null, num, 100.0f, 0);
        long doubleToRawLongBits = Double.doubleToRawLongBits(90.0d);
        Integer num2 = 0S2.A01;
        7zU.A1F(A0Z2, 7zS.A0H(A0Z, AeS), A0L, 4YV.A0K(A04, num2, doubleToRawLongBits), C1rp.FLEX_START);
        8Dt r04 = new 8Dt(r02, A0e, 0);
        2lO A0Z3 = 7zS.A0Z((2lO) null, num2, 405.0d);
        long A08 = 7zP.A08();
        2NI r05 = C8nc.A0O;
        1Iw r06 = A0L.A00;
        C02A c02a = r06.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A00 = C9sn.A00(r06);
        C9sn.A04(A00, 0QD.A0i((Iterable) r02.A00), SJ5.A00, 83Q.A01(r03, this, 45));
        return 7zN.A0N(new C8ej(r05, null, r04, A0Z3, null, C9mj.A05(r06, c1j8, null, num, 1, -1, 7zN.A03(A0L, A08), false, z), A00.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true), A0L, c2k5, A0P);
    }
}
