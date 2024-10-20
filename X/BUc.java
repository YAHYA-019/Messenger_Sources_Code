package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import java.util.concurrent.Executor;

/* loaded from: BUc.class */
public abstract class BUc {
    public static final void A00(Context context, FbUserSession fbUserSession, User user, String str) {
        11T.A0F(user, 2);
        CEs cEs = (CEs) 1Hv.A02(context, 68131);
        Executor A15 = 7zQ.A15();
        1Kd.A0F(new D4T(context, fbUserSession, user, str, 1), CEs.A00(context, (ThreadSummary) null, cEs, user), A15);
    }
}
