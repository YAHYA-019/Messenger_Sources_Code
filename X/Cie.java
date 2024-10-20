package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cie.class */
public final class Cie implements DJa {
    @Override // X.DJa
    public 2cL AJW(1Iw r302, C2iw c2iw, C0E c0e, BLA bla, MigColorScheme migColorScheme, String str, boolean z, boolean z2, boolean z3) {
        2K3 r314;
        if (z) {
            r314 = null;
        } else {
            2KD A01 = 2K3.A01(r302, 0);
            A01.A0R();
            A01.A2x(migColorScheme);
            A01.A2z(4YU.A0E(r302).getString(2131953984));
            A01.A2k();
            A01.A2c();
            4YU.A1N(A01, 2RH.A05);
            4YU.A1M(A01, 2RH.A07);
            7zO.A1K(A01, 2RH.A03);
            r314 = A01.A2W();
        }
        2cM A0i = 7zM.A0i(r302);
        7zO.A1G(A0i, 2RH.A05);
        A0i.A2e(r314);
        8TI A00 = 8oZ.A00(r302);
        7zO.A1K(A00, 2RH.A03);
        8oZ r0 = A00.A01;
        r0.A01 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        A00.A2Z(migColorScheme);
        r0.A0J = 4YU.A0E(r302).getString(2131967397);
        r0.A04 = 3;
        r0.A03 = 3;
        r0.A0O = true;
        r0.A02 = 200;
        r0.A0A = 1LI.A09(r302, B0v.class, "ChannelEditingLayout", 185501895);
        r0.A0I = str;
        A00.A1w(c2iw);
        return 7zL.A0V(A0i, A00.A2W());
    }

    @Override // X.DJa
    public 2cL AKS(FbUserSession fbUserSession, 1Iw r303, C0E c0e, MigColorScheme migColorScheme, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        2cM A00 = 2cK.A00(r303);
        A00.A0e();
        4YU.A1N(A00, 2RH.A03);
        1Im A09 = 1LI.A09(r303, B0v.class, "ChannelEditingLayout", 1620391348);
        int i = 6;
        if (z2) {
            i = 134217728;
        }
        return 7zL.A0V(A00, new QI4(r303, A09, migColorScheme, (CharSequence) null, str2, (String) null, i));
    }

    @Override // X.DJa
    public /* synthetic */ 1LI AL6(1Iw r302, C0E c0e, Bkl bkl, MigColorScheme migColorScheme, C2fr c2fr) {
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
