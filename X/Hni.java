package X;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import java.util.List;

/* loaded from: Hni.class */
public final class Hni {
    public final 1BP A01 = FbInjector.A00;
    public final 1Br A00 = AbG.A0M();

    public final void A00() {
        String str;
        String formatStrLocaleSafe;
        C00i A0R = AbF.A0R(this.A00);
        StringBuilder A0k = AnonymousClass001.A0k();
        ActivityManager activityManager = (ActivityManager) FbInjector.A03.getSystemService("activity");
        if (activityManager == null) {
            str = "Null activity manager when checking for foreground service of type MEDIA_PROJECTION.";
        } else {
            List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(50);
            PackageManager packageManager = FbInjector.A03.getPackageManager();
            if (packageManager == null) {
                str = "Null package manager when checking for foreground service of type MEDIA_PROJECTION.";
            } else {
                try {
                    for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                        if (runningServiceInfo == null) {
                            formatStrLocaleSafe = "null;";
                        } else {
                            ServiceInfo serviceInfo = packageManager.getServiceInfo(runningServiceInfo.service, 0);
                            11T.A0A(serviceInfo);
                            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s-foreground:%s,started:%s,media:%s;", runningServiceInfo.service.getClassName(), Boolean.valueOf(runningServiceInfo.foreground), Boolean.valueOf(runningServiceInfo.started), Boolean.valueOf((serviceInfo.getForegroundServiceType() & 32) != 0));
                        }
                        A0k.append(formatStrLocaleSafe);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((C01s) A0R.get()).D0y("ScreenSharingServiceChecker", "Failure when checking for foreground service of type MEDIA_PROJECTION.", 1, e);
                }
                11T.A0A(A0k.toString());
                A0R.get();
                str = "Foreground service of type MEDIA_PROJECTION not found.";
            }
        }
        ((C01s) A0R.get()).D0w("ScreenSharingServiceChecker", str, 1);
    }
}
