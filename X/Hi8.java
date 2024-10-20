package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.rtgql.graphqlsubscriptionssdk.GraphQLSubscriptionsSDKProvider;

/* loaded from: Hi8.class */
public final class Hi8 {
    public final GraphQLSubscriptionsSDKProvider A00;
    public final ISv A01;
    public final Ha7 A02;
    public final 1De A03;
    public final Gv9 A04;
    public final 1gT A05;

    public Hi8(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        1BY r0 = r303.A00;
        Ha7 ha7 = (Ha7) 1Lo.A04((Context) null, fbUserSession, r0, 115234);
        this.A02 = ha7;
        Gv9 gv9 = (Gv9) 1Lo.A04((Context) null, fbUserSession, r0, 115433);
        this.A04 = gv9;
        ISv iSv = (ISv) 1Bn.A0E((Context) null, r0, 115238);
        this.A01 = iSv;
        1gT r02 = (1gT) 1Bn.A0E((Context) null, r0, 68741);
        this.A05 = r02;
        this.A00 = new GraphQLSubscriptionsSDKProvider(AnonymousClass000.A00(71), ha7.A00, gv9, iSv, r02);
    }
}
