package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Crb.class */
public final class Crb implements DIv {
    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9K(Btt btt, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9M(PlatformSearchGameData platformSearchGameData, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9O(PlatformSearchUserData platformSearchUserData, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9X(ThreadSummary threadSummary, Object obj) {
        AcX acX = (AcX) obj;
        11T.A0F(threadSummary, 0);
        if (acX == null) {
            return null;
        }
        53N r0 = acX.A0A;
        11T.A09(r0);
        EnumC1297Ada enumC1297Ada = EnumC1297Ada.A0j;
        DataSourceIdentifier dataSourceIdentifier = acX.A09;
        11T.A09(dataSourceIdentifier);
        return new B7H(acX.A04, threadSummary, dataSourceIdentifier, r0, enumC1297Ada);
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
        AcX acX = (AcX) obj;
        11T.A0F(user, 0);
        if (acX == null) {
            return null;
        }
        53N r0 = acX.A0A;
        11T.A09(r0);
        DataSourceIdentifier dataSourceIdentifier = acX.A09;
        EnumC1297Ada enumC1297Ada = (dataSourceIdentifier == ClientDataSourceIdentifier.A0T || user.A0U == 1Kq.A04) ? EnumC1297Ada.A0l : EnumC1297Ada.A13;
        11T.A09(dataSourceIdentifier);
        return new B7K(acX.A04, dataSourceIdentifier, r0, enumC1297Ada, user);
    }
}
