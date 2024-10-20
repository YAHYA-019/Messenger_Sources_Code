package com.mapbox.android.accounts.v1;

import X.0Pz;
import X.1BJ;
import X.AnonymousClass001;
import X.K93;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: MapboxAccounts.class */
public class MapboxAccounts {
    public static final String SKU_ID_MAPS_MAUS = "00";
    public static final String SKU_ID_NAVIGATION_MAUS = "02";
    public static final String SKU_ID_NAVIGATION_TRIPS = "03";

    public static String A00(long j) {
        String l = Long.toString(j, 36);
        int length = l.length();
        if (length > 8) {
            l = l.substring(length - 8);
        } else if (length < 8) {
            return String.format(0Pz.A0d("%1$", K93.__redex_internal_original_name, 8), l).replace(" ", ConstantsKt.CAMERA_ID_FRONT);
        }
        return l;
    }

    public static String A01(Object[] objArr) {
        StringBuilder A0k = AnonymousClass001.A0k();
        int length = objArr.length;
        boolean z = true;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0k.toString();
            }
            Object obj = objArr[i2];
            if (z) {
                z = false;
            } else {
                A0k.append((CharSequence) "");
            }
            A0k.append(obj);
            i = i2 + 1;
        }
    }

    public static long getNow() {
        return System.currentTimeMillis();
    }

    public static String obtainEndUserId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String obtainMapsSkuUserToken(String str) {
        return A01(new String[]{ConstantsKt.CAMERA_ID_BACK, SKU_ID_MAPS_MAUS, A00(System.currentTimeMillis()), str});
    }

    public static String obtainNavigationSkuSessionToken() {
        char[] charArray = 1BJ.A00(628).toCharArray();
        char[] cArr = new char[10];
        SecureRandom secureRandom = new SecureRandom();
        int i = 0;
        do {
            cArr[i] = charArray[secureRandom.nextInt(charArray.length)];
            i++;
        } while (i < 10);
        return A01(new String[]{ConstantsKt.CAMERA_ID_BACK, SKU_ID_NAVIGATION_TRIPS, new String(cArr)});
    }

    public static String obtainNavigationSkuUserToken(String str) {
        return A01(new String[]{ConstantsKt.CAMERA_ID_BACK, SKU_ID_NAVIGATION_MAUS, A00(System.currentTimeMillis()), str});
    }
}
