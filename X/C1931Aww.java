package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aww, reason: case insensitive filesystem */
/* loaded from: Aww.class */
public final class C1931Aww extends 1LH {
    public final MigColorScheme A00;
    public final C8d A01;

    public C1931Aww(C8d c8d, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A01 = c8d;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C8d c8d = this.A01;
        if (c8d == null) {
            return null;
        }
        1Iw r0 = c2k5.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        11T.A0F(r0, 1);
        List list = c8d.A08;
        if (list != null) {
            2rQ r02 = new 2rQ((List) null, list);
            2rS A00 = 2rR.A00(r0);
            A00.A2c(r02);
            A00.A2d(true);
            A00.A2a(3);
            A00.A2Z(60.0f);
            A00.A2Y(12.0f);
            A00.A2b(this.A00);
            A00.A0L();
            4YU.A1N(A00, 2RH.A06);
            A0s.add(A00.A2W());
        }
        2KD A01 = 2K3.A01(r0, 0);
        A01.A2z(c8d.A07);
        A01.A2M(true);
        A01.A2g();
        A01.A2b();
        MigColorScheme migColorScheme = this.A00;
        A01.A2x(migColorScheme);
        A01.A2X();
        2RH r03 = 2RH.A03;
        7zO.A1K(A01, r03);
        7zO.A1I(A01, 2RH.A04);
        A0s.add(A01.A2W());
        2KD A012 = 2K3.A01(r0, 0);
        A012.A30(true);
        7zQ.A1T(A012, c8d.A04);
        A012.A2x(migColorScheme);
        A012.A2X();
        7zO.A1K(A012, r03);
        4YU.A1M(A012, 2RH.A06);
        A0s.add(A012.A2W());
        C1ro c1ro = C1ro.CENTER;
        2lQ r04 = 2lO.A02;
        2lO A04 = C82m.A04(4YV.A0K((2lO) null, 0S2.A04, 4YV.A06(r03)), 0S2.A00, 100.0f, 0);
        ArrayList A0s2 = AnonymousClass001.A0s();
        8TV A002 = C8ns.A00(r0);
        A002.A2Z(c8d.A05);
        A002.A01.A03 = c8d.A00;
        A002.A2Y(migColorScheme);
        2RH r05 = 2RH.A05;
        4YU.A1M(A002, r05);
        A0s2.add(A002.A2W());
        8TV A003 = C8ns.A00(r0);
        A003.A2Z(c8d.A06);
        7zL.A1J(A003);
        86K r06 = 86K.A02;
        C8ns c8ns = A003.A01;
        c8ns.A04 = r06;
        c8ns.A03 = c8d.A01;
        A003.A2Y(migColorScheme);
        4YU.A1M(A003, r05);
        A0s2.add(A003.A2W());
        2cL r07 = new 2cL(c1ro, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0s2, false);
        A04.A01(r07.A0v(), r0);
        A0s.add(r07);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0s, false);
    }
}
