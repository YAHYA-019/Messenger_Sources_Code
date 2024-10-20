package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: Bav.class */
public final class Bav {
    public final ByN A00;

    public Bav(Context context, Context context2, FbUserSession fbUserSession, ThreadKey threadKey, DIz dIz, NavigationTrigger navigationTrigger, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new ByN(context, context2, fbUserSession, threadKey, dIz, navigationTrigger);
    }
}
