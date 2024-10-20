package com.facebook.rtc.receivers;

import X.0FI;
import X.11T;
import X.1BL;
import X.1Bi;
import X.1Lm;
import X.1Ql;
import X.2QN;
import X.2QO;
import X.4YV;
import X.4zI;
import X.51K;
import X.C0dr;
import X.C4A7;
import X.GOn;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: RtcDeviceStateBroadcastReceiver.class */
public final class RtcDeviceStateBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(1710371530);
        11T.A0H(context, intent);
        if (11T.A0O(intent.getAction(), "android.intent.action.ACTION_SHUTDOWN")) {
            2QN r0 = (2QO) 1Lm.A05(context, 4YV.A0E(context), 99977);
            if (r0.A00 != 0) {
                C4A7 c4a7 = (C4A7) 1Bi.A03(32928);
                FbSharedPreferences A0W = 1BL.A0W();
                C0dr c0dr = (C0dr) 1Bi.A03(84489);
                4zI.A03.A05("RtcDeviceStateBroadcastReceiver", "Logging device shutdown info for ongoing RTC call %d %s", new Object[]{Integer.valueOf(GOn.A03(c4a7.A01(), 100.0f)), r0.A0r});
                1Ql edit = A0W.edit();
                edit.CaH(51K.A0Q, c0dr.now());
                edit.CaE(51K.A0O, GOn.A03(c4a7.A01(), 100.0f));
                edit.CaL(51K.A0P, r0.A0r);
                edit.commitImmediately();
            }
            i = 1828570254;
        } else {
            i = -2109117098;
        }
        0FI.A0D(i, A01, intent);
    }
}
