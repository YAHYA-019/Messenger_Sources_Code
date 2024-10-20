package X;

import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.48u, reason: invalid class name */
/* loaded from: 48u.class */
public final class C48u extends 1LH {
    public final int A00;
    public final int A01;
    public final 3JG A02;
    public final MigColorScheme A03;

    public C48u(3JG r302, MigColorScheme migColorScheme, int i) {
        11T.A0F(r302, 2);
        this.A03 = migColorScheme;
        this.A02 = r302;
        this.A01 = i;
        this.A00 = 2131957862;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1ro c1ro = C1ro.CENTER;
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A03;
        2lO r02 = new 2lO(new 2lO((2lO) null, new C2xi(0S2.A00, new ColorDrawable(migColorScheme.BDl()), 1)), new 2lT(0S2.A01, 1.0f));
        C1rp c1rp = C1rp.CENTER;
        C2sn c2sn = new C2sn(c2k5.A05, new ArrayList());
        1Iw AeS = c2sn.AeS();
        2KD A01 = 2K3.A01(AeS, 0);
        A01.A32(false);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        A01.A2s(alignment);
        A01.A2r(this.A01);
        A01.A2y(2KE.A04);
        A01.A2w(C1u7.A08);
        A01.A2x(migColorScheme);
        C26z c26z = C26z.VERTICAL;
        2RH r03 = 2RH.A05;
        A01.A25(c26z, r03.A00());
        c2sn.A00(A01.A2W());
        2KD A012 = 2K3.A01(AeS, 0);
        A012.A32(false);
        A012.A2s(alignment);
        A012.A2r(this.A00);
        A012.A2y(2KE.A05);
        A012.A2w(C1u7.A06);
        A012.A2x(migColorScheme);
        A012.A2N(true);
        A012.A2T(new 3vS(new C4O1(this, 3), (Object[]) null, -1));
        A012.A25(c26z, r03.A00());
        A012.A25(C26z.START, 2RH.A07.A00());
        c2sn.A00(A012.A2W());
        return C2so.A0U(c2sn, c2k5, r02, null, c1ro, c1rp, null, false);
    }
}
