package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Crg.class */
public final class Crg implements DIv {
    public static Crg A00 = new Object();

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9K(Btt btt, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9M(PlatformSearchGameData platformSearchGameData, Object obj) {
        return new CDH((ThreadKey) obj, Qur.A01);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9O(PlatformSearchUserData platformSearchUserData, Object obj) {
        return new CDH((ThreadKey) obj, Qur.A01);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9X(ThreadSummary threadSummary, Object obj) {
        return new CDH((ThreadKey) obj, BOs.A03);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9Z(C1772As6 c1772As6, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9a(Bt5 bt5, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9b(8KN r302, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9h(MessageSearchMessageModel messageSearchMessageModel, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9j(MessageSearchThreadModel messageSearchThreadModel, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9p(User user, Object obj) {
        return new CDH((ThreadKey) obj, user, BOt.A0H);
    }
}
