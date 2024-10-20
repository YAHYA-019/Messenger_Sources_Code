package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8ct, reason: invalid class name */
/* loaded from: 8ct.class */
public final class C8ct extends 1LH {
    public final int A00;
    public final MigColorScheme A01;
    public final List A02;
    public final C00m A03;
    public final Function1 A04;
    public final Function1 A05;
    public final int A06;

    public C8ct(MigColorScheme migColorScheme, List list, C00m c00m, Function1 function1, Function1 function12, int i, int i2) {
        1BK.A1K(list, 1, migColorScheme);
        this.A02 = list;
        this.A00 = i;
        this.A06 = i2;
        this.A01 = migColorScheme;
        this.A05 = function1;
        this.A04 = function12;
        this.A03 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        float f = this.A00 * 1.65f;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        1Iw r0 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r0);
        1Iw r02 = A0U2.A00;
        2KD A01 = 2K3.A01(r02, 0);
        7zM.A1X(A01, A0U2, 2131964175);
        A01.A2d();
        A01.A2k();
        MigColorScheme migColorScheme = this.A01;
        A01.A2x(migColorScheme);
        A01.A0X();
        A01.A1A(12.0f);
        2KD A0d = 7zR.A0d(r02, A0U2, A01, 0);
        7zM.A1X(A0d, A0U2, 2131964176);
        A0d.A2w(C1u7.A06);
        A0d.A2k();
        A0d.A2x(migColorScheme);
        A0d.A0X();
        A0d.A1A(12.0f);
        7zR.A1A(A0d, new AR2(this, 31));
        7zN.A1Q(A0U2, A0d);
        7zN.A1M(A0U2, A0U, (2lO) null, c1rp);
        2lQ r03 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A01, ((int) f) | 9221401712017801216L);
        long A0A = 7zP.A0A();
        2lO A0K2 = 4YV.A0K(A0K, 0S2.A0A, A0A);
        8Dm A00 = C9d1.A00(A0U, 7zL.A0w(this.A06 | 9221401712017801216L), A0A);
        long A08 = 7zP.A08();
        2NI r04 = C8nc.A0O;
        C02A c02a = r0.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A002 = C9sn.A00(r0);
        C9sn.A02(A002, C13m.A1A(this.A02), this, AT5.A00, 35);
        2KD A12 = 7zM.A12(new C8ej(r04, A00, null, A0K2, null, C9mj.A01(r0, c1j8, 7zN.A03(A0U, A08), z), A002.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true), r0, A0U, 0);
        7zM.A1X(A12, A0U, 2131957070);
        A12.A2d();
        A12.A2k();
        A12.A2x(migColorScheme);
        A12.A0X();
        A12.A1A(12.0f);
        7zN.A1Q(A0U, A12);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
    }
}
