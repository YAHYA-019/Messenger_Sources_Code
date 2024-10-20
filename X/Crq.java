package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Crq.class */
public final class Crq implements DIp {
    public final C00i A00;

    public Crq(FbUserSession fbUserSession, Context context) {
        this.A00 = 1Lm.A00(context, fbUserSession, 49481);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9J(Btt btt) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9L(PlatformSearchGameData platformSearchGameData) {
        11T.A0F(platformSearchGameData, 0);
        String str = platformSearchGameData.A00.A0E;
        ImmutableList of = str == null ? ImmutableList.of() : ImmutableList.of((Object) str);
        11T.A0D(of);
        return of;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9N(PlatformSearchUserData platformSearchUserData) {
        11T.A0F(platformSearchUserData, 0);
        return 7zN.A0e(platformSearchUserData.A04);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9W(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        AnonymousClass545 anonymousClass545 = (AnonymousClass545) this.A00.get();
        boolean z = true;
        if (AbF.A00(threadSummary) <= 1) {
            z = false;
        }
        ImmutableList A00 = AnonymousClass545.A00(anonymousClass545, threadSummary, z);
        11T.A0A(A00);
        return A00;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        11T.A0F(messageSearchMessageModel, 0);
        ImmutableList A00 = AnonymousClass545.A00((AnonymousClass545) this.A00.get(), messageSearchMessageModel.A01, true);
        11T.A0A(A00);
        return A00;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        11T.A0F(messageSearchThreadModel, 0);
        ImmutableList A00 = AnonymousClass545.A00((AnonymousClass545) this.A00.get(), messageSearchThreadModel.A02, true);
        11T.A0A(A00);
        return A00;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9o(User user) {
        11T.A0F(user, 0);
        return 7zN.A0e(user.A13);
    }
}
