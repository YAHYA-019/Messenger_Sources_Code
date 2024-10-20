package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Crm.class */
public final class Crm implements DIp {
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
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey.A0z()) {
            Long l = threadSummary.A1e;
            if (l != null) {
                return String.valueOf(l);
            }
        } else if (!threadKey.A19()) {
            return threadKey.A12() ? String.valueOf(threadSummary.A1e) : 1BK.A0w(threadKey);
        }
        return threadKey.A0u();
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        return messageSearchMessageModel.A09;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        11T.A0F(messageSearchThreadModel, 0);
        return 0Pz.A0W("message_multiple:", String.valueOf(AbL.A05(AbF.A0f(messageSearchThreadModel.A02))));
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9o(User user) {
        11T.A0F(user, 0);
        return AbF.A1A(user);
    }
}
