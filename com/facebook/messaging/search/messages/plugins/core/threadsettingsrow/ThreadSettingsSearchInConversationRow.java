package com.facebook.messaging.search.messages.plugins.core.threadsettingsrow;

import X.11T;
import X.1BK;
import X.2MQ;
import X.2oI;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsSearchInConversationRow.class */
public final class ThreadSettingsSearchInConversationRow {
    public static final Cug A00(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 0);
        if (threadSummary == null) {
            throw 1BK.A0h();
        }
        CQg A00 = CQg.A00();
        int i = 2131959875;
        if (2oI.A03(threadSummary)) {
            i = 2131959874;
        }
        CQg.A07(context, A00, i);
        CQg.A08(BNV.A20, A00);
        CQg.A09(A00, ThreadSettingsSearchInConversationRow.class);
        CHv.A00(2MQ.A1x, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A4D, (C1ut) null, (Boolean) null);
        return CQg.A04(A00, threadSummary, 64);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (X.4YU.A1Y(r302, 34) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.messaging.model.threads.ThreadSummary r301, com.facebook.xapp.messaging.capability.vector.Capabilities r302) {
        /*
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            if (r0 == 0) goto L18
            r0 = r302
            r1 = 34
            boolean r0 = X.4YU.A1Y(r0, r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1a
        L18:
            r0 = 0
            r303 = r0
        L1a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.search.messages.plugins.core.threadsettingsrow.ThreadSettingsSearchInConversationRow.A01(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }
}
