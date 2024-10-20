package X;

import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;

/* loaded from: DIk.class */
public interface DIk {
    void Bnt(RankingLoggingItem rankingLoggingItem, DataSourceIdentifier dataSourceIdentifier, 53N r3, DK4 dk4, User user, int i, int i2, int i3);

    void Btp(String str, Integer num, String str2);

    void Bzz(String str, boolean z);

    void C2o(PlatformSearchUserData platformSearchUserData, RankingLoggingItem rankingLoggingItem, DataSourceIdentifier dataSourceIdentifier, 53N r4, DK4 dk4, int i, int i2, int i3);

    void C2p(RankingLoggingItem rankingLoggingItem, ThreadSummary threadSummary, DataSourceIdentifier dataSourceIdentifier, 53N r4, DK4 dk4, int i, int i2, int i3);

    void C2q(RankingLoggingItem rankingLoggingItem, DataSourceIdentifier dataSourceIdentifier, 53N r3, DK4 dk4, User user, int i, int i2, int i3);
}
