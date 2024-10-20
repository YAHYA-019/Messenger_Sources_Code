package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8br, reason: invalid class name */
/* loaded from: 8br.class */
public final class C8br extends 1LH {
    public final 8Lf A00;
    public final RFD A01;
    public final 9Di A02;
    public final MigColorScheme A03;
    public final String A04;
    public final String A05;

    public C8br(8Lf r302, RFD rfd, 9Di r304, MigColorScheme migColorScheme, String str, String str2) {
        1BL.A1H(migColorScheme, str, str2);
        11T.A0F(rfd, 6);
        this.A03 = migColorScheme;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r302;
        this.A02 = r304;
        this.A01 = rfd;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        2lQ r0 = 2lO.A02;
        C1ro c1ro = C1ro.FLEX_START;
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, c1ro, 0));
        1Iw AeS = A0L.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        8Tl A00 = C5hr.A00(A0U.A00);
        A00.A2X(C5hs.LARGE);
        MigColorScheme migColorScheme = this.A03;
        A00.A2Y(migColorScheme);
        7zR.A1A(A00, new DD4(this, 42));
        2RH r02 = 2RH.A03;
        7zO.A1H(A00, r02);
        4YU.A1M(A00, r02);
        7zQ.A1F(A00.A2W(), A0U, A0L, A0g);
        2lO A0L2 = 4YV.A0L((2lO) null, num, C1ro.CENTER, 0);
        C2sn A0U2 = 7zQ.A0U(AeS);
        8Tn A09 = 8Tn.A09(A0U2.A00, migColorScheme);
        String str = this.A05;
        String str2 = this.A04;
        7zQ.A1F(8Tn.A0A(A09, new 8NJ(this.A00, this.A02, str2, (CharSequence) null, str, (List) null, true)), A0U2, A0L, A0L2);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0L.A01, false);
    }
}
