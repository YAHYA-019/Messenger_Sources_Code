package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Bb7.class */
public final class Bb7 {
    public final CPz A00;

    public Bb7(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, User user, Capabilities capabilities, 2Sh r309, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CPz(context, r303, fbUserSession, threadKey, threadSummary, user, capabilities, r309);
    }
}
