package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLXFBMessagingSearchMetaAISnippetStatus;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: Cpz.class */
public final class Cpz implements DIW {
    public final Context A00;
    public final FbUserSession A01;
    public final C1325Ae3 A02 = new C1325Ae3();

    public Cpz(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public static C1301Ade A00(8KN r301) {
        return new C1301Ade(EnumC1297Ada.A0T, BP1.A09, null, null, new AcX((PlatformSearchGameData) null, (PlatformSearchUserData) null, (RankingLoggingItem) null, (ThreadSummary) null, (C1772As6) null, (Bt5) null, r301, ClientDataSourceIdentifier.A0r, 53N.A0N, (MessageSearchMessageModel) null, (MessageSearchThreadModel) null, (User) null), null);
    }

    public void A5L(DFe dFe) {
        this.A02.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0r;
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        String str;
        String str2 = (String) obj;
        if (byH != null && !byH.A09) {
            return AbK.A0b();
        }
        0fH.A0g(str2, "MetaAISearchDataSource", "starting loading, query=%s");
        synchronized (this) {
            if (1JF.A0A(str2)) {
                ImmutableList of = ImmutableList.of();
                C1323Ae1 c1323Ae1 = C1323Ae1.A03;
                return AbG.A0n(of);
            }
            String trim = str2.trim();
            Bt6 bt6 = new Bt6(byH, this, str2, trim);
            Context context = this.A00;
            FbUserSession fbUserSession = this.A01;
            String str3 = byH != null ? byH.A03 : "";
            11T.A0F(context, 0);
            7zR.A1O(trim, str3);
            C8k c8k = (C8k) 1Bi.A03(84342);
            int hashCode = C04I.A00().hashCode();
            c8k.A02(hashCode, "MetaAISearchFetcher", "streamSearchResponse");
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A05("userPrompt", trim);
            A0M.A05("entryPoint", str3);
            1Kd.A0F(new D4B(c8k, bt6, trim, hashCode), 7zR.A0n(context, 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "SearchMetaAiSnippetQuery", (String) null, "fbandroid", -55294604, 0, 1397367569L, 1397367569L, false, true))), (1ED) 1Bi.A03(16441));
            8KN r0 = new 8KN(GraphQLXFBMessagingSearchMetaAISnippetStatus.FETCHING, (9Yl) null, (Bmv) null, str2, "", "", "", (String) null, (String) null, (String) null, ImmutableList.of(), (List) null, (List) null, false);
            CQb A02 = AcP.A02((AcP) 1Lo.A04(context, fbUserSession, (1BY) null, 84248));
            1UG A08 = 1BK.A08(A02.A0O, 1BJ.A00(2105));
            if (A08.isSampled() && (str = A02.A0K) != null) {
                AbF.A1N(A08, str);
                A08.BZL();
            }
            return new C1323Ae1(ImmutableList.of((Object) A00(r0)), 0S2.A0j);
        }
    }

    public String getFriendlyName() {
        return "MetaAISearchDataSource";
    }

    public String toString() {
        return "MetaAISearchDataSource";
    }
}
