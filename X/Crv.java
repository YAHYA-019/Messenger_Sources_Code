package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Crv.class */
public final class Crv implements DIp {
    public static final Crv A00 = new Object();

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9J(Btt btt) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9L(PlatformSearchGameData platformSearchGameData) {
        11T.A0F(platformSearchGameData, 0);
        return platformSearchGameData.A00.A0E;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9N(PlatformSearchUserData platformSearchUserData) {
        11T.A0F(platformSearchUserData, 0);
        String str = platformSearchUserData.A04;
        11T.A09(str);
        return str;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9W(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        ThreadKey A0f = AbF.A0f(threadSummary);
        return A0f.A12() ? String.valueOf(threadSummary.A1e) : 1BK.A0w(A0f);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        11T.A0F(c1772As6, 0);
        return 1BK.A0w(c1772As6.A01);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        11T.A0F(messageSearchMessageModel, 0);
        String str = messageSearchMessageModel.A0F;
        11T.A0A(str);
        return str;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        11T.A0F(messageSearchThreadModel, 0);
        return String.valueOf(AbL.A05(AbF.A0f(messageSearchThreadModel.A02)));
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9o(User user) {
        11T.A0F(user, 0);
        return AbF.A1A(user);
    }
}
