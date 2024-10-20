package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.msys.mca.MailboxFeature;

/* loaded from: Bqk.class */
public final class Bqk {
    public final BDG A02;
    public final C00i A01 = AbH.A0J();
    public final C0dr A00 = RealtimeSinceBootClock.A00;

    public Bqk(Context context, FbUserSession fbUserSession) {
        this.A02 = new MailboxFeature((1Uj) 1Lo.A04(context, fbUserSession, (1BY) null, 16686));
    }
}
