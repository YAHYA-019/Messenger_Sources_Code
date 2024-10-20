package com.facebook.orca.notify;

import X.0Fc;
import X.4YU;
import X.C01q;
import X.C0hu;
import android.content.Context;
import android.content.Intent;

/* loaded from: MessagesNotificationBroadcastReceiver.class */
public class MessagesNotificationBroadcastReceiver extends C0hu {
    public void A02(Context context, Intent intent, C01q c01q) {
        String action = intent.getAction();
        if (action != null) {
            Intent A0A = 4YU.A0A(action);
            A0A.setClass(context, MessagesNotificationService.class);
            A0A.putExtra("notification", intent.getParcelableExtra("notification"));
            0Fc.A00(context, A0A, MessagesNotificationService.class);
        }
    }
}
