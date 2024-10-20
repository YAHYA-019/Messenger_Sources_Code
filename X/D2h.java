package X;

import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.user.model.User;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

/* loaded from: D2h.class */
public final class D2h implements Function {
    public final /* synthetic */ String A00;

    public D2h(String str) {
        this.A00 = str;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        User user = (User) obj;
        if (user == null) {
            throw 1BK.A0h();
        }
        return AcX.A03(new RankingLoggingItem(ImmutableList.of(), null, this.A00, 0.0f), "MSYSContact".equals(user.A1B) ? ClientDataSourceIdentifier.A0j : ClientDataSourceIdentifier.A0m, 53N.A05, user);
    }
}
