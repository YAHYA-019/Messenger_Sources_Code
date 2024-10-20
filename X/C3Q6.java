package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Q6, reason: invalid class name */
/* loaded from: 3Q6.class */
public final class C3Q6 {
    public final 1De A00;
    public final 1Br A01 = 1BK.A0C();
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public C3Q6(1De r302) {
        this.A00 = r302;
    }

    public static final void A00(FbUserSession fbUserSession, ThreadKey threadKey, C3Q6 c3q6, String str, List list) {
        C5ny c5ny = new C5ny(str, 0S2.A00, 1BK.A0w(threadKey));
        1BY r0 = c3q6.A00.A00;
        ((C5j7) 1Lm.A07(fbUserSession, r0, 66320)).AgW(threadKey).A02.A00(c5ny);
        ((C5j8) 1Lm.A07(fbUserSession, r0, 67843)).AgW(threadKey).A02.A00(new C5o1(str, list));
        ((C5k6) 1Lm.A07(fbUserSession, r0, 67819)).AgW(threadKey).A08(str);
    }
}
