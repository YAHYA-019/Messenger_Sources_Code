package X;

import android.content.res.Resources;
import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* loaded from: B08.class */
public final class B08 extends C1rj {
    public static final MigColorScheme A04 = LightColorScheme.A00();
    public Bg1 A00;
    public MigColorScheme A01;
    public String A02;
    public String A03;

    public B08() {
        super("OmnipickerNameCardLayout");
        this.A01 = A04;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A03, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2K3 r312;
        String str = this.A03;
        String str2 = this.A02;
        MigColorScheme migColorScheme = this.A01;
        1BK.A1J(r302, 0, migColorScheme);
        2cM A0f = AbH.A0f(r302, 0);
        DuQ A00 = Dzj.A00(r302, 0);
        A00.A1H(0);
        A00.A01.A0F = migColorScheme.B4i();
        int B36 = migColorScheme.B36();
        Dzj dzj = A00.A01;
        dzj.A06 = B36;
        dzj.A0L = Layout.Alignment.ALIGN_CENTER;
        A00.A2W(17.0f);
        A00.A0E("omnipicker_name_card_tag");
        1Im A09 = 1LI.A09(r302, B08.class, "OmnipickerNameCardLayout", 427839100);
        Dzj dzj2 = A00.A01;
        dzj2.A0P = A09;
        if (str == null || str.length() == 0) {
            dzj2.A0T = 7zL.A12(A00, 2131962472);
        } else {
            dzj2.A0V = str;
        }
        AtU A002 = B0s.A00(r302);
        C83g A003 = C02413v4.A00(r302);
        A003.A2Z(2MQ.A38);
        A003.A2X();
        A003.A2e(migColorScheme);
        A002.A2b(A003.A2V());
        A002.A2Y(40.0f);
        A002.A00.A07 = C1ro.CENTER;
        DuQ.A06(A00);
        A00.A0J();
        A002.A2a(A00.A01);
        A002.A2W(7zL.A02());
        7zO.A1K(A002, 2RH.A05);
        A002.A0l(60.0f);
        A002.A0J();
        B0s b0s = A002.A00;
        11T.A0A(b0s);
        A0f.A2e(b0s);
        if (str2 == null || str2.length() == 0) {
            r312 = null;
        } else {
            Resources A0C = 4YU.A0C(r302.A0D);
            2KD A0Y = 7zN.A0Y(r302, false);
            A0Y.A2z(4YU.A0u(A0C, str2, 2131962442));
            A0Y.A2k();
            A0Y.A2d();
            A0Y.A2x(migColorScheme);
            7zO.A1K(A0Y, 2RH.A06);
            A0Y.A1B(10.0f);
            r312 = A0Y.A2W();
        }
        return 7zL.A0V(A0f, r312);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 427839100) {
            return null;
        }
        1Is r0 = r302.A00.A01;
        String str = ((C9Mz) obj).A01;
        Bg1 bg1 = ((B08) r0).A00;
        11T.A0F(str, 1);
        if (bg1 == null) {
            return null;
        }
        B7D b7d = bg1.A00;
        b7d.A0M = str;
        B7D.A0O(b7d, b7d.A0K, true);
        return null;
    }
}
