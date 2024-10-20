package com.facebook.messaging.notify.plugins.failedtosend.handler;

import X.1BL;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.5qH;
import X.AbH;
import X.C00i;
import X.C10904ux;
import X.C10914uy;
import X.C50c;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.FailedToSendMessageNotification;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;

/* loaded from: FailedToSendNotificationHandlerImplementation.class */
public final class FailedToSendNotificationHandlerImplementation {
    public final C00i A00 = AbH.A0b();
    public final C00i A02 = 1BQ.A02(49839);
    public final C00i A04 = 1BQ.A02(49845);
    public final C00i A03 = AbH.A0a();
    public final C00i A01 = 1BQ.A02(49803);

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.50c] */
    public static C10914uy A00(Context context, FailedToSendMessageNotification failedToSendMessageNotification, FailedToSendNotificationHandlerImplementation failedToSendNotificationHandlerImplementation, String str, String str2) {
        C10914uy A00 = ((C10904ux) 1Bn.A0E(context, (1BY) null, 49358)).A00(context, null, failedToSendMessageNotification, 10001);
        boolean A1Z = AbH.A1Z(A00, 1BL.A08(failedToSendNotificationHandlerImplementation.A03));
        A00.A0L(str);
        A00.A0K(str2);
        A00.A0M(str2);
        A00.A0N(A1Z);
        ((5qH) failedToSendNotificationHandlerImplementation.A04.get()).A00(A00, (ThreadKey) null, (C50c) new Object(), (ServerMessageAlertFlags) null);
        return A00;
    }
}
