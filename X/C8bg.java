package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8bg, reason: invalid class name */
/* loaded from: 8bg.class */
public final class C8bg extends 1LH {
    public final C5ww A00;
    public final C5ww A01;
    public final C5ww A02;
    public final MigColorScheme A03;
    public final boolean A04;
    public final boolean A05;

    public C8bg(C5ww c5ww, C5ww c5ww2, C5ww c5ww3, MigColorScheme migColorScheme, boolean z, boolean z2) {
        this.A03 = migColorScheme;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = c5ww;
        this.A01 = c5ww2;
        this.A02 = c5ww3;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1i A0T = 7zU.A0T();
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = this.A03;
        CQY A00 = A0T.A00(r0, migColorScheme);
        A00.A0C(2131967155);
        String A09 = 3yH.A09(c2k5, 2131967158);
        C5ww c5ww = this.A00;
        c5ww.getClass();
        boolean z = this.A05;
        CQY.A03(A00, c5ww, "", A09, z);
        int i = 9GF.A00;
        LightColorScheme.A00();
        CFx A0o = 7zQ.A0o();
        1Br A002 = 1Bu.A00(68729);
        1Br A0a = 7zM.A0a();
        String A092 = 3yH.A09(c2k5, 2131967156);
        String A0A = 3yH.A0A(c2k5, A092, 2131967153);
        EC2 A01 = A0o.A01(3vP.A00(c2k5), new 9pX(0, A0a, c2k5, A002), migColorScheme);
        0Dc A0F = 7zS.A0F(3vP.A00(c2k5), A0A);
        A0F.A05(A01, A092, A092, 33);
        A00.A0L(new C55g(C1u7.A0A, migColorScheme, 2KE.A04, 7zM.A0E(A0F), 7zL.A03(), 0, 2RH.A08.A00(), -1, true));
        if (z) {
            A00.A0C(2131967154);
            EL0 el0 = EL0.A03;
            Integer num = 0S2.A00;
            A00.A0F(new Byf(this.A01, null, null, el0, 3yH.A09(c2k5, 2131967157), "", num, null, 0L, true, false, false));
            if (this.A04) {
                A00.A0F(new Byf(this.A02, null, null, el0, 3yH.A09(c2k5, 2131967159), "", num, null, 0L, true, false, false));
            }
        }
        return A00.A09();
    }
}
