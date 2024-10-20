package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Bb1.class */
public final class Bb1 {
    public final CEj A00;

    public Bb1(Context context, FbUserSession fbUserSession, 1pI r304, DFp dFp, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CEj(context, fbUserSession, r304, dFp);
    }
}
