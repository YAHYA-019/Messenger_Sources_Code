package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6rq, reason: invalid class name */
/* loaded from: 6rq.class */
public final class C6rq extends C6rr {
    public final FbUserSession A00;

    public C6rq(FbUserSession fbUserSession) {
        this.A00 = fbUserSession;
    }

    public 4kZ A00(ThreadKey threadKey) {
        return ((C5jm) 1Lo.A06(this.A00, 68746)).A00(0Pz.A0W("THREAD_VIEW_UI_STATE_PREFIX", String.valueOf(threadKey.A0s())));
    }
}
