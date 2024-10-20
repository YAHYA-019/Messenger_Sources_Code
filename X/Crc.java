package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Crc.class */
public final class Crc implements DIv {
    public final /* synthetic */ B81 A00;

    public Crc(B81 b81) {
        this.A00 = b81;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9K(Btt btt, Object obj) {
        AcX A04 = AcX.A04(ClientDataSourceIdentifier.A0y, 53N.A0R);
        if (btt != null) {
            A04.A00 = btt;
        }
        return A04;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9M(PlatformSearchGameData platformSearchGameData, Object obj) {
        AcX acX = (AcX) obj;
        53N r0 = acX.A0A;
        return AcX.A00(platformSearchGameData, acX.A04, this.A00.A00, r0);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9O(PlatformSearchUserData platformSearchUserData, Object obj) {
        AcX acX = (AcX) obj;
        53N r0 = acX.A0A;
        return AcX.A01(platformSearchUserData, acX.A04, this.A00.A00, r0);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9X(ThreadSummary threadSummary, Object obj) {
        AcX acX = (AcX) obj;
        53N r0 = acX.A0A;
        return AcX.A02(acX.A04, threadSummary, this.A00.A00, r0);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9Z(C1772As6 c1772As6, Object obj) {
        AcX acX = (AcX) obj;
        53N r0 = acX.A0A;
        return new AcX((PlatformSearchGameData) null, (PlatformSearchUserData) null, acX.A04, (ThreadSummary) null, c1772As6, (Bt5) null, (8KN) null, this.A00.A00, r0, (MessageSearchMessageModel) null, (MessageSearchThreadModel) null, (User) null);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9a(Bt5 bt5, Object obj) {
        return new AcX((PlatformSearchGameData) null, (PlatformSearchUserData) null, (RankingLoggingItem) null, (ThreadSummary) null, (C1772As6) null, bt5, (8KN) null, this.A00.A00, ((AcX) obj).A0A, (MessageSearchMessageModel) null, (MessageSearchThreadModel) null, (User) null);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9b(8KN r302, Object obj) {
        return new AcX((PlatformSearchGameData) null, (PlatformSearchUserData) null, (RankingLoggingItem) null, (ThreadSummary) null, (C1772As6) null, (Bt5) null, r302, this.A00.A00, ((AcX) obj).A0A, (MessageSearchMessageModel) null, (MessageSearchThreadModel) null, (User) null);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9h(MessageSearchMessageModel messageSearchMessageModel, Object obj) {
        AcX acX = (AcX) obj;
        53N r0 = acX.A0A;
        return new AcX((PlatformSearchGameData) null, (PlatformSearchUserData) null, acX.A04, (ThreadSummary) null, (C1772As6) null, (Bt5) null, (8KN) null, this.A00.A00, r0, messageSearchMessageModel, (MessageSearchThreadModel) null, (User) null);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9j(MessageSearchThreadModel messageSearchThreadModel, Object obj) {
        AcX acX = (AcX) obj;
        53N r0 = acX.A0A;
        return new AcX((PlatformSearchGameData) null, (PlatformSearchUserData) null, acX.A04, (ThreadSummary) null, (C1772As6) null, (Bt5) null, (8KN) null, this.A00.A00, r0, (MessageSearchMessageModel) null, messageSearchThreadModel, (User) null);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9p(User user, Object obj) {
        AcX acX = (AcX) obj;
        53N r0 = acX.A0A;
        return AcX.A03(acX.A04, this.A00.A00, r0, user);
    }
}
