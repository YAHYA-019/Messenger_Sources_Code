package com.facebook.rti.orca;

import X.0FI;
import X.0fH;
import X.1Bi;
import X.AbstractC02273uo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: UpdateQeBroadcastReceiver.class */
public class UpdateQeBroadcastReceiver extends BroadcastReceiver {
    public FbnsLiteInitializer A00;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(-1871418952);
        AbstractC02273uo.A00(context);
        this.A00 = (FbnsLiteInitializer) 1Bi.A03(38);
        0fH.A07(UpdateQeBroadcastReceiver.class, intent, "onReceive %s");
        if (intent == null) {
            i = 1642406575;
        } else if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            FbnsLiteInitializer fbnsLiteInitializer = this.A00;
            fbnsLiteInitializer.getClass();
            fbnsLiteInitializer.A05();
            0fH.A0A(UpdateQeBroadcastReceiver.class, "FBNS client started on package replacement");
            i = 1717474013;
        } else {
            i = -1663257527;
        }
        0FI.A0D(i, A01, intent);
    }
}
