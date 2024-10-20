package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.inject.FbInjector;

/* renamed from: X.2tb, reason: invalid class name */
/* loaded from: 2tb.class */
public abstract class C2tb {
    public static final String A00() {
        Context A00 = FbInjector.A00();
        String packageName = A00.getPackageName();
        try {
            return Build.VERSION.SDK_INT >= 30 ? A00.getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName() : A00.getPackageManager().getInstallerPackageName(packageName);
        } catch (PackageManager.NameNotFoundException e) {
            0fH.A0z("FbDownloaderModule", "Could not find installer package name for %s", e, new Object[]{packageName});
            return null;
        }
    }
}
