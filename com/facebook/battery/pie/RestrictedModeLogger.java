package com.facebook.battery.pie;

import X.04J;
import X.1BK;
import X.1BQ;
import X.1G0;
import X.1G9;
import X.1Ql;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.52K;
import X.C00i;
import android.app.ActivityManager;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.mapbox.mapboxsdk.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: RestrictedModeLogger.class */
public final class RestrictedModeLogger {
    public static final 1G9 A05;
    public static final 1G9 A06;
    public static final 1G9 A07;
    public final C00i A04 = new 1BQ(49468);
    public final C00i A03 = new 1BQ(33013);
    public final C00i A01 = new 1BQ(16385);
    public final C00i A02 = new 1BQ(66191);
    public final C00i A00 = new 1BQ(16634);

    static {
        1G9 A0F = 1G0.A08.A0F("battery");
        A05 = A0F;
        A07 = A0F.A0F("restricted_mode");
        A06 = A0F.A0F("restricted_app_version");
    }

    public static void A00(RestrictedModeLogger restrictedModeLogger) {
        boolean z;
        synchronized (restrictedModeLogger) {
            C00i c00i = restrictedModeLogger.A03;
            c00i.get();
            52K r0 = (52K) restrictedModeLogger.A04.get();
            try {
                Method method = r0.A01;
                if (method == null) {
                    method = ActivityManager.class.getMethod("isBackgroundRestricted", new Class[0]);
                    r0.A01 = method;
                }
                Object invoke = method.invoke(r0.A02, new Object[0]);
                invoke.getClass();
                z = ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                1BK.A09(r0.A03).softReport("RestrictedModeChecker", "Unable to check for restricted mode", e);
                z = false;
            }
            restrictedModeLogger.A02.get();
            FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
            1G9 r02 = A07;
            boolean z2 = false;
            boolean AZn = fbSharedPreferences.AZn(r02, false);
            FbSharedPreferences fbSharedPreferences2 = (FbSharedPreferences) c00i.get();
            1G9 r03 = A06;
            String BD0 = fbSharedPreferences2.BD0(r03);
            boolean z3 = false;
            if (z != AZn) {
                z3 = true;
            }
            if (BD0 != null && !BD0.equals(BuildConfig.VERSION_NAME)) {
                z2 = true;
            }
            if (z3 || z2) {
                1UG A00 = 1UD.A00((04J) restrictedModeLogger.A00.get(), z ? 1ZG.A02 : 1ZG.A01, "android_restricted_mode");
                if (A00.isSampled()) {
                    A00.A5H("restricted_mode_enabled", Boolean.valueOf(z));
                    A00.BZL();
                }
                1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
                edit.CaL(r03, BuildConfig.VERSION_NAME);
                edit.putBoolean(r02, z).commit();
            }
        }
    }
}
