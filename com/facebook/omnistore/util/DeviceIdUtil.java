package com.facebook.omnistore.util;

import X.0Pz;
import X.1JF;
import X.30Y;
import X.AbY;
import X.AnonymousClass001;
import X.C0B9;
import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import java.util.Map;
import java.util.Set;

/* loaded from: DeviceIdUtil.class */
public class DeviceIdUtil {
    public static final Long GRAPHQL_TEST_APP_ID = 512266575476403L;
    public static final Long INSTANT_ARTICLES_SAMPLE_APP_ID = 1410841939220564L;
    public static final Long AI_DEMOS_SAMPLE_APP_ID = 1613547858907322L;
    public static final Long APP_MANAGER_APP_ID = 659091980805095L;
    public static final Long PAGES_MANAGER_APP_ID = 121876164619130L;
    public static final Long PAGES_MANAGER_IN_HOUSE_APP_ID = 288852714521348L;
    public static final Long PAGES_MANAGER_DEV_APP_ID = 310060339087338L;
    public static final Long CREATOR_APP_ID = 256624908153128L;
    public static final Map APP_ID_MAP = new 30Y(1);
    public static final Set REQUIRE_PACKAGENAME_CHECK_APP_ID = new AbY();
    public static final Map PACKAGE_NAME_MAP = new 30Y(2);

    public static String getDeviceId(Context context, Long l) {
        String str;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (1JF.A0A(string)) {
            return null;
        }
        try {
            string = Base64.encodeToString(C0B9.A01(string), 17);
        } catch (IllegalArgumentException unused) {
        }
        if (REQUIRE_PACKAGENAME_CHECK_APP_ID.contains(l)) {
            str = AnonymousClass001.A0b(context.getPackageName(), PACKAGE_NAME_MAP);
        } else {
            str = null;
        }
        if (str == null) {
            str = (String) APP_ID_MAP.get(l);
        }
        if (str == null) {
            throw AnonymousClass001.A0L(0Pz.A0v("Invalid app ID: ", String.valueOf(l), " or package name: ", context.getPackageName()));
        }
        String replaceAll = string.replaceAll("[^a-zA-Z0-9]", "");
        if (1JF.A0A(replaceAll)) {
            return null;
        }
        return 0Pz.A0W(str, replaceAll);
    }

    public static boolean isCreatorApp(String str) {
        return CREATOR_APP_ID.toString().equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (com.facebook.omnistore.util.DeviceIdUtil.PAGES_MANAGER_DEV_APP_ID.toString().equals(r301) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isPagesManager(java.lang.String r301) {
        /*
            java.lang.Long r0 = com.facebook.omnistore.util.DeviceIdUtil.PAGES_MANAGER_APP_ID
            java.lang.String r0 = r0.toString()
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L35
            java.lang.Long r0 = com.facebook.omnistore.util.DeviceIdUtil.PAGES_MANAGER_IN_HOUSE_APP_ID
            java.lang.String r0 = r0.toString()
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L35
            java.lang.Long r0 = com.facebook.omnistore.util.DeviceIdUtil.PAGES_MANAGER_DEV_APP_ID
            java.lang.String r0 = r0.toString()
            r1 = r301
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L37
        L35:
            r0 = 1
            r303 = r0
        L37:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.omnistore.util.DeviceIdUtil.isPagesManager(java.lang.String):boolean");
    }

    public static boolean isSupportedApp(String str) {
        return APP_ID_MAP.containsKey(Long.valueOf(Long.parseLong(str)));
    }
}
