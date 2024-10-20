package X;

import android.text.style.ClickableSpan;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8an, reason: invalid class name */
/* loaded from: 8an.class */
public final class C8an extends 1LH {
    public final ClickableSpan A00;
    public final 9Io A01;
    public final MigColorScheme A02;
    public final boolean A03;
    public final boolean A04;

    public C8an(ClickableSpan clickableSpan, 9Io r303, MigColorScheme migColorScheme, boolean z, boolean z2) {
        11T.A0F(clickableSpan, 3);
        this.A02 = migColorScheme;
        this.A01 = r303;
        this.A00 = clickableSpan;
        this.A04 = z;
        this.A03 = z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A02;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, A1W);
        C9zj.A04(A0l, this, 61);
        A0l.A2c(this.A04 ? 2MG.A02 : 2MG.A06);
        7zM.A1W(migColorScheme, A0l);
        7zN.A1R(A0L, A0l);
        8Tn A09 = 8Tn.A09(AeS, migColorScheme);
        String A092 = 3yH.A09(A0L, 2131964508);
        C8xf A00 = C8xf.A00(7zS.A02(C9ll.A05, migColorScheme));
        List A12 = 7zO.A12(8Ll.A01(C1u3.A1B, 3yH.A09(A0L, 2131964505), 3yH.A09(A0L, 2131964503), (String) null, 8), 8Ll.A01(C1u3.A2M, 3yH.A09(A0L, 2131964506), 9C7.A00(7zQ.A0J(AeS), this.A00, 3yH.A09(A0L, 2131964504), 3yH.A09(A0L, 2131964507), "[[learn-more-backups]]"), (String) null, 8));
        int i = 2131964502;
        if (this.A03) {
            i = 2131964501;
        }
        A09.A2Y(new 8NJ(C9py.A02(3yH.A09(A0L, i), this, ActionId.NEW_START_FOUND), A00, (CharSequence) null, (CharSequence) null, A092, A12, true));
        return 8Tn.A06(A0L, c2k5, A0T, A09);
    }
}
