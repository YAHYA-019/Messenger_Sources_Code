package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8c9, reason: invalid class name */
/* loaded from: 8c9.class */
public final class C8c9 extends 1LH {
    public final View A00;
    public final FbUserSession A01;
    public final C1u2 A02;
    public final Aaf A03;
    public final MigColorScheme A04;
    public final String A05;

    public C8c9(View view, FbUserSession fbUserSession, C1u2 c1u2, Aaf aaf, MigColorScheme migColorScheme, String str) {
        11T.A0F(c1u2, 3);
        this.A01 = fbUserSession;
        this.A04 = migColorScheme;
        this.A02 = c1u2;
        this.A00 = view;
        this.A05 = str;
        this.A03 = aaf;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1ro c1ro = C1ro.CENTER;
        C2sn A0L = 7zR.A0L(c2k5);
        C2cq A0n = 7zL.A0n(A0L, 0);
        7zM.A1I(C1u3.A2N, this.A02, A0n, this.A04.B9O());
        7zP.A10(A0n);
        7zN.A1E(A0n, A0L, 2131952083);
        7zR.A1A(A0n, AVH.A00(A0L, this, 32));
        7zN.A1O(A0L, A0n);
        return new 2cL((C1ro) null, c1ro, (C1rp) null, (EnumC00743oh) null, A0L.A01, false);
    }
}
