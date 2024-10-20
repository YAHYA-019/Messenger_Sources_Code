package com.facebook.errorreporting.lacrima.detector.broadcast;

import X.0fH;
import X.AnonymousClass001;
import X.C01q;
import X.C0hq;
import android.content.Context;
import android.content.Intent;

/* loaded from: PublicLockScreenBroadcastReceiver.class */
public class PublicLockScreenBroadcastReceiver extends C0hq {
    public void A02(Context context, Intent intent, C01q c01q) {
        if (intent.getAction().equals("com.instagram.android.intent.action.ACTION_SCREEN_OFF")) {
            0fH.A0j("lacrima", "LockScreenBroadcastReceiver screen off");
            throw AnonymousClass001.A0Q("getDetectorByClass");
        }
        if (intent.getAction().equals("com.instagram.android.intent.action.ACTION_SCREEN_ON")) {
            0fH.A0j("lacrima", "LockScreenBroadcastReceiver screen on");
            throw AnonymousClass001.A0Q("getDetectorByClass");
        }
    }
}
