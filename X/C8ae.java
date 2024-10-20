package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8ae, reason: invalid class name */
/* loaded from: 8ae.class */
public final class C8ae extends 1LH {
    public final MigColorScheme A00;
    public final String A01;
    public final C00m A02;
    public final C00m A03;
    public final boolean A04;

    public C8ae(MigColorScheme migColorScheme, String str, C00m c00m, C00m c00m2, boolean z) {
        7zS.A17(2, str, c00m, c00m2);
        this.A00 = migColorScheme;
        this.A01 = str;
        this.A04 = z;
        this.A03 = c00m;
        this.A02 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0g = 7zL.A0g((2lO) null, 7zO.A0X(0S2.A01));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        8Tn A00 = C8nn.A00(AeS);
        MigColorScheme migColorScheme = this.A00;
        A00.A2a(migColorScheme);
        Context context = AeS.A0D;
        0Dc A0P = 7zP.A0P(context);
        A0P.A02(3yH.A09(A0L, 2131966862));
        A0P.A02("\n");
        A0P.A02(3yH.A0A(A0L, this.A01, 2131966863));
        String A02 = 11T.A02(7zM.A0E(A0P));
        2qR r0 = 9GI.A02;
        11T.A0F(migColorScheme, A1W ? 1 : 0);
        C9py c9py = null;
        C8xf A002 = C8xf.A00(7zS.A02(9GI.A00, migColorScheme));
        List A0v = 7zN.A0v(new 8Ll(C1u3.A3C, (CharSequence) null, 3yH.A09(A0L, 2131966859), (String) null, 10), 8Ll.A00(C1u3.A4l, A0L, 2131966860, 10), new 8Ll(C1u3.A0q, (CharSequence) null, 9Bf.A00(4YU.A0C(3vP.A00(A0L)), migColorScheme, 7zT.A0w(context, A0L, 2131966861), "https://www.messenger.com/help/2750564398424947", "[[Learn more]]", 3yH.A09(A0L, 2131966847)), (String) null, 10));
        String A09 = 3yH.A09(A0L, 2131966845);
        C9py A03 = C9py.A03(this, 56);
        if (this.A04) {
            str = 3yH.A09(A0L, 2131966858);
            c9py = C9py.A03(AV4.A00(this, 5), 57);
        } else {
            str = null;
        }
        A00.A2Y(new 8NJ(new 8Lf(A03, c9py, A09, str), A002, (CharSequence) null, (CharSequence) null, A02, A0v, A1W));
        return 8Tn.A06(A0L, c2k5, A0g, A00);
    }
}
