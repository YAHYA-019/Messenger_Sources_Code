package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.5no, reason: invalid class name */
/* loaded from: 5no.class */
public final class C5no {
    public final C5np A00;

    public C5no(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, String str, int i) {
        if (!str.equals("All")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new C5np(context, fbUserSession, threadSummary, i);
    }
}
