package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cif.class */
public final class Cif implements DJa {
    public final 1Br A00 = AbG.A0Q();
    public final 1Br A01 = 1Bq.A00(82303);
    public final Long A02;
    public final String A03;

    public Cif(String str, Long l) {
        this.A03 = str;
        this.A02 = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014a  */
    @Override // X.DJa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2cL AJW(X.1Iw r302, X.C2iw r303, X.C0E r304, X.BLA r305, com.facebook.mig.scheme.interfaces.MigColorScheme r306, java.lang.String r307, boolean r308, boolean r309, boolean r310) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cif.AJW(X.1Iw, X.2iw, X.C0E, X.BLA, com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String, boolean, boolean, boolean):X.2cL");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x014a  */
    @Override // X.DJa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2cL AKS(com.facebook.auth.usersession.FbUserSession r302, X.1Iw r303, X.C0E r304, com.facebook.mig.scheme.interfaces.MigColorScheme r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, boolean r309, boolean r310, boolean r311, boolean r312) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cif.AKS(com.facebook.auth.usersession.FbUserSession, X.1Iw, X.C0E, com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):X.2cL");
    }

    @Override // X.DJa
    public 1LI AL6(1Iw r302, final C0E c0e, final Bkl bkl, final MigColorScheme migColorScheme, C2fr c2fr) {
        if (AbK.A0o(this.A00).AZk(36324647251234676L)) {
            if (bkl != null) {
                return new 1LH(c0e, bkl, migColorScheme) { // from class: X.8Wn
                    public final C0E A00;
                    public final Bkl A01;
                    public final MigColorScheme A02;

                    {
                        this.A01 = bkl;
                        this.A02 = migColorScheme;
                        this.A00 = c0e;
                    }

                    public 1LI A0s(C2k5 c2k5) {
                        11T.A0F(c2k5, 0);
                        9cG A00 = 9B8.A00(c2k5);
                        4NU A002 = 4NT.A00(c2k5, ALf.A00);
                        4FL.A00(c2k5, new 85O(35, A00, A002, this), 7zL.A1Y());
                        return EWB.A00(c2k5, (2lO) null, 83Q.A01(A00, this, 21));
                    }
                };
            }
            throw 1BK.A0h();
        }
        C2pz A00 = C2px.A00(r302);
        A00.A2X(C2q0.A00);
        A00.A2Z(c2fr);
        A00.A2Y(migColorScheme);
        A00.A0F("android.widget.ImageView");
        A00.A0L();
        4YU.A1N(A00, 2RH.A06);
        return A00.A2W();
    }
}
