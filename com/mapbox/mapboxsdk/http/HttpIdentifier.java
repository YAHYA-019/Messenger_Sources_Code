package com.mapbox.mapboxsdk.http;

import X.JQz;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.mapbox.mapboxsdk.MapStrictMode;

/* loaded from: HttpIdentifier.class */
public class HttpIdentifier {
    public static String getIdentifier() {
        return getIdentifier(JQz.A0J());
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, java.lang.String] */
    public static String getIdentifier(Context context) {
        ?? format;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            format = String.format("%s/%s (%s)", context.getPackageName(), packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
            return format;
        } catch (Exception unused) {
            MapStrictMode.strictModeViolation((Throwable) format);
            return "";
        }
    }
}
