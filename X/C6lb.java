package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.6lb, reason: invalid class name */
/* loaded from: 6lb.class */
public final class C6lb {
    public final C6lc A00;

    public C6lb(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, 5Sl r306, 5Sh r307, 64W r308, 63D r309, ThreadViewParams threadViewParams, 6IV r311, MigColorScheme migColorScheme, User user, Capabilities capabilities, String str, String str2) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C6lc(context, r303, fbUserSession, threadSummary, r306, r307, r308, r309, threadViewParams, r311, migColorScheme, user, capabilities, str2);
    }
}
