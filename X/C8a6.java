package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8a6, reason: invalid class name */
/* loaded from: 8a6.class */
public final class C8a6 extends 1LH {
    public final MigColorScheme A00;
    public final AXF A01;
    public final int A02;
    public final boolean A03;

    public C8a6(MigColorScheme migColorScheme, AXF axf, int i, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A01 = axf;
        this.A02 = i;
        this.A03 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1u2 A0G = 7zS.A0G(c2k5, 0);
        55M r306 = null;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        int i = this.A02;
        1Iw AeS = A0U.AeS();
        C5yw A00 = C5yv.A00(AeS);
        Context context = AeS.A0D;
        A00.A2f(4YV.A0o(context.getResources(), i, 2131820567));
        MigColorScheme migColorScheme = this.A00;
        A00.A2b(migColorScheme);
        A00.A2X();
        C9zj.A04(A00, this, ActionId.VIDEO_PLAYING);
        A00.A2i(false);
        A00.A2h(false);
        7zN.A1R(A0U, A00);
        if (this.A03) {
            55N A002 = 55M.A00(AeS);
            AnonymousClass557 A0p = 7zL.A0p();
            7zU.A1S(A0p, A0U, 2131955640);
            A0p.A05(migColorScheme);
            7zV.A0f(context, A0G, A0p, migColorScheme);
            C9ye.A03(A0p, this, 78);
            r306 = 7zU.A0U(A002, A0p);
        }
        A0U.A00(r306);
        55N A003 = 55M.A00(AeS);
        AnonymousClass557 A0p2 = 7zL.A0p();
        7zU.A1S(A0p2, A0U, 2131955641);
        A0p2.A05(migColorScheme);
        7zV.A0f(context, A0G, A0p2, migColorScheme);
        C9ye.A03(A0p2, this, 79);
        7zU.A1I(A0U, A0p2.A00(), A003);
        return 7zU.A0H(A0U);
    }
}
