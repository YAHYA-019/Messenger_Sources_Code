package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.rsys.cowatch.gen.CowatchAutoplayStore;
import com.facebook.rsys.cowatch.gen.CowatchFetchAutoplaySuccessCallback;

/* loaded from: Gwg.class */
public final class Gwg extends CowatchAutoplayStore {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public Gwg(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 16428);
        this.A00 = 1Bu.A03(r0, 114886);
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchAutoplayStore
    public void fetchMedia(String str, String str2, CowatchFetchAutoplaySuccessCallback cowatchFetchAutoplaySuccessCallback) {
        11T.A0H(str, str2);
        11T.A0F(cowatchFetchAutoplaySuccessCallback, 2);
        FbUserSession A03 = 1Br.A03(this.A01);
        HeS heS = (HeS) 1Br.A0B(this.A00);
        String A02 = I6D.A02(str2);
        InV inV = new InV(this, cowatchFetchAutoplaySuccessCallback, str, str2, 2);
        11T.A0F(A03, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("content_id", str);
        A0M.A05("content_source", A02);
        1Br.A0D(heS.A00, inV, 7zT.A09(heS.A01).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MediaSyncAutoPlayCandidateQuery", (String) null, "fbandroid", -1790014171, 0, 249126274L, 249126274L, false, true))));
    }
}
