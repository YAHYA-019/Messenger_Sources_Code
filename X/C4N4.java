package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4N4, reason: invalid class name */
/* loaded from: 4N4.class */
public final class C4N4 {
    public final C4N5 A00;

    public C4N4(Context context, FbUserSession fbUserSession, C4Xo c4Xo, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C4N5(context, fbUserSession, c4Xo);
    }
}
