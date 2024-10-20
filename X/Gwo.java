package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.rsys.cowatch.gen.CowatchFetchMediaFailureCallback;
import com.facebook.rsys.cowatch.gen.CowatchFetchMediaSuccessCallback;
import com.facebook.rsys.cowatch.gen.CowatchMediaInfoStore;

/* loaded from: Gwo.class */
public final class Gwo extends CowatchMediaInfoStore {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public Gwo(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 16428);
        this.A01 = 1Bu.A03(r0, 114886);
        this.A02 = 1Bu.A03(r0, 114887);
        this.A00 = 1Bu.A03(r0, 67593);
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchMediaInfoStore
    public void fetchMedia(String str, String str2, CowatchFetchMediaSuccessCallback cowatchFetchMediaSuccessCallback, CowatchFetchMediaFailureCallback cowatchFetchMediaFailureCallback) {
        7zT.A1S(str, str2, cowatchFetchMediaSuccessCallback);
        11T.A0F(cowatchFetchMediaFailureCallback, 3);
        FbUserSession A03 = 1Br.A03(this.A03);
        HeS heS = (HeS) 1Br.A0B(this.A01);
        String A02 = I6D.A02(str2);
        Ing ing = new Ing(cowatchFetchMediaFailureCallback, this, A03, cowatchFetchMediaSuccessCallback, str2, str, 0);
        11T.A0F(A03, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("content_id", str);
        A0M.A05("content_source", A02);
        1Br.A0D(heS.A00, ing, 7zT.A09(heS.A01).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MediaSyncContentQuery", (String) null, "fbandroid", 1066168449, 0, 2842406182L, 2842406182L, false, true))));
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchMediaInfoStore
    public void updateMediaLikedState(String str, String str2, boolean z) {
        11T.A0F(str, 0);
        FbUserSession A03 = 1Br.A03(this.A03);
        HeT heT = (HeT) 1Br.A0B(this.A02);
        11T.A0F(A03, 0);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, TraceFieldType.VideoId);
        07S.A00(A0J, Integer.valueOf(z ? 1 : 0), "feedback_reaction");
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(A0J, A0M, "data");
        5Dh A00 = 5Dh.A00(A0M, new C01643sd(C2575Gho.class, "MediaSyncFeedbackReactionMutation", null, "data", "fbandroid", -930736462, 96, 657959764L, 657959764L, false, true));
        4zI.A03.A05("MediaSyncContentMutator", "updateMediaLikedState called", new Object[0]);
        1FV A09 = 7zT.A09(heT.A01).A09(A00);
        1Br.A0D(heT.A00, new InC(2), A09);
    }
}
