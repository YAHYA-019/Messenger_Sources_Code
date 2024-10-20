package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityCreationState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Axi, reason: case insensitive filesystem */
/* loaded from: Axi.class */
public final class C1953Axi extends 1LH {
    public final LifecycleOwner A00;
    public final 1pI A01;
    public final CPh A02;
    public final 2MX A03;
    public final MigColorScheme A04;
    public final Long A05;
    public final String A06;

    public C1953Axi(LifecycleOwner lifecycleOwner, 1pI r303, CPh cPh, 2MX r305, MigColorScheme migColorScheme, Long l, String str) {
        11T.A0F(migColorScheme, 1);
        this.A04 = migColorScheme;
        this.A01 = r303;
        this.A02 = cPh;
        this.A00 = lifecycleOwner;
        this.A06 = str;
        this.A03 = r305;
        this.A05 = l;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, DCc.A00);
        1Iw r0 = c2k5.A05;
        C5yw A002 = C5yv.A00(r0);
        A002.A2f(3yH.A09(c2k5, 2131958895));
        CommunityCreationState A003 = CPh.A00(this.A02);
        A002.A01.A0A = A003 != null ? A003.A09 : null;
        A002.A2j(false);
        MigColorScheme migColorScheme = this.A04;
        A002.A2b(migColorScheme);
        CxE.A01(A002, this, 36);
        A002.A2i(false);
        11T.A0A(r0.A0D);
        7zQ.A0Q().Ciz(new D7X(A00, this));
        C9lC A004 = C9lC.A00();
        A004.A04(3yH.A09(c2k5, 2131958907));
        11T.A0F(migColorScheme, 0);
        A004.A01 = migColorScheme;
        A004.A05 = 7zP.A1V(A00);
        A002.A2e(Cx1.A00(A004, this, 16));
        return A002.A2V();
    }
}
