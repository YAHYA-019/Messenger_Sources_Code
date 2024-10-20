package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.1Y9, reason: invalid class name */
/* loaded from: 1Y9.class */
public final class C1Y9 {
    public final 1YA A00;

    public C1Y9(Context context, FbUserSession fbUserSession, String str) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new 1YA(context, fbUserSession);
    }
}
