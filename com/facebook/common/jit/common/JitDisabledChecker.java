package com.facebook.common.jit.common;

import X.0Xe;
import android.app.Application;
import android.content.pm.PackageManager;
import android.text.SpannedString;
import com.facebook.common.dextricks.Constants;

/* loaded from: JitDisabledChecker.class */
public final class JitDisabledChecker {
    public static final boolean VM_SAFE_MODE_ENABLED;
    public static final boolean sIsJitDisabled;

    static {
        Application A00 = 0Xe.A00();
        boolean z = false;
        try {
            if (A00.getPackageManager() != null) {
                if ((A00.getPackageManager().getApplicationInfo(A00.getPackageName(), 0).flags & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        VM_SAFE_MODE_ENABLED = z;
        sIsJitDisabled = z;
    }

    public static boolean testCompileMethod(int i) {
        boolean z = false;
        if (new SpannedString("Test").length() > i) {
            z = true;
        }
        return z;
    }
}
