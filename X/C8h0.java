package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8h0, reason: invalid class name */
/* loaded from: 8h0.class */
public final class C8h0 extends 1LH {
    public static final long A07 = Double.doubleToRawLongBits(1.0d);
    public final Aaj A00;
    public final 2Qz A01;
    public final HighlightsFeedContent A02;
    public final FbUserSession A03;
    public final C9yk A04;
    public final MigColorScheme A05;
    public final Function1 A06;

    public C8h0(FbUserSession fbUserSession, Aaj aaj, 2Qz r304, HighlightsFeedContent highlightsFeedContent, C9yk c9yk, MigColorScheme migColorScheme, Function1 function1) {
        11T.A0F(migColorScheme, 2);
        7zT.A11(3, aaj, c9yk, r304, fbUserSession);
        11T.A0F(function1, 7);
        this.A02 = highlightsFeedContent;
        this.A05 = migColorScheme;
        this.A00 = aaj;
        this.A04 = c9yk;
        this.A01 = r304;
        this.A03 = fbUserSession;
        this.A06 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        C2sn A0U = 7zQ.A0U(7zL.A0X(c2k5));
        A0U.A00(new C8f3(null, 2132279342));
        2lQ r0 = 2lO.A02;
        Context A00 = 3vP.A00(A0U);
        MigColorScheme migColorScheme = this.A05;
        8Be r02 = new 8Be(A00, 18.0f, 0, migColorScheme.Atp(), 7zO.A04(A0U, A07));
        Integer num = 0S2.A00;
        2lO A0K = 4YV.A0K(4YV.A0L((2lO) null, num, r02, 1), 0S2.A06, 3yH.A04(A0U));
        C2sn A0K2 = 7zS.A0K(A0U);
        HighlightsFeedContent highlightsFeedContent = this.A02;
        Aaj aaj = this.A00;
        C9yk c9yk = this.A04;
        A0K2.A00(new 8dI(this.A03, aaj, this.A01, highlightsFeedContent, c9yk, migColorScheme, this.A06, 7zP.A08()));
        2lO A0R = 7zR.A0R(7zT.A0P(4YV.A0K(4YV.A0L((2lO) null, num, new 8Be(3vP.A00(A0K2), 10.0f, migColorScheme.B9I(), 0, 1), 1), 0S2.A08, 3yH.A04(A0K2)), 3yH.A04(A0K2), 3yH.A02(A0K2)), AV6.A00(A0K2, this, 26), 1);
        C2sn A0K3 = 7zS.A0K(A0K2);
        2KD A0r = 7zL.A0r(A0K3, 0);
        7zR.A1J(migColorScheme, A0r, A0K3, 2131958514);
        A0r.A2b();
        A0r.A2f();
        A0r.A2X();
        A0r.A2Z();
        A0r.A2a();
        7zS.A1O(A0K3, A0K2, A0R, A0r);
        7zN.A1I(A0K2, A0U, A0K);
        return new C1rh(null, null, null, null, A0U.A01, false);
    }
}
