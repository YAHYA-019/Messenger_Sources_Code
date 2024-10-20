package com.facebook.rtc.notification;

import X.0FI;
import X.1BK;
import X.1BL;
import X.C09h;
import X.GOo;
import X.HCL;
import X.I6E;
import X.JOK;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: RtcMultiCallActionReceiver.class */
public final class RtcMultiCallActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(-915029749);
        boolean A1X = 1BL.A1X(context, intent);
        if (C09h.A03().A04(context, intent, this)) {
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1016139507 && action.equals("com.facebook.rtc.notification.DECLINE_MULTI_CALL_ACTION")) {
                String stringExtra = intent.getStringExtra("local_call_id");
                if (stringExtra == null) {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A0D(1281642503, A01, intent);
                    throw A0h;
                }
                I6E.A00(HCL.A0y, stringExtra, null, null);
                JOK A0Z = GOo.A0Z(stringExtra);
                if (A0Z != null) {
                    A0Z.AWz().removeWhenEnded();
                    A0Z.AWz().end(0, "decline_multi_call_via_notification", A1X);
                }
            } else {
                HCL hcl = HCL.A15;
                String action2 = intent.getAction();
                if (action2 == null) {
                    action2 = "";
                }
                I6E.A00(hcl, null, null, 1BK.A1D("action", action2));
            }
            i = 1085486319;
        } else {
            i = 1799415529;
        }
        0FI.A0D(i, A01, intent);
    }
}
