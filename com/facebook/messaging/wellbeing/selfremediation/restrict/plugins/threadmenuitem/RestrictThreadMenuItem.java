package com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadmenuitem;

import X.11T;
import X.1BY;
import X.1Lo;
import X.4YU;
import X.7zQ;
import X.C5ws;
import X.I9B;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: RestrictThreadMenuItem.class */
public final class RestrictThreadMenuItem {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r304 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C9T A00(android.content.Context r301, com.facebook.user.model.User r302) {
        /*
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r302
            com.facebook.user.model.Name r0 = r0.A0X
            r303 = r0
            r0 = r303
            java.lang.String r0 = r0.firstName
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1c
        L19:
            java.lang.String r0 = ""
            r304 = r0
        L1c:
            X.CQE r0 = new X.CQE
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = r305
            r1 = 39
            r0.A00 = r1
            X.1u3 r0 = X.C1u3.A4L
            r303 = r0
            r0 = r305
            r1 = r303
            r0.A06(r1)
            r0 = 2131967192(0x7f133cd8, float:1.9571243E38)
            r306 = r0
            r0 = r301
            r1 = r305
            r2 = r306
            X.CQE.A04(r0, r1, r2)
            r0 = r301
            r1 = r304
            r2 = 2131967017(0x7f133c29, float:1.9570888E38)
            java.lang.String r0 = X.1BK.A0v(r0, r1, r2)
            r307 = r0
            r0 = r301
            r1 = r306
            java.lang.String r0 = r0.getString(r1)
            r303 = r0
            r0 = r307
            java.lang.String r1 = ", "
            r2 = r303
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r303 = r0
            r0 = r305
            r1 = r303
            r0.A08(r1)
            r0 = r305
            java.lang.String r1 = "restrict_user"
            X.C9T r0 = X.CQE.A01(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadmenuitem.RestrictThreadMenuItem.A00(android.content.Context, com.facebook.user.model.User):X.C9T");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(android.content.Context r301, X.06Z r302, com.facebook.auth.usersession.FbUserSession r303, com.facebook.messaging.model.threads.ThreadSummary r304, com.facebook.user.model.User r305) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadmenuitem.RestrictThreadMenuItem.A01(android.content.Context, X.06Z, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.User):void");
    }

    public static final boolean A02(Context context, FbUserSession fbUserSession, User user, Capabilities capabilities) {
        11T.A0H(context, capabilities);
        11T.A0F(fbUserSession, 3);
        if (!4YU.A1Y(capabilities, 85) || C5ws.A00(user)) {
            return false;
        }
        return user == null || !((I9B) 1Lo.A04(context, fbUserSession, (1BY) null, 82499)).A04(7zQ.A0H(user));
    }
}
