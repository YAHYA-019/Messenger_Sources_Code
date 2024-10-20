package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.concurrent.Callable;

/* loaded from: G6n.class */
public final class G6n implements Callable {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Eoz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public G6n(FbUserSession fbUserSession, Eoz eoz, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = fbUserSession;
        this.A01 = eoz;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A02, "actor_id");
        07S.A00(A0J, this.A03, "game_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, this.A04, "request_payload");
        4YV.A1A(A0J, A0N, "input");
        5Dh A00 = 5Dh.A00(A0N, new C01643sd(Dke.class, "InstantGameGetSignedPlayerInfoMutation", null, "input", "fbandroid", 1415812011, 384, 142272858L, 142272858L, false, true));
        1Vd A0K = 7zM.A0K(this.A01.A00);
        DKH.A1H(A00);
        return A0K.A08(A00, 5Dj.A01);
    }
}
