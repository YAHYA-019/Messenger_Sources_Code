package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8cr, reason: invalid class name */
/* loaded from: 8cr.class */
public final class C8cr extends 1LH {
    public final AnonymousClass622 A00;
    public final Function1 A01;
    public final 5zD A02;
    public final C62q A03;
    public final 63E A04;
    public final MigColorScheme A05;
    public final boolean A06;

    public C8cr(5zD r302, C62q c62q, 63E r304, AnonymousClass622 anonymousClass622, MigColorScheme migColorScheme, Function1 function1, boolean z) {
        11T.A0F(anonymousClass622, 1);
        this.A00 = anonymousClass622;
        this.A04 = r304;
        this.A03 = c62q;
        this.A05 = migColorScheme;
        this.A02 = r302;
        this.A06 = z;
        this.A01 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        2oN r02 = (2oN) 7zO.A0o(r0, 33246);
        C1u2 A0I = 4YV.A0I();
        63E r03 = this.A04;
        AnonymousClass622 anonymousClass622 = this.A00;
        5zD r04 = this.A02;
        AnonymousClass644 A02 = r03.A02(r04, (64W) null, this.A03, anonymousClass622, (63W) null, 5Hr.A06, false);
        C2cl c2cl = null;
        if (A02 == null) {
            return null;
        }
        1LI r05 = A02.A00;
        2lQ r06 = 2lO.A02;
        AnonymousClass843 A00 = AnonymousClass843.A00(this, 40);
        Integer num = 0S2.A1G;
        2lO A0L = 4YV.A0L(4YV.A0L((2lO) null, num, A00, 1), 0S2.A02, AnonymousClass843.A00(this, 41), 1);
        C2sn A0U = 7zQ.A0U(r0);
        2RH r07 = 2RH.A04;
        long A06 = 4YV.A06(r07);
        long A062 = 4YV.A06(2RH.A05);
        2RH r08 = 2RH.A03;
        2lO A0V = 7zS.A0V(4YV.A0K((2lO) null, 0S2.A05, A06), 7zL.A0i(0S2.A0u, A062), num, 4YV.A06(r08));
        C1ro c1ro = C1ro.FLEX_START;
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        1Iw r09 = A0U.A00;
        C2sn A0H = 7zS.A0H(r05, r09);
        if (!this.A06) {
            C2cm A0I2 = 7zL.A0I(A0H);
            7zN.A18(A0I2, C1u3.A1a, A0I);
            A0I2.A0L();
            A0I2.A0z(24.0f);
            A0I2.A0l(24.0f);
            A0I2.A0s(24.0f);
            A0I2.A0r(24.0f);
            4YU.A1N(A0I2, r08);
            A0I2.A2X(r04.BKa());
            c2cl = 7zL.A0J(A0I2);
        }
        A0H.A00(c2cl);
        2KD A0r = 7zL.A0r(A0H, 0);
        A0r.A2z(r02.A03(anonymousClass622.A03.A05));
        MigColorScheme migColorScheme = this.A05;
        A0r.A2x(migColorScheme);
        A0r.A0c();
        7zU.A1C(A0r, r07);
        C26z c26z = C26z.END;
        7zU.A1E(A0r, r08, c26z);
        A0r.A2c();
        A0r.A2i();
        7zN.A1Q(A0H, A0r);
        A0U.A00(C2so.A0V(A0H, A0U, A0V, c1ro, c1rp));
        C83f A002 = C2hd.A00(r09);
        A002.A2Z(0);
        A002.A2Y(migColorScheme.Atp());
        A002.A2X(0.8f);
        7zO.A1M(A002, r08, c26z);
        A002.A13(60.0f);
        return 7zM.A0l(A002.A2V(), A0U, c2k5, A0L);
    }
}
