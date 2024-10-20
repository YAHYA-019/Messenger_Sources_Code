package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Baw.class */
public final class Baw {
    public final CFJ A00;

    public Baw(Context context, Context context2, View view, FbUserSession fbUserSession, ThreadKey threadKey, String str, String str2) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CFJ(context, context2, view, fbUserSession, threadKey, str2);
    }
}
