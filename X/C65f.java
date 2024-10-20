package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.65f, reason: invalid class name */
/* loaded from: 65f.class */
public final class C65f implements C64o {
    public final 1CO A00 = (1CO) 1Bi.A03(16387);

    @Override // X.C64o
    public 1LI AKU(06Z r302, FbUserSession fbUserSession, 1Iw r304, 5zD r305, 64W r306, AnonymousClass622 anonymousClass622) {
        11T.A0F(r304, 0);
        1BL.A1H(fbUserSession, anonymousClass622, r305);
        11T.A0F(r302, 4);
        MigColorScheme A00 = 5zD.A00(r305);
        String A0D = r304.A0D(2131958259);
        boolean z = anonymousClass622.A0Z;
        9zM r0 = new 9zM(fbUserSession, r305, r306, this, anonymousClass622);
        7xD r02 = 7xD.A00;
        return new C8cz(r0, C1u7.A06, A00, 2KE.A05, A0D, r02, z);
    }

    @Override // X.C64o
    public void Bac(AnonymousClass622 anonymousClass622) {
    }

    @Override // X.C64o
    public boolean Cyg(AnonymousClass622 anonymousClass622) {
        11T.A0F(anonymousClass622, 0);
        boolean z = false;
        if (anonymousClass622.A04.A03("instant_games_nux_eligibility") && this.A00.AZk(72339558640977356L)) {
            z = true;
        }
        return z;
    }
}
