package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: DA6.class */
public final class DA6 implements Runnable {
    public static final String __redex_internal_original_name = "GroupUsersFragment$setUpViewData$1$1$onSuccess$2";
    public final /* synthetic */ BRI A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ AmE A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ java.util.Map A04;

    public DA6(BRI bri, ThreadKey threadKey, AmE amE, List list, java.util.Map map) {
        this.A02 = amE;
        this.A00 = bri;
        this.A01 = threadKey;
        this.A03 = list;
        this.A04 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AmE amE = this.A02;
        ThreadKey threadKey = this.A01;
        List list = this.A03;
        java.util.Map map = this.A04;
        if (amE.A03 != null) {
            MigColorScheme A0j = 7zS.A0j(amE);
            LithoView lithoView = amE.A03;
            if (lithoView != null) {
                FbUserSession fbUserSession = amE.A01;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                lithoView.A0y(new QHN(fbUserSession, threadKey, new BfN(amE), A0j, list, map));
            }
        }
    }
}
