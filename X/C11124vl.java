package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vl.class */
public final class C11124vl {
    public final 1Br A00;
    public final C11144vn A01;

    public C11124vl(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = 1Bq.A00(99390);
        this.A01 = (C11144vn) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 83240);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(X.1Br.A00(r301.A00)) <= r306) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            X.4vn r0 = r0.A01
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            r0 = r302
            java.lang.Long r0 = r0.A00     // Catch: java.lang.Throwable -> L89
            r303 = r0
            r0 = r302
            monitor-exit(r0)
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L83
            r0 = r303
            long r0 = r0.longValue()
            r306 = r0
            r0 = r306
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 <= 0) goto L4b
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r309 = r0
            r0 = r301
            X.1Br r0 = r0.A00
            r303 = r0
            r0 = r303
            long r0 = X.1Br.A00(r0)
            r310 = r0
            r0 = r309
            r1 = r310
            long r0 = r0.toSeconds(r1)
            r304 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r312 = r0
            r0 = r308
            if (r0 > 0) goto L51
        L4b:
            r0 = 0
            r312 = r0
            r0 = 0
            r309 = r0
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            java.lang.String r1 = "isNotificationRoutingEnabledByMsys::fbmEnabledTimeStamp - "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            r1 = r306
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            java.lang.String r1 = ", isNotiRoutingEnabledByMsys : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            r1 = r312
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            java.lang.String r0 = r0.toString()
            r302 = r0
            java.lang.String r0 = "MessagingNotificationSessionVariablesUtils"
            r1 = r302
            X.0fH.A0j(r0, r1)
            r0 = r312
            return r0
        L83:
            r0 = 0
            r306 = r0
            goto L4b
        L89:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11124vl.A00():boolean");
    }
}
