package com.facebook.rtc.notification;

import X.0FI;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.GOo;
import X.I6E;
import X.JOK;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.rsys.callmanager.gen.CallApi;
import java.util.ArrayList;

/* loaded from: NotificationDeletedBroadcastReceiver.class */
public final class NotificationDeletedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        JOK A0Z;
        CallApi AWz;
        int A01 = 0FI.A01(-176658916);
        boolean A1X = 1BL.A1X(context, intent);
        String stringExtra = intent.getStringExtra("notification_type_tag");
        String stringExtra2 = intent.getStringExtra("local_call_id");
        if (stringExtra2 == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A0D(-1914513611, A01, intent);
            throw A0h;
        }
        boolean booleanExtra = intent.getBooleanExtra("for_foreground", false);
        ArrayList A0s = AnonymousClass001.A0s();
        if (stringExtra != null) {
            A0s.add(stringExtra);
        }
        if (booleanExtra) {
            A0s.add("foreground");
        }
        I6E.A01("call_notification_dismissed", stringExtra2, null, A0s, null, false);
        if (intent.getBooleanExtra("end_call_on_notification_dismiss", false) && (A0Z = GOo.A0Z(stringExtra2)) != null && (AWz = A0Z.AWz()) != null) {
            AWz.end(0, "call_notification_dismissed", A1X);
        }
        0FI.A0D(396870345, A01, intent);
    }
}
