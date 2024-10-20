package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.model.GraphQLMedia;
import java.util.concurrent.Executor;

/* loaded from: Hpd.class */
public final class Hpd {
    public final 1Br A04 = 7zM.A0P();
    public final 1Br A01 = 1Bq.A00(16477);
    public final 1Br A00 = 1Bu.A00(16454);
    public final 1Br A02 = AbG.A0M();
    public final 1Br A03 = 7zM.A0N();

    public final void A00(Context context, FbUserSession fbUserSession, GraphQLMedia graphQLMedia, C6dn c6dn, C6dl c6dl, String str, String str2) {
        7zP.A1L(context, 4, c6dn);
        Executor A11 = 4YV.A11(this.A00);
        boolean AZk = 1Br.A07(this.A03).AZk(72340619497836429L);
        J42 j42 = new J42(context, fbUserSession, graphQLMedia, c6dn, this, c6dl, str2, str);
        if (AZk) {
            A11.execute(j42);
        } else {
            j42.run();
        }
    }
}
