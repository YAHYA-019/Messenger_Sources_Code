package X;

import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: C1f.class */
public final class C1f {
    public final /* synthetic */ AeU A00;

    public C1f(AeU aeU) {
        this.A00 = aeU;
    }

    public void A00(ImmutableList immutableList) {
        ImmutableList.Builder A0y = AbK.A0y(immutableList);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            53N r0 = 53N.A05;
            ClientDataSourceIdentifier clientDataSourceIdentifier = "MSYSContact".equals(A0t.A1B) ? ClientDataSourceIdentifier.A0j : ClientDataSourceIdentifier.A0m;
            ImmutableList of = ImmutableList.of();
            AeU aeU = this.A00;
            String str = aeU.A03;
            Number A0o = 1BK.A0o(A0t.A13, aeU.A04);
            A0y.m11011add((Object) AcX.A03(new RankingLoggingItem(of, null, str, A0o != null ? A0o.floatValue() : 0.0f), clientDataSourceIdentifier, r0, A0t));
        }
        DIW diw = this.A00;
        C1333AeN c1333AeN = new C1333AeN(EnumC1297Ada.A13, 1Fj.A01(A0y), null);
        if (c1333AeN.A01.isEmpty()) {
            return;
        }
        ((C6p) ((AeU) diw).A0C.get()).A01(((AeU) diw).A01, c1333AeN, "SuggestedSectionDataSource");
        ((AeU) diw).A0M.BsT(new C1323Ae1(ImmutableList.of((Object) c1333AeN), 0S2.A0C), diw, null, ((AeU) diw).A01);
    }
}
