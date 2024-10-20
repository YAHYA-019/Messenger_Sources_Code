package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Cqe.class */
public final class Cqe implements DIB {
    public final Context A00;
    public final FbUserSession A01;
    public final C00i A03 = AbH.A0X();
    public final C00i A04 = 1BQ.A02(49352);
    public final C00i A02 = AbH.A0U();

    public Cqe(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public /* bridge */ /* synthetic */ ImmutableList B7q(ByH byH, Object obj) {
        String str = (String) obj;
        String trim = str != null ? str.trim() : "";
        0fH.A0g(trim, "DbGroupSearchItemDataSource", "starting loading, query= %s");
        if (!1PG.A02(this.A02)) {
            try {
                InterfaceC10724uf A03 = ((C10704ud) this.A04.get()).A03(trim);
                try {
                    int A00 = 2yD.A00(C1gb.A01(this.A03), 36594053370021713L);
                    int i = 0;
                    ImmutableList.Builder builder = ImmutableList.builder();
                    while (true) {
                        ThreadSummary BfR = A03.BfR();
                        if (BfR == null) {
                            break;
                        }
                        if (AbF.A00(BfR) >= 3) {
                            AcX A02 = AcX.A02((RankingLoggingItem) null, BfR, ClientDataSourceIdentifier.A0w, 53N.A01(BfR));
                            0fH.A0i(BfR, "DbGroupSearchItemDataSource", "adding group summary: %s");
                            builder.m11011add((Object) A02);
                            i++;
                            if (i >= A00) {
                                break;
                            }
                        }
                    }
                    ImmutableList build = builder.build();
                    0fH.A0g(1BK.A0k(build), "DbGroupSearchItemDataSource", "got thread summaries: %d");
                    A03.close();
                    return build;
                } finally {
                }
            } catch (Exception e) {
                0fH.A0u("DbGroupSearchItemDataSource", "exception with filtering groups", e);
                return ImmutableList.of();
            }
        }
        ImmutableList.Builder builder2 = ImmutableList.builder();
        C00i c00i = this.A03;
        int i2 = -1;
        int A032 = AbF.A0n(c00i).A03() == 0 ? -1 : AbF.A0n(c00i).A03();
        Context context = this.A00;
        1Bn.A0E(context, (1BY) null, 84385);
        C9C c9c = new C9C(context, this.A01);
        if (AbF.A0n(c00i).A04() != 0) {
            i2 = AbF.A0n(c00i).A04();
        }
        if (AbF.A0n(c00i).A06()) {
            c9c.A02(trim);
            throw 0Q8.createAndThrow();
        }
        ImmutableList A002 = c9c.A00(trim, A032, i2);
        int i3 = 0;
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            ThreadSummary A0j = AbF.A0j(it);
            builder2.m11011add((Object) AcX.A02((RankingLoggingItem) null, A0j, ClientDataSourceIdentifier.A0k, 53N.A01(A0j)));
            if (AbF.A0n(c00i).A03() == 0) {
                i3++;
                if (3 <= i3) {
                    break;
                }
            }
        }
        ImmutableList build2 = builder2.build();
        0fH.A0g(1BK.A0k(build2), "DbGroupSearchItemDataSource", "got thread summaries: %d");
        return build2;
    }

    public String getFriendlyName() {
        return "DbGroupSearchItemDataSource";
    }
}
