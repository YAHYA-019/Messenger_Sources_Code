package X;

import android.graphics.drawable.ColorDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dux.class */
public final class Dux extends 1LH {
    public final Edl A00;
    public final MigColorScheme A01;

    public Dux(Edl edl, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = edl;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2lO A0R = 7zS.A0R(7zL.A0g((2lO) null, new C2xi(num, new ColorDrawable(BDl), 1)), 1.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        CQY A00 = 7zU.A0T().A00(A0L.AeS(), migColorScheme);
        A00.A0P("New Passkey");
        EL0 el0 = EL0.A03;
        A00.A0F(new Byf(new Fjz(this, A1W ? 1 : 0), null, null, el0, "Delete all cached secrets", "Delete all cached secrets from passkey secret manager. This is used to simulate a new device login, and to force passkey assertion before restoring EB.", num, null, 0L, true, A1W, A1W));
        A00.A0F(new Byf(new Fjz(this, 1), null, null, el0, "Create new passkey", "", num, null, 0L, true, A1W, A1W));
        A00.A0F(new Byf(new Fjz(this, 2), null, null, el0, "Assert new passkey", "", num, null, 0L, true, A1W, A1W));
        A00.A0F(new Byf(new Fjz(this, 3), null, null, el0, "Create VD with cached secrets", "Create VD with a secret from passkey creation or assertion.", num, null, 0L, true, A1W, A1W));
        A00.A0F(new Byf(new Fjz(this, 4), null, null, el0, "Restore EB with cached secrets", "Restore EB with a secret from passkey assertion.", num, null, 0L, true, A1W, A1W));
        C8m6 A09 = A00.A09();
        11T.A0A(A09);
        return 7zM.A0l(A09, A0L, c2k5, A0R);
    }
}
