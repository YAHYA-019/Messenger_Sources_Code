package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Bao.class */
public final class Bao {
    public final CFg A00;

    public Bao(Context context, FbUserSession fbUserSession, 1pK r304, ThreadKey threadKey, 6tF r306, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CFg(context, fbUserSession, r304, threadKey, r306);
    }
}
