package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: A8r.class */
public final class A8r implements AYp {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C2k6 A01;
    public final /* synthetic */ HighlightsFeedContent A02;

    public A8r(FbUserSession fbUserSession, C2k6 c2k6, HighlightsFeedContent highlightsFeedContent) {
        this.A01 = c2k6;
        this.A02 = highlightsFeedContent;
        this.A00 = fbUserSession;
    }

    @Override // X.AYp
    public void Bvo(Emoji emoji) {
        11T.A0F(emoji, 0);
        C2k6 c2k6 = this.A01;
        Context A00 = 3vP.A00(c2k6);
        HighlightsFeedContent highlightsFeedContent = this.A02;
        String A07 = emoji.A07();
        11T.A0A(A07);
        FbUserSession fbUserSession = this.A00;
        C3o5.A0k(highlightsFeedContent, 1, fbUserSession);
        Long l = highlightsFeedContent.A0M;
        if (l != null) {
            9gM.A09.A01(A00, fbUserSession, highlightsFeedContent.A0E, new ARh(c2k6, A00, highlightsFeedContent, fbUserSession, null, A07, 0, true), l.longValue());
        }
    }
}
