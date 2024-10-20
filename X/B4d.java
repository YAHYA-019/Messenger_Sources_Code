package X;

import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;
import com.google.common.base.Objects;

/* loaded from: B4d.class */
public final class B4d extends 2T9 {
    public static final B4d A00 = new Object();

    public /* bridge */ /* synthetic */ Object A00(RankingLoggingItem rankingLoggingItem, Object obj) {
        AcX acX = (AcX) obj;
        if (!Objects.equal(acX.A04, rankingLoggingItem)) {
            User user = acX.A0D;
            ThreadSummary threadSummary = acX.A05;
            PlatformSearchUserData platformSearchUserData = acX.A03;
            PlatformSearchGameData platformSearchGameData = acX.A02;
            MessageSearchThreadModel messageSearchThreadModel = acX.A0C;
            acX = new AcX(platformSearchGameData, platformSearchUserData, rankingLoggingItem, threadSummary, acX.A06, acX.A07, acX.A08, acX.A09, acX.A0A, acX.A0B, messageSearchThreadModel, user);
        }
        return acX;
    }

    public /* bridge */ /* synthetic */ String A01(Object obj) {
        return (String) ((AcX) obj).A07(Crv.A00);
    }
}
