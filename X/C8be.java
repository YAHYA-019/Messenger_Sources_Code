package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersiveuicomponents.permalink.HTImmersivePermalinkFragmentActivity;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8be, reason: invalid class name */
/* loaded from: 8be.class */
public final class C8be extends 1LH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C8be(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A03 = obj5;
        this.A05 = obj;
    }

    public 1LI A0s(C2k5 c2k5) {
        if (this.A00 != 0) {
            11T.A0F(c2k5, 0);
            9X8 r0 = (9X8) this.A04;
            FbUserSession fbUserSession = ((HTImmersivePermalinkFragmentActivity) this.A05).A01;
            if (fbUserSession == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            return C9dF.A01(r0.A00(fbUserSession, c2k5, (9SW) this.A01), (2R0) this.A03, (HighlightsFeedContent) this.A02);
        }
        boolean A1W = 7zL.A1W(c2k5);
        long A05 = 7zU.A05(c2k5, C9mV.A03);
        Integer num = 0S2.A01;
        2lO A0K = 4YV.A0K((2lO) null, num, A05);
        Integer num2 = 0S2.A00;
        2lO A04 = C82m.A04(A0K, num2, 100.0f, A1W ? 1 : 0);
        2lO r02 = (2lO) this.A04;
        HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) this.A01;
        HighlightsAttachmentContent highlightsAttachmentContent = (HighlightsAttachmentContent) this.A02;
        Function1 function1 = (Function1) this.A03;
        1LI r03 = (1LI) this.A05;
        C2sn A0L = 7zR.A0L(c2k5);
        A0L.A00(new C8e5(InterfaceC07034in.A01, null, C82m.A05(null, num2, num, 100.0f, A1W ? 1 : 0).A00(r02), highlightsAttachmentContent, highlightsFeedContent, null, null, function1, A1W ? 1 : 0, A1W));
        7zQ.A1E(r03, 7zS.A0K(A0L), A0L, 7zT.A0g(C82m.A02(null, 7zQ.A0q(A1W ? 1 : 0), num2, 100.0f, A1W ? 1 : 0), num2, 3vP.A00(A0L).getColor(2132213824)));
        return C2so.A02(A0L, c2k5, A04);
    }
}
