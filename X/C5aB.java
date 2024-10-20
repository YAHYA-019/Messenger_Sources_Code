package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Iterator;

/* renamed from: X.5aB, reason: invalid class name */
/* loaded from: 5aB.class */
public final class C5aB {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(X.24X r301, java.lang.String r302) {
        /*
            r0 = r301
            r1 = r302
            boolean r0 = r0.A0Z(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L29
            r0 = r301
            r1 = r302
            X.24X r0 = r0.A0D(r1)
            r301 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            java.lang.String r0 = com.facebook.common.util.JSONUtil.A0H(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L29
            r0 = r304
            int r0 = r0.length()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L2d
        L29:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L2d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5aB.A00(X.24X, java.lang.String):boolean");
    }

    public final ThreadKey A01(FbUserSession fbUserSession, 24X r303) {
        ThreadKey threadKey;
        Object obj;
        11T.A0F(fbUserSession, 1);
        if (A00(r303, "gti")) {
            String A0H = JSONUtil.A0H(r303.A0D("gti"), null);
            threadKey = ThreadKey.A08(A0H != null ? Long.parseLong(A0H) : 0L);
        } else {
            Iterator it = C7mg.A00.iterator();
            while (true) {
                threadKey = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (A00(r303, (String) obj)) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                long parseLong = Long.parseLong(((1G1) fbUserSession).A05);
                String A0H2 = JSONUtil.A0H(r303.A0D(str), null);
                return ThreadKey.A0H(A0H2 != null ? Long.parseLong(A0H2) : 0L, parseLong);
            }
        }
        return threadKey;
    }
}
