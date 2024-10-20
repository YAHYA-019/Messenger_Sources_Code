package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4Lz, reason: invalid class name */
/* loaded from: 4Lz.class */
public final class C4Lz {
    public final C4M0 A00;

    public C4Lz(Context context, FbUserSession fbUserSession, C4Xo c4Xo, String str) {
        if (!str.equals("AllChats")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C4M0(context, fbUserSession, c4Xo);
    }
}
