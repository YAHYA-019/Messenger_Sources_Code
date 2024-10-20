package com.facebook.messaging.accountswitch;

import X.1BK;
import X.2jF;
import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: SwitchAccountIntentHandler.class */
public final class SwitchAccountIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Intent A09;
        List A0T = C3o5.A0T(intent);
        boolean z = false;
        if (!A0T.isEmpty() && "halfsheetaccountswitcher".equals(A0T.get(0))) {
            z = true;
        }
        if (z) {
            A09 = new Intent();
            Bundle A05 = 1BK.A05();
            A05.putBoolean("EXTRA_OPEN_HALF_SHEET_ACCOUNT_SWITCHER", true);
            A05.putInt("intent_handler_delegate_arg1", 0);
            A05.putString("intent_handler_delegate_method", "openHome");
            A09.putExtras(A05);
        } else {
            A09 = C3o5.A09(context);
            A09.setFlags(67108864);
            List A0T2 = C3o5.A0T(intent);
            if (!A0T2.isEmpty() && "triggersso".equals(A0T2.get(0))) {
                A09.setAction("com.facebook.messaging.accountswitch.TRIGGER_SSO");
            }
            C3o5.A0b(intent, A09, "from_notification");
            C3o5.A0c(intent, A09, "extra_account_switch_target_uid");
            C3o5.A0c(intent, A09, "extra_account_switch_redirect_source");
            if (intent.hasExtra("silent_switch_account")) {
                A09.putExtra("silent_switch_account", intent.getBooleanExtra("silent_switch_account", false));
                Parcelable parcelableExtra = intent.getParcelableExtra("pending_intent_post_switch_account");
                ConcurrentLinkedQueue concurrentLinkedQueue = 2jF.A01;
                if (parcelableExtra != null) {
                    concurrentLinkedQueue.add(parcelableExtra);
                    return A09;
                }
            }
        }
        return A09;
    }
}
