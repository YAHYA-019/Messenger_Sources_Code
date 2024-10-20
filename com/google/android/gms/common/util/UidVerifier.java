package com.google.android.gms.common.util;

import X.AnonymousClass001;
import X.AnonymousClass276;
import X.C26H;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: UidVerifier.class */
public abstract class UidVerifier {
    public static boolean A00(Context context, int i) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C26H.A00(context).A00.getSystemService("appops");
            if (appOpsManager == null) {
                throw AnonymousClass001.A0Q("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, "com.google.android.gms");
            try {
                return AnonymousClass276.A00(context).A02(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (!Log.isLoggable("UidVerifier", 3)) {
                    return false;
                }
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                return false;
            }
        } catch (SecurityException unused2) {
            return false;
        }
    }
}
