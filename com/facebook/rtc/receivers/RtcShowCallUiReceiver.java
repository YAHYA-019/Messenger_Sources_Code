package com.facebook.rtc.receivers;

import X.11T;
import X.1BJ;
import X.1BV;
import X.1De;
import X.1Lm;
import X.4YV;
import X.51V;
import X.7zL;
import X.7zR;
import X.C01q;
import X.CJ5;
import X.GOn;
import X.HBr;
import X.I9I;
import X.IRF;
import X.IZI;
import X.JOJ;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.UserKey;

/* loaded from: RtcShowCallUiReceiver.class */
public final class RtcShowCallUiReceiver extends 51V {
    public RtcShowCallUiReceiver() {
        super(new String[]{"RTC_SHOW_CALL_UI", "RTC_SHOW_CALL_UI_AND_UNMUTE"});
    }

    public void A09(Context context, Intent intent, C01q c01q, String str) {
        String stringExtra;
        11T.A0F(context, 0);
        7zR.A1N(intent, str);
        FbUserSession A0E = 4YV.A0E(context);
        1BV A0R = 7zL.A0R(context, 115407);
        IRF irf = (IRF) 1Lm.A05(context, A0E, 99979);
        irf.A0q("RtcShowCallUiReceiver");
        if ("RTC_SHOW_CALL_UI_AND_UNMUTE".equals(str)) {
            ((I9I) A0R.get()).A04(A0E, "MUTE_DETECTION_OUT_OF_CALL_NOTIFICATION_UMUTE_ACTION_TAPPED", "OUT_OF_CALL");
            irf.A07.A02(false);
            Object systemService = context.getSystemService("notification");
            11T.A0I(systemService, 1BJ.A00(18));
            ((NotificationManager) systemService).cancel(10064);
            return;
        }
        if (!"RTC_SHOW_CALL_UI".equals(str) || (stringExtra = intent.getStringExtra("INCALL_NOTIFICATION_TYPE_KEY")) == null) {
            return;
        }
        HBr valueOf = HBr.valueOf(stringExtra);
        CJ5 cj5 = (CJ5) 1Lm.A05(context, A0E, 83620);
        IZI izi = (JOJ) 1Lm.A05(context, A0E, 83902);
        if (valueOf.ordinal() == 6) {
            IZI izi2 = izi;
            GOn.A1R(izi2.A01, (I9I) 1De.A00(izi2.A02, 115407), "SAFETY_WARNING_ELIGIBLE_PARTICIPANT_ADDED_NOTIFICATION_TAPPED");
            UserKey userKey = cj5.A00;
            if (userKey != null) {
                cj5.A0D.add(userKey);
            }
            cj5.A02(true);
        }
    }
}
