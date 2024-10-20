package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: C1p.class */
public final class C1p {
    public final 1De A00;

    public C1p(1De r302) {
        this.A00 = r302;
    }

    public final String A00(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        53N r306;
        11T.A0F(fbUserSession, 1);
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey.A15()) {
            r306 = 53N.A01(threadSummary);
        } else if (threadKey.A0x()) {
            r306 = 53N.A05;
        } else {
            if (!ThreadKey.A0a(threadKey)) {
                User A02 = ((AnonymousClass545) 4YU.A0o(fbUserSession, this.A00, 49481)).A02(threadKey);
                String str = A02 != null ? 53N.A02(A02).loggingName : "unknown";
                11T.A0D(str);
                return str;
            }
            r306 = 53N.A03;
        }
        String str2 = r306.loggingName;
        11T.A09(str2);
        return str2;
    }
}
