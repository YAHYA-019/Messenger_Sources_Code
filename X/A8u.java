package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: A8u.class */
public final class A8u implements AYp {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 8Lr A02;
    public final /* synthetic */ Aaj A03;
    public final /* synthetic */ 2Qz A04;
    public final /* synthetic */ HighlightsFeedContent A05;
    public final /* synthetic */ AaX A06;

    public A8u(Context context, FbUserSession fbUserSession, 8Lr r304, Aaj aaj, 2Qz r306, HighlightsFeedContent highlightsFeedContent, AaX aaX) {
        this.A02 = r304;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A05 = highlightsFeedContent;
        this.A03 = aaj;
        this.A04 = r306;
        this.A06 = aaX;
    }

    @Override // X.AYp
    public void Bvo(Emoji emoji) {
        11T.A0F(emoji, 0);
        8Lr r0 = this.A02;
        if (r0.A01) {
            7zL.A1R(r0.A00);
            String str = 9eQ.A00;
            FbUserSession fbUserSession = this.A01;
            Context context = this.A00;
            HighlightsFeedContent highlightsFeedContent = this.A05;
            Aaj aaj = this.A03;
            2Qz r02 = this.A04;
            String A07 = emoji.A07();
            11T.A0A(A07);
            9eQ.A00(context, fbUserSession, aaj, r02, highlightsFeedContent, this.A06, A07, true);
        }
    }
}
