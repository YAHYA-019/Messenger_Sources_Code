package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* renamed from: X.7OH, reason: invalid class name */
/* loaded from: 7OH.class */
public final class C7OH {
    public static final boolean A00(FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(fbUserSession, 0);
        boolean z = false;
        if (threadKey != null && threadKey.A1K()) {
            User A00 = ((23F) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 33102)).A00(new UserKey(1Js.A03, String.valueOf(threadKey.A02)));
            if (A00 != null && A00.A0E()) {
                z = true;
            }
        }
        return z;
    }
}
