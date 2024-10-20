package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Az3.class */
public final class Az3 extends C1rj {
    public FbUserSession A00;
    public C2kx A01;

    public Az3() {
        super("CoplayDrawerAppSectionError");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        boolean A1X = 1BL.A1X(r302, fbUserSession);
        Context context = r302.A0D;
        CNQ cnq = (CNQ) 7zN.A0k(context, 85227);
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(context, 16980);
        C6J A03 = cnq.A03(fbUserSession);
        A03.A01 = BOX.A05;
        A03.A00 = BOh.A01;
        A03.A00();
        2cM A0f = AbH.A0f(r302, 0);
        A0f.A1B(76.0f);
        A0f.A1C(24.0f);
        A0f.A2b();
        2KD A0Y = 7zN.A0Y(r302, false);
        A0Y.A2X();
        7zN.A1F(r302, A0Y, 2131964878);
        A0Y.A2g();
        A0Y.A2d();
        A0Y.A2Z();
        A0Y.A2M(A1X);
        A0Y.A2x(migColorScheme);
        4YU.A1K(A0f, A0Y);
        2KD A0Y2 = 7zN.A0Y(r302, false);
        A0Y2.A2X();
        7zQ.A1U(A0Y2, r302.A0D(2131964883));
        A0Y2.A2Z();
        A0Y2.A2M(A1X);
        A0Y2.A2x(migColorScheme);
        4YU.A1K(A0f, A0Y2);
        8Th A00 = C8nq.A00(r302);
        A00.A17(16.0f);
        A00.A2Z(migColorScheme);
        A00.A2a(r302.A0D(2131964888));
        7zN.A1D(A00, r302, Az3.class, "CoplayDrawerAppSectionError", 974949319);
        return 7zL.A0V(A0f, A00.A2W());
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 974949319) {
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        Az3 az3 = (Az3) r02;
        FbUserSession fbUserSession = az3.A00;
        C2kx c2kx = az3.A01;
        7zT.A1S(r03, fbUserSession, c2kx);
        C6J A02 = ((CNQ) 7zQ.A12(r03, 85227)).A02(BOk.A01, fbUserSession);
        A02.A01 = BOX.A05;
        A02.A00 = BOh.A01;
        A02.A00();
        c2kx.A09(false);
        return null;
    }
}
