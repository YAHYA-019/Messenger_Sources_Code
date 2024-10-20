package com.facebook.acra.util;

import X.0Pz;
import X.0fH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.os.Build;
import android.os.Process;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: CrashTimeDataCollectorHelper.class */
public class CrashTimeDataCollectorHelper {
    public static final String LOG_TAG = "ACRA";
    public static final String TIME_STAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ";

    public static String formatAppInstallTime(long j) {
        return formatTimestamp(j);
    }

    public static String formatAppUpgradeTime(long j) {
        return formatTimestamp(j);
    }

    public static String formatTimestamp(long j) {
        return new SimpleDateFormat(TIME_STAMP_FORMAT, Locale.US).format(new Date(j));
    }

    public static UUID generateReportUuid() {
        try {
            return UUID.randomUUID();
        } catch (Throwable unused) {
            return UUID.nameUUIDFromBytes(String.format("%s-%s-%s", AnonymousClass002.A0G(), Long.valueOf(System.nanoTime()), Integer.valueOf(Process.myTid())).getBytes());
        }
    }

    public static String getJailStatus() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return "yes";
        }
        try {
            if (AnonymousClass001.A1X("/system/app/Superuser.apk")) {
                return "yes";
            }
        } catch (Exception e) {
            0fH.A0s(LOG_TAG, "Failed to find Superuser.pak", e);
        }
        Map<String, String> map = System.getenv();
        if (map == null) {
            return "no";
        }
        String[] split = AnonymousClass001.A0b("PATH", map).split(":");
        int length = split.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return "no";
            }
            try {
            } catch (Exception e2) {
                0fH.A0s(LOG_TAG, "Failed to find su binary in the PATH", e2);
            }
            if (AnonymousClass001.A1X(0Pz.A0W(split[i2], "/su"))) {
                return "yes";
            }
            i = i2 + 1;
        }
    }
}
