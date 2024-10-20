package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.1z3, reason: invalid class name */
/* loaded from: 1z3.class */
public final class C1z3 {
    public final C1z4 A00;

    public C1z3(Context context, FbUserSession fbUserSession, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C1z4(context, fbUserSession);
    }
}
