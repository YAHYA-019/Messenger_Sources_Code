package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme;

/* renamed from: X.1or, reason: invalid class name */
/* loaded from: 1or.class */
public final class C1or {
    public final 1Br A00;
    public final 1Br A01;
    public final FbUserSession A02;

    public C1or(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A02 = fbUserSession;
        this.A01 = 1Lm.A01(fbUserSession, 66301);
        this.A00 = 1Lm.A01(fbUserSession, 66299);
    }

    public final MigColorScheme A00() {
        C00i c00i = this.A01.A00;
        boolean A00 = ((C1os) c00i.get()).A00();
        c00i.get();
        C1p0 c1p0 = ((C1oz) C1Y6.A00(null, "com_facebook_mig_scheme_plugins_interfaces_themepreferencesmodesetter_ThemePreferencesModeSetterInterfaceSpec", "Registry", new Object[0])).A00;
        int andIncrement = C1Y6.A04.getAndIncrement();
        1YC r0 = c1p0.A00;
        r0.A08("com.facebook.mig.scheme.plugins.interfaces.themepreferencesmodesetter.ThemePreferencesModeSetterInterfaceSpec", "mig.scheme.themepreferencesmodesetter.ThemePreferencesModeSetterInterfaceSpec", "setDarkThemeEnabled", andIncrement);
        r0.A02((Exception) null, "mig.scheme.themepreferencesmodesetter.ThemePreferencesModeSetterInterfaceSpec", "setDarkThemeEnabled", andIncrement);
        C1p1 c1p1 = (C1p1) 1Bn.A0A(66150);
        MigColorScheme migColorScheme = (MigColorScheme) (A00 ? c1p1.A00 : c1p1.A01).get();
        11T.A0D(migColorScheme);
        return A01(migColorScheme);
    }

    public final MigColorScheme A01(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        int intValue = ((C1p5) this.A00.A00.get()).A00().intValue();
        if (intValue != 0 && intValue != 2 && intValue != 1) {
            if (intValue != 3) {
                throw 1BK.A1F();
            }
            return migColorScheme;
        }
        return new DelegatingMigColorScheme(migColorScheme);
    }
}
