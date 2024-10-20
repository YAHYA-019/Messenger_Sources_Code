package com.facebook.acra.util;

import X.0fH;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: PackageManagerWrapper.class */
public final class PackageManagerWrapper {
    public final Context context;
    public final String logTag;

    public PackageManagerWrapper(Context context, String str) {
        this.context = context;
        this.logTag = str;
    }

    public String getInstallerPackageName() {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        return packageManager.getInstallerPackageName(this.context.getPackageName());
    }

    public PackageInfo getPackageInfo() {
        return getPackageInfo(this.context.getPackageName(), 0);
    }

    public PackageInfo getPackageInfo(String str, int i) {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            0fH.A0i(this.context.getPackageName(), this.logTag, "Failed to find PackageInfo for current App : %s");
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public boolean hasPermission(String str) {
        PackageManager packageManager = this.context.getPackageManager();
        boolean z = false;
        if (packageManager == null) {
            return false;
        }
        try {
            if (packageManager.checkPermission(str, this.context.getPackageName()) == 0) {
                z = true;
            }
        } catch (RuntimeException unused) {
        }
        return z;
    }
}
