package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8a0, reason: invalid class name */
/* loaded from: 8a0.class */
public final class C8a0 extends 1LH {
    public final MigColorScheme A00;
    public final List A01;
    public final Function1 A02;
    public final FbUserSession A03;

    public C8a0(FbUserSession fbUserSession, MigColorScheme migColorScheme, List list, Function1 function1) {
        7zR.A1N(fbUserSession, list);
        this.A03 = fbUserSession;
        this.A00 = migColorScheme;
        this.A01 = list;
        this.A02 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        C8ej c8ej;
        11T.A0F(c2k5, 0);
        FbUserSession fbUserSession = this.A03;
        1Iw r0 = c2k5.A05;
        Object A0h = 7zP.A0h(fbUserSession, r0, 17067);
        2lQ r02 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, C82m.A08(0S2.A0j, 65.0f, 0));
        C2sn A0U = 7zQ.A0U(r0);
        1Iw r03 = A0U.A00;
        2KD A01 = 2K3.A01(r03, 0);
        7zM.A1X(A01, A0U, 2131962195);
        MigColorScheme migColorScheme = this.A00;
        A01.A2x(migColorScheme);
        A01.A2k();
        A01.A2d();
        A01.A2q(1);
        A01.A13(16.0f);
        A01.A18(8.0f);
        7zN.A1Q(A0U, A01);
        List list = this.A01;
        if (list.isEmpty()) {
            2KD A012 = 2K3.A01(r03, 0);
            7zR.A1J(migColorScheme, A012, A0U, 2131962194);
            A012.A2i();
            A012.A2d();
            A012.A2q(1);
            A012.A13(16.0f);
            A012.A18(8.0f);
            c8ej = A012.A2W();
        } else {
            long A08 = 7zP.A08();
            2NI r04 = C8nc.A0O;
            C02A c02a = r03.A03.A01;
            C1J8 c1j8 = c02a.A02;
            boolean z = c02a.A0X;
            C9sn A00 = C9sn.A00(r03);
            C9sn.A04(A00, list, ATm.A00, new AW6(A0h, this, 0));
            c8ej = new C8ej(r04, null, null, null, null, C9mj.A02(r03, c1j8, 7zN.A03(A0U, A08), z), A00.A01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
        }
        return 7zM.A0l(c8ej, A0U, c2k5, A0g);
    }
}
