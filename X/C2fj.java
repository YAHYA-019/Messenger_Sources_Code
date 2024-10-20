package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.2fj, reason: invalid class name */
/* loaded from: 2fj.class */
public final class C2fj {
    public final C2fk A00;

    public C2fj(Context context, FbUserSession fbUserSession, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C2fk(context, fbUserSession);
    }
}
