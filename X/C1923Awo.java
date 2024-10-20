package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Awo, reason: case insensitive filesystem */
/* loaded from: Awo.class */
public final class C1923Awo extends 1LH {
    public final MigColorScheme A00;
    public final boolean A01;

    public C1923Awo(MigColorScheme migColorScheme, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A01 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2lQ r0 = 2lO.A02;
        boolean z = this.A01;
        MigColorScheme migColorScheme = this.A00;
        2lO A0h = 7zS.A0h(0S2.A00, 7zL.A0j(z ? migColorScheme.AjC() : migColorScheme.BDl()), 1);
        C2sn A0L = 7zR.A0L(c2k5);
        8TI A00 = 8oZ.A00(A0L.AeS());
        2RH r02 = 2RH.A03;
        7zO.A1K(A00, r02);
        4YU.A1M(A00, r02);
        A00.A2Z(migColorScheme);
        A00.A01.A0J = 3yH.A09(A0L, 2131956627);
        return 7zM.A0l(A00.A2W(), A0L, c2k5, A0h);
    }
}
