package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8bs, reason: invalid class name */
/* loaded from: 8bs.class */
public final class C8bs extends 1LH {
    public final MigColorScheme A00;
    public final ImmutableList A01;
    public final C00m A02;
    public final C00m A03;
    public final boolean A04;
    public final boolean A05;

    public C8bs(MigColorScheme migColorScheme, ImmutableList immutableList, C00m c00m, C00m c00m2, boolean z, boolean z2) {
        1BL.A1G(c00m, c00m2);
        this.A00 = migColorScheme;
        this.A01 = immutableList;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = c00m;
        this.A02 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        1Iw AeS;
        MigColorScheme migColorScheme;
        2cL A09;
        C8lp c8lp;
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0k(num, 1.0f));
        C2sn A0L = 7zR.A0L(c2k5);
        boolean z = this.A05;
        if (z) {
            2lO A0X = 7zQ.A0X((2lO) null, num, 1.0f);
            AeS = A0L.AeS();
            C2sn A0U = 7zQ.A0U(AeS);
            8Tj A0q = 7zL.A0q(A0U);
            migColorScheme = this.A00;
            A0q.A2Y(migColorScheme.AZc());
            8Tj.A07(A0U, A0q, migColorScheme);
            A09 = C2so.A07(A0U, A0L, A0X);
        } else {
            ImmutableList immutableList = this.A01;
            if (immutableList.isEmpty()) {
                2lO A0X2 = 7zQ.A0X((2lO) null, num, 1.0f);
                AeS = A0L.AeS();
                C2sn A0U2 = 7zQ.A0U(AeS);
                1Iw r0 = A0U2.A00;
                2KD A01 = 2K3.A01(r0, A1W ? 1 : 0);
                7zM.A1X(A01, A0U2, 2131966837);
                migColorScheme = this.A00;
                A01.A2x(migColorScheme);
                A01.A2d();
                A01.A2g();
                7zO.A1F(A01, 2RH.A05);
                2KD A0d = 7zR.A0d(r0, A0U2, A01, A1W ? 1 : 0);
                7zR.A1J(migColorScheme, A0d, A0U2, 2131966836);
                A0d.A2d();
                A0d.A2i();
                A0d.A2X();
                A0d.A01.A04 = 1.2f;
                A0d.A0z(262.0f);
                7zN.A1Q(A0U2, A0d);
                A09 = C2so.A06(A0U2, A0L, A0X2);
            } else {
                C1i A0T = 7zU.A0T();
                AeS = A0L.AeS();
                migColorScheme = this.A00;
                CQY A00 = A0T.A00(AeS, migColorScheme);
                int i = 9GF.A00;
                int i2 = 9GF.A01;
                LightColorScheme.A00();
                A00.A0L(new C55g(C1u7.A0A, migColorScheme, 2KE.A04, 3yH.A09(A0L, 2131966835), i, i2, i2, -1, A1W));
                A00.A0M(immutableList);
                A09 = A00.A09();
                11T.A0A(A09);
            }
        }
        A0L.A00(A09);
        boolean z2 = this.A04;
        if (z2 || !(this.A01.isEmpty() || z)) {
            8TZ A002 = C8nr.A00(AeS);
            int i3 = 2131966845;
            if (z2) {
                i3 = 2131966840;
            }
            A002.A2b(3yH.A09(A0L, i3));
            A002.A2Z(C9py.A03(this, 53));
            A002.A2a(migColorScheme);
            C8nr A2W = A002.A2W();
            8OG A003 = C8lp.A00(AeS);
            A003.A2X(A2W);
            4YU.A1L(A003, 2RH.A03);
            7zO.A1E(A003, 2RH.A05);
            A003.A0J();
            c8lp = A003.A01;
        } else {
            c8lp = null;
        }
        return 7zM.A0l(c8lp, A0L, c2k5, A0g);
    }
}
