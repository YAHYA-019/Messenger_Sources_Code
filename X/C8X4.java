package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.HighlightsReactionContent;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionCount;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8X4, reason: invalid class name */
/* loaded from: 8X4.class */
public final class C8X4 extends 1LH {
    public final FbUserSession A00;
    public final Aaj A01;
    public final HighlightsFeedContent A02;

    public C8X4(FbUserSession fbUserSession, Aaj aaj, HighlightsFeedContent highlightsFeedContent) {
        1BL.A1H(highlightsFeedContent, aaj, fbUserSession);
        this.A02 = highlightsFeedContent;
        this.A01 = aaj;
        this.A00 = fbUserSession;
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        11T.A0F(c2k5, 0);
        HighlightsFeedContent highlightsFeedContent = this.A02;
        List list = highlightsFeedContent.A0m;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (((HighlightsReactionContent) obj).A01 > 0) {
                A0s.add(obj);
            }
        }
        List<HighlightsReactionContent> A0b = 0QD.A0b(A0s, AHW.A00);
        ArrayList A0z = 1BL.A0z(A0b);
        for (HighlightsReactionContent highlightsReactionContent : A0b) {
            long j = highlightsReactionContent.A01;
            int i = (int) j;
            String str2 = highlightsReactionContent.A03;
            C1pq.A08("reaction", str2);
            boolean z = highlightsReactionContent.A04;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(j);
            A0k.append(' ');
            A0z.add(new MessageReactionCount(str2, AnonymousClass001.A0d(str2, A0k), null, i, 0L, z));
        }
        if (A0z.isEmpty() || (str = highlightsFeedContent.A0W) == null || str.length() == 0) {
            return null;
        }
        5zC r0 = (5zC) 1Bn.A0A(49882);
        r0.Cn0((ThreadViewColorScheme) 7zN.A0p(c2k5, 68548));
        C2sn A0L = 7zR.A0L(c2k5);
        A0L.A00((C1ub.A03.A0A() && highlightsFeedContent.A05 == C5by.A07.value) ? null : new C8f3(null, 2132279342));
        2lQ r02 = 2lO.A02;
        7zQ.A1E(new C8dm(this.A00, r0, this.A01, highlightsFeedContent, highlightsFeedContent.A0M, highlightsFeedContent.A0L, str, A0z), 7zS.A0K(A0L), A0L, 7zS.A0R((2lO) null, 1.0f));
        return new C1rh(null, null, null, null, A0L.A01, false);
    }
}
