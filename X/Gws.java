package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.rsys.cowatch.gen.CowatchFetchSuggestedContentQueueFailureCallback;
import com.facebook.rsys.cowatch.gen.CowatchFetchSuggestedContentQueueSuccessCallback;
import com.facebook.rsys.cowatch.gen.CowatchSuggestedContentQueueStore;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Gws.class */
public final class Gws extends CowatchSuggestedContentQueueStore {
    public String A00;
    public String A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1De A07;

    public Gws(1De r302) {
        this.A07 = r302;
        1BY r0 = r302.A00;
        this.A06 = 1Bu.A03(r0, 16428);
        this.A05 = 1Bu.A03(r0, 114886);
        this.A04 = 1Bq.A00(16477);
        this.A03 = 1Bu.A03(r0, 67593);
        this.A02 = GOo.A0N(r0);
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchSuggestedContentQueueStore
    public void fetchSuggestedContentQueue(String str, String str2, String str3, String str4, String str5, String str6, java.util.Map map, CowatchFetchSuggestedContentQueueSuccessCallback cowatchFetchSuggestedContentQueueSuccessCallback, CowatchFetchSuggestedContentQueueFailureCallback cowatchFetchSuggestedContentQueueFailureCallback) {
        ImmutableList of;
        11T.A0H(str, str2);
        7zR.A1P(cowatchFetchSuggestedContentQueueSuccessCallback, cowatchFetchSuggestedContentQueueFailureCallback);
        if (ICR.A00(this.A03).AZk(36320210550013093L)) {
            FbUserSession A03 = 1Br.A03(this.A06);
            HeS heS = (HeS) 1Br.A0B(this.A05);
            String A02 = I6D.A02(str2);
            if (map != null) {
                ArrayList A0t = AnonymousClass001.A0t(map.size());
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    2Jd r0 = new 2Jd(ActionId.LEGACY_MARKER);
                    r0.A09("key", AnonymousClass001.A0j(A0z));
                    r0.A09("value", 1BK.A16(A0z));
                    A0t.add(r0);
                }
                of = ImmutableList.copyOf((Collection) A0t);
            } else {
                of = ImmutableList.of();
            }
            11T.A0A(of);
            String str7 = this.A00;
            11T.A0F(A03, 0);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A05("content_id", str);
            A0M.A05("content_source", A02);
            A0M.A04("video_count", 10);
            boolean A1W = DKE.A1W(A0M, "tab_type", String.valueOf(str3));
            A0M.A05("cursor", str7);
            A0M.A05(1BJ.A00(35), str5);
            A0M.A05("suggested_context", str6);
            A0M.A06("ranking_signals", of);
            A0M.A05("session_id", str4);
            Preconditions.checkArgument(A1W);
            1FV A09 = 7zT.A09(heS.A01).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MediaSyncAutoChainingVideos", (String) null, "fbandroid", 1821539334, 0, 2540721815L, 2540721815L, false, true)));
            1Br.A0D(this.A04, new Ing(A03, this, cowatchFetchSuggestedContentQueueFailureCallback, cowatchFetchSuggestedContentQueueSuccessCallback, str2, str, 1), A09);
        }
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchSuggestedContentQueueStore
    public void fetchSuggestedReelsQueueDEPRECATED(String str, String str2, CowatchFetchSuggestedContentQueueSuccessCallback cowatchFetchSuggestedContentQueueSuccessCallback, CowatchFetchSuggestedContentQueueFailureCallback cowatchFetchSuggestedContentQueueFailureCallback) {
        7zT.A1S(str, str2, cowatchFetchSuggestedContentQueueSuccessCallback);
        11T.A0F(cowatchFetchSuggestedContentQueueFailureCallback, 3);
        String str3 = this.A01;
        if (str3 == null || str3.length() == 0) {
            this.A01 = str;
        }
        FbUserSession A03 = 1Br.A03(this.A06);
        HeS heS = (HeS) 1Br.A0B(this.A05);
        String str4 = this.A01;
        String str5 = this.A00;
        11T.A0F(A03, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A04("count", 8);
        A0M.A05("seedReel", str4);
        A0M.A05("endCursor", str5);
        1FV A09 = 7zT.A09(heS.A01).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MediaSyncSuggestedContentQueue", (String) null, "fbandroid", 1453002076, 0, 962245107L, 962245107L, false, true)));
        1Br.A0D(this.A04, new Ing(A03, this, cowatchFetchSuggestedContentQueueFailureCallback, cowatchFetchSuggestedContentQueueSuccessCallback, str2, str, 2), A09);
    }
}
