package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8de, reason: invalid class name */
/* loaded from: 8de.class */
public final class C8de extends 1LH {
    public final C1qb A00;
    public final 1Va A01;
    public final C5n8 A02;
    public final 7Kx A03;
    public final 72D A04;
    public final 1LI A05;
    public final MigColorScheme A06;
    public final boolean A07;

    public C8de(1LI r302, C1qb c1qb, MigColorScheme migColorScheme, 1Va r305, C5n8 c5n8, 7Kx r307, 72D r308, boolean z) {
        11T.A0F(c5n8, 2);
        this.A00 = c1qb;
        this.A02 = c5n8;
        this.A05 = r302;
        this.A06 = migColorScheme;
        this.A04 = r308;
        this.A03 = r307;
        this.A01 = r305;
        this.A07 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C5n8 c5n8 = this.A02;
        8Nx AxW = c5n8.AxW(C5kl.A00);
        if (AxW == null) {
            return null;
        }
        List list = (List) AQs.A00(c2k5, AxW, this, new Object[]{AxW.A01, c5n8}, 24);
        long doubleToRawLongBits = Double.doubleToRawLongBits(this.A07 ? 14.0d : (7zL.A02() * 2) + 28);
        2lQ r0 = 2lO.A02;
        2lO A0L = 4YV.A0L(7zS.A0R((2lO) null, 1.0f), 0S2.A08, "HSCROLL_XMA_DECORATOR_KEY", 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        7zQ.A1F(this.A05, 7zS.A0J(A0L2), A0L2, 4YV.A0K((2lO) null, 0S2.A02, doubleToRawLongBits));
        return 7zM.A0l(new 8bZ(this.A00, this.A06, list, doubleToRawLongBits, 5vA.A00(c5n8)), A0L2, c2k5, A0L);
    }
}
