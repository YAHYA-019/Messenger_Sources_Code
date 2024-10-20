package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Ax4, reason: case insensitive filesystem */
/* loaded from: Ax4.class */
public final class C1939Ax4 extends 1LH {
    public final Function1 A00;
    public final boolean A01;
    public final MigColorScheme A02;

    public C1939Ax4(MigColorScheme migColorScheme, Function1 function1, boolean z) {
        11T.A0F(function1, 3);
        this.A02 = migColorScheme;
        this.A01 = z;
        this.A00 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        55N A00 = 55M.A00(c2k5.A05);
        AnonymousClass557 A0p = 7zL.A0p();
        A0p.A00 = 1320780515L;
        A0p.A03(C5z6.A01(3yH.A09(c2k5, 2131952764), 3));
        boolean z = this.A01;
        int i = 2131952763;
        if (z) {
            i = 2131952762;
        }
        CJh.A02(A0p, 3yH.A09(c2k5, i));
        AbL.A15(A0p, this.A02, "AllowMembersToInviteToggleId", z);
        Cvn.A03(A0p, this, 27);
        return 7zU.A0U(A00, A0p);
    }
}
