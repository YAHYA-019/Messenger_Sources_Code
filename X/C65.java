package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;

/* loaded from: C65.class */
public final class C65 {
    public 1BY A00;
    public final Context A06 = AbF.A04((1BY) null);
    public final C00i A02 = 1BQ.A02(16469);
    public final C00i A08 = 1BV.A01((1BY) null, 82254);
    public final C00i A07 = 1BV.A01((1BY) null, 148133);
    public final C00i A05 = 1BQ.A02(68474);
    public final C00i A03 = 1BV.A01((1BY) null, 115683);
    public final C00i A01 = AbH.A0K();
    public final C00i A04 = 1BV.A01((1BY) null, 115729);

    public C65(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(FbUserSession fbUserSession) {
        1BY r0 = this.A00;
        CJA cja = (CJA) 1Lo.A04((Context) null, fbUserSession, r0, 84219);
        I5k i5k = (I5k) 1Lo.A04((Context) null, fbUserSession, r0, 84176);
        String str = i5k.A09;
        cja.A03(BLd.A04);
        boolean z = ((I5k) 1Lo.A04((Context) null, fbUserSession, r0, 84176)).A0A;
        LiveVideoApi liveVideoApi = (LiveVideoApi) this.A04.get();
        if (z) {
            liveVideoApi.endBroadcast();
        } else {
            liveVideoApi.cancelCreatedNotStartedBroadcast();
        }
        if (!i5k.A0A || str == null) {
            return;
        }
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("videoID", str);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FetchRooms2LiveInsightsQuery", (String) null, "fbandroid", -114361916, 0, 898508797L, 898508797L, false, true));
        ((C3sb) A0L).A00 = 2;
        1Vd A0I = AbK.A0I(r0);
        C00i c00i = this.A02;
        1Kd.A0D(c00i, D4p.A00(AbF.A0A(fbUserSession, r0, 84176), this, 62), A0I.A0A(A0L, 1BK.A1E(c00i)));
    }
}
