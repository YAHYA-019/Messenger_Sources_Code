package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Bar.class */
public final class Bar {
    public final CMi A00;

    public Bar(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, Bfk bfk, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CMi(context, r303, fbUserSession, r305, bfk);
    }
}
