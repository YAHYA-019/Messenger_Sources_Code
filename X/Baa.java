package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Baa.class */
public final class Baa {
    public final COb A00;

    public Baa(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, 64W r306, C5xv c5xv, Capabilities capabilities, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new COb(context, r303, fbUserSession, threadSummary, r306, c5xv, capabilities);
    }
}
