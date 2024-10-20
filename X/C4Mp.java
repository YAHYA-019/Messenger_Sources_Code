package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4Mp, reason: invalid class name */
/* loaded from: 4Mp.class */
public final class C4Mp {
    public final C4Mq A00;

    public C4Mp(Context context, FbUserSession fbUserSession, C4Xo c4Xo, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C4Mq(context, fbUserSession, c4Xo);
    }
}
