package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Az5.class */
public final class Az5 extends C1rj {
    public FbUserSession A00;
    public EeG A01;

    public Az5() {
        super("CoplayE2eeDisclaimerViewLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        11T.A0F(r302, 0);
        Context context = r302.A0D;
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(context, 16980);
        08O A0l = 7zR.A0l();
        C1830Au3 c1830Au3 = new C1830Au3(r302, new AzA());
        C1u7 c1u7 = C1u7.A0C;
        AzA azA = c1830Au3.A01;
        azA.A01 = c1u7;
        BitSet bitSet = c1830Au3.A02;
        bitSet.set(3);
        azA.A03 = false;
        bitSet.set(2);
        azA.A00 = BOX.A01;
        bitSet.set(0);
        azA.A02 = A0l;
        bitSet.set(1);
        C1rs.A02(bitSet, c1830Au3.A03);
        c1830Au3.A0J();
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C1ro c1ro = C1ro.CENTER;
        A01.A2g(c1ro);
        AbG.A1N(A01, r302, Az5.class, "CoplayE2eeDisclaimerViewLayout", 936280750);
        A01.A2c();
        Drawable drawable = context.getDrawable(2132475954);
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A17(16.0f);
        A00.A2a(drawable);
        A00.A0z(48.0f);
        A00.A0l(48.0f);
        7zN.A1B(A01, A00);
        String A0D = r302.A0D(2131955050);
        2KD A002 = 2K3.A00(r302);
        A002.A17(12.0f);
        A002.A16(11.0f);
        A002.A0L();
        A002.A2x(migColorScheme);
        A002.A2z(A0D);
        A002.A2e();
        A002.A2f();
        A002.A0S();
        4YU.A1K(A01, A002);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        A012.A17(12.0f);
        7zO.A1C(A012, A01, azA);
        C1rq A013 = C1rg.A01(r302, null, 0);
        A013.A17(16.0f);
        8TG A003 = Dyd.A00(r302);
        A003.A2X(migColorScheme);
        A003.A01.A00 = 1LI.A09(r302, Az5.class, "CoplayE2eeDisclaimerViewLayout", -1370976166);
        A013.A2f(A003.A2W());
        String A0D2 = r302.A0D(2131955048);
        2KD A014 = 2K3.A01(r302, 0);
        A014.A16(11.0f);
        A014.A1y(c1ro);
        A014.A2x(migColorScheme);
        A014.A2z(A0D2);
        A014.A2w(c1u7);
        A014.A2n();
        A014.A0S();
        7zN.A1T(A013, A014);
        7zL.A1I(A01, A013);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C6J A00;
        int i = r302.A01;
        if (i == -1370976166) {
            1Is r0 = r302.A00.A01;
            boolean z = ((Ehh) obj).A01;
            EeG eeG = ((Az5) r0).A01;
            11T.A0F(eeG, 1);
            E1r e1r = eeG.A00;
            e1r.A02 = z;
            A00 = CNQ.A00(e1r);
            A00.A01 = BOX.A01;
            A00.A00 = BOh.A0C;
        } else {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 936280750) {
                return null;
            }
            1Iv r02 = r302.A00;
            1Is r03 = r02.A01;
            1Iw r04 = r02.A00;
            FbUserSession fbUserSession = ((Az5) r03).A00;
            11T.A0H(r04, fbUserSession);
            A00 = ((CNQ) 7zQ.A12(r04, 85227)).A03(fbUserSession);
            A00.A01 = BOX.A01;
        }
        A00.A00();
        return null;
    }
}
