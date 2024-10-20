package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.FetchUnreadMessageParams;

/* loaded from: Cb7.class */
public final class Cb7 implements CallerContextable {
    public static final String __redex_internal_original_name = "StellaFetchUnreadMessageIntentHandler";
    public 1BY A00;
    public final C00i A02 = 7zN.A0D(33031);
    public final C00i A01 = AbH.A0J();

    public Cb7(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public 2FT A00(ThreadKey threadKey, int i) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("fetchUnreadMessageParams", new FetchUnreadMessageParams(threadKey, i));
        1IB A052 = 4YU.A0L(this.A02).newInstance_DEPRECATED(1BJ.A00(1318), A05, 1, CallerContext.A06(Cb7.class)).A05();
        return AbJ.A0t(this.A01, new D2l(this, 4), A052);
    }
}
