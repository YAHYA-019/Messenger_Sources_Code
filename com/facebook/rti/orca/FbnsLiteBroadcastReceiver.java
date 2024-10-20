package com.facebook.rti.orca;

import X.0FI;
import X.0MY;
import X.0MZ;
import X.0Pz;
import X.0fH;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.rti.push.service.FbnsServiceDelegate;

/* loaded from: FbnsLiteBroadcastReceiver.class */
public class FbnsLiteBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String packageName;
        String str;
        String A04;
        String str2;
        int i;
        int A01 = 0FI.A01(-377315342);
        0fH.A07(FbnsLiteBroadcastReceiver.class, intent, "onReceive %s");
        if (intent == null) {
            i = 1749805353;
        } else {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                0fH.A0A(FbnsLiteBroadcastReceiver.class, "MQTT client started on user present");
                packageName = context.getPackageName();
                str = "USER_PRESENT";
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo != null) {
                    str = 0Pz.A0W(networkInfo.getTypeName().toUpperCase(), networkInfo.isConnected() ? ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL : "-0");
                } else {
                    str = "NET_NULL";
                }
                packageName = context.getPackageName();
            } else {
                if ("com.facebook.rti.mqtt.intent.ACTION_WAKEUP".equals(intent.getAction())) {
                    0fH.A0A(FbnsLiteBroadcastReceiver.class, "FBNS service started on GCM wake up");
                    packageName = context.getPackageName();
                    str = "GCM_WAKEUP";
                    if (packageName == null) {
                        packageName = context.getPackageName();
                    }
                    A04 = FbnsServiceDelegate.A04(packageName);
                    str2 = "Orca.FORCE_KICK";
                    0MZ.A03(context, (0MY) null, A04, str, packageName, str2, false);
                }
                i = 1381417081;
            }
            if (packageName == null) {
                packageName = context.getPackageName();
            }
            A04 = FbnsServiceDelegate.A04(packageName);
            str2 = "Orca.START";
            0MZ.A03(context, (0MY) null, A04, str, packageName, str2, false);
            i = 1381417081;
        }
        0FI.A0D(i, A01, intent);
    }
}
