package com.facebook.messaging.notify.plugins.handler.messagereminder;

import X.1BL;
import X.1BV;
import X.1HH;
import X.AbI;
import X.C01q;
import X.C0hs;
import X.C5dz;
import X.F8q;
import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MessageNotificationSurveyReceiver.class */
public final class MessageNotificationSurveyReceiver extends C0hs {
    public void A02(Context context, Intent intent, C01q c01q) {
        boolean A1X = 1BL.A1X(context, intent);
        1BV A00 = 1BV.A00(49805);
        1HH A0J = AbI.A0J(context);
        String action = intent.getAction();
        ThreadKey A0K = ThreadKey.A0K(intent.getStringExtra("thread_key"), A1X);
        if (A0K != null) {
            if ("com.facebook.messaging.notify.plugins.handler.messagereminder.MESSAGE_NOTIF_SURVEY_ACTION_USEFUL".equals(action)) {
                C5dz.A01(A0K, (C5dz) A00.get(), "notification_useful_action_tapped");
            }
            if ("com.facebook.messaging.notify.plugins.handler.messagereminder.MESSAGE_NOTIF_SURVEY_ACTION_NOT_USEFUL".equals(action)) {
                C5dz.A01(A0K, (C5dz) A00.get(), "notification_not_useful_action_tapped");
            }
            AbI.A1V((F8q) A0J.get(), 2131962257, false);
        }
    }
}
