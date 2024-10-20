package com.facebook.messaging.notificationsound.plugins.customthreadsound.notification.threadsettingsrow;

import X.11T;
import X.1BK;
import X.2MQ;
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

/* loaded from: ThreadSettingsNotificationSoundRow.class */
public final class ThreadSettingsNotificationSoundRow {
    public static final Cug A00(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 0);
        if (threadSummary == null) {
            throw 1BK.A0h();
        }
        CHv cHv = new CHv(2MQ.A0S, (C1ut) null);
        CQg A00 = CQg.A00();
        CQg.A07(context, A00, 2131967166);
        CQg.A08(BNV.A1S, A00);
        A00.A00 = 1280034128L;
        A00.A04 = cHv;
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A0o, (C1ut) null, (Boolean) null);
        return CQg.A04(A00, threadSummary, 22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, boolean] */
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
            r0 = 66536(0x103e8, float:9.3237E-41)
            r304 = r0
            r0 = r301
            if (r0 == 0) goto L4c
            r0 = r302
            r1 = 54
            boolean r0 = X.4YU.A1Y(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4c
            r0 = r304
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L22
            r305 = r0
            goto L23
        L22:
            throw r0
        L23:
            r0 = r305
            X.21W r0 = (X.21W) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.A09()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4e
            r0 = r305
            X.1CO r0 = X.21W.A00(r0)
            r301 = r0
            r0 = 36314201892003595(0x81039300131f0b, double:3.0285857298326575E-306)
            r306 = r0
            r0 = r301
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4e
        L4c:
            r0 = 0
            return r0
        L4e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.notificationsound.plugins.customthreadsound.notification.threadsettingsrow.ThreadSettingsNotificationSoundRow.A01(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }
}
