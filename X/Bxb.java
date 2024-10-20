package X;

import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;

/* loaded from: Bxb.class */
public final class Bxb {
    public Member A00;
    public RankingLoggingItem A01;
    public String A02;
    public boolean A03;
    public final DataSourceIdentifier A04;
    public final 53N A05;
    public final DK4 A06;
    public final User A07;

    public Bxb(DataSourceIdentifier dataSourceIdentifier, 53N r303, DK4 dk4, User user) {
        7zT.A1W(user, r303, dk4, dataSourceIdentifier);
        this.A07 = user;
        this.A05 = r303;
        this.A06 = dk4;
        this.A04 = dataSourceIdentifier;
    }
}
