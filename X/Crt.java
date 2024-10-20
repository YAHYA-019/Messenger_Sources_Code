package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Crt.class */
public final class Crt implements DIp {
    public static final Crt A00 = new Object();

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
        return platformSearchUserData.A04;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9W(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        ThreadKey threadKey = threadSummary.A0n;
        return threadKey.A12() ? String.valueOf(threadSummary.A1e) : 1BK.A0w(threadKey);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        11T.A0F(messageSearchMessageModel, 0);
        return messageSearchMessageModel.A0F;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        11T.A0F(messageSearchThreadModel, 0);
        return AbK.A17(messageSearchThreadModel.A02);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9o(User user) {
        11T.A0F(user, 0);
        return AbF.A1A(user);
    }
}
