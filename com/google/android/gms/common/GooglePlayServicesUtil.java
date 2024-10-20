package com.google.android.gms.common;

import X.AnonymousClass276;
import X.C26H;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: GooglePlayServicesUtil.class */
public final class GooglePlayServicesUtil {
    public static boolean A00;
    public static boolean A01;
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    public GooglePlayServicesUtil() {
    }

    public GooglePlayServicesUtil(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        if (r306.booleanValue() != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.content.Context r301, int r302) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.A00(android.content.Context, int):int");
    }

    public static boolean A01(Context context) {
        if (!A00) {
            try {
                try {
                    PackageInfo packageInfo = C26H.A00(context).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    AnonymousClass276.A00(context);
                    if (packageInfo == null || AnonymousClass276.A01(packageInfo, false) || !AnonymousClass276.A01(packageInfo, true)) {
                        A01 = false;
                    } else {
                        A01 = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                }
            } finally {
                A00 = true;
            }
        }
        return A01 || !PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(Build.TYPE);
    }

    public static boolean A02(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
