package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8fa, reason: invalid class name */
/* loaded from: 8fa.class */
public final class C8fa extends 1LH {
    public final 9Kf A00;
    public final C9c6 A01;
    public final MigColorScheme A02;

    public C8fa(9Kf r302, C9c6 c9c6, MigColorScheme migColorScheme) {
        11T.A0F(r302, 2);
        this.A02 = migColorScheme;
        this.A00 = r302;
        this.A01 = c9c6;
    }

    private final 55M A01(C2k5 c2k5, C2lh c2lh) {
        55N A00 = 55M.A00(c2k5.A05);
        2K8 r0 = 2K5.A04;
        String A09 = 3yH.A09(c2k5, this.A01.A00.labelId);
        String A092 = 3yH.A09(c2k5, 2131967011);
        return 7zM.A10(new C55c(new 9pX(4, c2lh, this, c2k5), null, r0, this.A02, null, A09, A092, null, null, 1, 0L, 7zP.A1V(c2lh)), A00);
    }

    public 1LI A0s(C2k5 c2k5) {
        8Ud r305;
        11T.A0F(c2k5, 0);
        C9c6 c9c6 = this.A01;
        List A02 = C9iJ.A02(c9c6.A01, c2k5);
        AnonymousClass960 anonymousClass960 = (AnonymousClass960) C9iJ.A00(c9c6.A02, c2k5);
        if (anonymousClass960 == null) {
            anonymousClass960 = AnonymousClass960.A03;
        }
        C2lh A0e = 7zL.A0e(c2k5, ANq.A00);
        MigColorScheme migColorScheme = this.A02;
        2lO A0h = 7zS.A0h(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1);
        C2sn A0L = 7zR.A0L(c2k5);
        C5yw A0W = 7zU.A0W(A0L.AeS(), migColorScheme, false);
        7zM.A1Y(A0W, A0L, 2131967010);
        A0W.A2Y();
        C9zj.A02(A0L, A0W, this, 98);
        int ordinal = anonymousClass960.ordinal();
        if (ordinal == 0) {
            r305 = new 8Uf(migColorScheme);
        } else if (ordinal != 1) {
            55M A01 = A01(c2k5, A0e);
            if (ordinal != 2) {
                A0L.A00(A01);
                r305 = new C8W4(migColorScheme, A02);
            } else {
                A0L.A00(A01);
                r305 = new 8Ud(migColorScheme);
            }
        } else {
            r305 = new C8W3(c9c6, migColorScheme);
        }
        return 7zM.A0l(r305, A0L, c2k5, A0h);
    }
}
