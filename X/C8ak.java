package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8ak, reason: invalid class name */
/* loaded from: 8ak.class */
public final class C8ak extends 1LH {
    public final C9If A00;
    public final MigColorScheme A01;
    public final boolean A02;
    public final boolean A03 = true;
    public final boolean A04;

    public C8ak(C9If c9If, MigColorScheme migColorScheme, boolean z, boolean z2) {
        this.A01 = migColorScheme;
        this.A00 = c9If;
        this.A04 = z;
        this.A02 = z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zV.A0U(migColorScheme));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, A1W);
        C9zj.A04(A0l, this, 51);
        A0l.A2c(this.A02 ? 2MG.A02 : 2MG.A03);
        7zM.A1W(migColorScheme, A0l);
        7zN.A1R(A0L, A0l);
        C8xf A00 = C8xf.A00(C9ll.A02(migColorScheme));
        String A09 = 3yH.A09(A0L, 2131956429);
        String A092 = 3yH.A09(A0L, 2131956428);
        String A093 = 3yH.A09(A0L, 2131956426);
        C9py A03 = C9py.A03(this, 100);
        C9py c9py = null;
        if (this.A03) {
            str = 3yH.A09(A0L, 2131956427);
            c9py = C9py.A03(AVJ.A01(this, 19), ActionId.ON_VIEW_CREATED_END);
        } else {
            str = null;
        }
        8Tn A08 = 8Tn.A08(AeS, new 8NJ(new 8Lf(A03, c9py, A093, str), A00, A092, (CharSequence) null, A09, (List) null, A1W), migColorScheme);
        A08.A01.A04 = this.A04;
        return 8Tn.A06(A0L, c2k5, A0g, A08);
    }
}
