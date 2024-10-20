package com.facebook.errorreporting.lacrima.detector.broadcast;

import X.08Z;
import X.0CN;
import X.0Ig;
import X.0fH;
import X.1AM;
import X.AnonymousClass001;
import X.C01q;
import X.C08b;
import X.C1AJ;
import android.content.Context;
import android.content.Intent;

/* loaded from: ProtectedLockScreenBroadcastReceiver.class */
public class ProtectedLockScreenBroadcastReceiver extends 1AM implements C01q {
    public static final C1AJ A01 = new Object();
    public static final 08Z A00 = new 08Z();

    public ProtectedLockScreenBroadcastReceiver() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtectedLockScreenBroadcastReceiver(int i) {
        this.A00 = new C08b(A00, A01);
    }

    public void A02(Context context, Intent intent, C01q c01q) {
        if (0Ig.A00(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
            0fH.A0j("lacrima", "LockScreenBroadcastReceiver screen off");
            throw AnonymousClass001.A0Q("getDetectorByClass");
        }
        if (0Ig.A00(intent.getAction(), "android.intent.action.SCREEN_ON")) {
            0fH.A0j("lacrima", "LockScreenBroadcastReceiver screen on");
            throw AnonymousClass001.A0Q("getDetectorByClass");
        }
    }

    public final boolean A03(String str) {
        boolean z = false;
        if (str != null && (0CN.A00(str) || 0CN.A07.contains(str))) {
            z = true;
        }
        return z;
    }
}
