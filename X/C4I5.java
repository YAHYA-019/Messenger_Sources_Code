package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4I5, reason: invalid class name */
/* loaded from: 4I5.class */
public final class C4I5 {
    public final C4I6 A00;

    public C4I5(Context context, FbUserSession fbUserSession, C4I3 c4i3, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C4I6(context, fbUserSession, c4i3);
    }
}
