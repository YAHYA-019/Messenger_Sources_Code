package com.facebook.googleplay;

import X.0FI;
import X.0Fc;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: GooglePlayInstallReferrerReceiver.class */
public class GooglePlayInstallReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = 0FI.A01(1843743446);
        Intent intent2 = new Intent();
        intent2.putExtras(intent);
        intent2.setClass(context, GooglePlayInstallRefererService.class);
        0Fc.A00(context, intent2, GooglePlayInstallRefererService.class);
        0FI.A0D(-1721655410, A01, intent);
    }
}
