package com.facebook.advancedcryptotransport;

import X.1Fi;
import X.1Oy;
import X.InterfaceC00051a0;
import android.content.Context;

/* loaded from: ACTRegistrationDeviceIdProvider.class */
public class ACTRegistrationDeviceIdProvider {
    public static volatile 1Fi sSharedPrefs;

    public static void initialize(Context context) {
        synchronized (ACTRegistrationDeviceIdProvider.class) {
            if (sSharedPrefs == null) {
                sSharedPrefs = 1Oy.A00(context);
            }
        }
    }

    public static String readRegisteredDeviceId(String str) {
        if (sSharedPrefs == null) {
            return null;
        }
        return sSharedPrefs.getString(str, (String) null);
    }

    public static void removeRegisteredDeviceId(String str) {
        if (sSharedPrefs.contains(str)) {
            InterfaceC00051a0 AP5 = sSharedPrefs.AP5();
            AP5.Cdi(str);
            AP5.apply();
        }
    }

    public static void saveRegisteredDeviceId(String str, String str2) {
        InterfaceC00051a0 AP5 = sSharedPrefs.AP5();
        AP5.CaK(str, str2);
        AP5.apply();
    }
}
