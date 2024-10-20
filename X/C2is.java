package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.2is, reason: invalid class name */
/* loaded from: 2is.class */
public final class C2is {
    public final 2fE A00;

    public C2is(FbUserSession fbUserSession) {
        this.A00 = (2fE) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 17064);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r304 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0132, code lost:
    
        if (((X.2fI) r0.A02.get()).A0k(r304) == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C2it A00(X.1He r301, X.C2is r302, X.1F9 r303, com.facebook.messaging.model.threadkey.ThreadKey r304) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2is.A00(X.1He, X.2is, X.1F9, com.facebook.messaging.model.threadkey.ThreadKey):X.2it");
    }

    public C2it A01(1He r302, ThreadKey threadKey) {
        C2it c2it;
        synchronized (this) {
            if (threadKey != null) {
                if (r302 != 1He.A03 && r302 != 1He.A05 && r302 != 1He.A02) {
                    if (2fE.A01(this.A00, threadKey).BWh(threadKey, 20)) {
                        new C2it(r302);
                    } else {
                        0fH.A0j("ThreadsCacheUpdateRateLimiter", "Upgrading to PREFER_CACHE_IF_UP_TO_DATE b/c the thread is not up to date");
                        new C2it(1He.A04);
                    }
                }
            }
            new C2it(r302);
        }
        return c2it;
    }
}
