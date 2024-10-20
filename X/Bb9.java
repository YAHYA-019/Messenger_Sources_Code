package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Bb9.class */
public final class Bb9 {
    public final CQm A00;

    public Bb9(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, User user, Capabilities capabilities, 2Sh r308, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CQm(context, fbUserSession, threadKey, threadSummary, user, capabilities, r308);
    }
}
