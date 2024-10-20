package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Crp.class */
public final class Crp implements DIp {
    public final C00i A00;

    public Crp(FbUserSession fbUserSession, Context context) {
        1BL.A1F(fbUserSession, context);
        this.A00 = 1Lm.A00(context, fbUserSession, 49481);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9J(Btt btt) {
        return 1BK.A0d();
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9L(PlatformSearchGameData platformSearchGameData) {
        return 1BK.A0d();
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9N(PlatformSearchUserData platformSearchUserData) {
        return 1BK.A0d();
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9W(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        return Boolean.valueOf(AbK.A1X(this.A00, threadSummary));
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        return 1BK.A0d();
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        return 1BK.A0d();
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        return 1BK.A0d();
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9o(User user) {
        11T.A0F(user, 0);
        return Boolean.valueOf(AbL.A1F(this.A00, user));
    }
}
