package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.5qy, reason: invalid class name */
/* loaded from: 5qy.class */
public abstract class C5qy {
    public static final 1Br A00 = 1Bq.A00(16385);

    /* JADX WARN: Type inference failed for: r0v26, types: [X.1FX, java.util.concurrent.Future, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static final C5qz A00(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        C5qz c5qz;
        int i;
        11T.A0F(fbUserSession, 1);
        11T.A0F(context, 2);
        C00j.A05("ThreadFBIDLoggingUtil.getThreadFBIDMetadataForThreadKey", 543658353);
        try {
            if (((1CO) A00.A00.get()).AZk(36326464022730391L)) {
                if (threadKey.A0z()) {
                    ?? obj = new Object();
                    long j = threadKey.A04;
                    if (j != -1) {
                        obj.set(Long.valueOf(j));
                    } else {
                        ((5P5) 1Lo.A04(context, fbUserSession, (1BY) null, 67488)).A00(new A1b((SettableFuture) obj, 3), threadKey.A01);
                    }
                    Long l = (Long) obj.get();
                    new C5qz(threadKey, l != null ? l.longValue() : 0L);
                } else {
                    new C5qz(threadKey, threadKey.A0r());
                }
                i = -1570548345;
            } else {
                new C5qz(threadKey, threadKey.A04);
                i = -1303603519;
            }
            C00j.A01(i);
            return c5qz;
        } catch (Throwable th) {
            C00j.A01(1117506404);
            throw th;
        }
    }
}
