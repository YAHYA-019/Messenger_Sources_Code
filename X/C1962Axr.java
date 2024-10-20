package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.List;

/* renamed from: X.Axr, reason: case insensitive filesystem */
/* loaded from: Axr.class */
public final class C1962Axr extends 1LH {
    public final View.OnClickListener A00;
    public final BdP A01;
    public final MigColorScheme A02;
    public final boolean A03;
    public final boolean A04;
    public final FbUserSession A05;
    public final 2YW A06;
    public final 2Vk A07;
    public final List A08;

    public C1962Axr(View.OnClickListener onClickListener, FbUserSession fbUserSession, BdP bdP, 2YW r305, 2Vk r306, MigColorScheme migColorScheme, List list, boolean z, boolean z2) {
        11T.A0F(migColorScheme, 1);
        7zS.A18(5, r306, bdP, onClickListener);
        this.A02 = migColorScheme;
        this.A05 = fbUserSession;
        this.A08 = list;
        this.A06 = r305;
        this.A07 = r306;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = bdP;
        this.A00 = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [android.text.SpannableString] */
    public 1LI A0s(C2k5 c2k5) {
        String A09;
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A01;
        2lO A03 = C82m.A03(null, new C2xi(num, true, 1), num, A1W ? 1 : 0);
        MigColorScheme migColorScheme = this.A02;
        int BDl = migColorScheme.BDl();
        Integer num2 = 0S2.A00;
        2lO A0a = 7zS.A0a(A03, num2, BDl);
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0Z = 7zQ.A0Z((2lO) null, num2, new DD4(this, 44));
        C2sn A0J = 7zS.A0J(A0L);
        55N A00 = 55M.A00(A0J.A00);
        int i = 9GF.A00;
        int i2 = 9GF.A01;
        LightColorScheme.A00();
        boolean z = this.A03;
        if (z) {
            EC2 A01 = ((CFx) 1Bn.A0A(67680)).A01(3vP.A00(A0J), this.A00, migColorScheme);
            0Dc A0P = 7zP.A0P(3vP.A00(A0J));
            int i3 = 2131966478;
            if (this.A04) {
                i3 = 2131966479;
            }
            A0P.A01(i3);
            A0P.A05(A01, "[[learn more]]", 3yH.A09(A0J, 2131966483), 33);
            A09 = 7zM.A0E(A0P);
        } else {
            int i4 = 2131966484;
            if (this.A04) {
                i4 = 2131966477;
            }
            A09 = 3yH.A09(A0J, i4);
        }
        7zU.A1I(A0J, new C55g(C1u7.A0A, migColorScheme, 2KE.A02, A09, i, i2, i2, -1, z), A00);
        A0L.A00(C2so.A0I(A0J, A0L, A0Z));
        1Iw r0 = A0L.A00;
        C2ki A002 = C2kV.A00(r0);
        A002.A2j(true);
        7zL.A1K(r0);
        2Yt r02 = new 2Yt();
        r02.A06 = migColorScheme;
        r02.A00 = this.A05;
        r02.A08 = this.A08;
        r02.A02 = this.A06;
        r02.A07 = C1311Ado.A00;
        r02.A03 = this.A07;
        A002.A2d(r02);
        A002.A0Q();
        return 7zM.A0l(A002.A2W(), A0L, c2k5, A0a);
    }
}
