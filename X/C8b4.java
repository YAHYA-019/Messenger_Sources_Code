package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.8b4, reason: invalid class name */
/* loaded from: 8b4.class */
public final class C8b4 extends 1LH {
    public final 9Oh A00;
    public final MigColorScheme A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C8b4(9Oh r302, MigColorScheme migColorScheme, String str, String str2, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A00 = r302;
        this.A04 = z;
        this.A03 = str;
        this.A02 = str2;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1u2 A0G = 7zS.A0G(c2k5, 0);
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        1Iw r02 = c2k5.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        11T.A0F(r02, 1);
        A0s.add(new 8Vu(A0G, migColorScheme));
        A0s.add(new 8UX(migColorScheme));
        A0s.add(new 8Xm(migColorScheme, this.A03, this.A02));
        boolean z = this.A04;
        2KD A01 = 2K3.A01(r02, 0);
        int i = 2131954053;
        if (z) {
            i = 2131954051;
        }
        A01.A2r(i);
        A01.A2i();
        7zQ.A1O(migColorScheme, A01);
        A01.A17(36.0f);
        2RH r03 = 2RH.A03;
        7zO.A1K(A01, r03);
        7zQ.A1X(A01, A0s);
        C1ro c1ro = C1ro.CENTER;
        ArrayList A0s2 = AnonymousClass001.A0s();
        8Th A00 = C8nq.A00(r02);
        int i2 = 2131954052;
        if (z) {
            i2 = 2131954050;
        }
        A00.A2X(i2);
        A00.A0R();
        A00.A0h(0.0f);
        A00.A2Z(migColorScheme);
        4YU.A1N(A00, 2RH.A04);
        7zO.A1K(A00, r03);
        7zS.A1M(A00, (2lO) null, 0S2.A1G, new AR2(this, 22), 1);
        A0s2.add(A00.A2W());
        A0s.add(new C1rh(null, c1ro, null, null, A0s2, false));
        2cL r04 = new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0s, false);
        7zM.A1P(c2k5.AeS(), r04, A0g);
        return r04;
    }
}
