package com.facebook.messaging.marketplace.plugins.folder.hidemenuitem;

import X.11T;
import X.1BK;
import X.1BY;
import X.1Lo;
import X.1Um;
import X.Czj;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;

/* loaded from: HideMarketplaceFolderMenuItem.class */
public final class HideMarketplaceFolderMenuItem {
    public static final void A00(Context context, FbUserSession fbUserSession) {
        11T.A0H(context, fbUserSession);
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04(context, fbUserSession, (1BY) null, 68144);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        Czj.A01(AQV, 1BK.A0P(AQV), mailboxFeature, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r0.A04 != r0.intValue()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.messaging.model.threads.ThreadSummary r301, X.2SI r302) {
        /*
            r0 = r301
            r1 = r302
            X.11T.A0H(r0, r1)
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r303 = r0
            r0 = r303
            boolean r0 = r0.A1E()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L3e
            X.1F9 r0 = X.1F9.A0K
            java.lang.Integer r0 = r0.A01()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3e
            r0 = r303
            long r0 = r0.A04
            r307 = r0
            r0 = r306
            int r0 = r0.intValue()
            long r0 = (long) r0
            r309 = r0
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = 1
            r311 = r0
            r0 = r304
            if (r0 == 0) goto L43
        L3e:
            r0 = 0
            r311 = r0
            r0 = 0
            r303 = r0
        L43:
            X.2SI r0 = X.2SI.A09
            r306 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L56
            r0 = r311
            if (r0 == 0) goto L56
            r0 = r305
            return r0
        L56:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.marketplace.plugins.folder.hidemenuitem.HideMarketplaceFolderMenuItem.A01(com.facebook.messaging.model.threads.ThreadSummary, X.2SI):boolean");
    }
}
