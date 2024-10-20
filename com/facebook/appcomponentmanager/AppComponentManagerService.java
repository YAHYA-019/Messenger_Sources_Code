package com.facebook.appcomponentmanager;

import X.0Fe;
import X.0WW;
import X.0WY;
import X.0fH;
import X.0oU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C01v;
import X.C0fu;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;

/* loaded from: AppComponentManagerService.class */
public class AppComponentManagerService extends 0Fe {
    /* JADX WARN: Multi-variable type inference failed */
    public void onHandleWork(Intent intent) {
        0fH.A0g(intent.getAction(), "AppComponentManagerService", "onHandleIntent action[%s]");
        if ("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS".equals(intent.getAction())) {
            try {
                0fH.A0j("AppComponentManagerService", "Starting component enabling process");
                C01v.A05(this, "app_update");
                0fH.A0j("AppComponentManagerService", "Sending completion notification");
                Intent intent2 = new Intent("com.facebook.appcomponentmanager.ENABLING_CMPS_DONE");
                intent2.setPackage(getPackageName());
                sendBroadcast(intent2);
                return;
            } catch (RuntimeException e) {
                0fH.A0r("AppComponentManagerService", "Exception while enabling components. Aborting.", e);
                0oU A00 = C0fu.A00();
                if (A00 != null) {
                    A00.A00(e);
                    return;
                }
                return;
            }
        }
        if ("com.facebook.appcomponentmanager.ACTION_EFNORCE_MANIFEST_CONSISTENCY".equals(intent.getAction())) {
            0fH.A0j("AppComponentManagerService", "enforceManifestConsistency() - started");
            PackageManager packageManager = getPackageManager();
            0WY r0 = new 0WY();
            File A0B = AnonymousClass001.A0B(this);
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);
                0WW A03 = r0.A03(A0B);
                int i = packageInfo.versionCode;
                String num = Integer.toString(i);
                String str = A03.A01;
                if (!num.equals(str) || !packageInfo.versionName.equals(A03.A02) || !packageInfo.packageName.equals(A03.A00)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("PackageInfo{package=");
                    AnonymousClass001.A1D(packageInfo.packageName, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "versionCode=", A0k);
                    A0k.append(i);
                    A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    A0k.append("versionName=");
                    A0k.append(packageInfo.versionName);
                    A0k.append("} ,");
                    A0k.append("Manifest{package=");
                    AnonymousClass001.A1D(A03.A00, ", ", "versionCode=", A0k);
                    AnonymousClass001.A1D(str, ", ", "versionName=", A0k);
                    A0k.append(A03.A02);
                    A0k.append(", ");
                    A0k.append("activities=");
                    A0k.append(A03.A03.size());
                    A0k.append(", ");
                    A0k.append("receivers=");
                    A0k.append(A03.A05.size());
                    A0k.append(", ");
                    A0k.append("services=");
                    A0k.append(A03.A06.size());
                    A0k.append(", ");
                    A0k.append("providers=");
                    A0k.append(A03.A04.size());
                    throw AnonymousClass002.A0F("}", A0k);
                }
            } catch (Throwable th) {
                0oU A002 = C0fu.A00();
                if (A002 != null) {
                    A002.A00(th);
                } else {
                    0fH.A0r("AppComponentManagerService", "enforceManifestConsistency failed", th);
                }
            }
            0fH.A0j("AppComponentManagerService", "enforceManifestConsistency() - completed");
        }
    }
}
