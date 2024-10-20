package X;

import android.content.Context;
import android.text.SpannableString;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.8cy, reason: invalid class name */
/* loaded from: 8cy.class */
public final class C8cy extends 1LH {
    public final 06Z A00;
    public final FbUserSession A01;
    public final Message A02;
    public final ThreadSummary A03;
    public final C9P5 A04;
    public final 5zD A05;
    public final boolean A06;

    public C8cy(06Z r302, FbUserSession fbUserSession, 5zD r304, Message message, ThreadSummary threadSummary, C9P5 c9p5, boolean z) {
        this.A01 = fbUserSession;
        this.A05 = r304;
        this.A06 = z;
        this.A04 = c9p5;
        this.A00 = r302;
        this.A02 = message;
        this.A03 = threadSummary;
    }

    public 1LI A0s(C2k5 c2k5) {
        Integer num;
        2lO A0L;
        long A06;
        Integer num2;
        11T.A0F(c2k5, 0);
        CFx A0o = 7zQ.A0o();
        Context A00 = 3vP.A00(c2k5);
        5zD r0 = this.A05;
        EC2 A01 = A0o.A01(A00, 83S.A00(this, 34), 5zD.A00(r0));
        0Dc A0P = 7zP.A0P(3vP.A00(c2k5));
        A0P.A01(2131963948);
        SpannableString A0B = 7zS.A0B(A0P, A01, "[[prompt]]", 3yH.A09(c2k5, 2131963949));
        1Iw r02 = c2k5.A05;
        2KD A012 = 2K3.A01(r02, 0);
        7zQ.A1S(A012, A0B);
        7zN.A1V(r0, A012);
        2K3 A2W = A012.A2W();
        2lQ r03 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A08, 7zO.A09());
        if (this.A06) {
            C1ro c1ro = C1ro.FLEX_END;
            num = 0S2.A00;
            A0L = 4YV.A0L(A0g, num, c1ro, 0);
            A06 = 7zM.A08(c2k5);
            num2 = 0S2.A09;
        } else {
            C1ro c1ro2 = C1ro.FLEX_START;
            num = 0S2.A00;
            A0L = 4YV.A0L(A0g, num, c1ro2, 0);
            A06 = 3yH.A06(c2k5, 2132279328);
            num2 = 0S2.A07;
        }
        return 7zT.A0F(A2W, r02, c2k5, 4YV.A0K(A0L, num2, A06), new 3vR(num, AV3.A00(this, 43)));
    }
}
